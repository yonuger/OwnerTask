package com.young.ownertask.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.young.ownertask.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/28  20:08
 */


public class CalendarAdapter extends BaseAdapter{

    private List<CalendarInfo> data;
    private Context mContext;
    private List<CalendarInfo> mDatas;

    public CalendarAdapter(Context context, List<CalendarInfo> data) {
        this.mContext = context;
        if( data != null ){
            this.mDatas = data;
        }else{
            this.mDatas = new ArrayList<CalendarInfo>();
        }
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if( view == null ){
            view = LayoutInflater.from(mContext).inflate(R.layout.view_calendar_item, viewGroup, false);
        }
        ((CalendarItemView)view).resetView(mDatas.get(i));
        return view;
    }
}
