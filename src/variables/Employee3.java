package variables;

public class Employee3 {
	public static int a;
	public int b;
	
	public void empDetails() {
		System.out.println(a);
		System.out.println(b);
		a++;
		b++;
		
	}
	public static void main(String[] args) {
	
		Employee3 e=new Employee3();
		e.empDetails();
		Employee3 e1=new Employee3();
		e1.empDetails();
		Employee3 e2=new Employee3();
	    e2.empDetails();
		
	
	}

}
