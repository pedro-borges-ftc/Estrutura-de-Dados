package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listaPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // A lista é criada vazia
        ArrayList<Pessoa> playlist = new ArrayList<Pessoa>();
        int opcao = 0;
        Pessoa valor;

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

            valor = new Pessoa();

            switch (opcao) {
                case 1:// Adicionar
                    
                    System.out.println("Digite o nome da Pessoa:");
                    valor.nome = ler.nextLine();
                    System.out.println("Digite o cpf da Pessoa:");
                    valor.cpf = ler.nextInt();
                    ler.nextLine();
                    /*System.out.println("Digite o idade da Pessoa:");
                    valor.idade = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Digite o e-mail da Pessoa:");
                    valor.email = ler.nextLine();
                    System.out.println("Digite o celular da Pessoa:");
                    valor.celular = ler.nextLine();*/
                    playlist.add(valor);
                    break;
                case 2:// Remover
                    System.out.println("Digite o nome da Pessoa:");
                    valor.nome = ler.nextLine();
                    System.out.println("Digite o cpf da Pessoa:");
                    valor.cpf = ler.nextInt();
                    ler.nextLine();
                    playlist.remove(valor);
                    break;

                case 3:// Tamanho
                    System.out.println("O tamanho atual é: " + playlist.size());
                    break;
                case 4:// Buscar
                        System.out.println("Digite o nome da Pessoa:");
                        valor.nome = ler.nextLine();
                        System.out.println("Digite o cpf da Pessoa:");
                        valor.cpf = ler.nextInt();
                        ler.nextLine();
                        System.out.println("Item encontrado [" + playlist.indexOf(valor) + "]");
                    break;
                case 5:// Imprimir
                    Imprimir(playlist);
                    break;
                case 6:// Ordenar
                    Collections.sort(playlist);
                    Imprimir(playlist);
                    break;
            }
        } while (opcao != 0);
    }

    private static void Imprimir(ArrayList<Pessoa> playlist) {
        for (Pessoa p : playlist) {
            p.imprimir();
        }
    }
}