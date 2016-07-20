package com.young.ownertask.sql;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * 相关SQLite数据库操作类
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/19  15:40
 */


public class DatabaseHelper extends SQLiteOpenHelper {

    //类没有实例化,是不能用作父类构造器的参数,必须声明为静态
    private static final String name = "OwnTask"; //数据库名称

    private static final int version = 1; //数据库版本

    public DatabaseHelper(Context context) {

        //第三个参数CursorFactory指定在执行查询时获得一个游标实例的工厂类,设置为null,代表使用系统默认的工厂类

        super(context, name, null, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS Task (task_id long(6) primary key autoincrement, task_title varchar(20) not null, " +
                "task_title varchar(20) default '', task_year int(4), task_month int(2)), task_day int(2), task_week char(3), " +
                "task_time char(20), task_location char(35) default '', task_repeat char(10) CHECK(task_repeat IN('yearly','monthly','daily'))");
        db.execSQL("CREATE TABLE IF NOT EXISTS TaskStatus (task_id long(6) primary key, task_create_year int(4), task_create_month int(2)), " +
                "task_create_day int(2), task_status char(10) CHECK(task_status IN('completed','overdue','snoozed', 'init'))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

//               db.execSQL("ALTER TABLE person ADD phone VARCHAR(12)"); //往表中增加一列
        System.out.println("--------onUpdate Called--------"
                + oldVersion + "--->" + newVersion);

    }
}
