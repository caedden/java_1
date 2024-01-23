import java.util.Scanner;

public class  Switch {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("insira os valores de a e b começando por a");
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int guarda = valorA;
        valorA = valorB;
        valorB = guarda;
        System.out.println("o valor de A é "+ valorA+", e  de B é "+ valorB);

    }

}
