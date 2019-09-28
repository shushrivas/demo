package com.indexial.janjira.testImmutability;

public class StudentAge {
private int day;
private String month;
private int year;
public StudentAge(int day, String month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}
int getDay() {
	return day;
}
void setDay(int day) {
	this.day = day;
}
String getMonth() {
	return month;
}
void setMonth(String month) {
	this.month = month;
}
int getYear() {
	return year;
}
void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return " [day=" + day + ", month=" + month + ", year=" + year + "]";
}



}
