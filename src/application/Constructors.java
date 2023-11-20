package application;

import Entities.executer_Constructor;

import java.util.Locale;
import java.util.Scanner;

public class Constructors {
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO NOVO CAPITULO DE CONSTRUTORES");
        System.out.println();
        Locale.setDefault(Locale.US);
        Scanner construc = new Scanner(System.in);
        System.out.println("ENTER THE PRODUCT : ");
        String productName = construc.nextLine();
        System.out.println("NAME SAVED ....");
        System.out.println();
        System.out.println("ENTER THE PRICE : ");
        double price = construc.nextDouble();
        System.out.println("PRICE SAVED .....");
        System.out.println();
        System.out.println("QUANTITY IN STOCK : ");
        int quantity = construc.nextInt();
        System.out.println("QUANTITY SAVED ....");

        executer_Constructor executer_constructor = new executer_Constructor(productName,quantity, price);

        System.out.println();
        System.out.println("PRODUCT DATA : " + productName + price + quantity);
        System.out.println();

        System.out.println("ENTER THE NUMBERS OF PRODUCTS TO BEE ADD IN STOCK : ");
        quantity = construc.nextInt();
        executer_constructor.addProducts(quantity);

        System.out.println();
        System.out.println("UPDATE DATA : " + productName + "" + quantity + "" +  price);

        System.out.println("ENTER THE NUMBERS REMOVE PRODUCTS IN STOCK : ");
        quantity = construc.nextInt();
        System.out.println();

        System.out.println("UPDATE DATA : " + productName + "" );
        construc.close();




    }
}
