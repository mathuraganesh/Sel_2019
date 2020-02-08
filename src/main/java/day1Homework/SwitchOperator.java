package day1Homework;

public class SwitchOperator {

	public static void main(String[] args) {
		String sOperator="Add";
		int iFirstvalue=20;
		int iSecondvalue=10;
		
		switch(sOperator) {
		
		case "Add":
			int iAddition=iFirstvalue+iSecondvalue;
			System.out.println("Addition of "+iFirstvalue+" And "+iSecondvalue+" is "+iAddition);
			break;
		case "Sub":
			int iSub=iFirstvalue-iSecondvalue;
			System.out.println("Subtraction of "+iFirstvalue+" And "+iSecondvalue+" is "+iSub);
			break;
		case "Multiply":
			int iMultiply=iFirstvalue*iSecondvalue;
			System.out.println("Multiplication of "+iFirstvalue+" And "+iSecondvalue+" is "+iMultiply);
			break;
		case "Division":
			int iDivision=iFirstvalue/iSecondvalue;
			System.out.println("Division of "+iFirstvalue+" And "+iSecondvalue+" is "+iDivision);
			break;
		default:
			System.out.println("Please Enter the valid Operator");
		}

	}

}
