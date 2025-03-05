package com.telusko;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name = "Alien_Table")
public class Alien {
    @Id

    private int aid;
    @Column(name = "A_Name")
    private String aname;
//    @Transient
    @Column(name = "A_tech")
    private String tech;
//    @Embedded
    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptop;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
