package com.example.take1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        //Bundle extras = getIntent().getExtras();
//        String userName;
//
//            userName = extras.getString("id");
//
//            // and get whatever type user account id is
//            TextView profileName = (TextView) findViewById(R.id.heading);
//            profileName.setText(userName);
//        Log.i("username",userName);
        String newString;
        Bundle extras = getIntent().getExtras();
//        if (savedInstanceState == null) {
//            Bundle extras = getIntent().getExtras();
//            if(extras == null) {
//                newString= "food";
//                TextView profileName = (TextView) findViewById(R.id.heading);
//                profileName.setText(newString);
//
//            } else
          if(extras!=null){
                newString= extras.getString("id");
                TextView profileName = (TextView) findViewById(R.id.heading);
                String text = (String) profileName.getText();
                profileName.setText(newString);
            }

//        else {
//            newString= (String) savedInstanceState.getSerializable("id");
//            TextView profileName = (TextView) findViewById(R.id.heading);
//            profileName.setText(newString);
//        }
        Button btn = (Button) findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(Activity_1.this, Dashboard.class);
                startActivity(intToMain);

            }
        });
    }

    }
