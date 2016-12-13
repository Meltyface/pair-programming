package com.kinbiko.pairprogramming.algorithms;

public class BestSortMethodOfAllTime {
	
	public int[] sort(int[] mutableArray) {
		int sortedListLength = mutableArray.length;
		
		if (sortedListLength == 0) {
			return mutableArray;
		}
		
		int[] newArray = new int[sortedListLength];
		int mutableMin = mutableArray[0];
		int indexToRemove = 0;


		for (int j = 0; j < sortedListLength; j++) {
			if (mutableArray.length == 1) {
				mutableMin = mutableArray[0];
				newArray[j] = mutableMin;
			}
			
			for (int i = 0; i < mutableArray.length; i++) {
				if (notFirstAndSmallerThanPrevious(mutableArray, i)) {
					mutableMin = mutableArray[i];
					indexToRemove = i;
				}
			}
			newArray[j] = mutableMin;
			mutableArray = removeIndex(mutableArray, indexToRemove);
			
		}
		return newArray;
	}

	private boolean notFirstAndSmallerThanPrevious(int[] inputArray, int i) {
		return i > 0 && inputArray[i] < inputArray[i-1];
	}
	
	private int[] removeIndex(int[] array, int index) {
		return array.length > 1 ? pop(array, index) : array;
	}

	private int[] pop(int[] array, int index) {
		int arrayLength = array.length;
		int[] toReturn = new int[arrayLength - 1];
		for (int a = 0; a < index; a++) {
			toReturn[a] = array[a];
		}
		for (int a = index + 1; a < arrayLength; a++) {
			toReturn[a-1] = array[a];
		}
		return toReturn;
	}
}
