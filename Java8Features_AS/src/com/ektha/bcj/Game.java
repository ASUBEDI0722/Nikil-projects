package com.ektha.bcj;

import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Football");
		arrayList.add("Cricket");
		arrayList.add("Volleyball");
		arrayList.add("Chess");
		arrayList.add("Hockey");
				
		for (String string : arrayList) {
			
			System.out.println(string);
			
		}
		
		
	}

}
