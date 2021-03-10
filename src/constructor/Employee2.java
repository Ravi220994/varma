package constructor;

//Constructor overloading
//Constructor chainingl
public class Employee2 {
	
	public Employee2() {
		
	this(3123);
		System.out.println("Default constructor");
		
	}
	public Employee2(int id) {
		this("Ravi",9003652988l);
		System.out.println("Id:"+id);
		
	}
	public Employee2(String name,long mobno){
		System.out.println("Name:"+name);
		System.out.println("Mobile num:"+mobno);
		
	}

	public static void main(String[] args) {
		Employee2  e=new Employee2();
		
				
	}		

}
