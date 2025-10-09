import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double i = 1;
        Scanner leitor = new Scanner(System.in);
        while (i != 0) {
            System.out.println("digite a operacao que deseja fazer?");
            System.out.println("(1) soma");
            System.out.println("(2) subtracao");
            System.out.println("(3) multiplicacao");
            System.out.println("(4) divisao");
            System.out.println("(5) sair");
            System.out.println("");
            int op = leitor.nextInt();

            while (op == 1) {
                System.out.println("Digite o primeiro numero");
                double numS1 = leitor.nextInt();
                System.out.println("Digite o segundo numero");
                double numS2 = leitor.nextInt();
                double soma = numS1 + numS2;
                System.out.println("Sua soma é: "+soma);
                System.out.println("");
                break;
            }

            while (op == 2) {
                System.out.println("Digite o primeiro numero");
                double numSub1 = leitor.nextInt();
                System.out.println("Digite o segundo numero");
                double numSub2 = leitor.nextInt();
                double sub = numSub1 - numSub2;
                System.out.println("A subtracao dos numeros deu: "+sub);
                System.out.println("");
                break;
            }

            while (op == 3) {
                System.out.println("Digite o primeiro numero");
                double numM1 = leitor.nextInt();
                System.out.println("Digite o segundo numero");
                double numM2 = leitor.nextInt();
                double mult = numM1 * numM2;
                System.out.println("A sua multiplicacao deu: "+mult);
                System.out.println("");
                break;
            }

            // while (op = 4) {
                
            // }

            while (op == 5) {
                i = 0;
                break;
            }
        }
        leitor.close();
    }
}
