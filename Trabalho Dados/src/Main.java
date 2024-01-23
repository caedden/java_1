import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int guarda = 0;
        int guardaMaior = 0;
        int guardaMenor =  1000;
        int media = 0;
        int i = 0;
        int cont1=0;
        Stack pilha1 = new Stack();
        pilha1.push(12);
        pilha1.push(40);
        pilha1.push(32);
        pilha1.push(16);
        Stack pilha0= new Stack();
        pilha0.push(10);
        pilha0.push(20);
        pilha0.push(30);
        pilha0.push(12);
        pilha0.push(9);
        if (pilha0 != pilha1){
            System.out.println("diferente");
            if(pilha0.size() > pilha1.size()){
                System.out.println("a pilha0 é maior");
            }
            if (pilha1.size() > pilha0.size()){
            System.out.println("a pilha1 é maior");
            }
        }
        while(!pilha0.isEmpty()){
            guarda = (int) pilha0.peek();
            if(guardaMaior < guarda){
                guardaMaior = guarda;
            }
            if (guardaMenor > guarda){
                guardaMenor = guarda;
            }
            media = media + guarda;
            pilha0.pop();
            i++;
        }
        System.out.println(" é o menor valor da pilha0 " +guardaMenor);
        System.out.println("é o maior valor da pilha0 "+guardaMaior);
        media= media/i;
        System.out.println("A media é da pilha0 é "+media);
        guardaMenor = 1000;
        guardaMaior= 0;
        guarda = 0;
        media = 0;
        while(!pilha1.isEmpty()){
            guarda = (int) pilha1.peek();
            if(guardaMaior < guarda){
                guardaMaior = guarda;
            }
            if (guardaMenor > guarda){
                guardaMenor = guarda;
            }
            media = media + guarda;
            pilha1.pop();
            cont1++;
        }
        media = media/cont1;
        System.out.println(" é o menor valor da pilha1 " +guardaMenor);
        System.out.println("é o maior valor da pilha1 "+guardaMaior);
        System.out.println("A media é da pilha1 é "+media);


    }
}