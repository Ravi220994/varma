package first;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
	
// TODO Auto-generated method stub
     Scanner sc =  new Scanner (System.in);
System.out.println("enter ur age ");
byte age=sc.nextByte();
System.out.println("my age is "+age);

System.out.println("enter ur id");
int id =sc.nextInt();
System.out.println("my id is "+id);

System.out.println("enter ur mobnum");
long mobile=sc.nextLong();
System.out.println("my mob num is"+mobile);

System.out.println("enter ur num");
short num=sc.nextShort();
System.out.println("my num:"+num);

System.out.println("enter ur salary");
float salary=sc.nextFloat();
System.out.println("my salary is"+salary);

System.out.println("are you working");
boolean isEmp=sc.nextBoolean();
System.out.println("working :"+isEmp);
sc.close();




	}

}
