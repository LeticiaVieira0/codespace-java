import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Incrementação
        int a = 0;
        a = a + 1;
        a+=1;
        a++;

        //Decremento
        int b = 0;
        b = b -1;
        b-=1;
        b--;

        //Elif (encadeamento de if)
        System.out.println("Entre com o um numero: ");
        int num = teclado.nextInt();

        //&& and, || or
        if (num != 1 && num != 2 && num != 3 && num != 4) {
            System.out.println("Numero desconhecido");
        }

        if (num == 1) {
            System.out.println("Um");
        }else if (num == 2) {
            System.out.println("Dois");
        }else if (num == 3) {
            System.out.println("Tres");
        }else if (num == 4) {
            System.out.println("Quatro");
        }

        //Switch case
        switch (num) {
            case 1:
                System.out.println("Um");
                break;

            case 2:
                System.out.println("Dois");
                break;

            case 3:
                System.out.println("Tres");
                break;

            case 4:
                System.out.println("Quatro");
                break;

            default:
                System.out.println("Numero desconhecido");
                break;
        }


        //Outro tipo de switch
        switch (num) {
            case 1 -> System.out.println("UM");
            case 2 -> System.out.println("DOIS");
            case 3 -> System.out.println("TRES");
            case 4 -> System.out.println("QUATRO");
            default -> System.out.println("DESCONHECIDO");
        }

        //Outro tipo para escrever menos
        String resultado = switch(num){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            default -> "desconhecido";
        };

        System.out.println(resultado);

        teclado.close();
    }
}
