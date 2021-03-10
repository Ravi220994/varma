package constructor;

//Constructor overloading
public class Employee1 {
	
	public Employee1() {
		System.out.println("Default constructor");
		
	}
	public Employee1(int id) {
		System.out.println("Id:"+id);
		
	}
	public Employee1(String name,long mobno){
		System.out.println("Name:"+name);
		System.out.println("Mobile num:"+mobno);
		
	}

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		Employee1 e1=new 	Employee1(2324);
		Employee1 e2= new	Employee1("Ravi",9003652988l);
				
		

	}

}
