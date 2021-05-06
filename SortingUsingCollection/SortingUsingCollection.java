package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//1. Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		List <String> lst = new ArrayList<String>();
		lst.add("HCL");
		lst.add("Wipro");
		lst.add("Aspire Systems");
		lst.add("CTS");
		//2. get the length of the array
		System.out.println(lst.size());
		//3. sort the array	and Iterate it in the reverse order
		Collections.sort(lst,Collections.reverseOrder());
		//4. print the array and Required Output: Wipro, HCL , CTS, Aspire Systems
		System.out.println(lst);
		
	}

}
