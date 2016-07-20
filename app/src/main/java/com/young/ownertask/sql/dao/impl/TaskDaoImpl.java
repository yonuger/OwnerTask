package com.young.ownertask.sql.dao.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.young.ownertask.sql.dao.TaskDao;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/19  17:24
 */


public class TaskDaoImpl extends CommonImpl implements TaskDao {
    SQLiteDatabase db;

    public TaskDaoImpl(Context context) {
        super(context);
    }

    @Override
    public boolean createTask() {
//        String sql = "select * from video where video_id = '" + id + "'";
        db = dbHelper.getWritableDatabase();
        db.beginTransaction();
        try{
            db.execSQL("update person set amount=amount-10 where personid=?");
            db.execSQL("update person set amount=amount+10 where personid=?");
            db.setTransactionSuccessful();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.endTransaction();
        }
        return false;
    }
}
