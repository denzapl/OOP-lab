package org.example;
enum FillType {FILLED, NOT_FILLED}
public abstract class Shape {
    public String color;
    public FillType FillType;
    public Shape(String color, org.example.FillType fillType) {
        this.color = color;
        FillType = fillType;
    }
    public String DisplayInfo(){
        return "Color : " + this.color + "\nFilled : " + (FillType == org.example.FillType.FILLED ? "Filled" : "Not Filled");

    }

    public abstract String displayInfo();

    public double getArea(){
        return 0;

    }



}
