package com.hospital.patients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.patients.service.PatientService;



@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired 
	private PatientService patientService; //bean 
	
	
	@GetMapping("/id")
	public String printPatientId() {
		return patientService.printName("id patient : 0000000 ");
	}
	
	@GetMapping("/name")
	public void printPatientName() {
		System.out.println("name patient : aaaaaaaa");
	}

}

