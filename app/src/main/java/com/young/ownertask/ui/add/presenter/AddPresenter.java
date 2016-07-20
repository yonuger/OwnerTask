package com.young.ownertask.ui.add.presenter;

import com.young.ownertask.ui.add.model.IAddModel;
import com.young.ownertask.ui.add.model.AddModel;
import com.young.ownertask.ui.add.view.IAddRootView;
import com.young.ownertask.utils.TimeUtils;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/19  17:40
 */


public class AddPresenter implements IAddPresenter {

    public static final int FROM = 0;
    public static final int TO = 1;

    private IAddRootView view;   //6 拥有View与Model
    private IAddModel model;

    public AddPresenter(IAddRootView view){
        this.view=view;
        model=new AddModel();
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void setDate(final int type, int year, int month, int day) {
        if( type == FROM ){
            model.getFromDate(year, month, day, new IAddModel.ICallback() {
                @Override
                public void onResult(String data) {
                    view.setDate(type, data);
                }
            });
        }else{
            model.getToDate(year, month, day, new IAddModel.ICallback() {
                @Override
                public void onResult(String data) {
                    view.setDate(type, data);
                }
            });
        }
    }

    @Override
    public void setTime(final int type, int hour, int minute) {
        if( type == FROM ){
            model.getFromTime(hour, minute, new IAddModel.ICallback() {
                @Override
                public void onResult(String data) {
                    view.setTime(type, data);
                }
            });
        }else{
            model.getToTime(hour, minute, new IAddModel.ICallback() {
                @Override
                public void onResult(String data) {
                    view.setTime(type, data);
                }
            });
        }
    }

    @Override
    public void initDateAndTime() {
        setDate(FROM, TimeUtils.getCurrentYear(), TimeUtils.getCurrentMonth(), TimeUtils.getCurrentDay());
        setDate(TO, TimeUtils.getCurrentYear(), TimeUtils.getCurrentMonth(), TimeUtils.getCurrentDay());
        setTime(FROM, TimeUtils.getCurrentHour(), TimeUtils.getCurrentMinute());
        setTime(TO, TimeUtils.getCurrentHour(), TimeUtils.getCurrentMinute());
    }

    @Override
    public void setRepeat(final String repeat) {
        model.getRepeat(repeat, new IAddModel.ICallback(){
            @Override
            public void onResult(String data) {
                switch (data){
                    case "yearly":
                        view.setRepeat("每年一次");
                        break;
                    case "monthly":
                        view.setRepeat("每月一次");
                        break;
                    case "daily":
                        view.setRepeat("每日一次");
                        break;
                    case "none":
                        view.setRepeat("不重复");
                        break;
                    default:
                        view.setRepeat("每日一次");
                }

            }
        });
    }

    @Override
    public void initRepeat() {
        setRepeat("每日一次");
    }

    @Override
    public void isSetAllDay(final boolean b) {
        model.isAllDay(b, new IAddModel.ICallback(){
            @Override
            public void onResult(String data) {
                view.isAllDay(b);
            }
        });
    }

    @Override
    public void addTask() {

    }
}
