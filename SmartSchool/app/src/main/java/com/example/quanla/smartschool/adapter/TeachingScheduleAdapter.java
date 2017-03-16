package com.example.quanla.smartschool.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanla.smartschool.R;
import com.example.quanla.smartschool.activities.StudentListActivity;
import com.example.quanla.smartschool.adapter.viewhodler.ClassListHodler;
import com.example.quanla.smartschool.adapter.viewhodler.TeachingScheduleHodler;
import com.example.quanla.smartschool.database.DbClassContext;
import com.example.quanla.smartschool.database.DbStudentContext;
import com.example.quanla.smartschool.database.DbTeachingSchedule;
import com.example.quanla.smartschool.database.model.ClassStudent;
import com.example.quanla.smartschool.database.model.TeachingSchedule;

/**
 * Created by hieutran on 3/16/17.
 */

public class TeachingScheduleAdapter extends RecyclerView.Adapter<TeachingScheduleHodler> {

    @Override
    public TeachingScheduleHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_teaching, parent, false);
        //2: create ViewHolder
        return new TeachingScheduleHodler(itemView);
    }

    @Override
    public void onBindViewHolder(TeachingScheduleHodler holder, int position) {
        final TeachingSchedule teachingSchedule = DbTeachingSchedule.instance.getTeachingScheduleList().get(position);
        holder.bind(teachingSchedule);
    }

    @Override
    public int getItemCount() {
        return DbTeachingSchedule.instance.getTeachingScheduleList().size();
    }
}
