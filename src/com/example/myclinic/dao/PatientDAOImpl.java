package com.example.myclinic.dao;

import com.example.myclinic.entity.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */
@Repository
public class PatientDAOImpl implements PatientDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Patient> getPatient() {

        Session session = sessionFactory.getCurrentSession();


        List patientList = session.createQuery("from Patient").list();

        return patientList;
    }

    @Override
    @Transactional
    public void addPatient(Patient patient) {
        Session session = sessionFactory.getCurrentSession();
        session.save(patient);

    }

    @Override
    @Transactional
    public Patient getPatient(int patientId) {
        Session session = sessionFactory.getCurrentSession();

        Patient patient = session.get(Patient.class, patientId);

        return patient;
    }

    @Override
    @Transactional
    public List<Patient> getPatientsByLastName(String lastName) {
        Session session = sessionFactory.getCurrentSession();
        List<Patient> patientList =  session.createQuery("from Patient p where p.lastName LIKE '"+ lastName + "%'").list();

        return patientList;

    }

    @Override
    @Transactional
    public void deletePatient(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Patient patient = session.get(Patient.class, theId);
        session.delete(patient);
    }


}
