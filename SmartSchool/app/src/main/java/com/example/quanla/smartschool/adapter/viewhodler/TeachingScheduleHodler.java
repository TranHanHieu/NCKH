package com.example.quanla.smartschool.adapter.viewhodler;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.quanla.smartschool.R;
import com.example.quanla.smartschool.database.model.TeachingSchedule;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hieutran on 3/16/17.
 */

public class TeachingScheduleHodler extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_datetime)
    TextView tvDateTime;
    @BindView(R.id.tv_monHoc)
    TextView tvMonHoc;
    @BindView(R.id.tv_timeStudy)
    TextView tvTimeStudy;
    @BindView(R.id.tv_class_room)
    TextView tvClassRoom;
    @BindView(R.id.cv_Teaching)
    CardView cvTeaching;


    public TeachingScheduleHodler(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(TeachingSchedule teachingSchedule) {
        tvDateTime.setText("Thời gian :"+teachingSchedule.getDateStart()+" - "+teachingSchedule.getDateEnd());
        tvMonHoc.setText("Môn :"+teachingSchedule.getName());
        tvTimeStudy.setText("Thời gian dạy :"+teachingSchedule.getTimeStudy());
        tvClassRoom.setText("Phòng học :"+teachingSchedule.getClassRoom());

    }
}
