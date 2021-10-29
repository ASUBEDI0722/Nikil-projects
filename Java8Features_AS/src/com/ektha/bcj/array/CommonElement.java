package com.ektha.bcj.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10, 7, 15, -1 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0, 5, -1 };

		ArrayList<Integer> set1 = new ArrayList<>();
		ArrayList<Integer> set2 = new ArrayList<>();

		for (int i : array1) {
			set1.add(i);
		}

		for (int i : array2) {
			set2.add(i);
		}

		set2.retainAll(set1);
		System.out.println("Common Element" + set2);

		}

	}


