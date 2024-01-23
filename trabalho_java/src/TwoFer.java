import java.util.Scanner;

public class TwoFer {
      static final  Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        String nome = null;

        System.out.println("Quer inserir um nome? S(im) ou N(Ão)");
        var testa = SC.next();
        var guarda= twofer(testa);
        System.out.println("Um para "+ guarda +", um para mim!.");

    }

    public static String twofer(String nomeRecebido){
        if(nomeRecebido.equals("S")||nomeRecebido.equals("s")){
            System.out.println("Insira um nome");
            nomeRecebido = SC.next();
        }else{
            nomeRecebido="voce";
        }
        if(nomeRecebido.isBlank()|| nomeRecebido.isEmpty()){
            nomeRecebido = "voce";
        }

        return nomeRecebido;
    }
}