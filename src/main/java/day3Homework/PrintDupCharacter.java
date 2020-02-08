package day3Homework;

import java.util.LinkedHashSet;
import java.util.Set;

//In a Given String Print all the duplicate characters.
//input: Infosys Limited
//output: s,i
public class PrintDupCharacter {
	public static void main(String[] args) {
		String text="Infosys Limited";
		char[] ch=text.toCharArray();
		Set<Character> sDup=new LinkedHashSet<>();
		Set<Character> sGetDup=new LinkedHashSet<>();
		for(char eachChar:ch)
			if(sDup.add(eachChar)==false) {
				sGetDup.add(eachChar);
			}
		for(char eachDup:sGetDup)
			System.out.print(eachDup+",");
	}
	
		

}
