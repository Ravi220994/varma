package Abstract;
//partially abstract //child
public class Hdfc extends Bank {

	@Override
	public void savings() {
		System.out.println("savings 6%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit 7%");
		
	}
	public void fixed() {
		System.out.println("fixed 7%");
	}
	public static void main(String[] args) {
		Hdfc c=new Hdfc();
		c.savings();
		c.deposit();
		c.branchDetails();
		c.fixed();
	}

}
