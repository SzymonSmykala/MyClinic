package com.example.myclinic.dao;


import com.example.myclinic.entity.Patient;

import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */

public interface PatientDAO {

    List<Patient> getPatient();


    void addPatient(Patient patient);

     public Patient getPatient(int patientId);

    List<Patient> getPatientsByLastName(String lastName);

    void deletePatient(int theId);
}
