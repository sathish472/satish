package com.test.pract.collection.compare;

import java.util.Comparator;

public class IntDesc<T> implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}

}
