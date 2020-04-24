package Exercicio_14a17Abril;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Fazer em Java um programa que leia um número inteiro entre 0 e 20 (inclusive)
 * que representa uma classificação na escala 0-20. De seguida o utilizador
 * indica para a classificação introduzida, qual a classificação qualitativa
 * correspondente. A interface do programa será baseada num menu de opções: (C)
 * Inserir classificação (M) Mau (I) Insuficiente (S) Suficiente (B) Bom (MB)
 * Muito Bom (F) Fim Só deverá ser possível executar as opções M, I, S, B e MB
 * se a classificação numérica tiver sido previamente inserida na opção C. Se o
 * utilizador escolher corretamente a classificação qualitativa de acordo com a
 * classificação numérica, o programa apresenta a mensagem “Classificação
 * correta”, caso contrário apresenta a mensagem “Classificação incorreta”. As
 * classificações qualitativas são consideradas da forma seguinte: Mau – 0 a 4
 * Insuficiente – 5 a 9 Suficiente – 10 a 13 Bom – 14 a 17 Muito Bom – 18 a 20 O
 * programa deverá verificar se a classificação inserida é válida, ou seja, se
 * está no intervalo [0, 20]. Se for inserida uma classificação inválida na
 * opção C, o programa deverá pedir um novo valor.
 */
public class exercicio
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
            out.println("Menu de inserçao de notas");
            out.println("(C) Inserir classificação");
            out.println("(M) Mau");
            out.println("(I) Insuficiente");
            out.println("(S) Suficiente");
            out.println("(B) Bom");
            out.println("(MB) Muito Bom");
            out.println("(F) Fim");
            opcao = scanner.nextLine().toUpperCase();
            
            switch (opcao) 
            {
                case "C":
                    InsercaoNotas();
                break;
                case "M":
                    VerificarNota(opcao);
                break;
                case "I":
                    VerificarNota(opcao);
                break;
                case "S":
                    VerificarNota(opcao);
                break;
                case "B":
                    VerificarNota(opcao);           
                break;
                case "MB":
                    VerificarNota(opcao);           
                break;      
                default:
                    out.println("selecção inválida ou inexistente.");                    
            }
        }  while (opcao!="F");

        out.println("Programa terminado.");

        scanner.close();
    }

    public static void InsercaoNotas()
    {
        out.println("Inserir nota pretendida");
        nota = scanner.nextInt();
    }
    private static void VerificarNota(String opcao)
    {
        /*Mau – 0 a 4
         * Insuficiente – 5 a 9 
         * Suficiente – 10 a 13
         * Bom – 14 a 17
         * Muito Bom – 18 a 20
        */
        
        if (opcao.equals("M") && (0 <= nota && nota <= 4))
        {
                out.println("Classificação correta");
        }
        if (opcao.equals("I") && (5 <= nota && nota <=9))
        {
            out.println("Classificação correta");
        }
        if (opcao.equals("S") && (10 <= nota && nota <=13))
        {
            out.println("Classificação correta");
        }
        if (opcao.equals("B") && (14 <= nota && nota <=17))
        {
            out.println("Classificação correta");
        }
        if (opcao.equals("MB") && (18 <= nota && nota <=20))
        {
            out.println("Classificação correta");
        }

    }
}