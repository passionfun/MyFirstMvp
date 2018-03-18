package com.passionfun.testmvp.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.passionfun.testmvp.R;
import com.passionfun.testmvp.mvp.bean.User;
import com.passionfun.testmvp.mvp.presenter.UserLoginPresenter;
import com.passionfun.testmvp.mvp.view.IUserLoginView;

public class MainActivity extends AppCompatActivity implements IUserLoginView{
    private EditText et_userName;
    private EditText et_password;
    private Button btn_login;
    private Button btn_clear;
    private ProgressBar pb_show;
    private UserLoginPresenter userLoginPresenter = new UserLoginPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginPresenter.loginSuccessPresenter();
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginPresenter.clear();
            }
        });
    }

    private void initView() {
        et_userName = findViewById(R.id.et_userName);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        btn_clear = findViewById(R.id.btn_clear);
        pb_show = findViewById(R.id.pb_show);
    }
    @Override
    public String getUserName() {
        return et_userName.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return et_password.getText().toString().trim();
    }

    @Override
    public void showLoading() {
        pb_show.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        pb_show.setVisibility(View.GONE);
    }

    @Override
    public void toMainActivity(User user) {
        Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(MainActivity.this,"登录失败，用户名或密码错误！",Toast.LENGTH_LONG).show();
    }

    @Override
    public void clearUserName() {
        et_userName.setText("");
    }

    @Override
    public void clearPassword() {
        et_password.setText("");
    }
}
