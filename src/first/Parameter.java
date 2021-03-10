package first;

public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Param1 calc=new Param1();
		String out=calc.concet("ravi","varman");
     	float out1=calc.add(12,24);
        int out2=calc.percentage(12,24);
		int out3=calc.average(45,98);
    	double out4=calc.add1(122.12,2151.2);
    	long out5=calc.add2(3651455847155l,1521458511l);
    	//short out6=calc.add3(1854, 25478)
	
		System.out.println(out);
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);
		System.out.println(out4);
		System.out.println(out5);
	//	System.out.println(out6);
		
		
		
	}

}
