package com.mrthod.overloading;

public class Overloadin_show {
	
	void show(int a) {
		System.out.println("int method");
		
	}
    void show(String s) {
    	System.out.println("string method");
    	
    }
    void show(int n,char t) {
    	System.out.println("int char mnethod");
    }
    
    
    public static void main(String[] args) {
    	Overloadin_show st=new Overloadin_show();
    	
    	st.show(5);
	}
}
