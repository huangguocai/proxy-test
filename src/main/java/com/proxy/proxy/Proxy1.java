/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * ���ļ�������˳�ẽ�����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ�ġ�
 */
package com.proxy.proxy;

import com.proxy.dao.IUserDao;

/**
 * @author 01367627
 *
 */
public class Proxy1 implements IUserDao{
    
    private IUserDao target;
    
    public Proxy1(IUserDao target) {
        super();
        this.target = target;
    }

    public void saveUser() {
        System.out.println("Save start!");
        target.saveUser();
    }

}
