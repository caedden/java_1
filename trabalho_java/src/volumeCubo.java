
import java.util.Scanner;

public class volumeCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o comprimento do quadrado");
        int compri = sc.nextInt();
        System.out.println("insira o largura do quadrado");
        int larg = sc.nextInt();
        System.out.println("insira a altura do quadrado");
        int altura = sc.nextInt();

        int vol = (compri*larg)*altura;
        System.out.println("o volume do objeto é "+vol+" metros cubicos");

    }
}
