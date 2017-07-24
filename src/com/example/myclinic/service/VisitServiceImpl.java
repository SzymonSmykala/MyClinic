package com.example.myclinic.service;

import com.example.myclinic.dao.VisitDAO;
import com.example.myclinic.entity.Patient;
import com.example.myclinic.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */
@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    VisitDAO visitDAO;


    @Override
    public List<Visit> getVisits() {
        return visitDAO.getVisits();
    }

    @Override
    public void addVisit(Visit visit) {
        visitDAO.addVisit(visit);
    }

    @Override
    public List<Visit> getVisitsByPatientId(int patientId) {
        return visitDAO.getVisitsByPatientId(patientId);
    }


}
