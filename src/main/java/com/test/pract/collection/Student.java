package com.test.pract.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>{
	String name;
	Integer id;
	@Override
	public int compareTo(Student s) {
		return this.getId() - s.getId();
	}
}
