package com.wsr.eventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 *  * Title: email之事件类
 *  * EmailEvent类继承了ApplicationEvent类，除此之外，它就是一个普通的Java类
 * @author ：wangsr
 * @description：
 * @date ：Created in 2021/7/20 0020 10:39
 */
//@Component
public class EmailEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    //属性
    private String address;
    private String text;
    //构造方法
    public EmailEvent(Object source) {
        super(source);
    }
    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }
    //getter和setter设置
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
