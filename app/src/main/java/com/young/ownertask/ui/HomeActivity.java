package com.young.ownertask.ui;


import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.young.ownertask.R;
import com.young.ownertask.widgets.TaskItemView;

import java.util.ArrayList;
import java.util.List;

/**
 * 本素材由千图网获得,请勿作任何商业用途进行收费下载
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/28  12:17
 */

public class HomeActivity extends Activity {

    private LinearLayout taskLl;
    private GridView calendarGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        taskLl = (LinearLayout) findViewById(R.id.ll_home_task);
        calendarGv = (GridView) findViewById(R.id.gv_home_calendar);

        makeData();
    }


    /**
     * 制造假数据
     */
    private void makeData() {
        TaskItemView taskItemView = new TaskItemView(this, taskLl);
        BacklogInfo mBacklogInfo = new BacklogInfo(this, R.mipmap.pic_user_s_01,
                "New subpage for Janet", "8 - 11am", "", 1);
        taskItemView.resetView(mBacklogInfo);
        taskItemView.joinInView();
        TaskItemView taskItemView1 = new TaskItemView(this, taskLl);
        BacklogInfo mBacklogInfo1 = new BacklogInfo(this, R.mipmap.pic_user_s_02,
                "Catch up with Tom", "11 - 12pm", "Hangouts", 0);
        taskItemView1.resetView(mBacklogInfo1);
        taskItemView1.joinInView();
        TaskItemView taskItemView2 = new TaskItemView(this, taskLl);
        BacklogInfo mBacklogInfo2 = new BacklogInfo(this, R.mipmap.pic_user_s_03,
                "Lunch with Diane", "1pm","Restaurant", 2);
        taskItemView2.resetView(mBacklogInfo2);
        taskItemView2.joinInView();

        List<CalendarInfo> calendarInfoList = new ArrayList<CalendarInfo>();
        calendarInfoList.add(new CalendarInfo("SUN", false));
        calendarInfoList.add(new CalendarInfo("MON", false));
        calendarInfoList.add(new CalendarInfo("TUE", false));
        calendarInfoList.add(new CalendarInfo("WED", false));
        calendarInfoList.add(new CalendarInfo("THU", false));
        calendarInfoList.add(new CalendarInfo("FRI", false));
        calendarInfoList.add(new CalendarInfo("SAT", false));
        for(int i = 7; i < 14; i++){
            if( i == 8 || i == 11 ){
                calendarInfoList.add(new CalendarInfo(""+i, true));
            }else{
                calendarInfoList.add(new CalendarInfo(""+i, false));
            }
        }
        CalendarAdapter adapter = new CalendarAdapter(this, calendarInfoList);
        calendarGv.setAdapter(adapter);
    }

}
