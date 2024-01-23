import java.util.Scanner;

public class ConversaoReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a cotação do dolar");
        float dolar = sc.nextFloat();

        System.out.println("insira a quantia de dolares disponiveis para a conversão");
        float dolares = sc.nextFloat();
        float valorArmazenado = dolar*dolares;
        System.out.println("seus dolares foram convertidos em "+valorArmazenado+" reais");
    }
}
