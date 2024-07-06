package com.test.pract.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test3 {
    public static <T> void main(String[] args) {
        List<Object> userList = new ArrayList<>();
        userList.add(new User("Joe", 80));
        userList.add(new User("Alice", 25));
        userList.add(new User("John", 40));
        userList.add(new User("Bob", 35));

        List<User> distinctUsers = userList.stream().map( e-> (User)e)
                .distinct() 
                .collect(Collectors.toList());

        System.out.println("Distinct users:");
        distinctUsers.forEach(System.out::println);
        
        Optional<User> userOptional=userList.stream().map(e -> (User)e).filter(u -> u.getName().contains("o")).max((u1, u2) -> u1.getAge()-u2.getAge());
        
        if(userOptional.isPresent()) {
        	System.out.println("\n user is"+userOptional.get());
        }
    }
}