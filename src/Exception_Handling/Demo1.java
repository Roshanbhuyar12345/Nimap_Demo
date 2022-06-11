package Exception_Handling;

public class Demo1 {
	public static void main(String[] args) {

		System.out.println("main start");

		try {
			System.out.println("try start");
			int a = 10 / 0;
			System.out.println("try end");
		} catch (ArithmeticException e) {
			System.out.println("in catch block");
			//e.printStackTrace();

		} finally {
			System.out.println("inside finally");
		}

	}

}
