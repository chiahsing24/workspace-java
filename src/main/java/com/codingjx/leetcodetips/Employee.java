package com.codingjx.leetcodetips;

public class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "(age = " + this.age + ")";
    }

    @Override
    public int compareTo(Employee emp) {
        return (this.age - emp.age);
    }
}
