package com.young.ownertask.ui.group;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.young.ownertask.R;

import java.util.ArrayList;
import java.util.List;

public class GroupActivity extends Activity {

    private GridView groupGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        List<GroupInfo> mData = new ArrayList<GroupInfo>();
        mData.add(new GroupInfo("Shop", 25));
        mData.add(new GroupInfo("Work", 12));
        mData.add(new GroupInfo("Health", 3));
        mData.add(new GroupInfo("Travel", 8));
        mData.add(new GroupInfo("Bills", 16));
        mData.add(new GroupInfo("Auto", 14));
        GroupAdapter adapter = new GroupAdapter(this, mData);
        groupGv = (GridView) findViewById(R.id.gv_group);
        groupGv.setAdapter(adapter);
    }
}
