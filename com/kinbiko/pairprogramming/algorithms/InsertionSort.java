package com.kinbiko.pairprogramming.algorithms;

public class InsertionSort {
	
	public int[] sort(int[] array) {
		int[] newArray = new int[array.length];
		int min = array[0];
		int index = 0;
		int[] uglyArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			uglyArray[i] = array[i];
		}
		for (int j = 0; j < uglyArray.length; j++) {
			if (array.length == 1) {
				min = array[0];
				newArray[j] = min;

			}
			for (int i = 0; i < array.length; i++) {
				if (i > 0 && array[i] < array[i-1]) {
					min = array[i];
					index = i;
				}
			}
			newArray[j] = min;
			array = erase(array, index);
			
		}
		return newArray;
	}
	
	private int[] erase(int[] array, int index) {
		int[] newArray = new int[(array.length - 1)];
		if (newArray.length == 0){
			return newArray;
		}
		for (int a = 0; a < index; a++) { 
			newArray[a] = 
					array[a];
		}
		for (int a = (index + 1); a < array.length; a++) {
			newArray[a-1] = array[a];
		}
		return newArray;
	}
}
