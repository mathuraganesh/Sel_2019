package day3Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Sort the given company in reverse order (HCL, Aspire Systems, CTS )
//output: HCL , CTS, Aspire Systems

public class SortReverseOrder {

	public static void main(String[] args) {
		String[] sCompany= {"HCL","Aspire Systems","CTS"};
		
		List<String> sSortCompany=new ArrayList<>();
		for (int i=0;i<sCompany.length;i++) {
			sSortCompany.add(sCompany[i]);
			
		}
		Collections.sort(sSortCompany, Collections.reverseOrder());
		System.out.println(sSortCompany);  
		
		
		
	}

}
