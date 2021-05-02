package studentinfo;

public class Students {
	
	public void getStudentsInfo(int id) {
		
		System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println(id + name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		
		System.out.println(email + phoneNumber);
	}

	public static void main(String[] args) {
		
		Students studInfo = new Students();
		studInfo.getStudentsInfo(0471);
		studInfo.getStudentInfo(0471, "SaranV");
		studInfo.getStudentInfo("saranv@gmail.com", 8976543120L);

	}

}
