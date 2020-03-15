package CompararNumeros;

import java.io.PrintStream;
import java.util.Scanner;

public class CompararNumeros
{
    // ler dois numeros int e indicar qual é o maior
    public static void main(String[] args)
    {
        PrintStream ps = System.out;

        Scanner scanner = new Scanner(System.in);
        ps.printf("Insere um número: ");
        int num1 = scanner.nextInt();
        ps.printf("Insere um outro número: ");
        int num2 = scanner.nextInt();

        if (num1>num2)
        {
            ps.println("Número 1 é maioral.");
        }
        else if (num1<num2)
        {
            ps.println("Número 2 é maioral.");
        }
        else
        {
            ps.println("São iguais... Gémeos!");
        }

        ps.println("A média é: "+ (num1+num2)/2.0);
        scanner.close();
    }
}