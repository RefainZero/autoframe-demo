package com.frame.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author : longrong.lang
 * @description：
 * @date : 10:31 2019/11/3
 */
public class GetDriver {

    protected static WebDriver driver;

    public static WebDriver getDriver(String browerType) {
        if (browerType.equalsIgnoreCase("chrome")) {
            return getChromeDriver();
        } else if (browerType.equalsIgnoreCase("firefox")) {
            return getFirefoxDriver();
        } else {
            throw new RuntimeException("请检查配置文件，是否正确！！");
        }
    }

    public void loagpage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    /**
     * @return
     */
    public static WebDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }
}
