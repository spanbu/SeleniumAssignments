package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int myArr1[] = {21, 46, 86, 90, 65};
	      int myArr2[] = {86, 21, 65, 63, 16};
	      
	     
	      for(int i = 0; i<myArr1.length; i++ ) {
	         for(int j = 0; j<myArr2.length; j++) {
	            if(myArr1[i]==myArr2[j]) {
	               System.out.println(myArr2[j]);
	            }
	         }
	      }
	}

}
