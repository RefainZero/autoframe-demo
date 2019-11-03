package com.frame.demo.test;

import com.frame.demo.page.LoginPage;
import org.testng.annotations.Test;

/**
 * @author : longrong.lang
 * @description：
 * @date : 11:49 2019/11/3
 */
public class TestFrame {
    @Test
    public void test(){
        new LoginPage().login("","","请输入帐号");
    }
}
