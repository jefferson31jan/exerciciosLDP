package Lista09;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0, num = 0;
        do {
            System.out.print("Digite um valor: ");
            x = s.nextInt();
            if (x > 100 && x < 200) {
                num++;
            }
        } while (x != 0);
        System.out.println("Foram digitados " + num + " números entre 100 e 200.");
        System.out.println("Programa Finalizado!!!");
    }

}
