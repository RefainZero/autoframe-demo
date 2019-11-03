package com.frame.demo.page;

import com.frame.demo.model.Action;
import org.testng.Assert;

/**
 * @author : longrong.lang
 * @description：
 * @date : 11:41 2019/11/3
 */
public class LoginPage extends Action {
    public void login(String userName,String pwd,String expected){
        open();
        click("密码登录");
        enterFrame();
        sendKeys("输入用户名",userName);
        sendKeys("输入密码",pwd);
        click("点击登录");
        String text = getText("错误提示信息");
        Assert.assertEquals(text,expected);
    }
}
