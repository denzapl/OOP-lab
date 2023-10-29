package org.example;


public class Student extends People {
    int Credits;

    public Student(String name, String address, int credits) {
        super(name,address);
        this.Credits = 0;
    }

    public Student(String name, String address){
        super(name, address);
    }


    public int study(){
        return Credits++;
    }

    public int getCredits() {
        return Credits;
    }
}