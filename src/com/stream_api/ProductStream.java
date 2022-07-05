package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStream {
	
	int id;
	String name;
	int price;
	public ProductStream(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		List<ProductStream> list=new ArrayList<ProductStream>();
		
		list.add(new ProductStream(1, "HP",50000 ));
		list.add(new ProductStream(2,"DELL",56200));
		list.add(new ProductStream(3, "Lenovo", 30000));
		list.add(new ProductStream(4, "Apple", 80000));
		list.add(new ProductStream(5, "Sony", 42000));
		
		Stream<ProductStream> stream=list.stream();
		
	    stream.filter(i->i.price<80000)
				.forEach(i->System.out.println(i.name));
	}

}
