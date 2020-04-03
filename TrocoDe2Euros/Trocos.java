package TrocoDe2Euros;

import java.util.Scanner;

/**
 * Trocos
 */
public class Trocos 
{
    public static void main(String[] args)
    {
        float []moedas = {200,100,50,20,10,5, 2, 1};

        System.out.println("Insira o preço do produto: ");
        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();
        System.out.println("****************************");

        float troco = 200 - (valor * 100);
        System.out.println("Terá de troco: " + troco /100);

        float r = 0;

        for (int i = 0; i < moedas.length; i++)
        {
            r = troco / moedas[i];
            if (r!=0)
            {
                System.out.println((int)r + " moedas de " + moedas[i]/100 + " €");
            }
            troco%=moedas[i];
        }

        scanner.close();


    }
    
}