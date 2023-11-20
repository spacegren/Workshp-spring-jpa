package application;

import Entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class calcule_Retangle {
    public static void main(String[] args) {

        System.out.println("BEM VINDO AO CALCULO DO RETANGULO USANDO ORIENTAÇAO A OBJETO : ");

        Locale.setDefault(Locale.US);
        Scanner rec = new Scanner(System.in);

        Retangle rect = new Retangle();
        System.out.println();

        System.out.println("ENTER RECTANGLE WIDTH AND HEIGHT : ");
        System.out.println();
        System.out.println("ENTER WIDHT :  ");
        rect.widht = rec.nextDouble();
        System.out.println("ENTER HEIGHT :  ");
        rect.height = rec.nextDouble();
        System.out.println();
        System.out.println("CARREGANDO////////");
        System.out.println();
        System.out.println("IMPRIMINDO RESULTADOS ........");
        System.out.println();
        System.out.printf("AREA  = %.3f%n" , rect.area());
        System.out.printf("PERIMETER = %.2f%n " , rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n " , rect.diagonal());

    }
}
