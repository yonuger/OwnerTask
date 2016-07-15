package com.young.ownertask.ui.profile;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:46
 */


public class ProfileInfo {
    //已完成的数目
    private int completed;
    //被提醒过的数目
    private int snoozed;
    //未完成的数目
    private int overdue;

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getSnoozed() {
        return snoozed;
    }

    public void setSnoozed(int snoozed) {
        this.snoozed = snoozed;
    }

    public int getOverdue() {
        return overdue;
    }

    public void setOverdue(int overdue) {
        this.overdue = overdue;
    }
}
