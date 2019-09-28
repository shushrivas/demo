package com.indexial.janjira.testImmutability;

import java.util.Date;

public class Employee {
private final int id;
private final String name;
private final Date  date;
public Employee(int id, String name, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", date=" + date + "]";
}
int getId() {
	return id;
}
String getName() {
	return name;
}
Date getDate() {
	return new Date(date.getDate());
	//return date;
}


}
