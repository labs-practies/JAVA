package com.company;

public class Material {
    private String name;
    private double dencity;
    public Material(String name, double dencity){
        this.name  = name;
        this.dencity = dencity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDencity() {
        return dencity;
    }

    public void setDencity(double dencity) {
        this.dencity = dencity;
    }
    public String toString(){
        return name + "; " + dencity;
    }
}
