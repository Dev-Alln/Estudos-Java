package wh3schools;
    public class Teste02ConvercaoModeloPrimitivo {
        public static void main(String[] args) {
        
            // Convertendo Itens Modelos Primitivos
                //Pontuaçao em um jogo

                int record_maximo = 1000;
                int record_do_usuario = 342;

                float porcentagem = (float) record_do_usuario / record_maximo * 100.0f;

                System.out.println ("A porcentagem do Usuario é: " + porcentagem);
        }
    }
