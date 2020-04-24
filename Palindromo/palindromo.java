package Palindromo;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * palindromo
 */
public class palindromo
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        
        out.println("Qual a palavra ou frase a testar?");

        String palavra = scanner.nextLine();
        String temp = "";

        for (int i = palavra.length()-1; i>=0; i--)
        {
            temp+=palavra.charAt(i);
        }

        out.println("Palavra invertida: "+temp);
        String resposta = (palavra.equalsIgnoreCase(temp) ? "A palavra é palíndromo." : "A palavra não é um palíndromo.");
        out.println(resposta);
        scanner.close();
    }    
}