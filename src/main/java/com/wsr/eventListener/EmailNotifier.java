package com.wsr.eventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/** Title: email之监听类
 * 容器事件的监听器类必须实现ApplicationListener接口，实现该接口就必须实现
 *
 * @author ：wangsr
 * @description：
 * @date ：Created in 2021/7/20 0020 10:45
 */
@Component
public class EmailNotifier implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof EmailEvent){
            EmailEvent emailEvent = (EmailEvent) event;
            System.out.println("email's address:"+emailEvent.getAddress());
            System.out.println("email's text:"+emailEvent.getText());
        } else {
            System.out.println("the Spring's event:"+event);
        }
    }
}
