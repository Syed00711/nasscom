package com.microcare.nasscom.model;

public class Employee {
   private long id;
   private String name;
   private String institute;
   private String[] arr;
public String[] getArr() {
	return arr;
}
public void setArr(String[] arr) {
	this.arr = arr;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", institute=" + institute + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getInstitute() {
	return institute;
}
public void setInstitute(String institute) {
	this.institute = institute;
}
   
	
}
