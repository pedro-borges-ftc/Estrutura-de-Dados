package aula03;

import java.util.ArrayList;
import java.util.Scanner;

public class listaString {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // A lista é criada vazia
        ArrayList<String> playlist = new ArrayList<String>();
        int opcao = 0;
        String valor = "";

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Tamanho");
            System.out.println("4 - Buscar");
            System.out.println("5 - Imprimir");
            System.out.println("6 - Ordenar");
            opcao = ler.nextInt(); 
            ler.nextLine(); 

            switch (opcao) {
                case 1:// Adicionar
                    System.out.println("Digite o valor a ser adicionado:");
                    valor = ler.nextLine();
                    playlist.add(valor);
                    break;
                case 2:// Remover
                    System.out.println("Digite o valor a ser removido:");
                    valor = ler.nextLine();
                    playlist.remove(valor);
                    break;

                case 3:// Tamanho
                    System.out.println("O tamanho atual é: " + playlist.size());
                    break;
                case 4:// Buscar
                    System.out.println("Digite o valor a ser encontrado:");
                    valor = ler.nextLine();
                    System.out.println("Item encontrado [" + playlist.indexOf(valor) + "]");
                    break;
                case 5:// Imprimir
                    System.out.println(playlist.toString());
                    break;
                case 6:// Ordenar
                    playlist.sort(null);
                    System.out.println(playlist.toString());
                    break;
            }
        } while (opcao != 0);
    }
}