package com.young.ownertask.ui.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.young.ownertask.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/29  14:24
 */


public class ListItemView extends LinearLayout{

    private TextView titleTv;
    private ImageView checkIv;
    private RelativeLayout statueRl;

    public ListItemView(Context context) {
        super(context);
        initComponent();
    }

    public ListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public ListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initComponent();
    }

    private void initComponent() {
        titleTv = (TextView) findViewById(R.id.tv_list_item_title);
        checkIv = (ImageView) findViewById(R.id.iv_list_item_check);
        statueRl = (RelativeLayout) findViewById(R.id.rl_list_item_statue);
    }

    public void resetView(ListNoticeInfo listNoticeInfo) {
        titleTv.setText(listNoticeInfo.getTitle());
        if( listNoticeInfo.isHasNotice() ){
            checkIv.setImageResource(R.mipmap.ic_check);
            statueRl.setBackgroundColor(getResources().getColor(R.color.cyan));
        }else{
            checkIv.setImageResource(R.mipmap.ic_check_gray);
            statueRl.setBackgroundColor(getResources().getColor(R.color.gray));
        }
    }
}
