package com.abstraction_prog;

public abstract class Car {
	
	String  name;
    long cost;
    int s;
    int d;
    int t;    
    
    public void speed(int d,int t) {
    	this.d=d;
    	this.t=t;
    	s=d/t;
    	System.out.println(s+ "km/hr");
    	System.out.println(name);
    	System.out.println(cost);
    }
     
    public abstract void colour();
    
    public abstract void compony();
    
    
	

}
