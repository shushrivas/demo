package com.indexial.janjira.Coupling;

public class TestLooseCoupling {
public static void main(String[] args) {
	MotorBike mb = new MotorBike();
	Traveller t = new Traveller();
	t.setV(mb);
	t.startJourney();
}
}
