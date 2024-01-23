import java.util.Scanner;

public class CalculaRaio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor para o raio da circunferencia ");
        double raio = sc.nextDouble();
        double pi = 3.14159265;
        double a = (raio*raio)*pi;
        System.out.println("o valor da area é "+Math.round(a*100.0)/100.0+" metros quadrados");


    }
}
