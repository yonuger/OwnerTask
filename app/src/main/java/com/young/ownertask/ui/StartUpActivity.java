package com.young.ownertask.ui;

import android.app.Activity;
import android.content.Intent;
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
                startActivity(new Intent(this, LoginActivity.class));
        }
    }
}
