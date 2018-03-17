package com.example.android.youtube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;

    ArrayList<Videos> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerView);
        videoList=new ArrayList<>();

        videoList.add(new Videos(R.drawable.i1,"Avengers Infinity War","Avenger studios.1B views","3 months ago"));
        videoList.add(new Videos(R.drawable.dead,"DeadPool 2 Trailer","ABC company.20M views","8 months ago"));
        videoList.add(new Videos(R.drawable.cap,"Captain America Civil War","A Studios.50M views","8 months ago"));
        videoList.add(new Videos(R.drawable.titanic,"Titanic Full Movie","XYZ Ltd.10B views","5 years ago"));
        videoList.add(new Videos(R.drawable.harryp,"Harry Potter and the Deathly Hallows","JK Rowling.5B views","4 years ago"));
        LinearLayoutManager layoutmanager=new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvlayoutmanager=layoutmanager;
        recyclerview.setLayoutManager(rvlayoutmanager);

        YouTubeAdapter adapter=new YouTubeAdapter(this,videoList);
        recyclerview.setAdapter(adapter);


    }
}

