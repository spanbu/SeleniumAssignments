package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] text = "Target is to complete assignment".split(" ");
		String result = ""; 
		String rev = ""; 

		for (int i = 0; i < text.length; i++) 
		{

			String words = text[i];

			if (i % 2 != 0) 
			{

				for (int j = words.length() - 1; j >= 0; j--) 
																
				{

				
					rev = rev + words.charAt(j);
				}
				result = result + rev + " "; 

				rev = "";
			}

			else
				result = result + text[i] + " ";
		}
		System.out.println(result); 
	}

}
