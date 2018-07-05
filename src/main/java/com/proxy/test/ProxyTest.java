/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * 本文件仅限于顺丰航空有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 */
package com.proxy.test;

import com.proxy.dao.IUserDao;
import com.proxy.dao.impl.UserDaoImpl;
import com.proxy.proxy.ProxyFactory;

/**
 * @author 01367627
 *
 */
public class ProxyTest {

    public static void main(String[] args) {
        //1.静态代理
        /*IUserDao udao = new UserDaoImpl();
        Proxy1 proxy = new Proxy1(udao);
        proxy.saveUser();*/
        //2.动态代理
        IUserDao udao = new UserDaoImpl();
        ProxyFactory factory = new ProxyFactory(udao);
        IUserDao userdao = (IUserDao) factory.getProxyInstance();
        userdao.saveUser();

    }

}
