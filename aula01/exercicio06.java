package aula01;

import java.util.Scanner;

public class exercicio06{
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite um valor");
            int valor = ler.nextInt();
            System.out.println("Antecessor = " + (valor - 1));
            System.out.println("Sucessor = " + (valor + 1));
        }
    }
}