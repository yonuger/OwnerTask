package com.young.ownertask.sql.dao.impl;

import android.content.Context;

import com.young.ownertask.sql.DatabaseHelper;

/**
 * @author: young
 * email:1160415122@qq.com
 * phone:15625430473
 * date:16/5/25  15:22
 */
public class CommonImpl {
    protected DatabaseHelper dbHelper;

    public CommonImpl(Context context){
        dbHelper = new DatabaseHelper(context);
    }
}