import java.util.Scanner;

public class ForExemplo {

    public class main{
        public static void condicoes (String[] args){
            String[] nomesjogadores = new String[10];
            Scanner sc =  new Scanner(System.in);
            sc.next();


            //inicializacao; condicao; incremento;
            // ++ -> vai somar +1 i= i + 1
            for(int i = 0; i < 10; i++){
                System.out.println("Nome do player : " +( i + 1));
                nomesjogadores[i] = sc.next();
            }
            //pedir nome do time CT
            //pedir  nomes do time CT(5)
            //pedir nomes do time TR
            //pedir nomes do time TR (5)

            System.out.println("Nome do time TR: ");
            String timeTr = sc.next();

            String[] PlayersTR = new String[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Nome do player : " + i );
                PlayersTR[i] = sc.next();
            }

            System.out.println("Nome do time CT : ");
            String timeCt = sc.next();

            String[] PlayersCT = new String[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Nome do player : " + i );
                PlayersCT[i] = sc.next();
            }
        }
    }
}