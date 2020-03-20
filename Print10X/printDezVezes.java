package Print10X;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * printDezVezes
 */
public class printDezVezes
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        out.println("Insere uma mensagem bonita:");
        String stringue = scanner.nextLine();

        for (int i = 0; i < 10; i++)
        {
            out.println(i +" - " + stringue);    
        }

        scanner.close();
    }
}
