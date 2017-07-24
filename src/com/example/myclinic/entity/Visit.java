package com.example.myclinic.entity;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Szymon on 23.07.2017.
 */

@Entity
@Table(name = "visit")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", date=" + date.toString() +
                ", patientId=" + patientId +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "comment")
    private String comment;

    public Visit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
