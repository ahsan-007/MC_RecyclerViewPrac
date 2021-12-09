package com.example.mc_recyclerview_prac;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView<CustomAdapter.MyViewHolder> {

    ArrayList<Student> students;

    public CustomAdapter(@NonNull ArrayList<Student> students) {
        super(null);
        this.students = students;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView rollNo;
        Student data;

        public MyViewHolder(View view){
            super(view);
        }
    }
}
