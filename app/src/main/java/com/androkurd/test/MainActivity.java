package com.androkurd.test;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androkurd.sllawcihan.R;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView;
    private ArrayAdapter<String> listAdapter;


    /**
     * yakam hangaw activity bang dakain
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativitymain);

        // lerda ListView kaman danasenin
        mainListView = (ListView) findViewById(R.id.Listakaman);

        // aw nawanay la listakaman habe
        String[] planets = new String[]{
                "babet1",
                "babet2",
                "babet3",
                "babet4",
                "babet5"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll(Arrays.asList(planets));

        // layout y aArrayAdaper dyary dakain lagal aw deqanay darkawe.
        listAdapter = new ArrayAdapter<String>(this, R.layout.nmunay_row, planetList);


        // lerada Adapter aka dary dakain.
        mainListView.setAdapter(listAdapter);

        // lerada bahoy switch farman dadin ka bcheta aw Activity amanawe ba suud wargrtn la postion akayn
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, babet1.class);
                        startActivity(intent);

                        break;
                    case 1:
                        Intent kurd = new Intent(MainActivity.this, babet2.class);
                        startActivity(kurd);

                        break;

                    case 2:

                        Intent about = new Intent(MainActivity.this, babet3.class);
                        startActivity(about);

                        break;
                }
            }
        });

    }
}
