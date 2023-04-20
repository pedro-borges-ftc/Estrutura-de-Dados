package aula07;

import java.util.Scanner;

public class somaAlgarismosRecursivo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite o valor:");
        valor = ler.nextInt();

        System.out.println("A soma dos algarismos de " + valor + " é " + somaAlgarismos(valor));
    }

    private static int somaAlgarismos(int n) {
        if(n < 10){
            return n;
        }else{
            int resultado = n / 10;
            return (n % 10) + somaAlgarismos(resultado);
        }
    }

}