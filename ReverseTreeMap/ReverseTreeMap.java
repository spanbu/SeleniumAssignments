package week3.day2.assignments;

import java.util.Collections;
import java.util.TreeMap;

public class ReverseTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> empInfo = new TreeMap<Integer,String>(Collections.reverseOrder());
		empInfo.put(100,"Hari");
		empInfo.put(101,"Naveen");
		empInfo.put(102,"Sam");
		empInfo.put(103,"Balaji");
		System.out.println("EmployeeInfo on Reverse" + empInfo);
		
	}

}
