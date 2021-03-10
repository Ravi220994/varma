package exception;

import java.util.Scanner;

public class InputMis {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		float id=s.nextFloat();
		System.out.println(id);
		s.close();
	}

}
