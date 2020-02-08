package day3Homework;

import java.util.LinkedHashSet;
import java.util.Set;

//In a given String print only distinct characters.

//Input: Amazon India Private Limited

//Output: AmazonIdiPrvteL
public class DistinctChar {

	public static void main(String[] args) {
		String text="Amazon India Private Limited";
		char[] ch=text.toCharArray();
		Set<Character> sDist=new LinkedHashSet<>();
		for(char eachDist:ch) {
			sDist.add(eachDist);
		}
		for(char eachDistChar:sDist)
		System.out.print(eachDistChar);
		
		

	}

}
