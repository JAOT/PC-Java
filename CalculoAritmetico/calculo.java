package CalculoAritmetico;

import java.util.Scanner;

/**
 * calculo
 */


public class calculo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String operador = "+";

        System.out.println("Insere o tipo de operação a executar (+ - / *)");
        System.out.println("/ - Divisão");
        System.out.println("* - Multiplicação");
        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("X - Sair");
        operador = scanner.next();

        System.out.println("Insere o primeiro operando:");
        int op1 = scanner.nextInt();
        System.out.println("Insere o segundo operando:");
        int op2 = scanner.nextInt();

        switch (operador) 
        {
            case "+":
            System.out.println(Soma(op1, op2));
            break;
            case "-":
            System.out.println(Subtracao(op1, op2));
            break;
            case "*":
                Multiplicacao(op1, op2);
            break;    
            case "/":
                Divisao(op1, op2);
            break;
            default:
                System.out.println("Opção inválida.");
            break;
        }
        
        scanner.close();

    }    
    public static int Soma(int op1, int op2)
    {
        return op1 + op2;
    }
    public static int Subtracao(int op1, int op2)
    {
        return op1 - op2;
    }
    public static void Divisao(int op1, int op2)
    {
        System.out.println("A divisão de " + op1 + " por " + op2 + " é " + op1/op2);
        System.out.println("O resto de " + op1 + " por " + op2 + " é " + op1 % op2);
        double v = (double)op1/(double)op2;
        System.out.printf("A divisão é %.2f\n", (double)v);
    }
    public static void Multiplicacao(int op1, int op2)
    {
        System.out.println("A multiplicação de " + op1 + " por " + op2 + " é " + op1 * op2);
    }
}