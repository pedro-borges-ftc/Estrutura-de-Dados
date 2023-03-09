package aula03;

public class Pessoa implements Comparable<Pessoa>{
    String nome;
    int cpf;
    int idade;
    String email;
    String celular;

    public void imprimir(){
        System.out.println("---------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("idade: " + this.idade);
        System.out.println("E-mail: " + this.email);
        System.out.println("Celular: " + this.celular);
        System.out.println("");
    }

    @Override public int compareTo(Pessoa outraPessoa) { //implementação }
        if(this.cpf > outraPessoa.cpf){
            return 1;
        }else{
            return -1;
        }
    }
}
