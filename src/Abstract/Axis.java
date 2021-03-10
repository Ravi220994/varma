package Abstract;
//full abstract //child
public class Axis implements Bank1 {

	@Override
	public void savings() {
		System.out.println("saving 5%");
		
	}

	@Override
	public void fixed() {
		System.out.println("fixed 7%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit 8%");
	}
	public void branchDetails () {
		System.out.println("chennai");
	}
	
	public static void main(String[] args) {
		Axis d=new Axis();
		d.savings();
		d.fixed();
		d.deposit();
		d.branchDetails();
		}

}
