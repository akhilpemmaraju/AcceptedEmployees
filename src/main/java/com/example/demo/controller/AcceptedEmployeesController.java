package com.example.demo.controller;

import com.example.demo.model.AcceptedEmployees;

import com.example.demo.repo.AcceptedEmployeesDAL;
import com.example.demo.repo.AcceptedEmployeesDALImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class AcceptedEmployeesController {
	
	@Autowired
	private AcceptedEmployeesDAL emprepo;

	@PostMapping("/employees")
	public void create(@RequestBody AcceptedEmployees accemp) {
		emprepo.save(accemp);
	}
	
	@GetMapping("/employees")
	public List<AcceptedEmployees> findAll(){
		return emprepo.findAll();
		
	}
 	
}
