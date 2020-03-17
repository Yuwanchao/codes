package com.douqi;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试类基类
 * @author 懒猴子CG
 * @date 2020/03/13 14:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 打印测试结果
     * @author 懒猴子CG
     * @date 2020/03/13 14:22
     */
}