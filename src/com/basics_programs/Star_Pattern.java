package com.basics_programs;

public class Star_Pattern {
	public static void main(String[] args)
	{
		    for (int i = 1; i <= 6; i++)
		    {
			for (int j = 2; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6;k>=i;k--) {
				System.out.print(k);
			}
			
			System.out.println( );
		}

	}
}
