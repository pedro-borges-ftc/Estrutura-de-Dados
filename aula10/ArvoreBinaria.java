package aula10;

public class ArvoreBinaria {
	//atributos
	private Noh raiz;
	//construtores
	public ArvoreBinaria() {
		raiz = null;
	}
	public ArvoreBinaria(int valor) {
		raiz = new Noh(valor);
	}	
	//métodos
	public Noh getRaiz() {
		return raiz;
	}
	public void setRaiz(Noh raiz) {
		this.raiz = raiz;
	}
	//Inserir
	public void inserir(Noh node, int valor) {
		if(raiz == null) {
			raiz = new Noh(valor);
		}else {
			//Verifica se o valor a ser inserido é menor que o nodo corrente da �rovre, se sim vai para subarvore esquerda
			if(valor < node.getValor()) {
				//Se tiver elemento no nodo esquerdo continua a busca
				if (node.getNohEsq() != null) {
					inserir(node.getNohEsq(), valor);
				} else {
					//Se nodo esquerdo vazio insere o novo nodo aqui
					System.out.println("\n\nInserindo " + valor + " a esqueda de " + node.getValor());
					//node.esquerda = new No(valor);
					node.setNohEsq(new Noh(valor));
				}
				//Verifica se o valor a ser inserido é maior que o nodo corrente da �rvore, se sim vai para subarvore direita
			}else if (valor > node.getValor()) {
				//Se tiver elemento no nodo direito continua a busca
				if (node.getNohDir() != null) {
					inserir(node.getNohDir(), valor);
				} else {
					//Se nodo direito vazio insere o novo nodo aqui
					System.out.println("\n\nInserindo " + valor + " a direita de " + node.getValor());
					//node.direita = new No(valor);
					node.setNohDir(new Noh(valor));
				}			
			}
		}
	}
	//Remover
	public Noh remover(Noh node, int valor) {
		if (node == null) {
			System.out.println("Árvore vazia ");
			return null;
		}
		System.out.println("Remover: Corendo No " + node.getValor());
		if (valor < node.getValor()) {
			node.setNohEsq(remover(node.getNohEsq(), valor));
		} else if (valor > node.getValor()) {
			node.setNohDir(remover(node.getNohDir(), valor));
		} else if (node.getNohEsq() != null && node.getNohDir() != null)  // 2 filhos
		{
			System.out.println("Removeu No " + node.getValor());
			node.setValor(encontraMinimo(node.getNohDir()).getValor());
			node.setNohDir(removeMinimo(node.getNohDir()));
		} else {
			System.out.println("  Removeu No " + node.getValor());
			if(node.getNohEsq() == null) {
				node = node.getNohEsq();
			}else {
				node = node.getNohDir();
			}
		}
		return node;
	}
	//Encontra Mínimo
	public Noh encontraMinimo(Noh node) {
		if (node != null) {
			while (node.getNohEsq() != null) {
				node = node.getNohEsq();
			}
		}
		return node;
	}
	//Remove Mínimo
	public Noh removeMinimo(Noh node) {
		if (node == null) {
			System.out.println("  ERRO ");
		} else if (node.getNohEsq() != null) {
			//node.esquerda = removeMinimo(node.esquerda);
			node.setNohEsq(removeMinimo(node.getNohEsq()));
			return node;
		} else {
			return node.getNohDir();
		}
		return null;
	}	
	//Soma
	public int soma(Noh node) {
		if(node == null) {
			return 0;
		}else {
			return node.getValor() + 
			soma(node.getNohEsq()) + 
			soma(node.getNohDir()); 
		}
	}
	//Pré-Ordem
	public void preOrdem(Noh no) {
		if(no != null){
			System.out.print(no.getValor() + " ");
			preOrdem(no.getNohEsq());
			preOrdem(no.getNohDir());
		}
	}
	//Em Ordem
	public void emOrdem(Noh no) {
		if(no != null){
			emOrdem(no.getNohEsq());
			System.out.print(no.getValor() + " ");
			emOrdem(no.getNohDir());
		}
	}
	//Pós-Ordem
	public void posOrdem(Noh no) {
		if(no != null){
			posOrdem(no.getNohEsq());	        
			posOrdem(no.getNohDir());
			System.out.print(no.getValor() + " ");
		}
	}
	//Imprime
	public void imprime(Noh inicial, int vezes) {
		if(inicial != null) {
			Noh aux = inicial;
			//
			if(inicial.getNohDir() != null) {
				aux = inicial.getNohDir();
				imprime(aux, ++vezes);
				System.out.println("");
				vezes--;
			}
			//
			if(inicial.getNohDir() == null && inicial.getNohEsq() != null) {
				for(int i = 0; i < vezes*5; i++)
					System.out.print(" ");
				inicial.imprimeNoh();
			}
			//
			if(inicial.getNohDir() != null && inicial.getNohEsq() == null) {
				for(int i = 0; i < vezes*5; i++)
					System.out.print(" ");
				inicial.imprimeNoh();
			}
			//
			if(inicial.getNohDir() != null && inicial.getNohEsq() != null) {
				for(int i = 0; i < vezes*5; i++)
					System.out.print(" ");
				inicial.imprimeNoh();
			}
			//
			if(inicial.getNohEsq() != null) {
				System.out.println("");
				aux = inicial.getNohEsq();
				imprime(aux, ++vezes);
				vezes--;
			}
			//
			if(inicial.getNohDir() == null && inicial.getNohEsq() == null) {
				for(int i = 0; i < vezes*5; i++)
					System.out.print(" ");
				inicial.imprimeNoh();
			}
		}else {
			System.out.println("A árvore está vazia!");
		}
	}
}
