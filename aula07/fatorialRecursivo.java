package aula07;

import java.util.Scanner;

public class fatorialRecursivo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite o valor:");
        valor = ler.nextInt();

        System.out.println("O Fatorial de " + valor + " é " + fatorial(valor));
    }

    private static int fatorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * fatorial(n - 1);
        }
    }

}