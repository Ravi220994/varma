package string;

public class Sumodd {

	public static void main(String[] args) {
		System.out.println("sum of odd num");
		
		int sum=0;
	
		for(int i=1;i<=100;i++)
				{
					if(i%2!=0) {
						sum=sum+i;
						
					}
					
				}
		System.out.println("sum of odd num:"+sum);
	}

}
