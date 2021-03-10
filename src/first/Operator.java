package first;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator obj=new Operator();
		obj.add();
		obj.mod();
		obj.comp();
		obj.log();
		obj.assign();
		obj.uno();
		obj.uno1();

	}
 
	public void add() {
	int x=10,y=10;
	System.out.println(x+y);

}
 
	public void mod() {
	int x=10,y=20;
	System.out.println(x/y);

}
	//comparsion
	public void comp() {
		int x=20,y=40;
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x==y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x!=y);
			
	}
	//logical
	public void log() {
		int x=79,y=43,z=56;
		System.out.println(x>y&&y<z);
		//System.out.println(x>z!);	
	}
	//assign
	public void assign() {
		int a=10;
		a*=11;
		a+=11;
		System.out.println(a);
	}
  //unary
	public void uno() {
	int a=23;
	System.out.println(a++);
	//System.out.println(a);
}
 public void uno1() {
	 int a=5,b=10;
	 System.out.println(a++);
	 System.out.println(++a);
	 System.out.println(--b);
	 System.out.println(b--);
 }
	
}
