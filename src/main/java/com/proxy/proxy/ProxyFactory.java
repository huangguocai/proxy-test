/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * ���ļ�������˳�ẽ�����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ�ġ�
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

    //���������
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
