package Comparar3Numeros;

import java.io.PrintStream;
import java.util.Scanner;

public class comparar3numeros
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        PrintStream ps = System.out;

        ps.println("Insere o primeiro número: ");
        int n1 = scanner.nextInt();
        ps.println("Insere o segundo número: ");
        int n2 = scanner.nextInt();
        ps.println("Insere o terceiro número: ");
        int n3 = scanner.nextInt();
        ps.print("O maior número é: ");
        if (n1>n2)
        {
            if(n1>n3)
            {
                ps.println(n1);
            }
            else if (n2>n3)
            {
                ps.println(n2);
            }
        }
        else if (n2>n3)
        {
            ps.println(n2);
        }
        else if (n2<n3)
        {
            ps.println(n3);
        }
        if (n1==n2)
        {
            if (n2==n3)
            {
                ps.println("São todos iguais.");
            }
            else
            {
                ps.println("O primeiro e o segundo são iguais");
            }
        }
        else if (n2==n3)
        {
            ps.println("O segundo e o terceiro são iguais");
        }
        else if (n1==n3)
        {
            ps.println("O primeiro e o terceiro são iguais");
        }

        //usando os operadores ternários
        int mai;
        mai = n1>n2 ? n1 : n2;
        mai = mai>n3 ? mai : n3;

        int min;
        min = n1 < n2 ? n1 : n2;
        min = min < n3 ? min :n3;
        ps.println("Maior com ternário: "+ mai);
        ps.println("Menor com ternário: "+ min);


        scanner.close();
    }
}