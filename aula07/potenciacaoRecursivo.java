package aula07;

import java.util.Scanner;

public class potenciacaoRecursivo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, n;
        
        System.out.println("Digite x:");
        x = ler.nextInt();

        System.out.println("Digite n:");
        n = ler.nextInt();

        System.out.println("O valor de " + x + " ˆ " + n + " = " + potencia(x,n));
    }

    private static int potencia(int x, int n) {
        if(n == 0){return 1;}
        if(n == 1){
            return x;
        }else{
            return x * potencia(x,n - 1);
        }
    }

}