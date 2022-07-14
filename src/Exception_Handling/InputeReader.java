package Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputeReader {
	public static void main(String[] args) {

		try {
			System.out.println("enter value");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			System.out.println(n);

		} catch (Exception e) {
			System.out.println("please enter valid input " + e);
		}

	}
}
