import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a cotação do dolar");
        float dolar = sc.nextFloat();

        System.out.println("insira a quantia de reaus disponiveis para a conversão");
        float reais = sc.nextFloat();
        float valorArmazenado = reais/dolar;
        System.out.println("seus reais foram convertidos em "+valorArmazenado+" dolares");
    }
}
