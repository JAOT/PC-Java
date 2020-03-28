package DecomporUmNumeroInteiro;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * DecomporNumero
 */
public class DecomporNumero
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int opcao = 1;
        do
        {
            out.println("Este programa faz várias operações sobre um número inteiro.");
            out.println("Insere um número inteiro:");
            int numero = scanner.nextInt();
            int algarismos = NumeroDeAlgarismos(numero);
            out.println("Este número é composto por " + algarismos + " algarismos.");
            int soma = SomaDosValores(numero);
            out.println("A soma desses algarismos é "+soma);
            double media = Media(algarismos, soma);
            out.printf("A média desses algarismos é %.2f\n", (double)media);
            int invertido = Invertido(numero);
            out.println("O número invertido é " + invertido);
            out.println("É capicua? "+ (Capicua(numero, invertido) == true ? "Sim" : "Não"));
            out.println("É perfeito? " + (Perfeito(numero, soma) == true ? "Sim" : "Não"));

            out.println("\n\nContinuar a fazer testes a números?");
            out.println("1 - Sim");
            out.println("Qualquer outro valor - Sair");

            opcao = scanner.nextInt();
        } while(opcao==1);



        scanner.close();
    }
    public static int NumeroDeAlgarismos(int numero)
    {
        int contador =0;
        for ( int n = numero ; n > 0 ; n/=10) {
            contador++;
        }    
        return contador;
    }
    public static int SomaDosValores(int numero)
    {
        int soma = 0;
        for ( int n = numero ; n > 0 ; n/=10) {
            soma+=n%10;
        }    
        return soma;
    }
    public static double Media(int algarismos, int soma)
    {
        return  (double)soma / (double)algarismos;
    }
    public static int Invertido(int numero)
    {
        int inverso = 0;

        while(numero != 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }
        return inverso;
    }
    public static Boolean Capicua(int numero, int invertido)
    {
        if (numero == invertido)        
        {
            return true;
        }
        return false;
    }
    public static Boolean Perfeito(int numero, int soma)
    {
        if (numero==soma)
        {
            return true;
        }
        return false;
    }
}