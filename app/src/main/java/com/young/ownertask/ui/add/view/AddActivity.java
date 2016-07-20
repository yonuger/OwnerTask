package com.young.ownertask.ui.add.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.young.ownertask.R;
import com.young.ownertask.ui.add.presenter.IAddPresenter;
import com.young.ownertask.ui.add.presenter.AddPresenter;
import com.young.ownertask.utils.TimeUtils;
import com.zwc.togglebutton.ToggleButton;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.NoTitle;
import org.androidannotations.annotations.ViewById;

import java.util.Calendar;

/**
 * 作为使用MVP以及Annotations的第一个实例
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/19  17:38
 */

//@Fullscreen 全屏
//@NoTitle 无标题
    @EActivity(R.layout.activity_add)
public class AddActivity extends Activity implements IAddRootView{

    private IAddPresenter presenter;

    @ViewById(R.id.et_activity_add_title)
    EditText titleEt;
    @ViewById(R.id.et_activity_add_description)
    EditText descriptionEt;
    @ViewById(R.id.tgbtn_activity_add_switch)
    ToggleButton switchTgbtn;
    @ViewById(R.id.ll_activity_add_time)
    LinearLayout timeLl;
    @ViewById(R.id.tv_add_from_date)
    TextView fromDateTv;
    @ViewById(R.id.tv_add_from_time)
    TextView fromTimeTv;
    @ViewById(R.id.tv_add_to_date)
    TextView toDateTv;
    @ViewById(R.id.tv_add_to_time)
    TextView toTimeTv;
    @ViewById(R.id.tv_add_repeat)
    TextView repeatTv;
    @ViewById(R.id.iv_add_add)
    ImageView addIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new AddPresenter(this);
    }

    @Override
    public void setData(String data) {

    }

    @Override
    public void selectDate(final int type) {
        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                // TODO Auto-generated method stub
                presenter.setDate(type, year, month, day);
            }
        }, TimeUtils.getCurrentYear(),
                TimeUtils.getCurrentMonth(),
                TimeUtils.getCurrentDay()).show();
    }

    @Override
    public void selectTime(final int type) {
        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                presenter.setTime(type, i, i1);
            }
        }, TimeUtils.getCurrentHour(), TimeUtils.getCurrentMinute(), true).show();
    }

    @Override
    public void setDate(int type, String data) {
        if( type == AddPresenter.FROM ){
            fromDateTv.setText(data);
        }else{
            toDateTv.setText(data);
        }
    }

    @Override
    public void setTime(int type, String data) {
        if( type == AddPresenter.FROM ){
            fromTimeTv.setText(data);
        }else{
            toTimeTv.setText(data);
        }
    }

    @Override
    public void selectRepeat() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //    指定下拉列表的显示数据
        final String[] repeatsShow = {"不重复", "每年一次", "每月一次", "每日一次"};
        final String[] repeats = {"none", "yearly", "monthly", "daily"};
        //    设置一个下拉的列表选择项
        builder.setItems(repeatsShow, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                presenter.setRepeat(repeats[which]);
            }
        });
        builder.show();
    }

    @Override
    public void setRepeat(String data) {
        repeatTv.setText(data);
    }

    @Override
    public void isAllDay(boolean b) {
        if( b ){
            timeLl.setVisibility(View.GONE);
        }else{
            timeLl.setVisibility(View.VISIBLE);
        }
    }

    @AfterViews
    public void initUI(){
        presenter.initDateAndTime();
        presenter.initRepeat();
        switchTgbtn.setOnToggleChanged(new ToggleButton.OnToggleChanged() {
            @Override
            public void onToggle(boolean on) {
                if( on ){
                    presenter.isSetAllDay(false);
                }else{
                    presenter.isSetAllDay(true);
                }
            }
        });
    }

    @Click({R.id.tv_add_from_date, R.id.tv_add_from_time, R.id.tv_add_to_date,
            R.id.tv_add_to_time, R.id.tv_add_repeat, R.id.iv_add_add})
    public void click(View view){
        switch (view.getId()){
            case R.id.tv_add_from_date:
                selectDate(AddPresenter.FROM);
                break;
            case R.id.tv_add_from_time:
                selectTime(AddPresenter.FROM);
                break;
            case R.id.tv_add_to_date:
                selectDate(AddPresenter.TO);
                break;
            case R.id.tv_add_to_time:
                selectTime(AddPresenter.TO);
                break;
            case R.id.tv_add_repeat:
                selectRepeat();
                break;
            case R.id.iv_add_add:
                addTask();
        }
    }

    @Override
    public void addTask() {
        presenter.addTask();
    }
}
