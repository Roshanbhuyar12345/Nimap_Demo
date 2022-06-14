package Exception_Handling;

public class LogicalProgram {

	public static void main(String[] args) {

		String s = "ROSHAN";

		char t[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			System.out.println(t[i] + " : " + (i + 1));

		}
	}
}
