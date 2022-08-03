package com.xkcoding.helloworld.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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


    public static void main(String[] args) {
        //Entry中相比于hashmap多了before、after两个节点，可以记录插入顺序
        LinkedHashMap<Object,Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, 1);
        linkedHashMap.put(2, 2);
        linkedHashMap.put(3, 3);


        Map<Object,Object> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        System.out.println(hashMap);
    }

    private void testException() {
        //throw new IllegalAccessException("fdfdfd");
        //IllegalArgumentException是运行时异常，虚拟机不会对其进行语法检查必须处理 因此不需要throws
        throw new IllegalArgumentException("result");
    }


}
