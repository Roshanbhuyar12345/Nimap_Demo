package Exception_Handling;

public class MultipleCatch {
	public static void main(String[] args) 
	{
		try {
		
		int s=6/0;
		System.out.println(s);
		//here the try block does not check the further conditon and it will goes to catch block
		int a[]=new int[5];
		a[4]=2;
	
		System.out.println(a[6]);
		
		}catch(ArithmeticException e)
		{
			System.out.println("something is wrong");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter right index");
		}
		// exception can handled all the exception
		catch(Exception e) {
			System.out.println("all exception are handled");
		}
		//finally block get always get executed if there is exception in try block or not
		finally
		{
			System.out.println("bye");
		}
		
		
		
	}
}
