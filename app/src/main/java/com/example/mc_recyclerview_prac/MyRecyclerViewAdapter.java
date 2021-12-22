package com.example.mc_recyclerview_prac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    List<Student> studentList;

    public MyRecyclerViewAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.data = studentList.get(position);
        holder.img.setImageResource(holder.data.imageId);
        holder.name.setText(holder.data.name);
        holder.rollNo.setText(holder.data.rollNo);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name;
        TextView rollNo;
        Student data;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img = img;
            this.name = name;
            this.rollNo = rollNo;
            this.data = data;
        }
    }
}
