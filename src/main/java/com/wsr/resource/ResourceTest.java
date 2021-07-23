package com.wsr.resource;

import cn.hutool.core.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/resource")
public class ResourceTest {
    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/test")
    public void test() {
        // 标题
        String subject = messageSource.getMessage("updateEmail.confirm.subject", null, Locale.SIMPLIFIED_CHINESE);
        // 内容，6位随机验证码
        String verifyUrl = "123456";
        Object[] args = new Object[]{verifyUrl, "木又寸", DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss")};
        String mailContent = messageSource.getMessage("updateEmail.confirm.content", args, Locale.SIMPLIFIED_CHINESE);
        System.out.println(subject);
        System.out.println(mailContent);
    }
}
