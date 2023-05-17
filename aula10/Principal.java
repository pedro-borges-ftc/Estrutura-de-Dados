package aula10;

public class Principal {

	public static void main(String[] args) {
		ArvoreBinaria ab = new ArvoreBinaria(8);
		System.out.println("Exemplo de Arvore Binaria");
		System.out.println("Criando arvore com a raiz " + ab.getRaiz().getValor());
		ab.inserir(ab.getRaiz(), 3);
		ab.inserir(ab.getRaiz(), 10);
		ab.inserir(ab.getRaiz(), 1);
		ab.inserir(ab.getRaiz(), 6);
		ab.inserir(ab.getRaiz(), 14);
		ab.inserir(ab.getRaiz(), 4);
		ab.inserir(ab.getRaiz(), 7);
		ab.inserir(ab.getRaiz(), 15);
		ab.inserir(ab.getRaiz(), 17);
		ab.inserir(ab.getRaiz(), 19);
		ab.inserir(ab.getRaiz(), 13);
		ab.remover(ab.getRaiz(), 15);
		ab.imprime(ab.getRaiz(), 1);		
	}

}
