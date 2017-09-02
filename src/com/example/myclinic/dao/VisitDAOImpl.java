package com.example.myclinic.dao;

import com.example.myclinic.entity.Visit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;
import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */
@Repository
public class VisitDAOImpl implements VisitDAO {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Visit> getVisits() {

        Session session = sessionFactory.getCurrentSession();

        List<Visit> visitList = session.createQuery("from Visit").list();

        return visitList;
    }

    @Override
    @Transactional
    public void addVisit(Visit visit) {
        Session session = sessionFactory.getCurrentSession();
        session.save(visit);
    }

    @Override
    @Transactional
    public List<Visit> getVisitsByPatientId(int patientId) {
        Session session = sessionFactory.getCurrentSession();
        List<Visit> visitList = session.createQuery("from Visit visit where visit.patientId = " + patientId).list();
        return visitList;
    }

    @Override
    @Transactional
    public void deleteVisit(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Visit visit = session.get(Visit.class, theId);
        session.delete(visit);

    }
}
