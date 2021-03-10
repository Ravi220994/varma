package first;

public class Employee {
	
	public void empId() {
		String id="2435";
		System.out.println("Employee Id is :"+id);
	}
	public void empName() {
		String name="Ravi";
		System.out.println("Employee Name is :"+name);
		
	}
	public void empDob() {
		String dob="22/09/1994";
		System.out.println("Employee Dob:"+dob);
		
	}
	public void empMob() {
		String mob="9003652988";
		System.out.println("Employee Mobile num:"+mob);
	
	}
	public void empMail() {
		String mail="ravi220994@gmail.com";
		System.out.println("Employee Mail id:"+mail);
	}
	
	public void empAddress() {
		String add="241/1 south st,eraiyur(po),tittagudi(tk),cuddalore(dt)";
		System.out.println("Employee Address:"+add);
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.empId();
		obj.empName();
		obj.empDob();
		obj.empMob();
		obj.empMail();
		obj.empAddress();


}
}