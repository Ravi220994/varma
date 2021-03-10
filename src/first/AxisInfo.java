package first;

public class AxisInfo extends BankInfo{
	public void deposit() {
		System.out.println("Deposit is 7.8%");
	}
	public static void main(String[] args) {
		AxisInfo e =new AxisInfo();
		e.deposit();
	}

}
