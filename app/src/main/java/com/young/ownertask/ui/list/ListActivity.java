package com.young.ownertask.ui.list;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.young.ownertask.R;
import com.young.ownertask.widgets.NavigationBar;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends Activity {

    private TextView titleTv;
    private ListView listView;

    private NavigationBar navigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        titleTv = (TextView) findViewById(R.id.tv_list_title);
        listView = (ListView) findViewById(R.id.lv_list);
        navigationBar = (NavigationBar) findViewById(R.id.navigation_bar);

        navigationBar.showForList();

        makeData();
    }

    private void makeData() {
        List<ListNoticeInfo> mDatas = new ArrayList<ListNoticeInfo>();
        mDatas.add(new ListNoticeInfo("Apples", false));
        mDatas.add(new ListNoticeInfo("Bananas", true));
        mDatas.add(new ListNoticeInfo("Juice", false));
        mDatas.add(new ListNoticeInfo("Bread", true));
        mDatas.add(new ListNoticeInfo("Cheese", false));
        mDatas.add(new ListNoticeInfo("Milk", false));
        mDatas.add(new ListNoticeInfo("Yogurt", false));
        ListListAdapter adapter = new ListListAdapter(this, mDatas);
        listView.setAdapter(adapter);
    }
}
