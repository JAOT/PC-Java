package Ficha16;

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
        /*
      int opcao =9;
      do
      {
          out.println("Escolher o exercício a apresentar:");
          out.println("1 - Soma de Matrizes Quadradas");
          out.println("2 - Maior nota");
          out.println("3 - Mostrar números pares");
          out.println("4 - Soma de vectores");
          out.println("5 - Menor valor num vector");
          out.println("6 - Inverter ordem de vector");
          out.println("7 - Ordenar vector por ordem crescente");
          out.println("8 - Retirar elementos duplicados de um vector");
          out.println("0 - Sair");
          opcao = scanner.nextInt();

          switch (opcao) {
            case 1:
                  
            break;
            case value:
                  
            break;
            case value:
                  
            break;
            case value:
                  
            break;
            case value:
                  
            break;
            case value:
                  
            break;
            case value:
                  
            break;

              default:
                  break;
          }



      }while(opcao!=0);
        */
        Exercicio3();
    }



    public static void Exercicio1() 
    {
        /*
        Elabore  um  algoritmo  que  efectue  a  soma  de  duas  matrizes  quadrada  3x3. 
        Apresente o resultado numa terceira matriz.
        */
        int linhas          =   3;
        int colunas         =   3;
        int [][] valores1   =   new int[colunas][linhas];
        int [][] valores2   =   new int[colunas][linhas];
        int [][] soma       =   new int[colunas][linhas];

        for (int i = 0; i < colunas; i++)
        {
            for (int j = 0; j < linhas; j++)
            {
                out.println("Valor da " + (j+1) + "ª linha e " + (i+1) + "ª coluna da primeira matriz?");
                valores1[j][i] = scanner.nextInt();
            }    
        }
        for (int i = 0; i < colunas; i++)
        {
            for (int j = 0; j < linhas; j++)
            {
                out.println("Valor da " + (j+1) + "ª linha e " + (i+1) + "ª coluna da segunda matriz?");
                valores2[j][i] = scanner.nextInt();
            }    
        }

        out.println("A primeira matriz:");
        for (int i = 0; i < colunas; i++)
        {
            String valores= "";

            for (int j = 0; j < linhas; j++)
            {
                valores+=valores1[j][i] + " ";
            }    
            out.println(valores);
        }

        out.println("A segunda matriz:");
        for (int i = 0; i < colunas; i++)
        {
            String valores= "";

            for (int j = 0; j < linhas; j++)
            {
                valores+=valores2[j][i] + " ";
            }    
            out.println(valores);
        }

        out.println("A soma das matrizes:");
        for (int i = 0; i < colunas; i++)
        {
            String somatorio= "";
            for (int j = 0; j < linhas; j++)
            {
                soma[j][i] = valores1[j][i] + valores2[j][i];
                somatorio+=soma[j][i] + " ";
            }    
            out.println(somatorio);
        }

    }

    public static void Exercicio2()
    {
        /*2.  Escreva um algoritmo que calcule a transposta de uma matriz 3x3. */
        int linhas          =   3;
        int colunas         =   3;
        int [][] valores1   =   new int[colunas][linhas];
        int [][] transposta =   new int[linhas][colunas];


        for (int i = 0; i < colunas; i++)
        {
            for (int j = 0; j < linhas; j++)
            {
                out.println("Valor da " + (j+1) + "ª linha e " + (i+1) + "ª coluna da matriz?");
                valores1[j][i] = scanner.nextInt();
            }    
        }

        out.println("A matriz:");
        for (int i = 0; i < colunas; i++)
        {
            String valores= "";

            for (int j = 0; j < linhas; j++)
            {
                valores+=valores1[j][i] + " ";
            }    
            out.println(valores);
        }

        out.println("A matriz transposta:");
        for (int i = 0; i < colunas; i++)
        {
            for (int j = 0; j < linhas; j++)
            {
                transposta[i][j] = valores1[j][i];
            }    
        }

        for (int i = 0; i < colunas; i++)
        {
            String valores= "";

            for (int j = 0; j < linhas; j++)
            {
                valores+=transposta[j][i] + " ";
            }    
            out.println(valores);
        }
    }

    public static void Exercicio3()
    {
      /*
      3.  Escreva um algoritmo que determine a soma dos elementos positivos e a soma 
        dos elementos negativos de uma matriz. 
      */
      int linhas          =   3;
      int colunas         =   3;
      int [][] valores1   =   new int[colunas][linhas];

      for (int i = 0; i < colunas; i++)
      {
          for (int j = 0; j < linhas; j++)
          {
              out.println("Valor da " + (j+1) + "ª linha e " + (i+1) + "ª coluna da matriz?");
              valores1[j][i] = scanner.nextInt();
          }
      }

      int somaNegativos = 0;
      int somaPositivos = 0; 

      for (int i = 0; i < colunas; i++)
      {
        for (int j = 0; j < linhas; j++)
        {
            if (valores1[j][i]<0)
            {
                somaNegativos+=valores1[j][i];
            }
            else
            {
                somaPositivos+=valores1[j][i];
            }
        }
      }
      out.println("Soma dos valores negativos: " + somaNegativos);
      out.println("Soma dos valores positivos: " + somaPositivos);
    }

    public static void Exercicio4()
    {
        /* 
        4.  Escreva  um  algoritmo  que  efectue  a  multiplicação  de  uma  matriz  100x100  por 
        uma matriz 100x50. Apresente o resultado numa terceira matriz.    
        */

    }

    public static void Exercicio5()
    {
        /*
        5.  Elabore um algoritmo que calcule a soma dos elementos da diagonal principal de 
        uma matriz quadrada 3x3. 
        */
    }

    public static void Exercicio6()
    {
        /*
        6.  Elabore  um  algoritmo  que  leia  um  número  inteiro  X  e  uma  matriz  V,  30x30  de 
        números inteiros. O algoritmo deverá contar quantos valores iguais a X existem 
        na matriz. 
        */ 
    }

    public static void Exercicio7()
    {
        /*
        7.  Elabore um algoritmo que leia uma matriz 20x15 de números inteiros e calcule a 
        soma das linhas pares da matriz. 
        */
    }

    public static void Exercicio8()
    {
        /* 
        8.  Elabore um algoritmo que leia uma matriz M 5x5 e crie dois vectores L e C que 
        contenham,  respectivamente,  as  somas  das  linhas  e  das  colunas  de  M.  O 
        algoritmo deverá escrever a matriz e os vectores criados.
        */
    }
}
