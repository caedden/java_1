import java.util.Scanner;

public class EleicaoSindico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de votos validos para o candidato1");
        int candidato1= sc.nextInt();
        System.out.println(" para o candidato2");
        int candidato2= sc.nextInt();
        System.out.println("para o candidato3");
        int candidato3= sc.nextInt();
        System.out.println("o numero de votos brancos");
        int branco = sc.nextInt();
        System.out.println("o numero de nulos");
        int nulo = sc.nextInt();
        int total = candidato1+candidato2+candidato3+branco+nulo;
        int validos = total-(nulo+branco);
        validos=percent(validos,total);
        System.out.println("a porcentagem de votos validos foi de "+validos+"%");
        int validos1 = percent(candidato1,total);
        System.out.println("o canditado 1 teve "+validos1+"% dos votos");

        int validos2 = percent(candidato2,total);
        System.out.println("o canditado 2 teve "+validos2+"% dos votos");

        int validos3 = percent(candidato3,total);
        System.out.println("o canditado 3 teve "+validos3+"% dos votos");

        int nuloPercent = percent(nulo,total);
        System.out.println("a porcentagem dos nulos foi de "+nuloPercent+"% dos votos");

        int brancoPercent = percent(branco,total);
        System.out.println("a porcentagem de votos em branco foi "+brancoPercent+"% dos votos");
    }

    public static int percent(int converte, int totais){
        converte = (converte*100)/totais;
        return converte;
    }
}
