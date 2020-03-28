package AreaDeFigGeo;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class areasFigurasGeometricas
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int opcao = 4;
        do
        {
            out.println("Qual a área a calcular?");
            out.println("1 - Círculo");
            out.println("2 - Rectângulo");
            out.println("3 - Triangulo");
            out.println("0 - Sair");
            opcao = scanner.nextInt();
            
            switch (opcao) 
            {
                case 1:
                out.printf("A área do círculo é: %.2f", Circulo(out, scanner));
                out.println("");
                break;
                case 2:
                    out.printf("A área do rectângulo é: %.2f", Rectangulo(out, scanner));
                    out.println("");
                break;
                case 3:
                    out.printf("A área do rectângulo é: %.2f", Triangulo(out, scanner));                 
                    out.println("");
                break;           
                default:
                    out.printf("Selecção inválida ou inexistente.");
                    out.println("");
            }
        }  while (opcao!=0);

        scanner.close();
    }

    private static double Triangulo(PrintStream out, Scanner scanner)
    {
        out.println("Qual a altura?");
        double altTri = scanner.nextDouble();
        out.println("Qual o tamanho da base?");
        double basTri = scanner.nextDouble();
        return (altTri * basTri)/2;
    }

    private static double Rectangulo(PrintStream out, Scanner scanner)
    {
        out.println("Qual o tamanho do lado 1?");
        double lado1 = scanner.nextDouble();
        out.println("Qual o tamanho do lado 2?");
        double lado2 = scanner.nextDouble();
        return lado1 * lado2;
    }

    private static double Circulo(PrintStream out, Scanner scanner)
    {
        out.println("Qual o raio do círculo?");
        double raio = scanner.nextDouble();
        return Math.PI * Math.pow( raio, 2);

    }
}