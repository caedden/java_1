import java.util.Scanner;

public class LeCores {

    public static final Scanner SC = new Scanner(System.in);

      public static void Cores() {
        System.out.println();
        System.out.println("Insira a primeira cor para o semaforo");
        String cor1 = SC.next();
        System.out.println("Insira a segunda cor para o semaforo");
        String cor2 = SC.next();

        while(cor2.equals(cor1)){
            System.out.println("insira uma cor diferente da anterior");
            cor2 = SC.next();
        }
        System.out.println("Insira a terceira cor para o semaforo");
        String cor3 = SC.next();
        while(cor3.equals(cor2)|| cor3.equals(cor1)){
            System.out.println("insira uma cor diferente das anterior");
            cor3 = SC.next();
        }
          System.out.println("Defina o tempo em segundos para cada sinal começando por" + cor1);
          var guardaTempo1 = SC.nextInt();
          System.out.println("Agora a cor" + cor2);
          var guardaTempo2 = SC.nextInt();
          System.out.println("E por ultimo " + cor3);
          var guardaTempo3 = SC.nextInt();

        MostraAsCores.mostraCores(cor1,cor2,cor3);

          System.out.println("gostaria de iniciar o sinaleiro? Digite S(im) ou N(ão)");
          String inicia = SC.next();
          if(inicia.equals("S")){
              MostraAsCores.run(cor1,guardaTempo1);
              MostraAsCores.run(cor2,guardaTempo2);
              MostraAsCores.run(cor3,guardaTempo3);
          }
    }


}
