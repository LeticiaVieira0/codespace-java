import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String senha;
        senha = "a";

        for(int i=0; i<=2; i++){
            System.out.println("Digite a sua senha: ");
            String tentativa = leitor.nextLine();
            System.out.println("A variavel senha é: "+senha);
            System.out.println("A variavel tentativa é: "+tentativa);


            // Em java a comparação de objetos é feita atraves de referencias, mesmo sendo iguais retorna o valor False
            //System.out.println(senha == tentativa);

            // Agora sim estamos comparando as strings corretamente, se elas forem iguais vai retornar True
            //System.out.println(tentativa.equals(senha));

            if (tentativa.equals(senha)) {
                System.out.println("parabens voce acertou a senha!!");
                i=3;
            }else {
                System.out.println("ERRASTE A SENHA");
            }
        }

        leitor.close();
        }
            }
