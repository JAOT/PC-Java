package EstacaoDoAno;

import java.io.PrintStream;
import java.util.Scanner;

public class estacoesDoAno
{
    public static void main(String[] args)
    {
        PrintStream out = System.out;
        out.println("Insere o número correspondente à estação do ano: ");
        Scanner scanner = new Scanner(System.in);

        int est = scanner.nextInt();

        switch (est) {
            case 1:
                out.println("Primavera ");
                break;
            case 2:
                out.println("Verão");
            break;
            case 3:
                out.println("Outono");
            break;
            case 4:
                out.println("Inverno");
            break;
            default:
                out.println("Estação inválida.");
            break;
        }
        scanner.close();

    }
}