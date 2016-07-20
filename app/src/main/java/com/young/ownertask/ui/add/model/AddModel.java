package com.young.ownertask.ui.add.model;

import com.young.ownertask.ui.add.presenter.AddPresenter;
import com.young.ownertask.ui.base.model.IModel;
import com.young.ownertask.utils.TimeUtils;

//Model实现
public class AddModel implements IAddModel {


    private String title;
    private String description;
    private int fromYear;
    private int fromMonth;
    private int fromDay;
    private int fromHour;
    private int fromMinute;
    private int toYear;
    private int toMonth;
    private int toDay;
    private int toHour;
    private int toMinute;

    private String repeat;

    public AddModel(){
        title = "";
        description = "";
        fromYear = TimeUtils.getCurrentYear();
        fromMonth = TimeUtils.getCurrentMonth();
        fromDay = TimeUtils.getCurrentDay();
        fromHour = TimeUtils.getCurrentHour();
        fromMinute = TimeUtils.getCurrentMinute();
        toYear = TimeUtils.getCurrentYear();
        toMonth = TimeUtils.getCurrentMonth();
        toDay = TimeUtils.getCurrentDay();
        toHour = TimeUtils.getCurrentHour();
        toMinute = TimeUtils.getCurrentMinute();

        repeat = "daily";
    }

    public void getData(final ICallback callback){

    }

    @Override
    public void getFromDate(int year, int month, int day, ICallback callback) {
        this.fromYear = year;
        this.fromMonth = month;
        this.fromDay = day;
        callback.onResult(TimeUtils.getMonthNameByNumb(month) + " " + day + ", "+year);
    }

    @Override
    public void getToDate(int year, int month, int day, ICallback callback) {
        this.toYear = year;
        this.toMonth = month;
        this.toDay = day;
        callback.onResult(TimeUtils.getMonthNameByNumb(month) + " " + day + ", "+year);
    }

    @Override
    public void getFromTime(int hour, int minute, ICallback callback) {
        this.fromHour = hour;
        this.fromMinute = minute;
        callback.onResult(hour + ":" + minute);
    }

    @Override
    public void getToTime(int hour, int minute, ICallback callback) {
        this.toHour = hour;
        this.toMinute = minute;
        callback.onResult(hour + ":" + minute);
    }

    @Override
    public void getRepeat(String repeat, ICallback callback) {
        this.repeat = repeat;
        callback.onResult(repeat);
    }

    @Override
    public void isAllDay(boolean b, ICallback callback) {
        if(b) {
            this.fromYear = this.toYear = TimeUtils.getCurrentYear();
            this.fromMonth = this.toMonth = TimeUtils.getCurrentMonth();
            this.fromDay = this.toDay = TimeUtils.getCurrentDay();
            this.fromHour = this.toHour = TimeUtils.getCurrentHour();
            this.fromMinute = this.toMinute = TimeUtils.getCurrentMinute();
        }
        callback.onResult("");
    }
}