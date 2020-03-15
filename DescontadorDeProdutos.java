package DescontadorDeProdutos;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DescontadorDeProdutos
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int continuar = 1;
        while (continuar==1)
        {
            out.println("Insere o tipo de produto a comprar:");
            String tipoProduto = scanner.next();

            String alimento = tipoProduto.substring(0, 3).toLowerCase();
            out.println(alimento);


            if (alimento.equalsIgnoreCase("veg"))
            {
                out.println("Desconto de 15%");
            }
            else if (alimento.equalsIgnoreCase("lac") || alimento.equalsIgnoreCase("cer") || alimento.equalsIgnoreCase("agu") )
            {
                out.println("Desconto de 10%");
            }
            else 
            {
                out.println("Desconto de 1%");
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
        scanner.close();    }
    
}