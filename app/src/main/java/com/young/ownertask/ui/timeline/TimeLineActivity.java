package com.young.ownertask.ui.timeline;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.young.ownertask.R;
import com.young.ownertask.ui.BacklogInfo;
import com.young.ownertask.ui.home.TaskItemView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 记录了所有的历史行程
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/18  11:23
 */

public class TimeLineActivity extends Activity {

    private LinearLayout timeLineLl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);

        timeLineLl = (LinearLayout) findViewById(R.id.ll_timeline_list);


        TimeLineInfo timeLineInfo1 = new TimeLineInfo("2015", "FEB 8", "MONDAY");
        TimeLineItemView timeLineItemView = new TimeLineItemView(this, timeLineLl);
        timeLineItemView.resetView(timeLineInfo1);
        timeLineItemView.joinInView();
        TaskItemView taskItemView = new TaskItemView(this, timeLineLl);
        BacklogInfo mBacklogInfo = new BacklogInfo(this, R.mipmap.pic_user_s_01,
                "New subpage for Janet", "8 - 11am", "", 1);
        taskItemView.resetView(mBacklogInfo);
        taskItemView.joinInView();
        TaskItemView taskItemView1 = new TaskItemView(this, timeLineLl);
        BacklogInfo mBacklogInfo1 = new BacklogInfo(this, R.mipmap.pic_user_s_02,
                "Catch up with Tom", "11 - 12pm", "Hangouts", 0);
        taskItemView1.resetView(mBacklogInfo1);
        taskItemView1.joinInView();
        TaskItemView taskItemView2 = new TaskItemView(this, timeLineLl);
        BacklogInfo mBacklogInfo2 = new BacklogInfo(this, R.mipmap.pic_user_s_03,
                "Lunch with Diane", "1pm","Restaurant", 2);
        taskItemView2.resetView(mBacklogInfo2);
        taskItemView2.joinInView();

        TimeLineInfo timeLineInfo2 = new TimeLineInfo("2015", "FEB 8", "MONDAY");
        TimeLineItemView timeLineItemView2 = new TimeLineItemView(this, timeLineLl);
        timeLineItemView2.resetView(timeLineInfo2);
        timeLineItemView2.joinInView();
        TaskItemView taskItemView3 = new TaskItemView(this, timeLineLl);
        BacklogInfo mBacklogInfo3 = new BacklogInfo(this, R.mipmap.pic_user_s_01,
                "New subpage for Janet", "8 - 11am", "", 1);
        taskItemView3.resetView(mBacklogInfo);
        taskItemView3.joinInView();
        TaskItemView taskItemView4 = new TaskItemView(this, timeLineLl);
        BacklogInfo mBacklogInfo4 = new BacklogInfo(this, R.mipmap.pic_user_s_02,
                "Catch up with Tom", "11 - 12pm", "Hangouts", 0);
        taskItemView4.resetView(mBacklogInfo1);
        taskItemView4.joinInView();
        TaskItemView taskItemView5 = new TaskItemView(this, timeLineLl);
        BacklogInfo mBacklogInfo5 = new BacklogInfo(this, R.mipmap.pic_user_s_03,
                "Lunch with Diane", "1pm","Restaurant", 2);
        taskItemView5.resetView(mBacklogInfo2);
        taskItemView5.joinInView();
    }
}
