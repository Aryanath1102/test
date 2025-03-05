package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;

public class Alien {


    private Laptop laptop;
    private int age;

    Alien() {
        System.out.println("Object Created");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code() {
        System.out.println("Codding....");
        laptop.compile();
    }


}
