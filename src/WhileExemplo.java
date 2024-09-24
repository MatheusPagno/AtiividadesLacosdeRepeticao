import java.util.Scanner;

public class WhileExemplo {
    public static void main(String[] args) {

        int valor = 0;         //variaveis de repetição devem ficar fora do laço para não zerar a contagem
        int somatotal = 0;
        Scanner sc = new Scanner(System.in);
        while(valor != 99){

           // System.out.println(valor);
            //valor = valor + 1;// pode ser abreviado para valor++;

            System.out.println("Informe o valor :");
            System.out.println("Informe 99 para sair");
            valor = sc.nextInt();

            somatotal += valor;
        }
        System.out.println("Total é v" + somatotal);

    }
}