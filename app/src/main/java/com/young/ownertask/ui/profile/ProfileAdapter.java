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

public class ProfileAdapter extends BaseAdapter{
//    private List<ProfileInfo> mDatas;
//    private Context mContext;
//    private LayoutInflater mInflater;
//    Bitmap iconBitmap;
//    private int selectIndex = -1;

    private int[] mIconIDs;
    private String[] mTitles;
    private Context mContext;
    private LayoutInflater mInflater;
    Bitmap iconBitmap;
    private int selectIndex = -1;

    public ProfileAdapter(Context context, String[] titles, int[] ids){
//        this.mContext = context;
//        if( profileInfoList == null ){
//            profileInfoList = new ArrayList<ProfileInfo>();
//        }
//        this.mDatas = profileInfoList;
//        mInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//LayoutInflater.from(mContext);
        this.mContext = context;
        this.mIconIDs = ids;
        this.mTitles = titles;
        mInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return mIconIDs.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView==null){
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.view_profile_item, null);
//            holder.mImage=(ImageView)convertView.findViewById(R.id.img_list_item);
//            holder.mTitle=(TextView)convertView.findViewById(R.id.text_list_item);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        if(position == selectIndex){
            convertView.setSelected(true);
        }else{
            convertView.setSelected(false);
        }

//        holder.mTitle.setText(mTitles[position]);
//        holder.mImage.setImageBitmap(iconBitmap);

        return convertView;
    }

    private static class ViewHolder {

    }

    public void setSelectIndex(int i){
        selectIndex = i;
    }
}
