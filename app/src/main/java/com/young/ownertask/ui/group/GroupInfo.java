package com.young.ownertask.ui.group;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/29  13:13
 */


public class GroupInfo {
    private String title;
    private int number;

    public GroupInfo(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
