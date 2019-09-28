package com.indexial.janjira.testImmutability;

public class TestImmutability {
public static void main(String[] args) {
	StudentAge sa = new StudentAge(1,"jan",1995);
	sa.setDay(22);
	Student s1 = new Student(1,"shubham",sa);
	System.out.println("Before Change"+s1);
	StudentAge sa11 =  s1.getSa();
	sa11.setMonth("feb");
	sa11.setDay(22);
	System.out.println("\nAfter change" );
	System.out.println(s1);

	
	
	
}
}
