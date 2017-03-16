package com.example.quanla.smartschool.database.model;

import java.util.Date;

/**
 * Created by hieutran on 3/16/17.
 */

public class TeachingSchedule {

    private String dateStart;
    private String dateEnd;
    private String name;
    private String timeStudy;
    private String classRoom;

    public TeachingSchedule(String dateStart, String dateEnd, String name, String timeStudy, String classRoom) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.name = name;
        this.timeStudy = timeStudy;
        this.classRoom = classRoom;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeStudy() {
        return timeStudy;
    }

    public void setTimeStudy(String timeStudy) {
        this.timeStudy = timeStudy;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
