package day1Homework;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = 0; j < split.length; j++) {
				if(split[i].equals(split[j]))
					System.out.println(split[i]);
					count++;
					if(count>1)
					//System.out.println(text.replace(split[j],""));
					count=0;
			}
		}
		//System.out.println(text);
	}

}

