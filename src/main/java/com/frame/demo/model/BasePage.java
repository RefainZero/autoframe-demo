package com.frame.demo.model;

import com.frame.demo.base.GetDriver;
import com.frame.demo.utils.BaseInfo;
import com.frame.demo.utils.ReadExcelUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

/**
 * @author : longrong.lang
 * @description：
 * @date : 10:55 2019/11/3
 */
public class BasePage extends GetDriver {
    private Logger logger=Logger.getLogger(GetDriver.class);

    public BasePage() {
        String browerType = BaseInfo.getInfo("browerType");
        driver=GetDriver.getDriver(browerType);
        PageFactory.initElements(driver,this);
    }

    public By getBy(String method, String metodValue){
        By by;
        if (method.equalsIgnoreCase("id")){
            by=By.id(metodValue);
        }else  if (method.equalsIgnoreCase("name")){
            by=By.name(metodValue);
        }else  if (method.equalsIgnoreCase("linkText")){
            by=By.linkText(metodValue);
        }else  if (method.equalsIgnoreCase("xpath")){
            by=By.xpath(metodValue);
        }else  if (method.equalsIgnoreCase("className")){
            by=By.className(metodValue);
        }else  if (method.equalsIgnoreCase("cssSelector")){
            by=By.cssSelector(metodValue);
        }else{
            throw new RuntimeException("请确认定位元素方法是否正确！");
        }
        return by;
    }

    public WebElement getElement(String name){
        Map<String, String> map = ReadExcelUtil.getElementData();
        String method = map.get(name).toString().split(",")[0];
        String metodValue = map.get(name).toString().split(",")[1];
        return driver.findElement(getBy(method,metodValue));
    }

    public void open(){
        loagpage();
        logger.info("打开163首页 ");
        driver.get("https://mail.163.com/");
    }

    public void quit(){
        logger.info("退出浏览器 ");
        driver.quit();
    }

}
