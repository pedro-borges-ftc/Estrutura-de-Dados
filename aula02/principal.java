package aula02;

public class principal {
    public static void main(String[] args) {
        exercicio01();
        
        exercicio02();

    }

    private static void exercicio02() {
        /*int[][] b = new int[2][2];
        b[0][0] = 5;
        b[0][1] = 10;
        b[1][0] = 15;
        b[1][1] = 25;*/
        int b[][] = {{5, 10} , {15, 25}};

        for(int linha = 0; linha < b.length; linha++){//percorre as linhas
            
            for(int coluna = 0; coluna < b.length; coluna++){//percorre as colunas
            
                System.out.print(b[linha][coluna] + "\t");

            }
            
            System.out.println("");
        }
    }

    private static void exercicio01() {
        System.out.println("***exercicio01*** ");
        int soma = 0;
        int valores[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        for (int valor : valores) {
            //System.out.println(valor);
            soma += valor;
        }

        System.out.println("A soma dos elementos do array é: " + soma);
    }


}
