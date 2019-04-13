package com.e.taxcalculator;

public class TaxCalculator {

    private double salary, yearlySalary;

    public TaxCalculator(double salary){
        this.salary = salary;
    }

    public double calculate()
    {
    yearlySalary = salary*12;

    if (yearlySalary>=1 && yearlySalary<=200000){
        return (1/100.0)*yearlySalary;
    }
    else if (yearlySalary>200000 && yearlySalary<=350000){
        return (1/100.0)*200000 + (15/100.0)*(yearlySalary-200000);
    }
    else if (yearlySalary>350000){
        return (25/100.0)*(yearlySalary-350000)+(15/100.0)*150000 + (1/100.0)*200000;
    }
    else {
        return 0;
    }
    }
}
