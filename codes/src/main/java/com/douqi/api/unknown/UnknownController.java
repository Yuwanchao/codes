package com.douqi.api.unknown;

import com.douqi.api.BaseController;
import com.douqi.core.model.R;
import com.douqi.dao.unknown.req.UnknownReq;
import com.douqi.service.unknown.UnknownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author 懒猴子CG
 * @date 2020/03/13 14:22
 */
@RestController
@RequestMapping("/unknown")
public class UnknownController extends BaseController {

    @Autowired
    private UnknownService unknownService;
    /**
     * 创建
     * @author 懒猴子CG
     * @date 2020/03/13 14:22
     */
    @PostMapping("/create")
    public R create(UnknownReq req) {
        unknownService.create(req);
        return R.success();
    }

}