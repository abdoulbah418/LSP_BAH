package org.howard.edu.lsp.assignment5.junit;

import org.howard.edu.lsp.assignment5.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	@Test
	@DisplayName("clear method")
	void testClear() {
		IntegerSet set = new IntegerSet();
		set.add(5);
		
		set.clear();

		Assertions.assertTrue(set.isEmpty());
	}
	
	@Test
	@DisplayName("length method")
	void testLength() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		
		Assertions.assertEquals(set.length(), 1);
	}

	@Test
	@DisplayName("equals method")
	void testEquals() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		boolean equal = set1.equals(set2);
		Assertions.assertTrue(equal);
	}
	
	@Test
	@DisplayName("contains method")
	void testContains() {
		IntegerSet set = new IntegerSet();
		set.add(5);
		
		boolean contain = set.contains(5);
		
		Assertions.assertTrue(contain);
	}
	
	@Test
	@DisplayName("largest method")
	void testLargest() throws IntegerSetException {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		
		int largest = set.largest();
		Assertions.assertEquals(largest, 2);
	}
	
	@Test
	@DisplayName("smallest method")
	void testSmallest() throws IntegerSetException {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		
		int smallest = set.smallest();
		Assertions.assertEquals(smallest, 1);
	}
	
	@Test
	@DisplayName("add method")
	void testAdd() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		
		Assertions.assertTrue(set.contains(1));
	}
	
	@Test
	@DisplayName("remove method")
	void testRemove() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.remove(1);
		
		Assertions.assertTrue(set.isEmpty());
	}
	
	@Test
	@DisplayName("union method")
	void testUnion() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		
		set1.union(set2);
		
		Assertions.assertTrue(set1.contains(2));
	}
	
	@Test
	@DisplayName("intersect method")
	void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		
		set1.intersect(set2);
		
		Assertions.assertTrue(set1.contains(2));
		
	}
	
	@Test
	@DisplayName("diff method")
	void testDiff() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(3);
		
		set1.diff(set2);
		
		Assertions.assertFalse(set1.contains(2));
	}
	
	@Test
	@DisplayName("empty method")
	void testEmpty() {
		IntegerSet set = new IntegerSet();
		set.clear();

		Assertions.assertTrue(set.isEmpty());
	}
	
	@Test
	@DisplayName("toString method")
	void testToString() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		
		Assertions.assertEquals(set.toString(), "[1]");
	}
}
