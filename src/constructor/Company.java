package constructor;

public class Company {
	
	public Company(){
		System.out.println("parent Default");
	}

	public Company(String name,long mobileno) {
		System.out.println("Name:"+name);
		System.out.println("Mobile num:"+mobileno);
	}
	
}
