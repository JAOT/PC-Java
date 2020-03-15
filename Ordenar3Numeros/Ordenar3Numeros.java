package Ordenar3Numeros;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ordenar3Numeros
{
    public static void main(String[] args)
    {
        InputStream in = System.in;
        PrintStream out = System.out;

        Scanner sc = new Scanner(in);
        int continuar = 1;
        
        while (continuar==1)
        {
            out.println("Insere o primeiro valor inteiro: ");
            int v1 = sc.nextInt();
            out.println("Insere o segundo valor inteiro: ");
            int v2 = sc.nextInt();
            out.println("Insere o segundo valor inteiro: ");
            int v3 = sc.nextInt();
    
            int maior = v1 > v2 ? v1 : v2;
            maior = maior > v3 ? maior : v3;
    
            int menor = v1 < v2 ? v1 : v2;
            menor = menor < v3 ? menor : v3;
            
            int medio = (v1 + v2 + v3) - maior - menor;
    
            out.println(menor + " < " + medio + " < " + maior);
            out.println(" ");
            out.println("-----------------");
            out.println("Continuar? 1 - Sim");
            out.println("Qualquer outro numero - Não");
            continuar = sc.nextInt();
            
        }
        out.println("Até breve...");
        sc.close();
    }
}