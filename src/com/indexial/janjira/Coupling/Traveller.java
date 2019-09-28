package com.indexial.janjira.Coupling;

public class Traveller {
private Vehicle v;

public Traveller(Vehicle v) {
	super();
	this.v = v;
}



public void setV(Vehicle v) {
	this.v = v;
}


public void startJourney()
{
	v.move();
}



public Traveller() {
	super();
}

}



