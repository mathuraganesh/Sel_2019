package day1week2;

import java.util.Arrays;

public class LearnArrays {

	/*
	 * Introduction to static, ASCII, Arrays, foreach
	 * Exceptions: ArrayIndexOutOfBoundsException
	 * 
	 */

	public static void main(String[] args) {
		/*// Arrays is a concept used to store multiple item of same type in a single name
		//Syntax to create an array
		String[] browsers = {"Chrome", "Firefox","Edge","IE"};
		//to find the size of the array
		int arrayLength = browsers.length;
		System.out.println("Array Length "+arrayLength);
		//To access the first item from the array
		String last = browsers[arrayLength-1];
		System.out.println(last);
		Arrays.sort(browsers);
		System.out.println(browsers[1]);*/

		int[] empNos = {231, 232, 233, 255, 298, 987, 916, 200};
		System.out.println(empNos.length);		
		// Sort an array by ASCII
		Arrays.sort(empNos);
		// Get the first item		
		System.out.println(empNos[0]);
		// Get the last item
		System.out.println(empNos[empNos.length-1]);
		/*for (int i = 0; i < empNos.length; i++) {
			System.out.println(empNos[i]);
		}*/
		//This is unidirectional traversal
		for (int eachEmpNo : empNos) {
			System.out.println(eachEmpNo);
		}
		
		
		//Create an array using object
		String[] data1 = new String[3];
		data1[0] = "Chrome";
		data1[1] = "Firefox";
		data1[2] = "Edge";
		System.out.println(data1[2]);
		
		//multidimensional array
		int[][] data2 = new int[1][2];
		data2[0][0] = 1;
		data2[0][1] = 2;
	}

}

