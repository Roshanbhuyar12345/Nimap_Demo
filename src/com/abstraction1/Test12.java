package com.abstraction1;

import com.abstraction_prog.Test;

public class Test12 extends Apple {
	public static void main(String[] args) {

		Apple apple;
		apple = new Apple();
		apple.colour();
		apple.vitamins();
		apple.waterPercent();
		apple.sweet();
		System.out.println("==*==*==*==");
		Bannana bannana;
		bannana = new Bannana();
		bannana.colour();
		bannana.vitamins();
		bannana.waterPercent();
		bannana.sweet();
		System.out.println("==*==*==*==");
		Orange orange;
		orange = new Orange();
		orange.colour();
		orange.vitamins();
		orange.waterPercent();
		orange.sweet();
	}

}
