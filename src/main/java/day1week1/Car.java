package day1week1;

//package - where this class is living
public class Car {
	//public - anyone in the project can access
	//class - denotes this is a class

	//Access Modifiers - Variable/method
	/*
public - anyone can access in the project
private - access only within the class
protected - access only by related classes ->week3
default - access only within the same package
	 */

	//dataType variableName = value;
	//boolean -> true/false
	boolean isPunctured = true;
	//char -> only single character within ''
	char firstLetter = 'T';
	//short -> smaller numbers
	short capacity = 4000;
	//int -> integer both postive/negative - 9digits
	int mobileNumber = 789654321;
	//long -> very bigger numbers & should end with l or L
	long fax = 98765432112345678l;
	//float -> small decimals 5 digits
	float bankBalance = 50.0009f;
	//double -> bigger decimals
	double balance = 0.0099887766554;

	//Non primitive datatype
	//String -> class (always within "")
	String brandName = "Boeing";

	// seating Capacity
	int seating = 0;

}
