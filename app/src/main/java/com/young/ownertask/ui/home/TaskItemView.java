package com.young.ownertask.ui.home;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
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
 * date:16/6/28  18:36
 */


public class TaskItemView{

    private Context mContext;
    private LinearLayout taskLl;

    private View rootView;
    private RelativeLayout statueRl;
    private ImageView userIv;
    private TextView titleTv, timeTv, nameTv;

    public TaskItemView(Context context, LinearLayout taskLl) {
        this.mContext = context;
        this.taskLl = taskLl;
        initComponent();
    }

    private void initComponent() {
        rootView = LayoutInflater.from(mContext).inflate(R.layout.view_task_item, null, false);
        ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(params);
        statueRl = (RelativeLayout) rootView.findViewById(R.id.rl_view_task_statue);
        userIv = (ImageView) rootView.findViewById(R.id.iv_view_task_item_user);
        titleTv = (TextView) rootView.findViewById(R.id.tv_view_task_item_title);
        timeTv = (TextView) rootView.findViewById(R.id.tv_view_task_item_time);
        nameTv = (TextView) rootView.findViewById(R.id.tv_view_task_item_name);

    }

    public void resetView(BacklogInfo backlogInfo) {
        switch ( backlogInfo.getStatue() ){
            case 0:
                statueRl.setBackgroundColor(mContext.getResources().getColor(R.color.root_color));
                break;
            case 1:
                statueRl.setBackgroundColor(mContext.getResources().getColor(R.color.cyan));
                break;
            case 2:
                statueRl.setBackgroundColor(mContext.getResources().getColor(R.color.orange));
                break;
        }
        titleTv.setText(backlogInfo.getTitle());
        timeTv.setText(backlogInfo.getTime());
        nameTv.setText(backlogInfo.getName());
        userIv.setImageBitmap(backlogInfo.getBitmap());

    }

    public void joinInView() {
        taskLl.addView(rootView);
    }
}
