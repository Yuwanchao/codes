package com.douqi.util;

import com.douqi.util.UUIDGenerator;

/**
 * @ClassName: IDGenerator
 * @Description UID生成
 * @author: Yuwanchao
 * @creatTime 2020-03-16 14:35
 */
public class IDGenerator {


    /**
     * 生成UUID
     * @return UUID
     */
    public final static String genUID(){
        return UUIDGenerator.get();
    }

    /**
     * 生成不含-的UUID
     * @return UUID
     */
    public final static String genDomID(){
        return genUID().replaceAll("[-]", "");
    }
}
