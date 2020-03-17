package com.douqi.service.app.impl;

import com.douqi.core.constants.Constants;
import com.douqi.core.model.ServiceReturn;
import com.douqi.dao.app.AppLoginUserMapper;
import com.douqi.dao.app.model.AppLoginUser;
import com.douqi.dao.app.model.AppLoginUserWrapper;
import com.douqi.dao.app.model.AppUser;
import com.douqi.dao.app.model.vo.AppLoginUserVo;
import com.douqi.service.app.AppLoginUserService;
import com.douqi.util.PasswordUtil;
import com.douqi.util.IDGenerator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AppLoginUserServiceImpl
 * @Description
 * @author: Yuwanchao
 * @creatTime 2020-03-16 11:13
 */
@Service
public class AppLoginUserServiceImpl implements AppLoginUserService {

    @Autowired
    private AppLoginUserMapper appLoginUserMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public ServiceReturn login(AppLoginUser appLoginUser){
        if(checkUserIsNull(appLoginUser)){
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "请正确输入账号密码！");
        }
        List<AppLoginUser> appLoginUsers = checkUserExist(appLoginUser.getLoginCode());
        if (appLoginUsers == null) {
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "该账户不存在！");
        }
        AppLoginUser findByLoginCode = appLoginUsers.get(0);
        String password = appLoginUser.getPassword();
        String passwordInDataBase = findByLoginCode.getPassword();
        if(PasswordUtil.checkPwd(password, passwordInDataBase)){
            redisTemplate.opsForValue().set(appLoginUser.getLoginCode(), "");
            return new ServiceReturn(Constants.StatusConstants.SUCCESSCODE, "登录成功！");
        }
        return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "登录失败，用户名或密码错误！");
    }

    @Override
    public ServiceReturn register(AppLoginUserVo appLoginUserVo){
        Object verificationCode = redisTemplate.opsForValue().get(appLoginUserVo.getLoginCode());
        if(verificationCode == null){
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "验证码已过期！");
        }
        if(!StringUtils.equals(appLoginUserVo.getVerificationCode(),  verificationCode.toString())){
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "验证码有误！");
        }
        AppLoginUser appLoginUser = new AppLoginUser();
        BeanUtils.copyProperties(appLoginUserVo, appLoginUser);
        if(checkUserIsNull(appLoginUser)){
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "请正确输入账号密码！");
        }
        List<AppLoginUser> appLoginUsers = checkUserExist(appLoginUserVo.getLoginCode());
        if (appLoginUsers == null) {
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "该账户已存在！");
        }
        appLoginUser.setId(IDGenerator.genUID());
        appLoginUser.setPassword(PasswordUtil.encryptedPwd(appLoginUserVo.getPassword()));
        int num = appLoginUserMapper.insertSelective(appLoginUser);
        if(num <= 0){
            return new ServiceReturn(Constants.StatusConstants.FAILURECODE, "系统繁忙！");
        }
        redisTemplate.delete(appLoginUser.getLoginCode());
        return new ServiceReturn(Constants.StatusConstants.SUCCESSCODE, "注册成功！");
    }

    /**
     * 判断用户是否为空
     * @param appLoginUser
     * @return
     */
    public boolean checkUserIsNull(AppLoginUser appLoginUser){
        return appLoginUser == null || appLoginUser.getLoginCode() == null || appLoginUser.getPassword() == null
                 ? true : false;
    }

    /**
     * 根据手机号判断用户是否存在
     * @param loginCode
     * @return
     */
    public List<AppLoginUser> checkUserExist(String loginCode){
        AppLoginUserWrapper appLoginUserWrapper = new AppLoginUserWrapper();
        appLoginUserWrapper.createCriteria().andLoginCodeEqualTo(loginCode);
        List<AppLoginUser> appLoginUsers = appLoginUserMapper.selectByExample(appLoginUserWrapper);
        return appLoginUsers;
    }
}
