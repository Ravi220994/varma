package second;

import first.Test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 obj=new Test2();
obj.calcaverage();
	}
public int calcaverage() {
	Test test=new Test();
	int out=test.addTwoNumber();
	System.out.println(out/2);
	return out;
}
}
