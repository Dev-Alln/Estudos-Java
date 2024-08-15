package wh3schools;

   

    public class Teste01 {
        public static void main (String[] args){

            //Criando variavies para diferentes tipos de dados

                int quantidade_de_itens = 50;
                float custo_por_item = 9.99f;
                float custo_total = quantidade_de_itens * custo_por_item;
                char moeda = '$';

            //imprimindo variaveis

            System.out.println ("Numero de itens: " + quantidade_de_itens);
            System.out.println ("Custo por item: " +custo_por_item + moeda);
            System.out.println ("Custo total: " + custo_total + moeda);

    }
}
