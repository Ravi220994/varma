package poly;

public class CompanyInfo {
	public void companyName(String name,String name1,String name2) {
		System.out.println("Company Name:"+name);
		System.out.println("Employee Name:"+name1);
		System.out.println("Employee Name1"+name2);
	}

	public static void main(String[] args) {
		CompanyInfo a=new CompanyInfo();
		a.companyName("Thermax","ravi", "varman");
		

	}
  
}
