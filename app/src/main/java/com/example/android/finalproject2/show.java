package com.example.android.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class show extends AppCompatActivity {


    Bundle bundlee=new Bundle();
    String name,age,section;
    TextView textView,textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        bundlee=getIntent().getExtras();

        name=bundlee.getString("Name");
        age=bundlee.getString("Age");
        section=bundlee.getString("Section");
        textView=findViewById(R.id.textview1);
        textView1=findViewById(R.id.textview2);
        textView2=findViewById(R.id.textview3);
        textView.setText(name);
        textView1.setText(age);
        textView2.setText(section);


    }
}
