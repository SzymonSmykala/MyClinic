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


}
