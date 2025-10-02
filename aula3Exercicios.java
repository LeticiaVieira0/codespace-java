import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//         Exercício:

//     Faça um menu apresentando todas as opções de resolução, pedindo entradas numeradas, como (1) Calcule área de um retângulo; (2) Calcule área de triângulo; etc;
//     Capture a entrada do usuário como um número inteiro e a processe (utilize switch/case). Caso nenhuma das opções apresentadas seja escolhida você deve apresentar a mensagem: Opção inválida!
//     Utilize se/senão para verificar valores inválidos (zero e negativos).

// Opções de resolução:

//     1Área de um retângulo (base*altura);
//     2Área de um triângulo (base*altura/2);
//     3Hipotenusa de um triângulo retângulo.
//     4Área de um círculo (pi*raio*raio);
//     5Perímetro de um círculo (2*pi*raio);
//     6Média de n números de ponto flutuante (num_1+num_2+...+num_n)/n;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a opção que deseja fazer! (apenas o numero)");
        System.out.println("");
        System.out.println("(1) Área de um retângulo");
        System.out.println("(2) Área de um triângulo");
        System.out.println("(3) Hipotenusa de um triângulo retângulo");
        System.out.println("(4) Área de um círculo");
        System.out.println("(5) Perímetro de um círculo");
        System.out.println("(6) Média de 3 alunos");

        int num = teclado.nextInt();

        switch (num){
            case 1:

                System.out.println("Vamos calcular a area de um retangulo!");
                System.out.println("Entre com a base: ");
                int base = teclado.nextInt();
                System.out.println("Agora entre com a altura: ");
                int altura = teclado.nextInt();
                System.out.println("Area do retangulo é igual a: "+base*altura);
                break;

            case 2:

                System.out.println("Vamos calcular a area de um triangulo!");
                System.out.println("Entre com a base: ");
                int baseTrian = teclado.nextInt();
                System.out.println("Agora entre com a altura: ");
                int alturaTrian = teclado.nextInt();
                System.out.println("Area do retangulo é igual a: "+baseTrian*alturaTrian/2);
                break;
                
            case 3:

                System.out.println("Hipotenusa do triangulo retangulo bora");
                System.out.println("Entre com o primeiro cateto: ");
                int catetoA = teclado.nextInt();
                System.out.println("Agora entre com o segundo cateto: ");
                int catetoB = teclado.nextInt();

                int hipotenusa=(catetoA*catetoA) + (catetoB*catetoB);
                System.out.println("A hipotenusa é: "+Math.sqrt(hipotenusa));
                break;

            case 4:

                System.out.println("Area do circulo:");
                System.out.println("Entre com o raio do circulo: ");
                int raio = teclado.nextInt();
                double pi = 3.1415;

                System.out.println("A area do circulo é "+raio*raio*pi);
                break;

            case 5:

                System.out.println("Perimetro do circulo: ");
                System.out.println("Entre com o raio: ");
                int raio1 = teclado.nextInt();
                double pi2 = 3.1415;
                int dois = 2;

                System.out.println("O perimetro do circulo é: "+raio1*dois*pi2);
                break;

            case 6:

                System.out.println("Media de 3 alunos ");
                System.out.println("Digite a media do aluno1");
                double aluno1 = teclado.nextInt();
                System.out.println("Digite a media do aluno2");
                double aluno2 = teclado.nextInt();
                System.out.println("Digite a media do aluno3");
                double aluno3 = teclado.nextInt();
                System.out.println("A media dos tres alunos é: "+(aluno1+aluno2+aluno3)/3);
                break;

            default:
                System.out.println("Numero invalido");
                break;
        }
        teclado.close();

    }
}
