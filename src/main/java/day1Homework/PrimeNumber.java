package day1Homework;

/*
 * Goal: To find whether a number is a Prime number or not
 * 
 * input: 13
 * output: 13 is a Prime Number
 */
public class PrimeNumber
{

	public static void main(String[] args) 
	{
		int iNumber=13;
		int iCount=0;
		for(int i=2;i<iNumber;i++)
		{
			if ((iNumber%i) == 0) 
			{
				iCount=iCount+1;
			}
		}
		if(iCount==0) 
			System.out.println("The Given Number '"+iNumber+"' is a Prime Number");
		else
			System.out.println("The Given Number '"+iNumber+"' is not a Prime Number");
	}

}
