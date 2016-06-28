package com.young.ownertask.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.young.ownertask.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/28  20:18
 */


public class CalendarItemView extends LinearLayout{

    private TextView dayTv;
    private ImageView noticeIv;

    public CalendarItemView(Context context) {
        super(context);
        initComponent();
    }

    public CalendarItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public CalendarItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initComponent();
    }

    private void initComponent() {
        dayTv = (TextView) findViewById(R.id.tv_view_calendar_item_day);
        noticeIv = (ImageView) findViewById(R.id.iv_view_calendar_item_notice);
    }

    public void resetView(CalendarInfo calendarInfo) {
        dayTv.setText(calendarInfo.getDay());
        if( calendarInfo.getHasNotice() ){
            noticeIv.setVisibility(VISIBLE);
        }else{
            noticeIv.setVisibility(INVISIBLE);
        }
    }
}
