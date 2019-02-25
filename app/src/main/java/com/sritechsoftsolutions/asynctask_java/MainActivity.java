package com.sritechsoftsolutions.asynctask_java;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btngetimage;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngetimage=findViewById(R.id.btngetimage);
        imgView=findViewById(R.id.imgView);
        btngetimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTask task=new MyTask(imgView);
                task.execute();
            }
        });



    }
}

