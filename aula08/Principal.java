package aula08;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // A lista é criada vazia
        ListaNoh lista = new ListaNoh();
        int opcao = 0;
        int valor = 0;

        do {
            System.out.println("******Lista de Noh*****:");
            System.out.println("Digite a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - EstaVazia");
            System.out.println("2 - inserirNoInicio");
            System.out.println("3 - inserirNoFim");
            System.out.println("4 - removerNoInicio");
            System.out.println("5 - Imprimir");
            opcao = ler.nextInt(); 
            ler.nextLine(); 

            switch (opcao) {
                case 1:// EstaVazia
                    if(lista.estaVazia()){
                        System.out.println("A lista ESTÁ vazia");
                    }else{
                        System.out.println("A lista NÃO está vazia");
                    }
                    break;
                case 2:// inserirNoInicio
                    System.out.println("Digite o valor a ser inserido:");
                    valor = ler.nextInt();
                    Noh n1 = new Noh(valor);
                    lista.inserirNoInicio(n1);
                    break;
                case 3:// inserirNoFim
                    System.out.println("Digite o valor a ser inserido:");
                    valor = ler.nextInt();
                    Noh n2 = new Noh(valor);
                    lista.inserirNoFim(n2);
                    break;
                case 4:// removerNoInicio
                    Noh n3 = lista.removerNoInicio();
                    System.out.println("Noh removido:" + n3.getNoh());
                    break;
                case 5:// Imprimir
                    lista.imprimeListaNoh(lista.getPrimeiroNoh());
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