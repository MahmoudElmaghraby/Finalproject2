package com.example.android.finalproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText1,editText2;
    Button button0,button1,button2;
    public static ArrayList<Student> students =new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.nametextview);
        editText1=findViewById(R.id.agetextview);
        editText2=findViewById(R.id.classtextview);
        button0=findViewById(R.id.savebutton);
        button1=findViewById(R.id.showRecycleview);
        button2=findViewById(R.id.showdata);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Student s1=new Student();
                s1.name=editText.getText().toString();
                s1.age=Integer.parseInt(editText1.getText().toString());
                s1.classs=editText2.getText().toString();
                students.add(s1);
                editText.setText("");
                editText1.setText("");
                editText2.setText("");

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("Name",editText.getText().toString());
                bundle.putString("Age",editText1.getText().toString());
                bundle.putString("Section",editText2.getText().toString());
                Intent intent=new Intent(MainActivity.this,show.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,showall.class);
                startActivity(intent);


            }
        });





    }
}
