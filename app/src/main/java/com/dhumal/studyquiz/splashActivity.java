package com.dhumal.studyquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Thread thread = new Thread(){
          public void run(){
              try {
                  sleep(1000);
              }
              catch (Exception e){
                  e.printStackTrace();
              }
              finally {
                  Intent l = new Intent(splashActivity.this,MainActivity.class);
                  startActivity(l);
              }
          }
        };thread.start();

    }
}