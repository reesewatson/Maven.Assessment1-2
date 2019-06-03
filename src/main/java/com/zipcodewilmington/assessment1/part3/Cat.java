package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */

    private String name;
    private int age;

    public Cat(String name, Integer age) {
        super(name, age);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */

    public Cat() {
        super("Cat name", 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super("Cat name", age);
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);

    }

    /**
     * @return meow as a string
     */
    public String speak() {

        return "Meow";
    }
}
