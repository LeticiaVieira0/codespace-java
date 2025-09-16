import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Essas letrinha imprime coisa na tela
        System.out.println("oie meu mundinho");

        //inteiros
        int a;
        a = 10;

        //reais
        double d;
        d = 9.5;

        //booleanos
        boolean b;
        b = true;

        //string
        String frase;
        frase = "HelloWorld";

        //Obejto para ler informações do teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com seu nome!: ");
        String nome = teclado.nextLine();
        //System.out.println("Yipeee, oi!! " + nome);

        System.out.println("Entre com o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        System.out.println("Entre com o ano atual:");
        int anoAtual = teclado.nextInt();

        int idade = anoAtual-anoNascimento;

        if (anoAtual<anoNascimento){

            System.out.println("Como assim, voce tem idade negativa?");

        }else if(idade>100){

            System.out.println("Procure o balcão pra provar sua idade");
            
        }else{

            System.out.println("Olá " + nome + ", voce tem " + idade + " anos");

        }


        teclado.close(); //Fechando o teclado

    }


}
