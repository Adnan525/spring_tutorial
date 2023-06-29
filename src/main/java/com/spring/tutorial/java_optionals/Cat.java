package com.spring.tutorial.java_optionals;

public class Cat {
    String name;
    Integer age;
    public Cat(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public static Integer getAge(Cat cat)
    {
        return cat.age;
    }
}
