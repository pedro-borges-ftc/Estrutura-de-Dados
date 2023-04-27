package aula08;

public class Noh {
    //Atributos
    private int valor;
    private Noh proxNoh;
    //Construtores
    public Noh(){
        this.valor = 0;
        this.proxNoh = null;
    }
    public Noh(int v){
        this.valor = v;
        this.proxNoh = null;
    }
   //Gets e Sets
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Noh getProxNoh() {
        return proxNoh;
    }
    public void setProxNoh(Noh proxNoh) {
        this.proxNoh = proxNoh;
    }
   //Imprime
   public void imprimeNoh(){
        System.out.print("[" + this.valor + "]");
   }
   public String getNoh(){
        return "[" + this.valor + "]";
   }
}
