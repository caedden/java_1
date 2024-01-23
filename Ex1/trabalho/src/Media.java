import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a primeira nota de 0 a 10");
        float nota1= sc.nextFloat();
        System.out.println("a segunda nota ");
        float nota2= sc.nextFloat();
        System.out.println("a terceira nota");
        float nota3= sc.nextFloat();
        System.out.println("e por fim a quarta");
        float nota4= sc.nextFloat();
        float media = (nota1+nota2+nota3+nota4)/4;
        if(media <= 5){
            System.out.println("Reprovado");
        }else if(media >= 5){
            System.out.println("aprovado");
        }
        System.out.println("sua media foi de "+media);



    }
}
