import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //exercicio 1
        System.out.println("EXERCICIO 1\n");
        double nums[] = {1.0, 2.0, 1.5, 6, 9, 7, 4.5, 3.3, 10};
        double bigger = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > bigger){
                bigger = nums[i];
            }
        }
        System.out.println("o maior numero da lista é "+bigger);


        //exercicio 2
        System.out.println("EXERCICIO 2\n");
        //num of the elements you want to get
        int n = 10;

        int fibonnaci[] = new int[n];
        fibonnaci[0] = 1;
        fibonnaci[1] = 1;

        for(int j=2; j<n; j++){
            fibonnaci[j]= fibonnaci[j-1] + fibonnaci[j-2];
        }
        System.out.println("n de fibbonacci escolhido: "+fibonnaci[n-1]);
        //fibonnaci[2] = fibonnaci[1] + fibonnaci[0];

        //exercicio 3
        System.out.println("EXERCICIO 3 \n");
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {6, 7, 8, 9, 10};
        int[] vetorSoma = new int[5];
        //somar vetorA[0] + vetorB[0], depois vetorA[1] + vetorB[1]

        for(int k=0; k<5; k++){
            vetorSoma[k] = vetorA[k] + vetorB[k];
            System.out.println(vetorSoma[k]);
        }

        //exercicio 4
        System.out.println("EXERCICIO 4 \n");
        //Leia a nota de 38 alunos de uma turma e calcule a média das notas, a maior e a menor nota.
        // Quantidade de notas a serem lidas (era pra ser 38 mas vai ser 5, só mudar a variavel)
        double quantidadeNotas = 5;
        int contagem = 0;

        // A maior nota vai ser armazenada nessa variavel:
        double maior = 0;

        // A menor nota vai ser armazenada nessa variavel:
        double menor = 10;

        // Soma das notas vai ficar aqui:
        double somaTotal= 0;
        
        // abrindo o teclado pra digitar nota
        Scanner teclado = new Scanner(System.in);

        while (contagem<quantidadeNotas) {
            System.out.println("Digite a nota n°"+contagem);
            double media = teclado.nextDouble();
            if (media>maior) {
                maior = media;
            }
            if (media<menor) {
                menor = media;
            }
            somaTotal = somaTotal + media;
            contagem += 1;
        }
        System.out.println("Media da turma "+(somaTotal/quantidadeNotas));
        System.out.println("Maior nota: "+maior);
        System.out.println("Menor nota: "+menor);


        //fecha o teclado
        teclado.close();

        // ler quantidade de notas
        // indexar em uma lista



    }
}
