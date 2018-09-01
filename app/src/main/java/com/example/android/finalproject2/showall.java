package com.example.android.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class showall extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager ;
    RecyclerView no ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showall);

        no =  findViewById(R.id.rec);
        layoutManager = new LinearLayoutManager(this);
        studentadapter sa=new studentadapter(MainActivity.students);
        no.setLayoutManager(layoutManager);
        no.setAdapter(sa);

    }
}
