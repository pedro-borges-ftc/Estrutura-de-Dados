package aula04;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class filaInteiros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // A fila é criada vazia
        Queue<Integer> q = new LinkedList<>();

        int opcao = 0;
        int valor = 0;

        do {
            System.out.println("******Fila de Inteiros*****:");
            System.out.println("Digite a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Tamanho");
            System.out.println("4 - Cabeça");
            System.out.println("5 - Imprimir");
            opcao = ler.nextInt(); 
            ler.nextLine(); 

            switch (opcao) {
                case 1:// Adicionar
                    System.out.println("Digite o valor a ser adicionado:");
                    valor = ler.nextInt();
                    q.add(valor);
                    break;
                case 2:// Remover
                System.out.println("Elemento Removido: " + q.remove());;
                    break;
                case 3:// Tamanho
                    System.out.println("O tamanho atual é: " + q.size());
                    break;
                case 4:// Cabeça
                    System.out.println("O primeiro da fila é: " + q.peek());
                    break;
                case 5:// Imprimir
                    System.out.println("Fila de Inteiros: " + q.toString());
                    break;
            }
            ler.nextLine();
            try {
                //new ProcessBuilder("cls").inheritIO().start().waitFor();  // Para windows
                new ProcessBuilder("clear").inheritIO().start().waitFor();	// Para linux (acho que para mac também)
              } catch(Exception e) {
                e.printStackTrace();
              }
        } while (opcao != 0);
    }
}