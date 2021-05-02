package univ.college;

public class College extends University{

	public static void main(String[] args) {
		
			College colg = new College();
			colg.pg();
			colg.ug();
	}

	@Override
	public void ug() {

		System.out.println("UG");
		
	}

}
