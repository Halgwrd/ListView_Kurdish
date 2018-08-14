package com.androkurd.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.androkurd.sllawcihan.R;

public class babet3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babet1);

        TextView deq = (TextView) findViewById(R.id.deq);
        deq.setText("Androkurd.com / babet 3");
    }
}
