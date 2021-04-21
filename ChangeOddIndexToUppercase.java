package week1.day2.assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "changeme";
	      char[] characters = text.toCharArray();
	      for(int i = 0; i< characters.length; i++)
	      {
	          char c = characters[i];
	          if(i % 2 != 0)
	          {
	              c = Character.toUpperCase(c);
	          }
	          System.out.print(c);
	          }
	}

}
