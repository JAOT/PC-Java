package Exercicio15;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * ex15
 */
public class ex15
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);    

        out.println("Insira o valor a cobrar: ");
        float vr = scanner.nextFloat();

        double iva = (vr*0.20);
        double irs = (vr * 0.20);
        double valorFinal = vr - iva - irs;
        out.printf("Com o valor recebido de "+ vr + ", " + " o valor líquido será: "+ valorFinal);
        scanner.close();
    }    
}