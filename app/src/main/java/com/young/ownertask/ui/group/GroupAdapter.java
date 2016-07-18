package com.young.ownertask.ui.group;

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
 * date:16/6/29  13:15
 */


public class GroupAdapter extends BaseAdapter{

    private Context mContext;
    private List<GroupInfo> mDatas;

    public GroupAdapter(Context context, List<GroupInfo> mDatas) {
        this.mContext = context;
        if( mDatas != null ) {
            this.mDatas = mDatas;
        }else{
            this.mDatas = new ArrayList<GroupInfo>();
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
            view = LayoutInflater.from(mContext).inflate(R.layout.view_group_item, viewGroup, false);
        }
        ((GroupItemView)view).resetView(mDatas.get(i));
        return view;
    }
}
