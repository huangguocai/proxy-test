/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * ���ļ�������˳�ẽ�����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ�ġ�
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
        //1.��̬����
        /*IUserDao udao = new UserDaoImpl();
        Proxy1 proxy = new Proxy1(udao);
        proxy.saveUser();*/
        //2.��̬����
        IUserDao udao = new UserDaoImpl();
        ProxyFactory factory = new ProxyFactory(udao);
        IUserDao userdao = (IUserDao) factory.getProxyInstance();
        userdao.saveUser();

    }

}
