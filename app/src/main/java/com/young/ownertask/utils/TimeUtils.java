package com.young.ownertask.utils;

import android.util.Log;

import com.young.ownertask.ui.home.CalendarInfo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * 用于处理相关时间的操作
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/20  14:32
 */


public class TimeUtils {

    public static int getCurrentYear(){
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR);
    }

    public static int getCurrentMonth(){
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.MONTH);
    }

    public static int getCurrentDay(){
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public static int getCurrentHour(){
        Date date=new Date();
        SimpleDateFormat f=new SimpleDateFormat("HH:mm:ss");
        String temp = f.format(date);
        StringTokenizer tokenizer = new StringTokenizer(temp, ":");
        Log.e("deded", temp);
        return Integer.parseInt(tokenizer.nextToken());
    }

    public static int getCurrentMinute(){
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.MINUTE);
    }

    public static String getMonthNameByNumb(int month) {
        switch(month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
}
