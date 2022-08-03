package com.xkcoding.helloworld.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "AComponent")
public class AComponent implements InitializingBean {

    @Resource
    private BComponent bComponent;

    @Value("${server.port}")
    private String myPort;


    public AComponent() {
        System.err.println("AComponent执行了构造器方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("AComponent执行afterPropertiesSet()");
    }
}
