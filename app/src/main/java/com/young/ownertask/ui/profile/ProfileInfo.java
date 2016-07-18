package com.young.ownertask.ui.profile;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:46
 */


public class ProfileInfo {
    //已完成的数目
    private int completedTask;
    //被提醒过的数目
    private int snoozedTask;
    //未完成的数目
    private int overdueTask;

    //日期间隔的第一天号数
    private int dateFirst;

    public ProfileInfo(int completedTask, int snoozedTask, int overdueTask, int dateFirst) {
        this.completedTask = completedTask;
        this.snoozedTask = snoozedTask;
        this.overdueTask = overdueTask;
        this.dateFirst = dateFirst;
    }


    public int getTotleTask(){
        return completedTask + snoozedTask + overdueTask;
    }

    public int getCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(int completedTask) {
        this.completedTask = completedTask;
    }

    public int getSnoozedTask() {
        return snoozedTask;
    }

    public void setSnoozedTask(int snoozedTask) {
        this.snoozedTask = snoozedTask;
    }

    public int getOverdueTask() {
        return overdueTask;
    }

    public void setOverdueTask(int overdueTask) {
        this.overdueTask = overdueTask;
    }

    public int getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(int dateFirst) {
        this.dateFirst = dateFirst;
    }
}
