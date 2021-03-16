package userdefinedexception;

public class UserExcep {
	public static void main(String[] args) {
		String s="Ravi";
		if(s.equalsIgnoreCase("ravi")){
			System.out.println("done");
		}else {
		try {
			throw new Test();
		} catch (Test e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}
