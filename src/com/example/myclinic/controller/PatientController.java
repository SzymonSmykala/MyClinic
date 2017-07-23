package com.example.myclinic.controller;

import com.example.myclinic.entity.Patient;
import com.example.myclinic.service.PatientService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;


/**
 * Created by Szymon on 23.07.2017.
 */
@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/list")
    public String showPatientsList(Model model) {

        List<Patient> patientList = patientService.getPatients();
        model.addAttribute("patientsList", patientList);

        return "patientsList";
    }

}
