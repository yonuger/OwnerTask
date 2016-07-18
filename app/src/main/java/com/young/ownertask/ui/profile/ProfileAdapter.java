package com.young.ownertask.ui.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.young.ownertask.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:35
 */


import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class ProfileAdapter extends BaseAdapter{

    private List<ProfileInfo> mDatas;
    private Context mContext;
    private LayoutInflater mInflater;

    //最高的任务数值
    private int maxValue;

    public ProfileAdapter(Context context, List<ProfileInfo> profileInfoList){
        this.mContext = context;
        if( profileInfoList == null ){
            profileInfoList = new ArrayList<ProfileInfo>();
        }
        this.mDatas = profileInfoList;
        for (ProfileInfo mProfile :
                profileInfoList) {
            maxValue = maxValue>mProfile.getTotleTask()?maxValue:mProfile.getTotleTask();
        }
        mInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if( view == null ){
            view = mInflater.inflate(R.layout.view_profile_item, null);
        }
        ((ProfileViewItem)view).resetView(mDatas.get(position), maxValue);
        return view;
    }
}
