package com.young.ownertask.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.young.ownertask.R;

public class LoginActivity extends Activity implements View.OnClickListener {

    private TextView signUpTv;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUpTv = (TextView) findViewById(R.id.tv_login_sign_up);
        signUpTv.setOnClickListener(this);
        loginBtn = (Button) findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_login_sign_up:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.btn_login:
                startActivity(new Intent(this, HomeActivity.class));
        }
    }
}
