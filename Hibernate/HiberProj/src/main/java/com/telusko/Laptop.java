package com.telusko;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable
@Entity
public class Laptop {
    @Id
    private int LId;
    private String brand;
    private String model;

    private String ram;

    public void setRam(String ram) {
        this.ram = ram;
    }


    public int getLId() {
        return LId;
    }
    public void setLId(int LId) {
        this.LId = LId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }





    @Override
    public String toString() {
        return "Laptop{" +
                "LId=" + LId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
