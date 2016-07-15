package com.young.ownertask.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.young.ownertask.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:39
 */


public class ProfileViewItem extends LinearLayout{

    public ProfileViewItem(Context context) {
        super(context);
    }

    public ProfileViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProfileViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initComponent();
    }

    private void initComponent() {
    }

    public void resetView(ProfileInfo profileInfo) {

    }
}
