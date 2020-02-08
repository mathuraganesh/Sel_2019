package day1Homework;

/*
 * Goal: Find the odd numbers in the specific range of numbers
 * 
 * Input: range of numbers (starting to end) [1 to 20]
 * Output: Printing only odd numbers [1,3,5,7,9...,19]
 */
public class OddNumbers {

	public static void main(String[] args) {
		int iRange=20;
		int sTemp=0;
		for(int i=0;i<=iRange;i++) 
		{
			if(i%2!=0)
			{
				System.out.print(i+",");
			}
		}

	}

}
