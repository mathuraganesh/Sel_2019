package day1week1;

public class MyCar {
	//To execute this class, you must have main()
	public static void main(String[] args) {
		//To call another class, syntax
		//ClassName object = new ClassName();
		Car myCar = new Car();
		//syntax to call the variable from called class
		//object.variableName; (To store ctrl+2 -> l)
		String brandName = myCar.brandName;
		//To print a value in console (syso -> ctrl+space, Enter)
		System.out.println(brandName);
		//To execute the code, ctrl+f11
		int seating = myCar.seating;
		//Conditional Statements 
		if (seating <= 5 && seating >= 3) {
			System.out.println("Hatch Back");
		}
		else if(seating > 5){
			System.out.println("SUV");
		}
		else {
//			System.err.println("Hey! This is not a car");
		}
		
		switch (brandName) {
		case "Bajaj":
			System.out.println("Bike");
			break;
		case "Ford":
			System.out.println("Car");
			break;
		case "Leyland":
			System.out.println("Bus");
			break;
		case "ICF":
			System.out.println("Coaching Factory");
			break;
		case "Boeing":
			System.out.println("Air Craft");
			break;
		default:
			System.err.println("Dont know what it is!");
			break;
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Car Running "+i+" KMS Done");
			if(i>5) {
				break;
			}
		}
		int a = 5, b = 8;
		String op = "+";
		switch (op) {
		case "+":
			
			break;

		default:
			break;
		}
	}

}