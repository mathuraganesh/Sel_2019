package day1Homework;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "madam";
				//Declare another String rev
				String rev = "";
				
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */
				for (int i = text.length()-1; i >=0;  i--) {
					rev+=text.charAt(i);
					
				}	
				System.out.println(rev);
				if(text.equals(rev))
					System.out.println("Given String is Palindrome ");
				else
					System.out.println("Given String is not Palindrome ");
	}

}
