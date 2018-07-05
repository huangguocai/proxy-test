/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * 本文件仅限于顺丰航空有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 */
package com.proxy.dao.impl;

import com.proxy.dao.IUserDao;

/**
 * @author 01367627
 *
 */
public class UserDaoImpl implements IUserDao {

    public void saveUser() {
        System.out.println("A user saved!");
    }
}
