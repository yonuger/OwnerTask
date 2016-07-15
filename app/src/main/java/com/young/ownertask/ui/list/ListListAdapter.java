package com.young.ownertask.ui.list;

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
 * date:16/6/29  14:19
 */


public class ListListAdapter extends BaseAdapter{

    private Context mContext;
    private List<ListNoticeInfo> mDatas;

    public ListListAdapter(Context context, List<ListNoticeInfo> mDatas) {
        this.mContext = context;
        if( mDatas != null ){
            this.mDatas = mDatas;
        }else{
            this.mDatas = new ArrayList<ListNoticeInfo>();
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
            view = LayoutInflater.from(mContext).inflate(R.layout.view_list_item, viewGroup, false);
        }
        ((ListItemView)view).resetView(mDatas.get(i));
        return view;
    }
}
