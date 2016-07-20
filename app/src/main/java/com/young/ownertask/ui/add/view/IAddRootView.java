package com.young.ownertask.ui.add.view;

import com.young.ownertask.ui.base.IView;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/19  17:37
 */


public interface IAddRootView extends IView {

    /**
     * 选择日期
     * @param type
     */
    void selectDate(int type);

    /**
     * 选择时间
     * @param type
     */
    void selectTime(int type);

    /**
     * 根据type设置起始日期和结束日期
     * @param type
     * @param data
     */
    void setDate(int type, String data);

    /**
     * 根据type设置起始时间和结束时间
     * @param type
     * @param data
     */
    void setTime(int type, String data);

    /**
     * 选择重复情况
     */
    void selectRepeat();

    /**
     * 设置重复类型
     * @param data
     */
    void setRepeat(String data);

    /**
     * 是否将时间设置为整天
     * @param b
     */
    void isAllDay(boolean b);

    /**
     * 添加任务
     */
    void addTask();
}
