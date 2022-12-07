package com.capgemini.HealthCareSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {
	@RequestMapping(value = "/getAllDiagnosticCenter")
	public  ModelAndView getAllDiagnosticCenter() {

        return null;
    }

}
