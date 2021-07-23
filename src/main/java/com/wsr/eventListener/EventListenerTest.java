package com.wsr.eventListener;

import cn.hutool.core.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Locale;

/**
 * @author ：wangsr
 * @description：
 * @date ：Created in 2021/7/20 0020 9:44
 */
@RestController
@RequestMapping("/event")
public class EventListenerTest {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test")
    public void test() {
        EmailEvent emailEvent = new EmailEvent("hello Spring!", "cxg@126.com", "This is SpringApplicatoinContext test!");
        applicationContext.publishEvent(emailEvent);
    }
}
