package application;

import Entities.executer_Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Encapsulamento {
    public static void main(String[] args) {
        System.out.println("BEM VINDO A AULA DE ENCAPSULAMENTO EXERCICIO 1");
        System.out.println("NOTA QUE FIZ ESSE PROGRAMA TOTALMENTE SOZINHA SOMENTE CON AUXILIO E RECURSOS DAS MINHAS AULAS ANTERIORES :)");
        System.out.println("");
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO ENCAPSULAMENTO FAREMOS O EXEMPLO COM ALGORITIMO DE SENHA : ");
        System.out.println();
        System.out.println("DIGITE O NOME DE USUARIO :");
        String name = scan.nextLine();
        System.out.println("POR FAVOR DIGITE A SENHA QUE VOÇE DESEJA SALVAR COMO SUA SENHA PADRAO : ");
        int senhaV = scan.nextInt();
        System.out.println();
        System.out.println("SENHA ARMAZENADA COM SUCESSO /////////////////");
        System.out.println();
        System.out.println("TESTE SUA SENHA AGORA MESMO : ");
        System.out.println();

        executer_Encapsulamento executer_encapsulameto = new executer_Encapsulamento();
        System.out.println();















    }
}
