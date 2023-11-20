package application;

import Entities.Clerk;

import java.util.Locale;
import java.util.Scanner;

public class program_Func {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("SEJAM BEM VINDO AO EXERCICIO DE CALCULO DE SALARIO DE FUNCIONARIO COM DESCONTOS : ");
        System.out.println();
        Scanner func = new Scanner(System.in);
        Clerk emp = new Clerk();
        System.out.print("NAME : ");
        emp.name = func.nextLine();
        System.out.println("LIQUIDE SALARY : ");
        emp.liquideSalary = func.nextDouble();
        System.out.println("TAX : ");
        emp.tax = func.nextDouble();
        System.out.println();
        System.out.println(" THANKS , FOR THE DATA ");
        System.out.println("LOADING.............");
        System.out.println("RESULT : ");
        System.out.println();

        System.out.print("CLARK : " + emp);
        System.out.println();
        System.out.print("WHICH PERCENTAGE TO INCREASE SALARY : ");
        double percentage = func.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.print("UPDATE DATA : " + emp);
        func.close();
    }
}
