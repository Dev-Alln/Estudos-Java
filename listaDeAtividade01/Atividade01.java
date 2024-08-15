package Java.listaDeAtividade01;
    import java.util.Scanner;

        public class Atividade01 {
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
            
                    /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
                    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
                    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

                    System.out.print ("Quantos anos voce tem? ");
                    int anos = sc.nextInt();

                    System.out.print ("Quantos meses aproximadamente voce teme? ");
                    int meses = sc.nextInt();

                    System.out.print ("Quandtos dias aproximadamente voce tem?");
                    int dias = sc.nextInt();
            
                sc.close();

                int meses_total = anos * 12;
                int dias_total = ((meses_total + meses) * 30) + dias;
                System.out.println ("Voce ja vivel aproximadamente " + dias_total + " dias");




        }
    }
