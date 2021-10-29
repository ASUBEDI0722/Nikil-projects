package com.ektha.bcj.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap();

		map.put(1, "Anamika");
		map.put(7, "Alisha");
		map.put(3, "Madhu");
		map.put(5, "Kedar");

		map.forEach((key, value) -> System.out.println("Key : " + key + " , value : " + value));

		System.out.println("Max value : " + Collections.max(map.keySet()));
		System.out.println("Min value : " + Collections.min(map.keySet()));

		System.out.println("Length : " + map.size());
		
		 for (Entry<Integer, String> entry : map.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());       
	    }


//		Collections.sort(map, (l1, l2) -> l1.comapreTo(l2.getValue()));

//	}
	
//	public static void getKeyOrder() {
//		
//		ArrayList<Integer> arrayList = new ArrayList();
//		
//		Collections.sort(arrayList);
//		
//		
	

}


