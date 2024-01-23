import java.util.Scanner;

public class AjusteSalarial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira o valor do seu salario ");
        double salario = sc.nextDouble();
        System.out.println("Qual o percentual de aumento?");
        double percentual = sc.nextDouble();
        percentual = (percentual*salario)/100;
        System.out.println("o novo salario é de " + (salario+percentual));
    }
}
