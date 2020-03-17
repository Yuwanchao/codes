package com.douqi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.Date;

/**
 * @ClassName: UUIDGenerator
 * @Description
 * @author: Yuwanchao
 * @creatTime 2020-03-16 14:37
 */
public class UUIDGenerator {


    private static final Logger LOG = LoggerFactory.getLogger(UUIDGenerator.class);

    /**
     * 禁止实例化工具类
     */
    private UUIDGenerator() {
        throw new Error("请不要实例化UUIDGenerator类");
    }

    /**
     * 采用mongodb的ObjectId实现，返回全局唯一的24位随机字符串(实际上是一个非常大的十六进制数)
     *
     * @return 返回24位随机字符串
     */
    public static final String get() {
        return ObjectId.get().toString();
    }

    /**
     * 获取20位的随机字符串
     */
    public static final String getSerializeNum() {
        return new BigInteger(get(), 16).toString(30);
    }

    /**
     * 获取id的生成时间
     *
     * @param uuid UUIDGenerator的get()方法生成的随机字符串
     * @return 返回生成该id时的时间。如果传入的id不是{@link UUIDGenerator}的get()方法生成的合法字符串,返回null
     */
    public static final Date getCreateDate(String uuid) {
        Date createDate = null;
        try {
            createDate = new ObjectId(uuid).getDate();
        } catch (IllegalArgumentException e) {
            LOG.error("根据[uuid:{}]获取其生成时间发生异常,可能该id不是UUIDGenerator工具类生成的合法字符串", uuid, e);
        }
        return createDate;
    }

}
