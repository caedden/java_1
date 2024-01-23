import java.util.Scanner;

public class SomaNaturais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        while(inicio < 0){
            System.out.println("insira um numero positivo");
            inicio = sc.nextInt();
        }
        int fim = sc.nextInt();
        while(fim < 0 || fim <= inicio||fim < inicio+100|| fim > inicio+100){
            System.out.println("insira um numero maior que o inicio e com 100 numeros de distancia");
            fim = sc.nextInt();
        }
        int guardaInicio = inicio;
        int guarda =0;
        while(inicio<fim){
            guarda=inicio+guarda;
            inicio++;
        }
        System.out.println("a soma do intervalo "+ guardaInicio+" até "+ fim+" é "+guarda);

    }
}
