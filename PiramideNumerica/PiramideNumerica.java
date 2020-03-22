package PiramideNumerica;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * PiramideNumerica
 */
public class PiramideNumerica
{
    public static void main(String[] args)
    {
        InputStream in = System.in;
        PrintStream out = System.out;
        Scanner scanner = new Scanner(in);

        out.println("Insere um inteiro:");
        int num = scanner.nextInt();

        int[][]piramide = new int[num+1][num*2];

        for (int linha = 1; linha < num+1; linha++)
        {
            for (int coluna = 1; coluna < (num*2); coluna++) 
            {
                if (coluna == num)
                {
                    piramide[linha][coluna] = linha;
                }
                else if (coluna>num)
                {
                    int val = (linha-coluna)+num;
                    piramide[linha][coluna] = (val > 0 ? val : 0);
                }
                else if (coluna < num)
                {
                    int val = (coluna - num)+linha;
                    piramide[linha][coluna] = (val > 0 ? val : 0);
                }
            }
        }
        for (int linha = 1; linha < num+1; linha++)
        {
            String linhaEscrita="";
            for (int coluna = 1; coluna < num*2; coluna++) 
            {
                linhaEscrita+=(piramide[linha][coluna] == 0 ? " ": (piramide[linha][coluna]) );
            }
            out.println(linhaEscrita);
        }
        scanner.close();
    }    
}