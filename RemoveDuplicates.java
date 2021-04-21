package week1.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I went to my friend's home to see my friend's mother who is sick";
	      int count = 0;
	      char[] string = text.toCharArray();
	      for(int i = 0; i< string.length; i++)
	      {
	          int j;
	          for(j = 0; j < i; j++) 
	          {
	              if(string[i] == string[j]) {
			break;
	          }
	          }
	          
		     if (j == i)
	               {
	string[count++] = string[i];
	System.out.print(string[i] + " ");
	               }
	          }
	}

}
