package Equacao2Grau;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Equacao2Grau
{
    public static void main(String[] args)
    {
        InputStream in = System.in;
        PrintStream out = System.out;
        Scanner scanner = new Scanner(in);

        int continuar = 1;

        while (continuar==1)
        {
            out.println("Insere o coeficiente de segundo grau: ");
            int a = scanner.nextInt();

            out.println("Insere o coeficiente de primeiro grau: ");
            int b = scanner.nextInt();

            out.println("Insere o termo independente: ");
            int c = scanner.nextInt();

            float bmenos = b * -1;
            float bquad = b * b;
            float quatroac = (4 * a * c);
            float disc = bquad - quatroac;

            if (disc >= 0)
            {
                double raiz1 = (bmenos + Math.sqrt(bquad - quatroac)) / 2 * a;
                double raiz2 = (bmenos - Math.sqrt(bquad - quatroac)) / 2 * a;
                if (raiz1 == raiz2)
                {
                    out.println("Esta equação só tem uma raíz: "+ raiz1);
                }
                else
                {
                    out.println("As raízes são: "+ raiz1 + " e: "+ raiz2);
                }
            }
            else
            {
                out.println("Esta equação não tem raízes reais.");
            }

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