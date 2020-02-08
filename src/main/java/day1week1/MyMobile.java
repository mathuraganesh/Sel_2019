package day1week1;

public class MyMobile {

	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.takeSnap();
		obj.addNumber(9876543210L);
		long num = obj.searchNum("Sam");
		System.out.println(num);
	}
}
