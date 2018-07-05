/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * 本文件仅限于顺丰航空有限公司内部传阅，禁止外泄以及用于其他的商业目的。
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
