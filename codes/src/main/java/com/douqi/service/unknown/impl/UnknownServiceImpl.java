package com.douqi.service.unknown.impl;

import com.douqi.dao.unknown.UnknownMapper;
import com.douqi.dao.unknown.model.Unknown;
import com.douqi.dao.unknown.req.UnknownReq;
import com.douqi.service.unknown.UnknownService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 业务实现
 * @author 懒猴子CG
 * @date 2020/03/13 14:22
 */
@Service
public class UnknownServiceImpl implements UnknownService {

    @Autowired
    private UnknownMapper unknownMapper;

    @Override
    public void create(UnknownReq req) {
        Unknown unknown = new Unknown();
        BeanUtils.copyProperties(req, unknown);
        unknownMapper.insertSelective(unknown);
    }
}