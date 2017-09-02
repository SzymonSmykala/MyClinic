package com.example.myclinic.controller;

import com.example.myclinic.entity.Patient;
import com.example.myclinic.service.PatientService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.validation.Valid;
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
        Patient patient = new Patient();
        model.addAttribute("patient",patient);
        return "patientsList";
    }

    @RequestMapping("/list/delete")
    public String deletePatient(@RequestParam("patientId") int theId, Model model){

        patientService.deletePatient(theId);
        return "redirect:/patient/list";
    }

    @GetMapping("/addPatient")
    public String addPatient(Model model){
        Patient patient = new Patient();
        model.addAttribute("patient", patient);
        return "addPatient";
    }

    @PostMapping("/savePatient")
    public String saveNewPatient(@ModelAttribute Patient patient){
        patientService.addPatient(patient);

        return "redirect:/patient/list";
    }

    @GetMapping("/searchPatient")
    public String searchPatient(@ModelAttribute Patient patient, Model model){
     List<Patient> patientList = patientService.getPatientsByLastName(patient.getLastName());
     model.addAttribute("patientList", patientList);
     return "searchPatient";
    }





}
