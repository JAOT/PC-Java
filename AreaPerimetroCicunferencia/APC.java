package AreaPerimetroCicunferencia;

import java.lang.Math;
import java.util.Scanner;

public class APC
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insere o valor do raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow( raio, 2);
        double perimetro = (2 * Math.PI) * raio;

        System.out.println("A área da circunferência é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

        double volume = 4.0/3.0 * Math.PI * Math.pow(raio, 3);

        System.out.printf("O volume da esfera é: %5f.2f", volume);



        scanner.close();
    }
}