package first;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter StudId:");
	int studId=obj.nextInt();
	System.out.println("Student ID:"+studId);
	System.out.println("Enter ur studName: ");
	String studName=obj.next();
	System.out.println("Student Name:"+studName);
	
	System.out.println(" mark1");
	int out=obj.nextInt();
	System.out.println("Mark1 :"+out);
	 
	System.out.println("Enter mark2:");
    int out1=obj.nextInt();
	System.out.println("Mark2:"+out1);
	
	System.out.println("mark3 ");
	int out2=obj.nextInt();
	System.out.println("Mark3 :"+out2);
	
	System.out.println("mark4:");
	int out3=obj.nextInt();
	System.out.println("Mark4:"+out3);

	System.out.println("Mark5");
	int out4=obj.nextInt();
	System.out.println("Mark5:"+out4);
	
	int total=out+out1+out2+out3+out4;
	int average=total/5;
	System.out.println("Total:"+total);
	System.out.println("Average:"+average);
			
	obj.close();
	
	}

}
