package com.douqi.service.app;

import com.douqi.core.model.ServiceReturn;
import com.douqi.dao.app.model.AppLoginUser;
import com.douqi.dao.app.model.vo.AppLoginUserVo;

/**
 * @ClassName: AppLoginUserService
 * @Description
 * @author: Yuwanchao
 * @creatTime 2020-03-16 11:13
 */
public interface AppLoginUserService {

    ServiceReturn login(AppLoginUser appLoginUser);

    ServiceReturn register(AppLoginUserVo appLoginUserVo);
}
