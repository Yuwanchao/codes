package com.douqi.util;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 * @ClassName: SmsUtil
 * @Description 短信工具类
 * @author: Yuwanchao
 * @creatTime 2020-03-16 15:02
 */
@Component
public class SmsUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    public String getMessage(String phoneCode){

        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod("http://utf8.api.smschinese.cn");
        //在头文件中设置转码
        post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf8");
        long randomCode = Math.round((Math.random() + 1) * 1000);
        NameValuePair[] data ={
                new NameValuePair("Uid", "yu165739"),
                new NameValuePair("Key", "17600080407"),
                new NameValuePair("smsMob", phoneCode),
                new NameValuePair("smsText","XX软件提醒提醒您，验证码为：" + randomCode + "。五分钟后失效。 若非本人操作请忽略！" )};
        post.setRequestBody(data);
        redisTemplate.opsForValue().set(phoneCode, randomCode, 5, TimeUnit.MINUTES);
//        try {
//            client.executeMethod(post);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Header[] headers = post.getResponseHeaders();
//        int statusCode = post.getStatusCode();
//        System.out.println("statusCode:"+statusCode);
//        String result = null;
//        try {
//            result = new String(post.getResponseBodyAsString().getBytes("utf8"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        post.releaseConnection();
//        return result;
        return "";
    }


}
