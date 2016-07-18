package com.young.ownertask.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.young.ownertask.R;
import com.young.ownertask.utils.DensityUtil;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:39
 */


public class ProfileViewItem extends LinearLayout{

    private LinearLayout noneLl, overdueLl, snoozedLl, completedLl;
    private TextView dayTv;
    public ProfileViewItem(Context context) {
        super(context);
        initComponent();
    }

    public ProfileViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public ProfileViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initComponent();
    }

    private void initComponent() {
        noneLl = (LinearLayout) findViewById(R.id.ll_profile_item_none);
        overdueLl = (LinearLayout) findViewById(R.id.ll_profile_item_overdue);
        snoozedLl = (LinearLayout) findViewById(R.id.ll_profile_item_snoozed);
        completedLl = (LinearLayout) findViewById(R.id.ll_profile_item_completed);
        dayTv = (TextView) findViewById(R.id.tv_profile_item_day);
    }

    public void resetView(ProfileInfo profileInfo, int maxValue) {

        dayTv.setText(""+profileInfo.getDateFirst());

        float complete = (float)profileInfo.getCompletedTask() / maxValue * DensityUtil.dip2px(getContext(), 150);
        float snoozed = (float)profileInfo.getSnoozedTask() / maxValue * DensityUtil.dip2px(getContext(), 150);
        float overdue = (float)profileInfo.getOverdueTask() / maxValue * DensityUtil.dip2px(getContext(), 150);
        float none = DensityUtil.dip2px(getContext(), 150) - complete - snoozed - overdue;

        float width = DensityUtil.dip2px(getContext(), 8);
        noneLl.setLayoutParams(new LayoutParams((int)width, (int)none));
        overdueLl.setLayoutParams(new LayoutParams((int)width, (int)overdue));
        snoozedLl.setLayoutParams(new LayoutParams((int)width, (int)snoozed));
        completedLl.setLayoutParams(new LayoutParams((int)width, (int)complete));

    }
}
