package Exercicios24Abril;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class exercicios
{
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);
    public static void main(String[] args)
    {
        int opcao;
        do
        {
            out.println("Menu:");
            //1. Ler sucessivamente uma sequência de strings até ser lida a string "FIM". Contar as strings iniciadas por A, B, ou C.
            out.println("(1) Exercicio 1");
            //2. Ler sucessivamente uma sequência de strings até ser lida a string "FIM". Contar as strings iniciadas por um prefixo inserido pelo utilizador.
            out.println("(2) Exercicio 2");
            //3. Método para inverter uma string passada por parâmetro.
            out.println("(3) Exercicio 3");
            //4. Método para remover todos os espaços em branco de uma string passada por parâmetro.
            out.println("(4) Exercicio 4");
            //5. Método que duplica todos os caracteres de uma string passada por parâmetro.
            out.println("(5) Exercicio 5");
            //6. Método para contar todas as ocorrências de um carácter dentro de uma string.
            out.println("(6) Exercicio 6");
            //7. Método que apresenta o primeiro e último nome de uma string representando um nome completo, convertendo para maiúsculas as primeiras letras.
            out.println("(7) Exercicio 7");
            //8. Método para contar o número de caracteres dentro de uma string (sem usar o método length() da classe String).
            out.println("(8) Exercicio 8");
            //9. Método para substituir um carácter por outro dentro de uma string (sem usar o método replace() da classe String).
            out.println("(9) Exercicio 9");
            //10. Ler uma frase e verificar se uma determinada string aparece nessa frase e a partir de que posição.
            out.println("(10) Exercicio 10");
            out.println("(0) Sair");

            opcao = scanner.nextInt();
            
            switch (opcao) 
            {
                case 1:
                    Exercicio1();
                break;
                case 2:
                    Exercicio2();
                break;
                case 3:
                    out.println("Qual a string a inverter?");
                    scanner.nextLine();
                    String i = scanner.nextLine();
                    Exercicio3(i);
                break;
                case 4:
                    out.println("Qual a string a limpar?");
                    scanner.nextLine();
                    String j = scanner.nextLine();
                    Exercicio4(j);
                break;
                case 5:
                    out.println("Qual a string a duplicar?");
                    scanner.nextLine();
                    String k = scanner.nextLine();
                    Exercicio5(k);
                break;
                case 6:
                    Exercicio6();
                break;
                case 7:
                    Exercicio7();
                break;
                case 8:
                    Exercicio8();
                break;
                case 9:
                    Exercicio9();
                break;
                case 10:
                    Exercicio10();
                break;
                default:
                    out.println("selecção inválida ou inexistente.");
                    out.println("");
                  
            }
        }  while (opcao!=0);

        out.println("Programa terminado.");

        scanner.close();
    }

    public static void Exercicio1()
    {
        String entrada ="";
        int contador = 0;
        do
        {
            out.println("Insere uma string");
            entrada = scanner.nextLine().toUpperCase();
            if (entrada.startsWith("A")||entrada.startsWith("B")||entrada.startsWith("C"))
            {
                contador++;    
            }
        }
        while (!entrada.equalsIgnoreCase("FIM"));
        out.println("Inseriste " + contador + " strings iniciadas por A, B ou C");
    }
    
    public static void Exercicio2()
    {
        String prefixo="";
        out.println("Insere um prefixo:");
        scanner.nextLine();
        prefixo = scanner.nextLine().toUpperCase();

        String entrada ="";
        int contador = 0;
        do
        {
            out.println("Insere uma string");
            entrada = scanner.nextLine().toUpperCase();

            if (entrada.startsWith(prefixo))
            {
                contador++;    
            }
        }
        while (!entrada.equalsIgnoreCase("FIM"));
        out.println("Inseriste " + contador + " strings iniciadas por "+prefixo);
    }

    public static void Exercicio3(String s)
    {
        String invertida="";

        for (int i = s.length()-1; i >= 0; i--)
        {
            invertida+=s.charAt(i);
        }
        out.println("A string invertida é: "+ invertida);
    }

    public static void Exercicio4(String s)
    {
        String semEspacos="";

        for (int i = 0; i <= s.length()-1 ; i++)
        {
            char temp = s.charAt(i);
            semEspacos+=(( temp == ' ') ? "" : s.charAt(i));
        }
        out.println("A string sem espaços é: "+ semEspacos);
    }

    public static void Exercicio5(String s)
    {
        String tempS="";

        for (int i = 0; i <= s.length()-1 ; i++)
        {
            tempS+= s.charAt(i);
            tempS+=s.charAt(i);
        }
        out.println("A string com os caracteres duplicados é: "+ tempS);
    }

    public static void Exercicio6()
    {
        out.println("Insere uma string");
        scanner.nextLine();
        String s = scanner.nextLine();
        out.println("Qual o caractere a contar?");
        char caractere = scanner.nextLine().charAt(0);
        int contador = 0;

        for (int i = s.length()-1; i >= 0; i--)
        {
            contador += (( s.charAt(i) == caractere)? 1 : 0);
        }
        out.println("Tens "+ contador + " caracteres \"" + caractere + "\" nesta string.");
    }
    
    public static void Exercicio7()
    {
        out.println("Insere o teu nome completo");
        scanner.nextLine();
        String s = scanner.nextLine();
        String [] nomes = s.split(" ");

        String v = "";
        v += nomes[0].charAt(0);
        
        String n1 = "";
        for (int i = 0; i < nomes[0].length(); i++)
        {
            n1 += (i == 0 ? v.toUpperCase() : nomes[0].charAt(i));
        }
        nomes[0] = n1;

        v="";
        v += nomes[nomes.length-1].charAt(0);
        n1="";

        for (int i = 0; i < nomes[nomes.length-1].length(); i++)
        {
            n1 += (i == 0 ? v.toUpperCase() : nomes[nomes.length-1].charAt(i));
        }
        nomes[nomes.length-1] = n1;


        String primeiroEUltimo = nomes[0] + " " + nomes[nomes.length-1];
        
        out.println(primeiroEUltimo);
    }
    
    private static void Exercicio8()
    {
        out.println("Escreve uma string");
        scanner.nextLine();
        String in = scanner.nextLine();

        char []chars = in.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++)
        {
            count++;
        }       
        out.println("A tua string tem " + count + " caracteres.");
    }
    
    private static void Exercicio9()
    {
        scanner.nextLine();
        out.println("Escreve uma string");
        String in           = scanner.nextLine();
        out.println("Escreve o caractere a substituir.");
        String substChar    = scanner.nextLine();
        out.println("Escreve o caractere a inserir.");
        String novoChar     = scanner.nextLine();
        String n1 = "";

        for (int i = 0; i < in.length() - 1; i++)
        {
            n1 += (in.charAt(0) == substChar.charAt(0) ? novoChar : in.charAt(i));
        }
     
        out.println("A tua string fica: " + n1);
    }
    
    private static void Exercicio10()
    {
        scanner.nextLine();
        out.println("Insere uma string, capataz:");
        String in = scanner.nextLine();
        out.println("Insere uma string a procurar, agora:");
        String proc = scanner.nextLine();

        String []split = in.split(" ");

        int charCount =0;
        for (int i = 0; i < split.length - 1; i++)
        {
            charCount += (split[i].equals(proc) ? 0 : split[i].length() + 1);
        }

        out.println("A string que procuras inicia a partir da posição : "+charCount);
    }
}