import java.util.Scanner;

public class SomaQuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor para A");
        int valorA = sc.nextInt();
        System.out.println("insira um valor para b");
        int valorb = sc.nextInt();
        System.out.println("insira um valor para c");
        int valorc = sc.nextInt();
        valorA= multiplica(valorA);
        valorb= multiplica(valorb);
        valorc= multiplica(valorc);
        int fim = valorA+valorb+valorc;
        System.out.println("a soma dos quadrados dos numeros inseridos foi "+fim);
    }
    public static int multiplica(int valor){
        valor=valor*valor;
        return valor;
    }
}
