package com.young.ownertask.ui.profile;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.young.ownertask.R;
import com.young.ownertask.widgets.HorizontalListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 针对于用户已用的情况的程序进行统计并以图表的形式进行显示
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/15  16:04
 */
public class ProfileActivity extends Activity {

    private HorizontalListView hListView;
    private ProfileAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        hListView = (HorizontalListView)findViewById(R.id.hlv_profile_chart);

////        List<ProfileInfo> profileInfoList = new ArrayList<ProfileInfo>();
////        for (int i=0; i<10; i++){
////            profileInfoList.add(new ProfileInfo());
////        }
////        adapter = new ProfileAdapter(this, profileInfoList);
////        hListView.setAdapter(adapter);
//
//        hListView = (HorizontalListView)findViewById(R.id.horizon_listview);

        String[] titles = {"��ʦ", "�ϻ�誾�У", "�չ�"};
        final int[] ids = {R.mipmap.pic_user_s_01, R.mipmap.pic_user_s_02, R.mipmap.pic_user_s_03};
        adapter = new ProfileAdapter(this,titles,ids);
        hListView.setAdapter(adapter);
        //		hListView.setOnItemSelectedListener(new OnItemSelectedListener() {
        //
        //			@Override
        //			public void onItemSelected(AdapterView<?> parent, View view,
        //					int position, long id) {
        //				// TODO Auto-generated method stub
        //				if(olderSelected != null){
        //					olderSelected.setSelected(false); //��һ��ѡ�е�View�ָ�ԭ����
        //				}
        //				olderSelected = view;
        //				view.setSelected(true);
        //			}
        //
        //			@Override
        //			public void onNothingSelected(AdapterView<?> parent) {
        //				// TODO Auto-generated method stub
        //
        //			}
        //		});
        hListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
//				if(olderSelectView == null){
//					olderSelectView = view;
//				}else{
//					olderSelectView.setSelected(false);
//					olderSelectView = null;
//				}
//				olderSelectView = view;
//				view.setSelected(true);

            }
        });
    }
}
