package org.example;

public class Circle extends Shape {
    double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    @Override
    public String displayInfo(){
        return "Color : " + this.color + "\nFilled : " + (FillType == org.example.FillType.FILLED ? "Filled" : "Not Filled.") + "\nRadius : " + this.radius + "\nArea = " + getArea();
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r){
        return  2 * PI * r;
    }
}