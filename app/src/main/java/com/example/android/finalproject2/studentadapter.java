package com.example.android.finalproject2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class studentadapter extends RecyclerView.Adapter<studentadapter.studentViewHolder> {

    ArrayList<Student> listss ;

    public studentadapter(ArrayList<Student> listss) {
        this.listss = listss;
    }

    public static class studentViewHolder extends RecyclerView.ViewHolder {

        TextView textView0 , textView11 , textView22 ;

        public studentViewHolder(@NonNull View itemView) {
            super(itemView);
            textView0 = itemView.findViewById(R.id.t1);
            textView11 = itemView.findViewById(R.id.t2);
            textView22 = itemView.findViewById(R.id.t3);
        }
    }

    @NonNull
    @Override
    public studentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View roww = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowww, parent, false);
        studentViewHolder holder = new studentViewHolder(roww);
        return holder ;

        }

    @Override
    public void onBindViewHolder(@NonNull studentViewHolder holder, int position) {

        Student student = new Student();
        student.name = listss.get(position).name;
        student.age = listss.get(position).age;
        student.classs = listss.get(position).classs ;

        holder.textView0.setText("Name : " + student.name);
        holder.textView11.setText("Age = " + student.age);
        holder.textView22.setText("Section : " + student.classs);


    }

    @Override
    public int getItemCount() {
        return listss.size();
    }
}
