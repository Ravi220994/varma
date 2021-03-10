package userdefinedexception;

public class Test {
	public static void main(String[] args) {
		try {
			throw new hiException();
		} catch (hiException e) {
			
			e.printStackTrace();
		}
	}

}
