package com.example.myclinic.service;

import com.example.myclinic.dao.PatientDAO;
import com.example.myclinic.entity.Patient;
import com.example.myclinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDAO patientDAO;

    @Override
    @Transactional
    public List<Patient> getPatients() {
        return patientDAO.getPatient();
    }

    @Override
    @Transactional
    public void addPatient(Patient patient) {
        patientDAO.addPatient(patient);
    }

    @Override
    public Patient getPatient(int patientId) {
        return patientDAO.getPatient(patientId);
    }
}


