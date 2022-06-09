package com.xkcoding.helloworld.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "BComponent")
public class BComponent implements InitializingBean {

    @Resource
    private AComponent aComponent;


    public BComponent() {
        System.err.println("BComponent执行了构造器方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("BComponent执行afterPropertiesSet()");
    }
}
