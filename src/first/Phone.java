package first;

public class Phone {
	public void phoneInfo(String name,int model,long num) {
		System.out.println("Phone Name:"+name);
		System.out.println("phone model:"+model);
		System.out.println("phone Number:"+num);
		
	}
	public void phoneInfo(int model,String name,long num) {
		System.out.println("phone Name:"+name);
		System.out.println("phone model:"+model);
		System.out.println("phone number:"+num);
	}

	public static void main(String[] args) {
		Phone c=new Phone();
		c.phoneInfo("realme", 5, 9003652988l);
		c.phoneInfo(5, "realme", 9003652988l);

	}

}
