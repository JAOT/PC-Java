package ValidadorDeCeNIF;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class validador
{
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);
    static int nota = 0;
    static String opcao;
    public static void main(String[] args)
    {
        do
        {
            out.println("Menu de verificação");
            out.println("(N) Inserir número de contribuinte");
            out.println("(C) Inserir número do cartão de cidadão");
            out.println("(F) Fim");
            opcao = scanner.nextLine().toUpperCase();
            switch (opcao) 
            {
                case "C":
                    VerificarCC();
                break;
                case "N":
                    VerificarNIF();
                break; 
                case "F":
                    out.println("Escolhida a opção de saída do programa.");
                break; 
                default:
                    out.println("Selecção inválida ou inexistente.");
                break;
            }
        }    while (!opcao.equals("F"));


        scanner.close();
    }

    private static void VerificarNIF()
    {
        out.println("Por favor, inserir o número de contribuinte a verificar.");

        int num = scanner.nextInt();
        scanner.nextLine();

        int contador =0;

        for ( int n = num ; n > 0 ; n/=10)
        {
            contador++;
        }    
        if (contador!=9)
        {
            out.println("Número errado ou inválido. Tentar de novo.");
            VerificarNIF();
        }

        int conta=0;
        int indice=1;
        int checkDigit=0;

        while(num != 0) {
            int digito = num % 10;
            num /= 10;
            if (indice>1)
            {
                conta+= indice*digito;
            }
            if (indice==1)
            {
                checkDigit=digito;
            }
            indice++;
        }

        double resto=conta%11;
        int verificado=0;

        if (resto>=2)
        {
            verificado=(11-(int)resto);
        }

        if (verificado == checkDigit)
        {
            out.println("O número de contribuinte é válido");
        }
        else
        {
            out.println("O número de contribuinte é inválido");
        }
    }

    private static void VerificarCC()
    {
        out.println("Por favor, inserir o número de cartão de cidadão a verificar.");
        String numCC = scanner.nextLine().toUpperCase();
        numCC = numCC.replace(" ", "");

        if (numCC.length()!=12)
        {
            out.println("Número de dígitos incorrecto. Tente de novo.");
            VerificarCC();
        }

        int soma = 0;
        for (int i = numCC.length()-1; i >= 0 ; i--)
        {
            int valor = 0;
            valor = SubstituirLetrasEmCC(numCC, i);

            if (i%2 == 0)
            {
                valor*=2;
                if (valor>9)
                {
                    valor-=9;
                }
            }
            soma+=valor;
        }
        double teste = soma%10;

        if (teste==0)
        {
            out.println("O cartão de cidadão é verdadeiro.");
        }
        else
        {
            out.println("O cartão de cidadão é falso.");
        }
    }

    public static int SubstituirLetrasEmCC(String numCC, int index)
    {
        int offset=48;
        if ((int)numCC.charAt(index)>=65)
        {
            offset = 55;
        }
        int c = (int)numCC.charAt(index) - offset;
        return (c);
    }
}