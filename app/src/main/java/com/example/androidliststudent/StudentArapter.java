package com.example.androidliststudent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentArapter extends RecyclerView.Adapter<StudentArapter.StudentViewHolder> {
    public List<Students> Students;


    public StudentArapter(MainActivity mainActivity, List<Students> students) {
        Students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_student, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        String profile = "";
        profile += Students.get(position).name +" " + Students.get(position).age +" " + Students.get(position).hometown;
        holder.tvView.setText(profile );

    }

    @Override
    public int getItemCount() {
        return Students.size();

    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvView;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvView = itemView.findViewById(R.id.tv_student);
        }
    }
    ;
}