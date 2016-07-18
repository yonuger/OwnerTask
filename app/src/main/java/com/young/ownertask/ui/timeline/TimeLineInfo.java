package com.young.ownertask.ui.timeline;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/18  11:34
 */


public class TimeLineInfo {
    private String year;
    private String date;
    private String week;

    public TimeLineInfo(){
        year = "";
        date = "";
        week = "";
    }

    public TimeLineInfo(String year, String date, String week) {
        this.year = year;
        this.date = date;
        this.week = week;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}
