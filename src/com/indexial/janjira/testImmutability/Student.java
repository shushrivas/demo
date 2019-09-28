package com.indexial.janjira.testImmutability;

public final class Student {
private final int id;
private final String name;
private final StudentAge sa;



public Student(int id, String name, StudentAge sa) {
	super();
	this.id = id;
	this.name = name;
	this.sa = sa;
}
@Override
public String toString() {
	return "\nStudent [id=" + id + ", name=" + name + ", sa=" + sa + "]";
}
StudentAge getSa() {
//return sa;
	return new  StudentAge(sa.getDay(),sa.getMonth(),sa.getYear());
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}

}
