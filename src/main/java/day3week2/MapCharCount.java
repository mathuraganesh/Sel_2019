package day3week2;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapCharCount {
	public static void main(String[] args) {
		int count=0;
		String str="Please focus";
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for (char c : ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else
			map.put(c,1);
		}
			
		System.out.println(map);
	}

}
