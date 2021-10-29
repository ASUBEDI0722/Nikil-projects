package com.ektha.bcj.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 2, 2, 1, -1 };
		int[] array2 = { 2, 2, 2, 1, 1, 1, -1 };

		int[] resultArray = findCommonElement(array1, array2);

		String output = Arrays.toString(resultArray);
		System.out.println("Common element " + output);

	}

	public static int[] findCommonElement(int[] array1, int[] array2) {

//		ArrayList<Integer> set1 = new ArrayList<>();
//		ArrayList<Integer> set2 = new ArrayList<>();
//
//		for (Integer i : array1) {
//			set1.add(i);
//		}
//
//		for (Integer i : array2) {
//			set2.add(i);
//		}
//
//		set2.retainAll(set1);
//
//		return set1.stream().mapToInt(Integer::intValue).toArray();
//
//	}

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (Integer i : array1) {
			set1.add(i);
		}

		for (Integer i : array2) {
			set2.add(i);
		}

		set2.retainAll(set1);

		return set1.stream().mapToInt(Integer::intValue).toArray();

	}
}
