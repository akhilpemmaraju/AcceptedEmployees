package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.AcceptedEmployees;

public interface AcceptedEmployeesDAL {

	boolean delete(AcceptedEmployees accemp);
	AcceptedEmployees create(AcceptedEmployees accemp);
	List<AcceptedEmployees> viewEmployee();
	void save(AcceptedEmployees accemp);
	List<AcceptedEmployees> findAll();

}
