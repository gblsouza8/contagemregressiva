package contagemregressiva;
import java.util.Scanner;

// programa que conta os segundos a partir do valor inserido pelo usuário
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // inicializa a variavel que irá ficar o valor do usuário
        int seg;
        // inicializa, pergunta, armazena e fecha o scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de segundos para iniciar a contagem regressiva: ");
        seg = input.nextInt();
        input.close();

        // roda o metódo que contará os segundos
        contarSegundos(seg);

    }

    public static void contarSegundos(int seg) throws InterruptedException
    {
        // laço for que a cada loop diminui 1 do valor inserido pelo usuário
        for (int i = seg; i >= 0; i--)
        {
            // exibe o valor atual
            System.out.println(i);
            // se o valor for 0, irá finalizar o programa sem ter que esperar mais um segundo
            if (i == 0)
            {
                System.out.println("Contagem regressiva finalizada!");
                break;
            }
            // aguarda um segundo (1000 milisegundos) para repetir o loop
            Thread.sleep(1000);
        }
    }
}