package com.example.myclinic.service;

import com.example.myclinic.entity.Patient;

import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */
public interface PatientService {
    public List<Patient> getPatients();


    void addPatient(Patient patient);
}
