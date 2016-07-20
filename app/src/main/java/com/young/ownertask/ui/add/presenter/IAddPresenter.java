package com.young.ownertask.ui.add.presenter;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/19  17:40
 */
public interface IAddPresenter {

    void onCreate();

    /**
     * 设置日期
     * @param type  类型有两种 --开始：FROM   --结束：TO
     * @param year  年份
     * @param month 月份
     * @param day   号数
     */
    void setDate(int type, int year, int month, int day);

    /**
     * 设置时间
     * @param type  类型有两种 --开始：FROM   --结束：TO
     * @param hour  小时
     * @param minute    分钟
     */
    void setTime(int type, int hour, int minute);

    /**
     * 对时间进行初始化
     */
    void initDateAndTime();

    /**
     * 设置重复类型
     * @param repeat
     */
    void setRepeat(String repeat);

    /**
     * 对类型进行初始化
     */
    void initRepeat();

    /**
     * 是否将完成时间设置为整天
     * @param b true即是，false即否
     */
    void isSetAllDay(boolean b);

    /**
     * 添加任务到数据库中
     */
    void addTask();
}
