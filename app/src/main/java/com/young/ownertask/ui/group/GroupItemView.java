package com.young.ownertask.ui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.young.ownertask.R;
import com.young.ownertask.ui.group.GroupInfo;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/29  13:22
 */


public class GroupItemView extends RelativeLayout{

    private TextView titleTv, numberTv;
    private RelativeLayout statueRl;

    public GroupItemView(Context context) {
        super(context);
        initComponent();
    }

    public GroupItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public GroupItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initComponent();
    }

    private void initComponent() {
        titleTv = (TextView) findViewById(R.id.tv_group_item_title);
        numberTv = (TextView) findViewById(R.id.tv_group_item_number);
        statueRl = (RelativeLayout) findViewById(R.id.rl_group_item_statue);
    }

    public void resetView(GroupInfo groupInfo) {
        titleTv.setText(groupInfo.getTitle());
        numberTv.setText(groupInfo.getNumber() + "  ITEMS");
    }
}
