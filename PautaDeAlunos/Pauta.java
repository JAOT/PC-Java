package PautaDeAlunos;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Pauta
 */
public class Pauta
{
    static int numAlunos = 3;
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);
    
    static float []notaAluno = new float[numAlunos];
    static String []nomeAluno = new String[numAlunos];

    public static void main(String[] args)
    {
        int input = 10;
        do
        {
            out.println("1 - Inserir alunos");
            out.println("2 - Pesquisar nota");
            out.println("3 - Alterar nota");
            out.println("4 - Listagem de alunos");
            out.println("5 - Ordenação alfabética");
            out.println("6 - Sair");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                        InserirAlunos();
                    break;
                case 2:
                        PesquisarNotas();
                    break;
                case 3:
                        AlterarNotas();
                    break;
                case 4:
                        ListarAlunos();
                    break;
                case 5:
                        ListagemAlfabetica();
                    break;
                default:
                    break;
            }
        } while (input!=6);

        scanner.close();
    }

    public static void InserirAlunos()
    {
        for (int i = 0; i < nomeAluno.length; i++)
        {
            out.println("Insira o nome do aluno: ");
            nomeAluno[i] = scanner.next();
            out.println("Insira a nota : ");
            notaAluno[i] = scanner.nextFloat();            
        }
        
    }

    public static void ListarAlunos()
    {
        for (int i = 0; i < nomeAluno.length; i++)
        {
            out.println("------------------------------");
            out.println("Nome do aluno: "+ nomeAluno[i] + " Nota: "+ notaAluno[i]);
        }    
    }

    public static void AlterarNotas()
    {
        out.println("Qual o nome do aluno cuja nota vai ser alterada?");
        String nomePesquisar = scanner.next();
        for (int i = 0; i < nomeAluno.length; i++)
        {
            if (nomeAluno[i].equals(nomePesquisar))
            {
                out.println("Insira nova nota:");
                notaAluno[i] = scanner.nextInt();
                out.println("Nota alterada.");
            }
        }
    }

    public static void PesquisarNotas()
    {
        out.println("Qual o nome do aluno cuja nota apresentar?");
        String alunoAPesquisar = scanner.next();

        for (int i = 0; i < nomeAluno.length; i++)
        {
            if (nomeAluno[i].equals(alunoAPesquisar))
            {
                out.println("O aluno "+nomeAluno[i]+" tem nota "+notaAluno[i]);
            }
        }        
    }

    public static void ListagemAlfabetica()
    {
        String []copiaAlunos = nomeAluno;
        Arrays.sort(copiaAlunos);

        for (int i = 0; i < copiaAlunos.length; i++)
        {
            for (int j = 0; j < nomeAluno.length; j++)
            {
                if (copiaAlunos[i].equals(nomeAluno[j]))
                {
                    out.printf("Aluno: " + copiaAlunos[i] + " Nota: "+ notaAluno[j]+ "\n");
                }
            }    
        }
    }
}