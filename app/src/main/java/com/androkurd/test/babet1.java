package com.androkurd.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androkurd.sllawcihan.R;

public class babet1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babet1);

        TextView deq = (TextView) findViewById(R.id.deq);
        deq.setText("Androkurd.com / babet 1");
    }
}
