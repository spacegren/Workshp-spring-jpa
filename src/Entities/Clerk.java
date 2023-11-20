package Entities;

public class Clerk {

    public String name;
    public double liquideSalary;
    public double tax;

    public double netSalary(){
        return liquideSalary - tax;

    }
    public void increaseSalary(double percentage){
        liquideSalary += liquideSalary * percentage / 100.0;
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f%n" , netSalary());

    }


}
