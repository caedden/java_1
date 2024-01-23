import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de horas trabalhadas no mês:");
        int horas=sc.nextInt();
        System.out.println("insira o valor para a hora trabalhada");
        float valorHora= sc.nextFloat();
        float salarioBruto = valorHora*horas;
        System.out.println("insira o percentual de desconto");
        float percent= (sc.nextInt()*salarioBruto)/100;
        float salarioLiquido = salarioBruto-percent;
        System.out.println("o salario bruto é "+salarioBruto+" e o liquido é "+salarioLiquido);
    }
}
