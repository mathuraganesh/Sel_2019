package day1week1;

public class LearnVariable {

	/*
	 * 	Shortcuts that you may have to remember:
	 *   1) Create main method : type -> main  & press -> ctrl + space + enter
	 *   2) Print a statement  : type -> syso  & press -> ctrl + space + enter
	 *   3) Execute code	      : press -> ctrl + F11 (In some machines, press -> ctrl + Fn + F10)
	 *   4) 
	 */
	public static void main(String[] args) {
		System.out.println("Start Running");
		
		// Declare a String variable String-> Non Primitive
		String browser = "Chrome";
		
		//Declare version number int->primitive
		int version = 54;
		
		//Declare a Headless option boolean -> primitive
		boolean headLess = true;
		
		//Declare a character
		char firstChar = '$';
		
		//Declare a long
		long d = 1;
		
		//Writing a conditional statement
		if (version>54) // Condition
		{
			//Positive Block
			System.out.println("Headless Possible");	
		}
		else {
			//Negative Block
			System.out.println("Headless Not possible, Please upgrade");
		}
		
		//Writing loop for doing same job recursively
		//for(initialisation;condition;incre/decrement)
		/*for (int i = 1; i <= 10; i++) {
			System.out.println("Run Test case "+ i);			
		}*/
		
		for (int i = 10; i >= 1; i--) {
			System.out.println("Run Test case "+ i);			
		}
		
		//writing switch case
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome is running");
			break;	//once the condition is done,break the run
		case "Firefox":
			System.out.println("Firefox is running");
			break;
		default:
			System.out.println("Browser Not supported");
			break;
		}
		float n = 5.0f;
		System.out.println(n/2);
		
		// while loop (condition based looping -> run until condition is satisfied)
		int run=1;
		while (run<5) {
			System.out.println("running");
			run++;
			
		}
		
	}

}
