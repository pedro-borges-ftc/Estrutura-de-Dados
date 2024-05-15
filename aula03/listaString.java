package aula03;

import java.util.ArrayList;
import java.util.Scanner;

public class listaString {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // A lista é criada vazia
        ArrayList<String> minhaLista = new ArrayList<String>();
        int opcao = 0;
        String valor = "";

        do {
            System.out.println("******Lista de Strings*****:");
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
                    minhaLista.add(valor);    //add é o método que insere elementos num Arraylist
                    break;
                case 2:// Remover
                    System.out.println("Digite o valor a ser removido:");
                    valor = ler.nextLine();
                    minhaLista.remove(valor);   //remove é o método que exclui um item do Arraylist
                    break;
                case 3:// Tamanho
                    System.out.println("O tamanho atual é: " + minhaLista.size()); //size é o método que devolve o tamanho do Arraylist
                    break;
                case 4:// Buscar
                    System.out.println("Digite o valor a ser encontrado:");
                    valor = ler.nextLine();
                    System.out.println("Item encontrado [" + minhaLista.indexOf(valor) + "]"); //indexof é o método que localiza um elemento no Arraylist através do valor
                    break;
                case 5:// Imprimir
                    System.out.println(minhaLista.toString()); //toString é o método que imprime o Arraylist
                    break;
                case 6:// Ordenar
                    minhaLista.sort(null); //sort é o método que ordena o array
                    System.out.println(minhaLista.toString());
                    break;
                default:
                System.out.println("opção inválida : " + opcao);
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