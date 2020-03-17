package com.douqi.util;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.util.IOUtils;
import org.mindrot.jbcrypt.BCrypt;
import org.mockito.internal.util.io.IOUtil;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @ClassName: PasswordUtil
 * @Description 密码工具类
 * @author: Yuwanchao
 * @creatTime 2020-03-16 11:36
 */

public class PasswordUtil {


    /**
     * 密码加密
     */
    public static String encryptedPwd(String pwd) {
        return BCrypt.hashpw(pwd, BCrypt.gensalt(12));
    }

    /**
     * 验证密码正确性
     * pwd 用户原来的密码    hashed用户新密码
     */
    public static boolean checkPwd(String pwd, String hashed) {
        try {
            return BCrypt.checkpw(pwd, hashed);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



}