package org.example;

public class Rectangle extends Shape{
    double width;
    double height;


    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    @Override
    public String displayInfo(){
        return "Color : " + this.color + "\nFilled : " + (FillType == org.example.FillType.FILLED ? "Filled" : "Not Filled.") + "\nArea : " + getArea();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}