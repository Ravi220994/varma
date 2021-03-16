package inheri.single;

public class SingleCollege extends University {
	public void ug() {
		System.out.println("undergraduate Percentage");
	}
	public void pg() {
		System.out.println("postgraduate percentage ");
	}

	public static void main(String[] args) {
		SingleCollege f=new SingleCollege();
		f.ug();
		f.pg();
		

	}

}
