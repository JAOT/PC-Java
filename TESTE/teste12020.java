package TESTE;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class teste12020
{
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);

    public static void main(String[] args)
    {
        //Menu inicial multi escolha, que permite a entrava dos valores
        int valor=0;
        int opcao;
        do
        {
            out.println("(1) - Inserir o valor do rendimento");
            out.println("(2) - Taxa de 14,5%");
            out.println("(3) - Taxa de 23%");
            out.println("(4) - Taxa de 28,5%");
            out.println("(5) - Taxa de 35%");
            out.println("(6) - Taxa de 37%");
            out.println("(7) - Taxa de 45%");
            out.println("(8) - Taxa de 48%");
            out.println("(9) - Sair");

            opcao = scanner.nextInt();
            
            switch (opcao) 
            {   case 1:
                out.println("");
                out.println("Qual o valor do rendimento?");
                valor = scanner.nextInt();
                out.println("");
                ValidarValor(valor);
                break;
                case 2:
                    CalcularTaxa(14.5f, valor);
                break;
                case 3:
                    CalcularTaxa(23f, valor);
                break;  
                case 4:
                    CalcularTaxa(28.5f, valor);
                break;
                case 5:
                    CalcularTaxa(35f, valor);
                break;
                case 6:
                    CalcularTaxa(37f, valor);
                break;               
                case 7:
                    CalcularTaxa(45f, valor);
                break;
                case 8:
                    CalcularTaxa(48f, valor);
                break;
                case 9:
                    out.println("Programa terminado.");
                break; 
                default:
                    out.println("");
                    out.println("Selecção inválida ou inexistente.");
                    out.println("");
            }
        }  while (opcao!=9);

        out.println("Obrigado por utilizar o programa.");

        scanner.close();
    }

    //Suprograma que valida se o valor é um rendimento válido
    public static void ValidarValor(int valor)
    {
        if (valor<=0)
        {
            out.println("Não são admitidos valores negativos ou nulos");
        }
    }

    //Calculadora de taxas
    public static void CalcularTaxa(float taxa, int valor)
    {
        if (valor>0)
        {
            if (taxa == 14.5f && valor <= 7090)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else if (taxa == 23f && valor > 7090 && valor <= 10700)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else if (taxa == 28.5f && valor > 10700 && valor <= 20261)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else if (taxa == 35f && valor > 20261 && valor <= 25000)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else if (taxa == 37f && valor > 25000 && valor <= 35856)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else if (taxa == 45f && valor > 35856 && valor <= 80640)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else if (taxa == 48f && valor > 80640)
            {
                CalcularValorAPagar(valor, taxa);
            }
            else
            {
                out.println("Escalão incorrecto");
            }
        }
        else
        {
            out.println("Não são admitidos valores negativos");
            out.println("Por favor tentar de novo.");
        }
    }

    //Calculadora de valor a pagar, dependendo da taxa
    public static void CalcularValorAPagar(int valor, float taxa)
    {
        out.println("");
        out.println("Escalão correcto");
        out.println("");
        out.println("Para um valor de "+valor);
        out.println("O valor a pagar é: "+ (valor * (taxa/100) +"€."));
        out.println("");
    }
}