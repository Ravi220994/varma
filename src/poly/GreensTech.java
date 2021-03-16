package poly;

public class GreensTech {
	public void greensOmr() {
		System.out.println("Greens Tech");
	}
	public void greensOmr(int x,int y) {
		System.out.println("Employee Id :"+x);
		System.out.println("Student Id:"+y);
		
	}
	public void greensOmr(String name,int id) {
		System.out.println("Student Name:"+name);
		System.out.println("Student Id:"+id);

	}
	public void greensOmr(int id,String name) {
		System.out.println("Student ID :"+id);
		System.out.println("Student Name:"+name);
		
		
	}

	public static void main(String[] args) {
		GreensTech d=new GreensTech();
		d.greensOmr();
		d.greensOmr(4552, 1581);
		d.greensOmr("Ravi", 1581);
		d.greensOmr(1581, "Ravi");
	 

	}

}
