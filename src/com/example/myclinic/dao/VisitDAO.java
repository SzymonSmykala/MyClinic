package com.example.myclinic.dao;

import com.example.myclinic.entity.Visit;

import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */

public interface VisitDAO {

    List<Visit> getVisits();

    void addVisit(Visit visit);

    List<Visit> getVisitsByPatientId(int patientId);

    void deleteVisit(int theId);
}
