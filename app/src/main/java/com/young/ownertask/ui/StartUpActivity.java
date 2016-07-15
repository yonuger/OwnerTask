package com.young.ownertask.ui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.young.ownertask.R;

public class StartUpActivity extends Activity implements View.OnClickListener {

    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);

        nextBtn = (Button) findViewById(R.id.btn_next);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_next:
                Intent intent = new Intent(StartUpActivity.this, LoginActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                }else{
                    startActivity(intent);
                }
        }
    }
}
