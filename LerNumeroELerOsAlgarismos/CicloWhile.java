package LerNumeroELerOsAlgarismos;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CicloWhile
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;

        Scanner scanner = new Scanner(in);

         out.println("Insere um número inteiro com vários dígitos: ");
        int valor = scanner.nextInt();
        int soma=0;
        int valorI = valor;
/*        while (valor> 0)
        {
            soma += valor % 10;
            valor/=10;
        } */
        
        for ( int n = valor ; n > 0 ; n/=10) {
            soma+=n%10;
        }


        out.println("A soma dos algarismos de " + valorI + " é " + soma);
        scanner.close();

        




    }
    
}