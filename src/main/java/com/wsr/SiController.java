package com.wsr;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wangsr
 * @description：
 * @date ：Created in 2021/7/21 0021 9:25
 */
@RestController
@RequestMapping("/test")
@Scope("prototype")
public class SiController {
    private int num = 0;

    @GetMapping(value = "/testScope")
    public void testScope() {
        System.out.println(++num);
    }

    @GetMapping(value = "/testScope2")
    public void testScope2() {
        System.out.println(++num);
    }
}
