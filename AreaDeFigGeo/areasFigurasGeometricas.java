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
        double area;      
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
                    out.println("Qual o raio do círculo?");
                    double raio = scanner.nextDouble();
                    area = Math.PI * Math.pow( raio, 2);
                    out.printf("A área do círculo é: %.2f", area);
                    out.println("");
                break;
                case 2:
                    out.println("Qual o tamanho do lado 1?");
                    double lado1 = scanner.nextDouble();
                    out.println("Qual o tamanho do lado 2?");
                    double lado2 = scanner.nextDouble();
                    double aRec = lado1 * lado2;
                    out.printf("A área do rectângulo é: %.2f", aRec);
                    out.println("");
                break;
                case 3:
                    out.println("Qual a altura?");
                    double altTri = scanner.nextDouble();
                    out.println("Qual o tamanho da base?");
                    double basTri = scanner.nextDouble();
                    double aTri = (altTri * basTri)/2;
                    out.printf("A área do rectângulo é: %.2f", aTri);                 
                    out.println("");
                break;           
                default:
                    out.printf("Selecção inválida ou inexistente.");
                    out.println("");
            }
        }  while (opcao!=0);

        scanner.close();
            

    }
}