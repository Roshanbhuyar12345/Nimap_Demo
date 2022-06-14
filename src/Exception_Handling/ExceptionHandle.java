package Exception_Handling;

public class ExceptionHandle {
	//use the try and catch and finally block.
	public static void main(String[] args) {
		int a = 20, b = 20, c = 0;
		int result;
		try {
			result = a / (b * c);
			System.out.println(result);
		} catch (ArithmeticException e)
		{
           System.out.println("erroe"+ e);
       
		} finally {
			System.out.println("bye-bye");
		}

		result=a/(b+c);
		System.out.println("result :- "+result);
	}

}
