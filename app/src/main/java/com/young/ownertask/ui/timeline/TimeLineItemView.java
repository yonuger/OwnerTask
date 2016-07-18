package com.young.ownertask.ui.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.young.ownertask.R;
import com.young.ownertask.ui.BacklogInfo;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/18  13:51
 */

public class TimeLineItemView {

    private Context mContext;
    private LinearLayout timelineLl;
    private View rootView;
    private TextView titleTv;

    public TimeLineItemView(Context context, LinearLayout timelineLl) {
        this.mContext = context;
        this.timelineLl = timelineLl;
        initComponent();
    }

    private void initComponent() {
        rootView = LayoutInflater.from(mContext).inflate(R.layout.view_timeline_item, null, false);
        ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(params);
        titleTv = (TextView) rootView.findViewById(R.id.tv_view_item_timeline_title);
    }

    public void resetView(TimeLineInfo timeLineInfo) {
        titleTv.setText(timeLineInfo.getWeek() + ", " + timeLineInfo.getDate() + ", " + timeLineInfo.getYear());
    }

    public void joinInView() {
        timelineLl.addView(rootView);
    }
}
