package Lista09;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, div = 1;
        System.out.print("Digite um número inteiro: ");
        num = s.nextInt();

        while (num != -999) {
            div = 1;
            System.out.println("Os divisores são:");
            while (div <= num) {
                if (num % div == 0) {
                    System.out.println(div);
                }
                div++;
            }
            System.out.print("Digite um número inteiro: ");
            num = s.nextInt();

        }
        System.out.println("Programa Encerrado!");
    }

}
