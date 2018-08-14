# ListView دروستکردنی
<div dir=rtl>
    
هەنگاوەکان.. 

<strong>-- پڕگەی Layout و شێوەی نەخشەی دەرکەوتن --</strong>
پڕۆژەیەکی نوێ دروست دەکەین، دواتر Listviewێک دروست دەکەین لە پەڕگەی Layoutەکەمان، بۆ نموونە:
<pre><code> &lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_gravity="right"
    android:gravity="right"
    tools:context="com.androkurd.test.MainActivity"&gt;
    &lt;ListView android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:id="@+id/Listakaman"&gt;
    &lt;/ListView&gt;
&lt;/RelativeLayout&gt;</code></pre>
دواتر Layout نوێ دروستدەکەین و ناوی دەنێین nmunay_row بۆ ستوونەکانی Listviewیەکەمان، لەناو ئەم پەڕگەیەدا تەنها Textview دادەنێین، بەم شێوەیە:
<pre><code>&lt;?xml version="1.0" encoding="utf-8"?&gt;
    &lt;TextView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/deq_list"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:textSize="16sp" &gt;
    &lt;/TextView&gt;</code></pre>
وە Layoutێکیش بۆ باباتەکان دروست دەکەین و ناوی دەنێین activitybabet1, بەم شێوەیە:
<pre><code>&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.androkurd.test.babet1"&gt;

    &lt;TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:id="@+id/deq"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="51dp" /&gt;
&lt;/RelativeLayout&gt;</code></pre>
<strong>-- لە Actvity (چالاکی دان بەنەخشەکانمان) --</strong>
لە نێو Activityیە سەرکیەکەمان (MainActivity) سوود لە ArrayAdapter وەرئەگرین، لە ArrayAdapterەکەمان نووسینەکان لەناو Textviewێک دادەنێین کە دامان نا لە nmunay_row سوود لە textviewێک وەردەگرین بۆ نیشاندانی ناوی لیستەکان وە Activityیەکیش بۆ بابەتەکان دروست دەکەین و Layoutەکەی خۆی تێیدا دەناسێنین.

<strong>سەرەتا MainActivity.java</strong>
<pre><code>package com.androkurd.test;

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
    private ArrayAdapter&lt;String&gt; listAdapter;

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
        ArrayList&lt;String&gt; planetList = new ArrayList&lt;String&gt;();
        planetList.addAll(Arrays.asList(planets));

        // layout y aArrayAdaper dyary dakain lagal aw deqanay darkawe.
        listAdapter = new ArrayAdapter&lt;String&gt;(this, R.layout.nmunay_row, planetList);

        // lerada Adapter aka dary dakain.
        mainListView.setAdapter(listAdapter);

        // lerada bahoy switch farman dadin ka bcheta aw Activity amanawe ba suud wargrtn la postion akayn
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView&lt;?&gt; arg0, View arg1, int position, long arg3) {
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
}</code></pre>
Activityی بابەتەکان کە سێ دانەیە ١ و ٢ و ٣ بەڵام من تەنها ئەوەی یەکەم دادەنێنم و ئەوەی تر هەمان شتە و ژمارەکە گۆڕاوە، ناوی Classی babet1، بەم شێوەیە:
<pre><code>package com.androkurd.test;

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
}</code></pre>
<strong>وێنەی پڕۆژەکە:</strong>

<img style="width: auto; height: 400px;" src="https://user-images.githubusercontent.com/42367292/44076451-e31589f0-9fa8-11e8-956e-280f0d5fad1b.png" alt="وێنەکە لەکار کەو" /><img style="width: auto; height: 400px;" src="https://user-images.githubusercontent.com/42367292/44076498-1180df92-9fa9-11e8-9972-b5db65f5afbe.png" alt="وێنەکە لەکار کەو" />
>  سووپاس، سەرکەوتووبن.
> 
</div>
