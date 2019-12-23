package com.softwarica.employeeapi.Models;

public class EmployeeCUD {

    public int id;
    public String name;
    public Float salary;
    public int age;
    public String image;

    public EmployeeCUD(String name, Float salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
