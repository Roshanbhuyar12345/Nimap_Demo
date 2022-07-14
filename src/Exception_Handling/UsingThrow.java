package Exception_Handling;

public class UsingThrow {
    
	
    static void checkAge(int age) {
		
		if(age<18) {
			throw new ArithmeticException("access denied- you must be at least 18 year old");
			}
		else {
			System.out.println("acces grant- you can use this site");
		}
	}
	
	public static void main(String[] args) {
		UsingThrow.checkAge(16);
	}
}
