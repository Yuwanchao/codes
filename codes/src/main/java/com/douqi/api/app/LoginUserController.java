package com.douqi.api.app;

import com.douqi.api.BaseController;
import com.douqi.core.constants.Constants;
import com.douqi.core.model.R;
import com.douqi.core.model.ServiceReturn;
import com.douqi.dao.app.model.AppLoginUser;
import com.douqi.dao.app.model.vo.AppLoginUserVo;
import com.douqi.service.app.AppLoginUserService;
import com.douqi.service.app.AppUserService;
import com.douqi.util.SmsUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName: LoginUserController
 * @Description 登录用户Controller
 * @author: Yuwanchao
 * @creatTime 2020-03-16 10:11
 */
@RestController
@RequestMapping(value = "/loginUser")
public class LoginUserController extends BaseController {

    @Autowired
    private SmsUtil smsUtil;

    @Autowired
    private AppLoginUserService appLoginUserService;

    @Autowired
    private AppUserService appUserService;


    /**
     * 登录
     * @param appLoginUser
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/login")
    public R login(@RequestBody AppLoginUser appLoginUser){
        ServiceReturn serviceReturn = appLoginUserService.login(appLoginUser);
        return StringUtils.equals(serviceReturn.getCode(), Constants.StatusConstants.SUCCESSCODE) ? R
                .success(serviceReturn.getMessage()) : R.failure(serviceReturn.getMessage());
    }

    @PostMapping(value = "/register")
    public R register(@RequestBody AppLoginUserVo appLoginUserVo){
        ServiceReturn serviceReturn = appLoginUserService.register(appLoginUserVo);
        return StringUtils.equals(serviceReturn.getCode(), Constants.StatusConstants.SUCCESSCODE) ? R
                .success(serviceReturn.getMessage()) : R.failure(serviceReturn.getMessage());
    }


    @GetMapping(value = "/getMessage")
    public R getMessage(String loginCode){
        return R.success(Integer.parseInt(smsUtil.getMessage(loginCode)) > 0  ? "发送成功！" : "发送失败！");
    }


}
