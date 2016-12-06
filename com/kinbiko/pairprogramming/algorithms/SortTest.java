package com.kinbiko.pairprogramming.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;

public class SortTest {
	InsertionSort target = new InsertionSort();
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
		int[] triplets = {3, 1, 2};
		int[] sortTriple = {1, 2, 3};
		assertArrayEquals(sortTriple, target.sort(triplets));
	}
}
