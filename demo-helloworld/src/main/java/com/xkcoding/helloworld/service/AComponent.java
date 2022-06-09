package com.xkcoding.helloworld.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "AComponent")
public class AComponent implements InitializingBean {

    @Resource
    private BComponent bComponent;


    public AComponent() {
        System.err.println("AComponent执行了构造器方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("AComponent执行afterPropertiesSet()");
    }
}
