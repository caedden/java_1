

public class MostraAsCores {
    public static void mostraCores(String primeiro, String segundo, String terceiro){
        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
    }

    public static void run(String cor, int tempo) {

        try {
            Thread.sleep(tempo*1000);
            System.out.println(cor+"  para por "+tempo );

        }
        catch (InterruptedException e) {
            System.out.println("sinal liberado");
        }
    }
}
