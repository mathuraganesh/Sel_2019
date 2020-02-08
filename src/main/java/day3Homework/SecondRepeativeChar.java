package day3Homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SecondRepeativeChar {
//Print only the Second most repeating character in the String  "PayPal India"
   // IP : "PayPal India"
    //OP: "P"
	public static void main(String[] args) {
		String text="PayPal India";
		int count=0;
		char[] ch=text.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				count++;
				map.put(ch[i],map.get(ch[i])+1);
				
			}else
			map.put(ch[i], 1);
		}
		System.out.println(map);
		for(Entry<Character,Integer> eachmap:map.entrySet()) {
			if(eachmap.getValue()==2)
			System.out.println("Second most repeating character-"+eachmap.getKey());
		}
		
	}

}
