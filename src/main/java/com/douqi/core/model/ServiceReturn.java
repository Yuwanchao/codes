package com.douqi.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: ServiceReturn
 * @Description
 * @author: Yuwanchao
 * @creatTime 2020-03-16 15:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceReturn {

    private String code;

    private String message;
}
