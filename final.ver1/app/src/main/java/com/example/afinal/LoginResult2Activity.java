package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginResult2Activity extends AppCompatActivity {
    TextView TextView_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        TextView_get = findViewById(R.id.TextView_get2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String email =  bundle.getString("email");
        String password = bundle.getString("password");

        TextView_get.setText("두번 째 로그인으로 로그인하셨습니다!");

    }
}