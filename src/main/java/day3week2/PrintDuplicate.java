package day3week2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate {
//5,10,8,75,10,2,3,9,10,5
	public static void main(String[] args) {
		int[] ivalue= {5,10,8,75,10,2,3,9,10,5};
		
		Set<Integer> iList=new LinkedHashSet();
		Set<Integer> iDuplicate=new LinkedHashSet();
		for (int i = 0; i < ivalue.length; i++) {
			if(iList.add(ivalue[i])) {
				
			}
			else 
				iDuplicate.add(ivalue[i]);
		}
		System.out.println(iDuplicate);
	}

}
