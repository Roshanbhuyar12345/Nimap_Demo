package com.static_demo;

public class StaticDemo {
	
	int id;
	int sal;
	String name;
	static String ceo;
	
	void show() {
		System.out.println(id);
		System.out.println(sal);
		System.out.println(name);
		System.out.println(ceo);
		System.out.println("==*==*==*==");
	}
	
	public static void main(String[] args) {
		
		StaticDemo st=new StaticDemo();
		st.id=101;
		st.sal=20000;
		st.name="rajesh";
		
		
		StaticDemo st1=new StaticDemo();

		st1.id=102;
		st1.sal=5000;
		st1.name="sameer";
		
		StaticDemo.ceo="roshan";
		
		st.show();
		st1.show();
		
	}

}
