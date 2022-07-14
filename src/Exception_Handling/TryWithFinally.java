package Exception_Handling;

public class TryWithFinally {
	public static void main(String[] args) {
		
		try {
			int a[]= {1,2,3,4,5,6};
			System.out.println(a[6]);
		}
		//we can only take one finally block after try block
		//if there is exception in try block or not, finally block will get exicuted in both the situation
		//we can not write catch block after after finally block
		finally{
			System.out.println("I am always curious");
		}
		
	}

}
