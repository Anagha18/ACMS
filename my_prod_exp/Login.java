package com.example.my_prod_exp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login Form");
    }

}
