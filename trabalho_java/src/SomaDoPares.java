import java.util.Scanner;

public class SomaDoPares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira o começo do intervalo de numeros");
        var primeiro = sc.nextInt();
        System.out.println("insira o segundo intervalo");
        var segundo = sc.nextInt();
        int guarda =0;
        while(primeiro<=segundo){
            if(primeiro%2==0){
            guarda = primeiro+guarda;}
            primeiro++;
        }
        System.out.println("a soma dos numeros pares nesse intervalo é de "+guarda);

    }
}
