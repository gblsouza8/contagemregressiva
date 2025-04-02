package contagemregressiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int seg;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de segundos para iniciar a contagem regressiva: ");
        seg = input.nextInt();
        input.close();

        contarSegundos(seg);

    }

    public static void contarSegundos(int seg) throws InterruptedException
    {
        for (int i = seg; i >= 0; i--)
        {
            System.out.println(i);
            if (i == 0)
            {
                System.out.println("Contagem regressiva finalizada!");
                break;
            }
            Thread.sleep(1000);
        }
    }
}