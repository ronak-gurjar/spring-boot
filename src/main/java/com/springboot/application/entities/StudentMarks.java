package com.springboot.application.entities;

import javax.persistence.*;

@Entity
public class StudentMarks {

    @Id
    private int mId;
    @Column(name = "maths")
    private int maths;
    @Column(name = "science")
    private int science;

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
}
