package com.douqi.service.app.impl;

import com.douqi.dao.app.AppUserMapper;
import com.douqi.dao.app.model.AppUser;
import com.douqi.service.app.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AppUserServiceImpl
 * @Description
 * @author: Yuwanchao
 * @creatTime 2020-03-16 15:33
 */
@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;


    @Override
    public int save(AppUser appUser) {

        return 0;
    }
}
