package constructor;

public class Employee3 extends Company {
	
	public Employee3() {
		super("ravi",9005234534l);
		System.out.println("child default");
	}
	public Employee3(int id) {
		System.out.println("Id:"+id);
		
	}
	public static void main(String[] args) {
		
		Employee3 e=new Employee3();
		Employee3 e1=new Employee3(333);
	}

}
