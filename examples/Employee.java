package com.edademirbas.examples;

public class Employee {
    private String name;
    protected double salary;
    private int age;

    public Employee(String anme, double salary,int age) {
    this.name = name;
    this.salary = salary;
    this.age = age;
    }
    public String getName(){
        return this.name;

    }
    public int getAge(){
        return  this.age;

    }
    public double getSalary(){
        return this.salary*1.2;
    }
}

