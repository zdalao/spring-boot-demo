package com.xkcoding.cache.redis.entity;

import org.springframework.beans.factory.InitializingBean;

public class XXXUtil implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("afterPropertiesSet() do ....");
    }
}
