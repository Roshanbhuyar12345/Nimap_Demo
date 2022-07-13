package Exception_Handling;

public class Class_Not_Found {
	private void m1() throws ClassNotFoundException {
		Class.forName("Class.java");
	}
	
	public static void main(String[] args) throws ClassNotFoundException  {
		Class_Not_Found cnf=new Class_Not_Found();
		cnf.m1();
	}

	
}
