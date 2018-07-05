/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * 本文件仅限于顺丰航空有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 */
package com.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 01367627
 *
 */
public class ProxyFactory {

    //被代理对象
    private Object target;
    
    /**
     * 
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }
    
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
                target.getClass().getInterfaces(), 
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + "start!");
                        Object ret = method.invoke(target, args);
                        return ret;
                    }
                });
    }
    
    
}
