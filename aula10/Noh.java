package aula10;

public class Noh {
	//atributos
	private int valor;
	private Noh NohEsq;
	private Noh NohDir;
	//construtores
	public Noh(int v){
		this.valor = v;
		this.NohEsq = null;
		this.NohDir = null;
	}
	public Noh(int v, Noh esq, Noh dir){
		this.valor = v;
		this.NohEsq = esq;
		this.NohDir = dir;
	}
	//m�todos	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Noh getNohEsq() {
		return NohEsq;
	}
	public void setNohEsq(Noh nohEsq) {
		NohEsq = nohEsq;
	}
	public Noh getNohDir() {
		return NohDir;
	}
	public void setNohDir(Noh nohDir) {
		NohDir = nohDir;
	}
	public void imprimeNoh(){
		System.out.print(" {" + this.valor + "}");
	}
}