package com.test.pract.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		 m2();

	}
	
	public static void m1() {
          List<Employee> employeeList = new ArrayList<>();
		
          employeeList.add(new Employee(2, "n2", 3.5, 11));
          employeeList.add(new Employee(3, "n3", 7.5, 12));
          employeeList.add(new Employee(4, "n4", 6.5, 13));
          employeeList.add(new Employee(1, "n1", 2.5, 10));
		Collections.sort(employeeList, (e1,e2) -> e2.getId()-e1.getId());
		
		
		System.out.println(employeeList);
	}
	
	public static void m2() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(2, "n2", 2000, 11));
		employeeList.add(new Employee(3, "n3", 7000, 12));
		employeeList.add(new Employee(4, "n4", 6000, 13));
		employeeList.add(new Employee(1, "n1", 5000, 10));
		
		//Predicate<Employee> p1 = (e ) -> e.getSalary()<3000;
		
		Function<Employee, Employee> f = (e)->{ 
			if(e.getSalary()<3000) {
			e.setSalary(e.getSalary()+1000);
			return e;
			}else {
				return null;
			}
			
		};
		
		
		
		Predicate<Employee> p1 = (e ) -> Objects.isNull(e);
		
		List<Employee> el2 = employeeList.parallelStream().map(f).filter(p1.negate()).collect(Collectors.toList());
		
		employeeList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.groupingBy(Employee::getSalary)));
		
		
		
		for(Employee e:el2) {
			System.out.println(e.toString());
		
		}
	}
	
	
	

}
