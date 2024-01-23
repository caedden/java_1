import java.util.Scanner;

public class QuadradoSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor para A");
        int valorA = sc.nextInt();
        System.out.println("insira um valor para b");
        int valorB = sc.nextInt();
        System.out.println("insira um valor para c");
        int valorC = sc.nextInt();
        int fim = valorA+valorB+valorC;
        fim = fim*fim;
        System.out.println("o valor do quadrado da soma dos numeros é "+fim);
    }
}
