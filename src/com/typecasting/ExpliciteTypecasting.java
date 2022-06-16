package com.typecasting;

public class ExpliciteTypecasting {

	public static void main(String[] args) {

		// loss of data or information
		// programmer will do it forcefully
		// compiler does not recommend to do this

		int x = 1005256551;
		byte b = (byte) x;

		System.out.println(b);
	}
}
