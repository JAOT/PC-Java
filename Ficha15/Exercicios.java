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
      //Exercicio1();
      //Exercicio2();
      //Exercicio3();
      //Exercicio4();
      //Exercicio5();
      //Exercicio6();
      //Exercicio7();
      Exercicio8();
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

    public static void Exercicio4()
    {
        /* Elabore um algoritmo que leia dois vectores de 15 elementos cada, some os dois 
        vectores e guarde o resultado num terceiro vector. No final, o algoritmo deverá 
        escrever o conteúdo do terceiro vector. */
        int tamanhoVector = 5;
        int []v1= new int[tamanhoVector];
        int []v2= new int[tamanhoVector];
        int []v3= new int[tamanhoVector];

        out.println("Inserção de dados do vector 1");
        for (int i = 0; i < v1.length; i++)
        {
            out.println("Valor para a posição " +i+ " do vector 1:");
            v1[i] = scanner.nextInt();
        }

        out.println("Inserção de dados do vector 2");
        for (int i = 0; i < v2.length; i++)
        {
            out.println("Valor para a posição " + i +" do vector 2:");
            v2[i] = scanner.nextInt();
            v3[i] = v1[i] + v2[i];
        }

        out.println("Demonstração de resultados");
        out.println("Valores de v3:");
        for (int i = 0; i < v3.length; i++)
        {
            out.println(i+": "+v3[i]+" ");
        }
    }

    public static void Exercicio5()
    {
        /*Elabore  um  algoritmo  que  leia  um  vector  de  12  elementos  e  determine  qual  o 
        menor valor.*/
        int tamanhoVector = 5;
        int []v1= new int[tamanhoVector];
        int menor=0;
        out.println("Inserção de dados do vector");
    
        for (int i = 0; i < v1.length; i++)
        {
            out.println("Valor para a posição " + i +" do vector:");
            v1[i] = scanner.nextInt();
            if (i==0)
            {
                menor=v1[i];
            }
            else
            {
                if (v1[i]<menor)
                {
                    menor=v1[i];
                }
            }

        }
        out.println("O menor valor é: "+menor);
    }

    public static void Exercicio6()
    {
        /*Elabore um algoritmo que leia um vector de 10 elementos e que troque entre si 
        os conteúdos das posições 1 com 10, 2 com 9, 3 com 8, etc. O algoritmo deverá 
        escrever o vector alterado. 
        */
        int tamanhoVector = 10;
        int []v1= new int[tamanhoVector];
        int []v2= new int[tamanhoVector];

        out.println("Inserção de dados do vector");

        for (int i = 0; i < v1.length; i++)
        {
            out.println("Valor da posição "+i+"?");
            v1[i] = scanner.nextInt();
            v2[(v2.length-1)-i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++)
        {
            out.println("Posição original "+ i + ": "+v1[i]+ " --- Nova posição "+ i + ": "+v2[i]);
        }        
    }

    public static void Exercicio7()
    {
        /*
        Elabore um algoritmo que leia um vector de 15 elementos e o coloque por ordem 
        crescente.
        */
        int tamanhoVector = 4;
        int []v1= new int[tamanhoVector];
        int []v2= new int[tamanhoVector];
        for (int i = 0; i < v1.length; i++)
        {
            out.println("Valor da posição "+i+"?");
            v1[i] = scanner.nextInt();
        }

        //percorrer todas as posições do vector
        for (int x = 0; x < v1.length; x++)
        {
            //para cada uma das posições, fazer uma iteração pelo vector
            for (int i = 0; i < v1.length - 1; i++) 
            {
                //criar uma variável temporária
                int temp =0;
                //trocar as posições dos valores caso exista inegualdade
                if (v1[i]>v1[i+1])
                {
                    temp = v1[i];
                    v1[i] = v1[i+1];
                    v1[i+1] = temp;
                }
            }
        }
        out.println("Esta é o vector ordenado de forma crescente:");
        for (int i = 0; i < v2.length; i++)
        {
            out.println(i + ":" + v1[i]);   
        }
    }

    public static void Exercicio8()
    {
        /*
        Elabore  um  algoritmo  que  leia  um  vector  de  20  elementos  e  retire  todos  os 
        elementos duplicados, compactando o vector. 
        */
        int tamanhoVector = 10;
        int []v1= new int[tamanhoVector];
        int []v2= new int[tamanhoVector];
        
        for (int i = 0; i < v1.length; i++)
        {
            out.println("Valor da posição " + i + "?");
            v1[i] = scanner.nextInt();
        }

        //Ordenar o vector
        for (int x = 0; x < v1.length; x++)
        {
            for (int i = 0; i < v1.length - 1; i++) 
            {
                int temp =0;
                if (v1[i]>v1[i+1])
                {
                    temp = v1[i];
                    v1[i] = v1[i+1];
                    v1[i+1] = temp;
                }
            }
        }

        //Temos pelo menos um valor único
        int valsDifs =1;
        v2[0] = v1[0];
        //Contar as diferenças
        for (int i = 0; i < v1.length-1; i++)
        {
            if (v1[i]!=v1[i+1])
            {
                //Por cada diferença, incrementar o seu número e copiar para um novo vector
                v2[valsDifs]=v1[i+1];
                valsDifs++;
            }
        }
        out.println("Valores únicos: "+valsDifs);

        //Inicializar um novo vector con dimensão igual ao número de valores diferentes
        int []novoVector = new int[valsDifs];

        //Copiar os valores para o novo vector
        for (int i = 0; i < novoVector.length; i++)
        {
            novoVector[i] = v2[i];
        }

        //Apresentar os valores sem repetições
        for (int i = 0; i < novoVector.length; i++)
        {
            out.println(i + ": " + novoVector[i]);  
        }
        
    }
}