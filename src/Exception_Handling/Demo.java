package Exception_Handling;

public class Demo {
	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		try {
			int i=a[5];
			System.out.println(i);
			System.out.println("in try block");	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled in catch block");
		}
		System.out.println("OutSide Try Block");
	}

}
