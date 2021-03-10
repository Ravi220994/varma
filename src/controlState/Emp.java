package controlState;

public class Emp {

	public static void main(String[] args) {
		int age=50,wt=40;
		if(age>=40){
			if(wt<=30) {
				System.out.println("eligible");
			}
			else {
				System.out.println("inner else");
			}
		}
		else {
			System.out.println("outer else");
		}
	}

}
