package com.frame.demo.model;

import org.apache.log4j.Logger;

/**
 * @author : longrong.lang
 * @description：
 * @date : 11:29 2019/11/3
 */
public class Action extends BasePage {
    private Logger logger=Logger.getLogger(BasePage.class);
    public void enterFrame(){
        logger.info("进入frame成功");
        driver.switchTo().frame(0);
    }

    public void click(String name){
        logger.info("点击"+name);
        getElement(name).click();
    }

    public void sendKeys(String name,String str){
        logger.info(name+str);
        getElement(name).clear();
        getElement(name).sendKeys(str);
    }

    public String getText(String name){
        logger.info("获取文本成功！！");
        return getElement(name).getText();
    }
}
