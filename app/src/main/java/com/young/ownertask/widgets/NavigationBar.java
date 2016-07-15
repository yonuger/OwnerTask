package com.young.ownertask.widgets;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.young.ownertask.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/28  10:58
 */
public class NavigationBar extends RelativeLayout{

    private TextView numberTv;
    private ImageView shareIv, searchIv, menuIv;

    public NavigationBar(Context context) {
        super(context);
        initCompoment();
    }

    public NavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initCompoment();
    }

    public NavigationBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initCompoment();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initCompoment();
    }

    private void initCompoment() {
        numberTv = (TextView) findViewById(R.id.tv_navigation_bar_number);
        shareIv = (ImageView) findViewById(R.id.iv_navigation_bar_share);
        searchIv = (ImageView) findViewById(R.id.iv_navigation_bar_search);
        menuIv = (ImageView) findViewById(R.id.iv_navigation_bar_menu);
    }

    public void showForList() {
        numberTv.setVisibility(VISIBLE);
        shareIv.setVisibility(VISIBLE);
    }

    public ImageView getMenu() {
        return menuIv;
    }
}
