package Matriz;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Matriz
 */
public class Matriz
{
    static int coluna = 2;
    static int linha = 5;
    
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);

    public static void main(String[] args)
    {

        int [][] inteiros = new int[coluna][linha];

        for (int i = 0; i < coluna; i++)
        {
            for (int j = 0; j < linha; j++)
            {
                out.println("Valor da coluna "+ i + " e linha "+j);
                inteiros[i][j] = scanner.nextInt();
            }    
        }

        int maior = inteiros[0][0];
        int menor = inteiros[0][0];

        for (int i = 0; i < coluna; i++) 
        {
            for (int j = 0; j < linha; j++)
            {
                if (inteiros[i][j]> maior)
                {
                    maior = inteiros[i][j];
                }
                if (inteiros[i][j]< menor)
                {
                    menor = inteiros[i][j];
                }                
            }
        }
        out.println("O maior é:"+maior);
        out.println("O menor é:"+menor);

        SomarColunas(inteiros);
    }
    public static void SomarColunas(int[][] inteiros)
    {
        for (int i = 0; i < coluna; i++) 
        {
            int soma =0;
            for (int j = 0; j < linha; j++)
            {
                soma+=inteiros[i][j];
            }
            out.println("A soma da coluna "+i+" é "+soma);
        }
    }
}