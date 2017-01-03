package com.kinbiko.pairprogramming.algorithms;

public class RogerSort {

	public int[] sort(int[] mutableArray) {
		int sortedListLength = mutableArray.length;

		if (sortedListLength == 0) {
			return mutableArray;
		}

		int[] newArray = new int[sortedListLength];

		for (int j = 0; j < sortedListLength; j++) {
			IndexAndMin indexAndMin = findMinAndIndexToPop(mutableArray);
			newArray[j] = indexAndMin.min;
			mutableArray = pop(mutableArray, indexAndMin.index);
		}
		return newArray;
	}

	private int[] pop(int[] mutableArray, int index) {
		int arrayLength = mutableArray.length;
		int[] toReturn = new int[arrayLength - 1];
		for (int a = 0; a < index; a++) {
			toReturn[a] = mutableArray[a];
		}
		for (int a = index + 1; a < arrayLength; a++) {
			toReturn[a-1] = mutableArray[a];
		}
		return toReturn;
	}

	private IndexAndMin findMinAndIndexToPop(int[] mutableArray) {
		IndexAndMin indexAndMin = new IndexAndMin();
		indexAndMin.min = findMin(mutableArray);
		indexAndMin.index = findIndex(mutableArray, indexAndMin.min);
		return indexAndMin;
	}

	private int findIndex(int[] mutableArray, int min) {
		for (int i = 0; i < mutableArray.length; i++)
			if (mutableArray[i] == min)
				return i;
		return -1;
	}

	private int findMin(int[] mutableArray) {
		int smallest = mutableArray[0];
		for (int i = 0; i < mutableArray.length; i++)
			if (mutableArray[i] < smallest)
				smallest = mutableArray[i];
		return smallest;
	}

}

class IndexAndMin {
	public int index;
	public int min;
}