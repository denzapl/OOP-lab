package org.example;

public class Teacher extends People{
    int Salary;


    public Teacher(String name, String address, int Salary) {
        super(name, address);
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString(){
        return this.getName() + this.getAddress() + "Salary " + this.Salary + "  Euros per month";
    }
}