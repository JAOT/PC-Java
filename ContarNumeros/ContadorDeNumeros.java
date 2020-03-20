package ContarNumeros;

import java.util.Scanner; 
import java.io.InputStream; 
import java.io.PrintStream; 
public class ContadorDeNumeros
{
    public static void main(String[] args)
    {
        int valor;
        int contadorPOS = 0;
        int contadorNEG = 0;
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        do   
        {
            out.println("Insere um valor:");
            valor = scanner.nextInt();
            
            if (valor> 0)
            {
                contadorPOS++;
            }
            else if (valor < 0)
            {
                contadorNEG++;
            }

        } while (valor !=0);
        
        out.println("Valores positivos:" + contadorPOS);
        out.println("Valores negativos:" + contadorNEG);

        scanner.close();
    }
}