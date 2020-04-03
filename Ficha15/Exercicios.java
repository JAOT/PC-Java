package Ficha15;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Exercicios
 */
public class Exercicios
{
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);
    
    public static void main(String[] args)
    {
//        Exercicio1();
//        Exercicio2();
        Exercicio3();
//        Exercicio4();
//        Exercicio5();
//        Exercicio6();
    }   
    public static void Exercicio1()
    {
        /*
        Escreva um algoritmo que registe 7 temperaturas ocorridas diariamente numa
        localidade e que calcule a média dessas temperaturas. O algoritmo deve também
        indicar quais os dias que tiveram valores acima da média.
        */

        int[] temperaturas = new int[7];
        int soma =0;
        for (int i = 0; i < temperaturas.length; i++)
        {
            out.println("Insira a temperatura do dia "+(i+1));
            temperaturas[i] = scanner.nextInt();
            soma+=temperaturas[i];
        }

        float media = soma / temperaturas.length;
        out.println("A média das temperaturas é:" + media);

        for (int i = 0; i < temperaturas.length; i++)
        {
            if (temperaturas[i] > media)    
            {
                out.println("O dia "+ i + " teve de temperatura "+temperaturas[i]+", o que o coloca acima da média.");
            }
        }
    }

    public static void Exercicio2()
    {
    /*
    Elabore um algoritmo que leia as notas de 10 alunos para um vector e determine
    qual a maior nota da turma. As notas são do tipo inteiro.
    */
        int []notas = new int[10];

        for (int i = 0; i < notas.length; i++)
        {
            out.println("Qual a nota do aluno nº"+(i+1)+"?");
            notas[i] = scanner.nextInt();
        }
        int maior=0;
        for (int i = 0; i < notas.length; i++)
        {
            maior = (notas[i] > maior ? notas[i] : maior);
        }

        out.println("A maior nota é: "+maior);
    }

    public static void Exercicio3()
    {
        /*
        Elabore um algoritmo que leia um vector de 10 números inteiros e escreva no
        ecrã apenas os números pares.
        */

        int []numeros = new int[10];

        for (int i = 0; i < numeros.length; i++)
        {
            out.println("Qual o valor nº"+(i+1)+"?");
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i]%2 == 0)
            {
                out.println("O número " + numeros[i]+" é par.");
            }
        }
    }
}