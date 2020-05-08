package TorredeHanoi;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class torredehanoi
{
    static PrintStream out = System.out;
    static InputStream in = System.in;
    static Scanner scanner = new Scanner(in);
    public static void main(String[] args)
    {


        out.println("Quantos discos são?");
        int aneis = scanner.nextInt();
        Mover(aneis, "Torre 1", "Torre 3", "Torre 2");
        scanner.close();
    }
    public static void Mover(int aneis, String de, String para, String temp)
    {
        if (aneis==1)
        {
            out.println("Move o disco "+ aneis + " da " +de+ " para a "+para);
            return;
        }
        else
        {
            Mover(aneis-1, de, temp, para);
            out.println("Mover o disco "+ (aneis) + " da " + de +" para a "+para);
            Mover(aneis-1, temp, para, de);    
        }
    }
}