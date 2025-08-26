import calculadora.Calculadora;

public class main 
{
      public static void main(String[] args) 
    {
        
       calculadora calc1 = new calculadora();
       calculadora calc2 = new calculadora();

        calc1.numeroA = 2.0;
        calc1.numeroB = 3.0;

        calc2.numeroA = 4.0;
        calc2.numeroB = 5.0;

        calc1.soma();
        calc2.soma();


    }
}
