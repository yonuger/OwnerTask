package com.young.ownertask.ui.profile;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.young.ownertask.R;
import com.young.ownertask.widgets.HorizontalListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 针对于用户已用的情况的程序进行统计并以图表的形式进行显示
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:04
 */
public class ProfileActivity extends Activity {

    HorizontalListView hListView;
    ProfileAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initUI();
    }

    public void initUI(){
        hListView = (HorizontalListView)findViewById(R.id.horizon_listview);
        List<ProfileInfo> profileInfoList = new ArrayList<ProfileInfo>();
        profileInfoList.add(new ProfileInfo(8,5,1,1));
        profileInfoList.add(new ProfileInfo(7,3,1,4));
        profileInfoList.add(new ProfileInfo(9,3,1,7));
        profileInfoList.add(new ProfileInfo(10,3,1,11));
        profileInfoList.add(new ProfileInfo(6,3,1,14));
        profileInfoList.add(new ProfileInfo(5,5,1,17));
        profileInfoList.add(new ProfileInfo(6,5,1,20));
        profileInfoList.add(new ProfileInfo(6,1,1,23));
        profileInfoList.add(new ProfileInfo(8,5,2,25));
        profileInfoList.add(new ProfileInfo(7,5,2,27));
        adapter = new ProfileAdapter(this, profileInfoList);
        hListView.setAdapter(adapter);
    }
}
