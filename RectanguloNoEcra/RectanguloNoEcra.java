package RectanguloNoEcra;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * RectanguloNoEcra
 */
public class RectanguloNoEcra
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        out.println("Insere o comprimento do rectângulo: ");
        int comp = scanner.nextInt();
        out.println("Insere a altura do rectângulo: ");
        int altu = scanner.nextInt();

        String[][] grelha = new String[comp][altu];

        for (int j = 0; j < altu; j++)
        {
            for (int i = 0; i < comp; i++)
            {
                if (i==0 || i == comp-1 || j==0 || j == altu -1)
                {
                    grelha[i][j] = "X";
                }
                else
                {
                    grelha[i][j] = " ";
                }
            }
        }
        
        for (int j = 0; j < altu; j++)
        {
            String linha="";
            for (int i = 0; i < comp; i++)
            {

                linha+= grelha[i][j];

            }
            out.println(linha);
        }
    }    
}