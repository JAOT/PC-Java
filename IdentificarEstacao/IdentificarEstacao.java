package IdentificarEstacao;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * IdentificarEstacao
 */
public class IdentificarEstacao
{

    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);
    static int opcao = 0;
    static int mesEscolhido = 0;
    static int estacaoEscolhida = 0;
    static int diaEscolhido = 0;
    public static void main(String[] args)
    {
        ApresentaMenu();
    }
    public static void ApresentaMenu()
    {
        do
        {
            out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            out.println("x       1 - Inserir mês     x");
            out.println("x       2 - Primavera       x");
            out.println("x       3 - Verão           x");
            out.println("x       4 - Outono          x");
            out.println("x       5 - Inverno         x");
            out.println("x       6 - Sair            x");
            out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            out.println("Mês actual: " + MesExtenso(mesEscolhido));
            out.println("Estação actual: " + EstacaoExtenso(estacaoEscolhida));
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    EscolheMes();
                    break;
                case 2:
                    EscolheEstacao(1);
                    break;
                case 3:
                    EscolheEstacao(2);
                    break;
                case 4:
                    EscolheEstacao(3);
                    break;
                case 5:
                    EscolheEstacao(4);
                    break;
                case 6:
                    break;

                default:
                out.println("Entrada inválida.");
                    break;
            }
        } while(opcao!=6);
    }
    public static void EscolheEstacao(int est)
    {
        if (mesEscolhido!=0)        
        {
            estacaoEscolhida = est;
        }
        else
        {
            out.println("Ainda não foi definido o mês.");
        }
        
        ConfirmaDados();
    }
    public static void EscolheMes()
    {
        do
        {
            out.println("Escolher o mês em formato numérico:");
            mesEscolhido = scanner.nextInt();
        }while(mesEscolhido<1||mesEscolhido>12);
    }
    public static void ConfirmaDados()
    {
        if (mesEscolhido == 3 ||  mesEscolhido == 6 || mesEscolhido == 9 || mesEscolhido == 12)
        {
            do
            {
                out.println("Em que dia?");
                diaEscolhido = scanner.nextInt();
            } while (diaEscolhido < 1 || diaEscolhido > 31);

            if (mesEscolhido==3)
            {
                if (diaEscolhido<21 && estacaoEscolhida==4)
                {
                    out.println("Está correcto");
                }
                else if (diaEscolhido>=21 && estacaoEscolhida==1)
                {
                    out.println("Está correcto");
                }
                else
                {
                    out.println("Está errado.");
                }
            }
            if (mesEscolhido==6)
            {
                if (diaEscolhido<21 && estacaoEscolhida==1)
                {
                    out.println("Está correcto");
                }
                else if (diaEscolhido>=21 && estacaoEscolhida==2)
                {
                    out.println("Está correcto");
                }
                else
                {
                    out.println("Está errado.");
                }            }
            if (mesEscolhido==9)
            {
                if (diaEscolhido<21 && estacaoEscolhida==2)
                {
                    out.println("Está correcto");
                }
                else if (diaEscolhido>=21 && estacaoEscolhida==3)
                {
                    out.println("Está correcto");
                }
                else
                {
                    out.println("Está errado.");
                }            }
            if (mesEscolhido==12)
            {
                if (diaEscolhido<21 && estacaoEscolhida==3)
                {
                    out.println("Está correcto");
                }
                else if (diaEscolhido>=21 && estacaoEscolhida==4)
                {
                    out.println("Está correcto");
                }
                else
                {
                    out.println("Está errado.");
                }
            }
        }

        if (mesEscolhido == 1 || mesEscolhido==2)
        {
            if (estacaoEscolhida==4)
            {
                out.println("Está correcto");
            }
        }
        if (mesEscolhido == 4 || mesEscolhido==5)
        {
            if (estacaoEscolhida==1)
            {
                out.println("Está correcto");
            }
        }
        if (mesEscolhido == 7 || mesEscolhido==8)
        {
            if (estacaoEscolhida==2)
            {
                out.println("Está correcto");
            }
        }
        if (mesEscolhido == 10 || mesEscolhido==11)
        {
            if (estacaoEscolhida==1)
            {
                out.println("Está correcto");
            }
        }
        out.println("Insere uma opção.");
    }
    public static String MesExtenso(int mesEscolhido)
    {
        String mes ="";
        switch (mesEscolhido)
        {
            case 1:
            mes="Janeiro";
            break;
            case 2:
            mes="Fevereiro";
            break;
            case 3:
            mes="Março";
            break;
            case 4:
            mes="Abril";
            break;
            case 5:
            mes="Maio";
            break;
            case 6:
            mes="Junho";
            break;
            case 7:
            mes="Julho";
            break;
            case 8:
            mes="Agosto";
            break;
            case 9:
            mes="Setembro";
            break;
            case 10:
            mes="Outubro";
            break;
            case 11:
            mes="Novembro";
            break;
            case 12:
            mes="Dezembro";
            break;
        }
        return mes;   
    }
    public static String EstacaoExtenso(int estacaoEscolhida)
    {
        String est="";
        switch (estacaoEscolhida) {
            case 1:
                est="Primavera";
                break;
            case 2:
                est="Verão";
                break;
            case 3:
                est="Outono";
                break;
            case 4:
                est="Inverno";
                break;

        }
        return est;   
    }
}