package com.capgemini.Test.Service;

import java.math.BigInteger;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Test.Dao.DaoClass;
import com.capgemini.Test.entity.Test;

@Service
@Transactional
public class ServiceClass {

	@Autowired
	DaoClass dao;
	
	public Test addTest(Test test)
	{
		Test t=dao.save(test);
		return t;
	}
	
	public Test updateTest(Test test)
	{
		return dao.save(test);
	}
   
	public List<Test> testDetails() {
		return dao.findAll();
	}

	public String deleteTest(BigInteger id)
	{
		if(dao.existsById(id))
		{
		  dao.deleteById(id);
		  return "deleted successfully";
		}
		else
		{
			return null;
		}
	}

	 public Optional<Test> getTestById(BigInteger id) {
			
			return dao.findById(id);
		}
	
}
