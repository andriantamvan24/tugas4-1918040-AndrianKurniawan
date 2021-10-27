 package com.example.projectrecycleviewneww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
     private RecyclerView rvMedia;
     private ArrayList<Media> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMedia = findViewById(R.id.rv_media);
        rvMedia.setHasFixedSize(true);


        list.addAll(MediaData.getListData());
        showRecyclerList();
    }
     private void showRecyclerList(){
         rvMedia.setLayoutManager(new LinearLayoutManager(this));
         ListMediaAdapter listmediaAdapter = new ListMediaAdapter(list);
         rvMedia.setAdapter(listmediaAdapter);
     }

}