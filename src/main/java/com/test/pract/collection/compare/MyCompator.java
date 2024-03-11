package com.test.pract.collection.compare;

import java.util.Comparator;

import com.test.pract.collection.Student;

public class MyCompator<T> implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		return s1.getId() - s2.getId();
	}
}
