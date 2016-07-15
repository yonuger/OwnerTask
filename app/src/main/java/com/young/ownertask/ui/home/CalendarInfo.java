package com.young.ownertask.ui.home;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/28  20:14
 */


public class CalendarInfo {
    private String day;
    private Boolean hasNotice;

    public CalendarInfo(String day, boolean hasNotice) {
        this.day = day;
        this.hasNotice = hasNotice;
    }

    public Boolean getHasNotice() {
        return hasNotice;
    }

    public void setHasNotice(Boolean hasNotice) {
        this.hasNotice = hasNotice;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
