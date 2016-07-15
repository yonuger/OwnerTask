package com.young.ownertask.ui.list;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/29  14:16
 */


public class ListNoticeInfo {
    private String title;
    private boolean hasNotice;

    public ListNoticeInfo(String title, boolean hasNotice) {
        this.title = title;
        this.hasNotice = hasNotice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasNotice() {
        return hasNotice;
    }

    public void setHasNotice(boolean hasNotice) {
        this.hasNotice = hasNotice;
    }
}
