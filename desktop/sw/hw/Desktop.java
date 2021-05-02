package desktop.sw.hw;

/* 
   Description:
   create 2 Interface and archieve multiple inheritance.
 */

public class Desktop implements Hardware, Software {
	
	

	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.hardwareResources();
		desk.softwareResources();
	}

	public void softwareResources() {

		System.out.println("S/W Resources");
		
	}

	public void hardwareResources() {
		
		System.out.println("H/W Resources");
		
	}

}
