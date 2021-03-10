package Array;

public class Employee {

	public static void main(String[] args) {
		int a []={344,2352,4523,23423,43,134,523};
		//a[0]=12;
		//a[1]=23;
	    //a[2]=33;
		//a[3]=422;
		//a[4]=32;
		//a[5]=3;
		System.out.println(a.length);
		System.out.println("Normal for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enhanced for loop");
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
