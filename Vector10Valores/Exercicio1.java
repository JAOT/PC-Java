package Vector10Valores;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int []valores=new int[10];
        int contador=0;
        
        for (int i : valores)
        {
            out.println("Insere um valor para o indice nº "+ contador);
            valores[contador] = scanner.nextInt();
            contador++;
        }

        int soma=0;
        float media =0;
        for (int i : valores)
        {
            soma+=i;
        }
        media=soma/10;

        out.println("A soma dos valores é: "+soma);
        out.printf("A média dos valores é: "+media);

        out.println("\nQual o valor a descobrir?");
        int input = scanner.nextInt();
        int ocorrencias =0;

        for (int i : valores)
        {
            if (i==input)
            {
                ocorrencias++;
            }
        }

        out.printf("O numero "+input+" foi inserido "+ocorrencias+" vezes.");

        scanner.close();
    }
}