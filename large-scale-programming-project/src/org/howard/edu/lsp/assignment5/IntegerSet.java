package org.howard.edu.lsp.assignment5;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

/**
 * IntegerSet is a class to manage a set of integers.
 * 
 * @author Abdoul Bah
 */
public class IntegerSet {
	/**
	 * A list of integers called set
	 */
	public List<Integer> set = new ArrayList<Integer>();

	/**
	 * Default Constructor to IntegerSet
	 */
	public IntegerSet() {
	}

	/**
	 * Clear the set of integers
	 */
	public void clear() {
		this.set.clear();
	};

	/**
	 * Calculate the length of the set of integers
	 * 
	 * @return length of set
	 */
	public int length() {
		return this.set.size();
	}; // returns the length

	/**
	 * Determines if the provided IntegerSet is equal to the internal IntegerSet.
	 * 
	 * @param b b is an IntegerSet
	 * 
	 * @return isEqual A boolean value determining if the provided IntegerSet is
	 *         equal
	 */
	public boolean equals(IntegerSet b) {
		boolean isEqual = true;
		if (b.length() != length()) {
			return false;
		}

		for (int i = 0; i < length(); i++) {
			Integer currentNumber = this.set.get(i);
			if (!b.contains(currentNumber)) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	};

	/**
	 * Determines if the provided value is in the set
	 * 
	 * @param value An int
	 * 
	 * @return isContained A boolean value. true if value is in the set and vice
	 *         versa.
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	};

	/**
	 * Return the largest integer in the set
	 * 
	 * @throws IntegerSetException The set is empty
	 * @return largestNumber The largest integer in the set
	 */
	public int largest() throws IntegerSetException {
		Integer largestNumber = Integer.MIN_VALUE;
		if (isEmpty()) {
			throw new IntegerSetException("Set is Empty");
		}

		for (Integer num : this.set) {
			if (num > largestNumber) {
				largestNumber = num;
			}
		}
		return largestNumber.intValue();
	};

	/**
	 * Return the smallest integer in the set
	 * 
	 * @throws IntegerSetException The set is empty
	 * @return smallestNumber The smallest integer in the set
	 */
	public int smallest() throws IntegerSetException {
		Integer smallestNumber = Integer.MAX_VALUE;
		if (isEmpty()) {
			throw new IntegerSetException("Set is Empty");
		}

		for (Integer num : this.set) {
			if (num < smallestNumber) {
				smallestNumber = num;
			}
		}
		return smallestNumber.intValue();
	};

	/**
	 * Add the given int item to the set of integers
	 * 
	 * @param item An int
	 */
	public void add(int item) {
		if (!this.set.contains(item)) {
			this.set.add(new Integer(item));
		}
	};

	/**
	 * Remove the given int item in the set
	 * 
	 * @param item An int
	 */
	public void remove(int item) {
		if (this.set.contains(new Integer(item))) {
			int index = this.set.indexOf(item);
			this.set.remove(index);
		}
	};

	/**
	 * Prints our the union between this instance's set and the given intSetb
	 * 
	 * @param intSetb An IntegerSet
	 */
	public void union(IntegerSet intSetb) {
		IntegerSet newIntegerSet = new IntegerSet();
		for (Integer num : this.set) {
			newIntegerSet.add(num.intValue());
		}
		for (Integer num : intSetb.set) {
			newIntegerSet.add(num.intValue());
		}
		System.out.println(newIntegerSet.toString());
	};

	/**
	 * Prints our the intersection between this instance's set and the given intSetb
	 * 
	 * @param intSetb An IntegerSet
	 */
	public void intersect(IntegerSet intSetb) {
		IntegerSet newIntegerSet = new IntegerSet();

		for (Integer num : this.set) {
			if (intSetb.contains(num.intValue())) {
				newIntegerSet.add(num.intValue());
			}
		}
		System.out.println(newIntegerSet.toString());
	};

	/**
	 * Prints our the difference between this instance's set and the given intSetb
	 * 
	 * @param intSetb An IntegerSet
	 */
	public void diff(IntegerSet intSetb) {
		for (Integer num : intSetb.set) {
			if (this.set.contains(num)) {
				this.set.remove(num);
			}
		}

		System.out.println(toString());
	};

	/**
	 * Determines if the set is empty
	 * 
	 * @return isEmpty A boolean value that represent the emptiness of the set
	 */
	public boolean isEmpty() {
		if (length() > 0) {
			return false;
		}
		return true;
	};

	/**
	 * Return a string representation of the set
	 * 
	 * @return string a string representation of the set
	 */
	public String toString() {
		return this.set.toString();
	};
}
