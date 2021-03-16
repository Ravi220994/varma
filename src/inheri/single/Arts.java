package inheri.single;

public class Arts extends Education {
	public void bSc() {
		System.out.println("Bsc fees :50K");
	}
	public void bEd() {
		System.out.println("bEd fees :55K");
	}
	public void bA() {
		System.out.println("BA fees :58K");
	}
	public void ug() {
		System.out.println("UG fees :70k");
		
	}
	public void pg() {
		System.out.println("PG fees:65k");
	}

	public static void main(String[] args) {
		Arts edu=new Arts();
			edu.bSc();
			edu.bEd();
			edu.bA();
			edu.pg();
			edu.ug();
		}

}

