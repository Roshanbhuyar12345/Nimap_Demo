package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetCricketer {
	
	public static void main(String[] args) {
		
	TreeSet<Cricketer> cr=new TreeSet<Cricketer>(new CompairCricketor());
	
	cr.add(new Cricketer("sachin", 80));
	cr.add(new Cricketer("sehwagh", 100));
	cr.add(new Cricketer("dravid", 41));
	cr.add(new Cricketer("ashwin", 100));
	cr.add(new Cricketer("pant", 14));
	cr.add(new Cricketer("pritvi", 20));
	cr.add(new Cricketer("gambhir", 40));
	cr.add(new Cricketer("mmahi", 54));
	
	Iterator<Cricketer> itr=cr.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	}
}
