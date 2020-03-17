package com.douqi.dao.app.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AppLoginUserVo
 * @Description
 * @author: Yuwanchao
 * @creatTime 2020-03-16 17:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppLoginUserVo {

    private String id;

    private String loginCode;

    private String password;

    private String verificationCode;


}
