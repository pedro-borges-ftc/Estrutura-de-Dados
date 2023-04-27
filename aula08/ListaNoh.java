package aula08;

public class ListaNoh {
    //Atributos
    private Noh primeiroNoh;
    //Construtor
    public ListaNoh(Noh primeiroNoh) {
        this.primeiroNoh = primeiroNoh;
    }
    public ListaNoh() {
        
    }
    //Gets e Sets
    public Noh getPrimeiroNoh() {
        return this.primeiroNoh;
    }
    public void setPrimeiroNoh(Noh primeiroNoh) {
        this.primeiroNoh = primeiroNoh;
    }
    //Métodos
    public boolean estaVazia(){
        if(this.primeiroNoh == null){
            return true;
        }
        return false;
    }
    public void inserirNoInicio(Noh novoNoh){
        if(this.estaVazia()){
            this.primeiroNoh = novoNoh;
        }else{
            novoNoh.setProxNoh(this.primeiroNoh);
            this.primeiroNoh = novoNoh;
        }
    }
    public void inserirNoFim(Noh novoNoh){
        novoNoh.setProxNoh(null);
        if(this.estaVazia()){
            this.primeiroNoh = novoNoh;
        }else{
            Noh aux = this.primeiroNoh;
            while(aux.getProxNoh() != null){
                aux = aux.getProxNoh();
            }
            aux.setProxNoh(novoNoh);
        }
    }
    public Noh removerNoInicio(){
        Noh aux = new Noh();
        if(this.estaVazia()){
            System.out.println("A lista já está vazia!");
        }else{
            aux = this.primeiroNoh;
            this.primeiroNoh = aux.getProxNoh();
            aux.setProxNoh(null);
        }
        return aux;
    }
    public void imprimeListaNoh(Noh atual){
        if(this.estaVazia()){
            System.out.println("A lista já está vazia!");
        }else{
            //na chamada do main, tem de enviar o primeiro noh da lista
            if(atual.getProxNoh() == null){
                atual.imprimeNoh();
            }else{
                atual.imprimeNoh();
                System.out.print(" ");
                imprimeListaNoh(atual.getProxNoh());
            }
        }
    }
}
