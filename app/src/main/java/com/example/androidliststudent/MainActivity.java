package com.example.androidliststudent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewStudent;
    StudentArapter studentAdapter;
    public List<Students> Students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Students.add(new Students("Thieu", 23,"Quang Tri"));
        Students.add( new Students("Lan", 34,"Hue"));
        Students.add( new Students("Hao", 23,"Quang Nam"));
        Students.add( new Students("Nhi", 22,"Hair Phong"));
        Students.add( new Students("Phuong", 25,"Binh Thuan"));


        recyclerViewStudent = findViewById(R.id.Recyckerview_task);
        recyclerViewStudent.setLayoutManager(new LinearLayoutManager(this));

        studentAdapter = new StudentArapter( this, Students);
        recyclerViewStudent.setAdapter(studentAdapter);

    }
    public void clickAdd (View view){
        Students newTask = new Students("Anonymous", 20,"Galaxy");
        Students.add(newTask);
        studentAdapter.notifyDataSetChanged();
    }
    public void clickDelete (View view){
        Students.remove(4);
        studentAdapter.notifyDataSetChanged();
    }
}