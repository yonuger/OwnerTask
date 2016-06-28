package com.young.ownertask.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.young.ownertask.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/28  19:26
 */


public class BacklogInfo {
    private Bitmap bitmap;
    private String title;
    private String time;
    private String name;
    private int statue;     //状态有3种     0-  1-  2-

    public BacklogInfo(Context context, int bitmapId, String title, String time, String name, int statue) {
        this.bitmap = BitmapFactory.decodeResource(context.getResources(), bitmapId);
        this.title = title;
        this.time = time;
        this.name = name;
        this.statue = statue;
    }


    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }
}
