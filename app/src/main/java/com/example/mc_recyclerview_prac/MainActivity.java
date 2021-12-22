package com.example.mc_recyclerview_prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));
        studentList.add(new Student("BCSF18M007","Muhammad Ahsan",R.drawable.ic_baseline_emoji_emotions_100));
        studentList.add(new Student("BCSF18M002","Suleman Sohail",R.drawable.ic_baseline_person_100));
        studentList.add(new Student("BCSF18M016","Muhammad Ali",R.drawable.ic_baseline_elderly_100));
        studentList.add(new Student("BCSF18M056","Omer Sharif",R.drawable.ic_baseline_outlet_100));


    }
}