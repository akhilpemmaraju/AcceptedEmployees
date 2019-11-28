package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AcceptedEmployees;

@Repository
public class AcceptedEmployeesDALImp implements AcceptedEmployeesDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public AcceptedEmployees create(AcceptedEmployees accemp) {
		// TODO Auto-generated method stub
		return mongo.save(accemp);
	}

	@Override
	public boolean delete(AcceptedEmployees accemp) {
		// TODO Auto-generated method stub
		return mongo.remove(accemp).wasAcknowledged();
	}

	@Override
	public List<AcceptedEmployees> viewEmployee() {
		// TODO Auto-generated method stub
		return mongo.findAll(AcceptedEmployees.class);
	}

	@Override
	public void save(AcceptedEmployees accemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AcceptedEmployees> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}