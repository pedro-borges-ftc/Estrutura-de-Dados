package aula05;

import java.util.Stack;
import java.util.Scanner;

public class pilhaInteiros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // A pilha é criada vazia
        Stack<Integer> pilha = new Stack<Integer>();

        int opcao = 0;
        int valor = 0;

        do {
            imprimeMenu();
            opcao = ler.nextInt(); 
            ler.nextLine(); 

            switch (opcao) {
                case 1:// Adicionar
                    System.out.println("Digite o valor a ser adicionado:");
                    valor = ler.nextInt();
                    pilha.push(valor);
                    break;
                case 2:// Remover
                System.out.println("Elemento Removido: " + pilha.pop());;
                    break;
                case 3:// Tamanho
                    System.out.println("O tamanho atual é: " + pilha.size());
                    break;
                case 4:// Topo
                    System.out.println("O Topo da Pilha é: " + pilha.peek());
                    break;
                case 5:// Imprimir
                    imprimePilha(pilha);
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

    private static void imprimeMenu() {
        System.out.println("******Pilha de Inteiros*****:");
        System.out.println("Digite a opção desejada:");
        System.out.println("0 - Sair");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Tamanho");
        System.out.println("4 - Topo");
        System.out.println("5 - Imprimir");
    }

    private static void imprimePilha(Stack<Integer> pilha) {
        System.out.println("Pilha de Inteiros: ");
        String teste = pilha.toString();                //atribui os elementos da pilha numa string
        teste = teste.substring(1,teste.length()-1);    //remove o "[" e o "]"
        String[] v = teste.split(", ");                 //quebra a string, num array
        //imprime os elementos da pilha
        for(int i = v.length -1; i >= 0; i--){
                System.out.println("["+ v[i] + "]");
        }
    }
}