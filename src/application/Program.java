package application;

import Entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("BEM VINDO AO SEGUNDO EXERCICIO DE ORIENTAÇAO A OBJETO ");
        System.out.println("TIPO DE EXERCICIO  : CAIXA SIMPLES ");
        System.out.println("");
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Products products = new Products();
        System.out.println("ENTER PRODUCT DATA : ");
        System.out.print(" NAME : ");
        products.name = leitor.nextLine();
        System.out.print(" PRICE : ");
        products.price = leitor.nextDouble();
        System.out.print("QUANTITY IN STOCK : ");
        products.quantity = leitor.nextInt();

        System.out.println( "PRODUCTS DATA : " +products);
        System.out.println("");
        System.out.println("ENTER THE NUMBER OF PRODUCTS TO BE ADDED IN STOCK : ");
        int quantity = leitor.nextInt();
        products.addProducts(quantity);
        System.out.println("UPDATE DATA : " + products);
        System.out.println();
        System.out.println("ENTER THE NUMBER OF PRODUCTS TO BE REMOVED FROM STOCK :  ");
        quantity = leitor.nextInt();
        products.removeProducts();
        System.out.println();
        System.out.println("UPDATE DATA : " + products);

        leitor.close();
    }
}
