package com.example.quanla.smartschool.database;

import com.example.quanla.smartschool.database.model.TeachingSchedule;

import java.util.List;
import java.util.Vector;

/**
 * Created by hieutran on 3/16/17.
 */

public class DbTeachingSchedule {

    public static final DbTeachingSchedule instance = new DbTeachingSchedule();

    private List<TeachingSchedule> teachingScheduleList;

    private DbTeachingSchedule() {
        teachingScheduleList = new Vector<>();
        teachingScheduleList.add(new TeachingSchedule("1666","1999","hoa","tiết 9","325A4"));
    }

    public List<TeachingSchedule> getTeachingScheduleList() {
        return teachingScheduleList;
    }

    public void addTeachingSchedule (TeachingSchedule teachingSchedule){
        teachingScheduleList.add(teachingSchedule);
    }
}
