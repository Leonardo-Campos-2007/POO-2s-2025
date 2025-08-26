import java.util.Scanner;

public class scanner 
{
    public static void main(String[] args) 
    {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = entradaUsuario.nextLine();

        System.out.println("Olá, "+ nome);

    }
}
