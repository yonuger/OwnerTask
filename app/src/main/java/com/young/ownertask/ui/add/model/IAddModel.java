package com.young.ownertask.ui.add.model;

import com.young.ownertask.ui.base.model.IModel;

//Model接口
public interface IAddModel extends IModel{            //9 内嵌ICallback接口

    void getFromDate(int year, int month, int day, final ICallback callback);
    void getToDate(int year, int month, int day, final ICallback callback);
    void getFromTime(int hour, int minute, final ICallback callback);
    void getToTime(int hour, int minute, final ICallback callback);

    void getRepeat(String repeat, ICallback iCallback);

    void isAllDay(boolean b, ICallback callback);
}