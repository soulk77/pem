package com.company;

public class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int age, double salary, double bonus) {
        super(firstName, lastName, age, salary);
        if (bonus <= 0){
            System.out.println("Invalid bonus");
            this.bonus = 1;
        }
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus <= 0){
            System.out.println("Invalid bonus");
        }
        this.bonus = bonus;
    }

    public double getTotal (){
        return (getSalary()*(100+bonus))/100;
    }
}
