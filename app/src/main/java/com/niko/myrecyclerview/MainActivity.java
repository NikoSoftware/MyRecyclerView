package com.niko.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerView;

    private List<String> lists =new ArrayList<String>(){
        {
            Log.d("TAG===>", "MainActivity");
            for (int i = 0;i<100;i++){
                add(i+"");
            }
        }
    };

    @Override
    public int setView() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {

        recyclerView = (RecyclerView) findViewById(R.id.RecyclerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(this, lists));
    }
}
