package Lista09;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome;
        System.out.print("Digite um nome: ");
        nome = s.nextLine();
        
        while (!nome.toLowerCase().equals("fim")) {
            System.out.print("Digite um nome: ");
            nome = s.nextLine();
        }
        System.out.println("Programa Finalizado!");
    }

}
