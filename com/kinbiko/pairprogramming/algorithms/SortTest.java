package com.kinbiko.pairprogramming.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;

public class SortTest {
	RogerSort target = new RogerSort();
	@Test
	public void testEmpty() {
		int[] empty = {};
		assertArrayEquals(empty, target.sort(empty));
	}
	@Test
	public void testSingleElement() {
		int[] single = {1};
		assertArrayEquals(single, target.sort(single));
	}
	@Test
	public void testDoubleElement() {
		int[] doublet = {2, 1};
		int[] reverseDoublet = {1, 2};
		assertArrayEquals(reverseDoublet, target.sort(doublet));
	}
	@Test
	public void testTripleBaby() {
		int[] triplets = {2, 1, 3};
		int[] sortTriple = {1, 2, 3};
		assertArrayEquals(sortTriple, target.sort(triplets));
	}
	@Test
	public void testTen() {
		int[] bigTen = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] sortTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertArrayEquals(sortTen, target.sort(bigTen));
	}
	@Test
	public void testDoubleTrouble() {
		int[] duplicateCity = {10, 9, 8, 7, 5, 5, 4, 3, 2, 1};
		int[] sortDuplicate = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
		assertArrayEquals(sortDuplicate, target.sort(duplicateCity));
	}
	@Test
	public void testNegativeNelly() {
		int[] negativity = {9, -10, 17};
		int[] sortNegatives = {-10, 9, 17};
		assertArrayEquals(sortNegatives, target.sort(negativity));
	}
}
