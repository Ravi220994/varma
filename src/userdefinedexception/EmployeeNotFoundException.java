package userdefinedexception;

public class EmployeeNotFoundException extends Throwable{
	public String getmessage(){
		String msg="Employee not found in unit 1";
		return msg;
		
	}

}
