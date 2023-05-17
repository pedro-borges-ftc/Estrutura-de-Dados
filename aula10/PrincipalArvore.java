package aula10;

import java.util.Scanner;

public class PrincipalArvore {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int resultado = 0, opcao = 1, aux, valor;
        ArvoreBinaria ab = new ArvoreBinaria();
        
        while(opcao != 0){
    
        	System.out.println("\n\n*************Árvore*****************");
        	System.out.println("0-Sair");
        	System.out.println("1-Inserir");
        	System.out.println("2-Remover");
        	System.out.println("3-Imprimir");
        	System.out.println("4-Soma");
        	System.out.println("5-Em-Ordem");
        	System.out.println("6-Pré-Ordem");
        	System.out.println("7-Pós-Ordem");
        	opcao = ler.nextInt();
        	
        	switch(opcao){
        		case 0: //nada
        			System.out.println("***FIM DO PROGRAMA***");
        			break;
        		case 1: //Inserir
        			System.out.println("Digite o valor do Noh a ser inserido: ");
        			valor = ler.nextInt();        			
        			ab.inserir(ab.getRaiz(),valor);
        			break;
        		case 2: //Remover
        			System.out.println("Digite o valor do Noh a ser removido: ");
        			valor = ler.nextInt();        			
        			ab.remover(ab.getRaiz(),valor);
        			break;
        		case 3: //Imprimir
        			ab.imprime(ab.getRaiz(), 1);
        			break;
        		case 4://Soma
        			System.out.println("Soma dos elementos: " + ab.soma(ab.getRaiz()));
        			break;
        		case 5://Em-Ordem
        			ab.emOrdem(ab.getRaiz());
        			break;
        		case 6://Pré-Ordem
        			ab.preOrdem(ab.getRaiz());
        			break;
        		case 7://Pós-Ordem
        			ab.posOrdem(ab.getRaiz());
        			break;
        		default:
        			System.out.println("Opção Inválida");
        	}//Fim do Switch
			ler.nextLine();
			ler.nextLine();
            try {
                //new ProcessBuilder("cls").inheritIO().start().waitFor();  // Para windows
                new ProcessBuilder("clear").inheritIO().start().waitFor();	// Para linux (acho que para mac também)
              } catch(Exception e) {
                e.printStackTrace();
              }
        }//Fim do Loop
	}//Fim do MAIN***********************
}//Fim da Classe