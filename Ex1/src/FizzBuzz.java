import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira um numero para começar a contagem");
        int in= sc.nextInt();
        System.out.println("e um para finalizar contagem");
        int fim = sc.nextInt();
        if(fim <= in){
            System.out.println("o numero final da contagem deve ser maior que o inicial");
        }else {
            fizzBuzz(in, fim);
        }
    }

    public static void fizzBuzz(int inicio , int finaliza){
        int guarda = inicio;
        while(guarda <= finaliza){
              if (guarda % 3 == 0 & guarda % 5 != 0) {
                  System.out.println("Fizz");
              }
              if (guarda % 5 == 0& guarda % 3 != 0) {
                  System.out.println("Buzz");
              }
              if (guarda % 5 == 0 & guarda % 3 == 0) {
                  System.out.println("FizzBuzz");
              }
              if (guarda % 5 != 0 & guarda % 3 != 0) {
                  System.out.println(guarda);
              }
            guarda = guarda + 1;
        }
    }
}
