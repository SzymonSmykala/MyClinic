package com.example.myclinic.controller;

import com.example.myclinic.entity.Patient;
import com.example.myclinic.entity.Visit;
import com.example.myclinic.service.PatientService;
import com.example.myclinic.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Szymon on 23.07.2017.
 */
@Controller
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    VisitService visitService;

    @Autowired
    PatientService patientService;

    @RequestMapping("/list")
    public String showVisitsList(Model model){

        List<Visit> visitList = visitService.getVisits();
        model.addAttribute("visitList", visitList);
        return "visitsList";
    }
    @GetMapping("/newVisit")
    public String newVisit(@RequestParam("patientId") int patientId, Model model){

        Patient patient = patientService.getPatient(patientId);
        Visit visit = new Visit();
        model.addAttribute("patientId", patientId);
        model.addAttribute("firstName", patient.getFirstName());
        model.addAttribute("lastName", patient.getLastName());
        model.addAttribute("visit", visit);
        return "newVisit";
    }

    @PostMapping("/saveVisit")
    public String saveVisit(@ModelAttribute Visit visit){

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        visit.setDate(date);
        visitService.addVisit(visit);
        return "redirect:/visit/list";
    }


}
