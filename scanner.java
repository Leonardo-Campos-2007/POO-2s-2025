import java.util.Scanner;

public class scanner 
{
    public static void main(String[] args) 
    {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = entradaUsuario.nextLine();

        System.out.println("QUAL SUA IDADE ? ");
        float idade = entradaUsuario.nextFloat();

        System.out.println("Olá, " + nome);
        System.out.println("Sua idade eh " + idade);

    }
}
