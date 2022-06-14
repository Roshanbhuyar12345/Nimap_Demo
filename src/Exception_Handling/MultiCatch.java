package Exception_Handling;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		String s="hello world";
		
		foo(null);
		bar(null);
		
	}
	//using try and catch block
	static void foo(String x) {
		try {
			System.out.println("first character"+x.charAt(0));
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
	//by using if else statment
		static void bar(String x) {
			if(x!=null) {
				System.out.println("first character"+x.charAt(0));
			}
			else
				System.out.println("Nullpointexception");
		}
		
		
	}


