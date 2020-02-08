package day1Homework;

public class Factorial {

	public static void main(String[] args) {
		int sum=1;
		int fact=5;
		for (int i = fact; i > 0; i--) {
			sum=sum*i;
		}
		System.out.println(sum);
	}

}

