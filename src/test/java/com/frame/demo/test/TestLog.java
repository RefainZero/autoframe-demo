package com.frame.demo.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author : longrong.lang
 * @description：
 * @date : 9:49 2019/11/3
 */
public class TestLog {

    private Logger logger=Logger.getLogger(TestLog.class);
    @Test
    public void testLog() {
        logger.info("this is info message");
        logger.error("this is error message");
    }
}
