package com.indexial.janjira.testImmutability;

import java.util.Date;

public class TestEmployee {
public static void main(String[] args) {
	Date d1 = new Date();
    d1.setHours(23);
	Employee e1 = new Employee(1, "shubham", d1);
	System.out.println("Before changes e1");
	System.out.println(e1);
	tryModification(e1.getId(), e1.getName(), e1.getDate());
	 System.out.println("After changes");
	System.out.println(e1);
}


private static void tryModification(int immutableField1, String immutableField2, Date mutableField)
{
    immutableField1 = 10000;
    immutableField2 = "test changed";
    mutableField.setDate(29);
}
}
