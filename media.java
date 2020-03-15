package Media;

import java.util.Scanner;

public class media
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insere um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Insere um outro número: ");
        int n2 = scanner.nextInt();

        double media = (n1+n2)/2.0;
        System.out.printf("A bela da média é: %.2f \n", media);
        scanner.close();
    }
}