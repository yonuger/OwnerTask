package com.young.ownertask.ui.calendar;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.young.ownertask.R;
import com.young.ownertask.ui.BacklogInfo;
import com.young.ownertask.ui.add.view.AddActivity;
import com.young.ownertask.ui.group.GroupActivity;
import com.young.ownertask.ui.home.CalendarAdapter;
import com.young.ownertask.ui.home.CalendarInfo;
import com.young.ownertask.ui.home.TaskItemView;
import com.young.ownertask.ui.list.ListActivity;
import com.young.ownertask.ui.profile.ProfileActivity;
import com.young.ownertask.ui.setting.SettingActivity;
import com.young.ownertask.ui.timeline.TimeLineActivity;
import com.young.ownertask.widgets.NavigationBar;
import com.young.ownertask.widgets.SlideMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/18  16:21
 */


public class CalendarActivity extends Activity implements View.OnClickListener {

    private LinearLayout taskLl;
    private GridView calendarGv;

    private SlideMenu slideMenu;
    private NavigationBar navigationBar;

    //菜单控件
    private RelativeLayout listsRl, groupRl, profileRl, timelineRl, settingRl;

    //添加按钮
    private ImageView addIv;
    private LinearLayout headLl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_calendar);

        initComponent();
        makeData();
    }

    private void initComponent() {

        navigationBar = (NavigationBar) findViewById(R.id.navigation_bar);

        headLl = (LinearLayout) findViewById(R.id.ll_home_head);

        taskLl = (LinearLayout) findViewById(R.id.ll_home_task);
        calendarGv = (GridView) findViewById(R.id.gv_home_calendar);
        slideMenu = (SlideMenu) findViewById(R.id.slide_menu);

        listsRl = (RelativeLayout) findViewById(R.id.rl_layout_menu_lists);
        listsRl.setOnClickListener(this);
        groupRl = (RelativeLayout) findViewById(R.id.rl_layout_menu_group);
        groupRl.setOnClickListener(this);
        profileRl = (RelativeLayout) findViewById(R.id.rl_layout_menu_profile);
        profileRl.setOnClickListener(this);
        timelineRl = (RelativeLayout) findViewById(R.id.rl_layout_menu_timeline);
        timelineRl.setOnClickListener(this);
        settingRl = (RelativeLayout) findViewById(R.id.rl_layout_menu_setting);
        settingRl.setOnClickListener(this);


        navigationBar.getMenu().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (slideMenu.isMainScreenShowing()) {
                    slideMenu.openMenu();
                } else {
                    slideMenu.closeMenu();
                }
            }
        });
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
        calendarInfoList.add(new CalendarInfo("SUN", false,false));
        calendarInfoList.add(new CalendarInfo("MON", false,false));
        calendarInfoList.add(new CalendarInfo("TUE", false,false));
        calendarInfoList.add(new CalendarInfo("WED", false,false));
        calendarInfoList.add(new CalendarInfo("THU", false,false));
        calendarInfoList.add(new CalendarInfo("FRI", false,false));
        calendarInfoList.add(new CalendarInfo("SAT", false,false));
        calendarInfoList.add(new CalendarInfo("31", false, false));
        for(int i = 1; i < 29; i++){
            if( i == 8 || i == 11 ){
                calendarInfoList.add(new CalendarInfo(""+i, true, true));
            }else{
                calendarInfoList.add(new CalendarInfo(""+i, false, true));
            }
        }
        for(int i = 1; i < 7; i++){
            calendarInfoList.add(new CalendarInfo(""+i, false, false));
        }
        CalendarAdapter adapter = new CalendarAdapter(this, calendarInfoList);
        calendarGv.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rl_layout_menu_group:
                slideMenu.closeMenu();
                Intent intent = new Intent(this, GroupActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this, headLl, "transitionHead").toBundle());
//                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
                break;
            case R.id.rl_layout_menu_lists:
                slideMenu.closeMenu();
                intent = new Intent(this, ListActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
                break;
            case R.id.rl_layout_menu_profile:
                slideMenu.closeMenu();
                intent = new Intent(this, ProfileActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
                break;
            case R.id.rl_layout_menu_timeline:
                slideMenu.closeMenu();
                intent = new Intent(this, TimeLineActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
                break;
            case R.id.rl_layout_menu_setting:
                slideMenu.closeMenu();
                intent = new Intent(this, SettingActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
                break;
            case R.id.iv_home_add:
                intent = new Intent(this, AddActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
                break;
            case R.id.tv_home_title:

                break;
        }
    }
}
