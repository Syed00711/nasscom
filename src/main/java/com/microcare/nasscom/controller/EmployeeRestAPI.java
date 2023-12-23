package com.microcare.nasscom.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.nasscom.model.Employee;


@RestController
public class EmployeeRestAPI {
	
	Logger  log =LoggerFactory.getLogger(EmployeeRestAPI.class);
	@Value("${hostname}")
	public String name;

	@GetMapping("/getemp/{id}")
	public String getEmployee(@PathVariable String id) {
		try {
			log.info("Parsing input value");
			Integer.parseInt(id);
			log.debug("Parsing completed"+id);
		}
		catch(Exception e) {
			log.error("Cannot parse id,please check input value"+id);
		}
		
		return id;
	}
	//@PutMapping("/getemp/{id}")
	@RequestMapping(value="/getemp/{id}",method=RequestMethod.PUT)
	public long putEmployee(@PathVariable long id) {
		return id*id;
	}
	
	@PostMapping("/getlatemp")
	public String getLatestEmployee(@RequestParam(value="id",
	required=true)long id,@RequestParam(value="name",
	required=false,defaultValue="Microcare")String name) {
		return name+"====="+Math.sqrt(id);
	}
	
	@PostMapping("/getemp")
	public Employee createLatestEmployee(@RequestBody Employee emp) {
	emp.setId((long)(Math.random()*1000));
	
	return emp;
	}
	

}
