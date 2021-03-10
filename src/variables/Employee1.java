package variables;

public class Employee1 {
	//instance variable
	public int a=10;
	public void empDetails() {
	a=345;
	System.out.println("method call:"+a);
	
	}
	

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		System.out.println("before method call:"+e.a);
		e.empDetails();
		System.out.println("after method call:"+e.a);
		
		Employee1 e1=new Employee1();
		System.out.println("accessing a value by e1:"+e1.a);
		
		
	

	}

}
