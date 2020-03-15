package CompararNotaTernario;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CompararNotaTernario
{
    public static void main(String[] args) 
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int continuar = 1;

        while  (continuar == 1)
        {
            out.println("Insere a nota: ");
            int nota = scanner.nextInt();

            String mensagem = nota > 10 ? "Parabéns" : "Marque novo exame.";
            out.println(mensagem);

            out.println("");
            out.println("----------------------------------");
            out.println("Continuar?");
            out.println("1: Sim");
            out.println("Qualquer outro valor: Não");
            out.println("----------------------------------");
            continuar = scanner.nextInt();
        }
        out.println("Até breve...");
        scanner.close();

    }    
}