package day3Homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharcter {

	//Remove duplicate characters in the given String  "PayPal India"
	//IP: PayPal India
	//OP: ylIndi
	public static void main(String[] args) {
		String text="PayPal India";
		char[] charArray = text.toCharArray();
		Set<Character> sDup=new LinkedHashSet<>();
		Set<Character> sGetDup=new LinkedHashSet<>();
		for (int i=0;i<charArray.length;i++) {
			
			if(sDup.add(charArray[i])==true) {
				
			}else
				sGetDup.add(charArray[i]);
				
		}
		//System.out.println(sDup);
		//System.out.println(sGetDup);
		sDup.removeAll(sGetDup);
		System.out.println(sDup);
		for (Character eachChar : sDup) {
			if(!eachChar.isWhitespace(eachChar))
			System.out.print(eachChar);
		}
	}

}
