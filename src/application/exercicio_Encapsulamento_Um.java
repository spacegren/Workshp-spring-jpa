package application;

import Entities.encapsulamento_Executer_Um;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Encapsulamento_Um {
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO NOVO CAPITULO DE ENCAPSULAMENTO APROVEITANDO CODIGO : (");
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


        encapsulamento_Executer_Um encapsulamento_executer_um = new encapsulamento_Executer_Um(productName,quantity, price);


        encapsulamento_executer_um.setName("COMPUTER : ");


        System.out.println();
        System.out.println("PRODUCT DATA : " + productName + "" + price + "" + quantity);
        System.out.println();

        System.out.println("ENTER THE NUMBERS OF PRODUCTS TO BEE ADD IN STOCK : ");
        quantity = construc.nextInt();
        encapsulamento_executer_um.addProducts(quantity);

        System.out.println();
        System.out.println("UPDATE DATA : " + productName + "" + quantity + "" +  price);

        System.out.println("ENTER THE NUMBERS REMOVE PRODUCTS IN STOCK : ");
        quantity = construc.nextInt();
        System.out.println();

        System.out.println("UPDATE DATA : " + productName + "" );

        System.out.println("UPDATE NAME : " + encapsulamento_executer_um.getName());
        encapsulamento_executer_um.setPrice(1200.00);
        System.out.println("UPDATE PRICE : " + encapsulamento_executer_um.getPrice());
        construc.close();




    }
}

