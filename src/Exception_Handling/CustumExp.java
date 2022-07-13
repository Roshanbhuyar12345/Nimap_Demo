package Exception_Handling;

public class CustumExp {

	public void m1(int age) {

		if (age < 0) {
			ArithmeticException e = new ArithmeticException("please provide valid age");
			throw e;
		}
		System.out.println(age);

	}

	public static void main(String[] args) {

		CustumExp exp = new CustumExp();
		try 
		{
			exp.m1(-2);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("catch -" + e.getMessage());
		}

	}
}
