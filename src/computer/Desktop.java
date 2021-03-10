package computer;
// multiple inheritance
//child
public class Desktop implements Software,Hardware {

	public static void main(String[] args) {
		Desktop c=new Desktop();
		c.softwareResources();
		c.hardwareResources();
		c.desktopModel();
	}

	@Override
	public void hardwareResources() {
		System.out.println("Harware Resources: CPU,RAM,MotherBoard");
		
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Software Resources:System sotfware,Application software");
	}
	private void desktopModel() {
		System.out.println("Desktop Model:DELL");
		

	}

}
