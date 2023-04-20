package aula07;

import java.util.Scanner;

public class somaRecursivo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite o valor:");
        valor = ler.nextInt();

        System.out.println("A soma de 0 até " + valor + " é " + soma(valor));
    }

    private static int soma(int n) {
        if(n == 0 || n == 1){
            return n;
        }else{
            return n + soma(n - 1);
        }
    }

}