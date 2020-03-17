package com.douqi.api.app;

import com.douqi.api.BaseController;
import com.douqi.core.model.R;
import com.douqi.dao.app.model.AppUser;
import com.douqi.service.app.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Description 用户Controller
 * @author: Yuwanchao
 * @creatTime 2020-03-16 15:41
 */
@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController{

    @Autowired
    private AppUserService appUserService;


    @PostMapping(value = "/saveInfo")
    public R saveInfo(@RequestBody AppUser appUser){
        int num = appUserService.save(appUser);
        return R.success("填写成功！");
    }

}
