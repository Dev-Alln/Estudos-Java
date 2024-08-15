package Java.w3schools;

    public class Teste03ExemploDoUsoDosOperadores {
        public static void main(String[] args) {
            
        
            //Operadores Aritimeticos
                int a = 5; 
                int b = 10;
                int c = a + b; // Adicao
                int d = b - a; // Subitracao
                int e = a * b; // Mutiplicacao
                int f = b / a; // Divisao
                int g = b % a; // Modulo

            //Operadores de Atribuicao
                int x = 10;
                x+=5;          // x = 15
                x*=2;          // x = 30

            //Operadores de Comparacao
                boolean igual = (x == 30); // True
                boolean maior_que = (x > 20); // True
            
            //Operadores Logicos
                boolean resultado = (x > 10 && x < 40 ); // True
            
            //Operacoes Com String
                String saudacao = "Seja bem-vindo"; //14
                System.out.println ("Comprimento da Linha " + saudacao.length()); // Comprimento da String
                System.out.println (saudacao.toUpperCase()); // Convertendo para Maiusculo
                System.out.println (saudacao.toLowerCase()); // Convertendo para Minusculo
                System.out.println ("Posicao do vindo: " + saudacao.indexOf ("vindo")); // Posicao do "vindo"
            
            //Combinacao de tudo em uma unica Linha
                System.out.println ("x = " + x + " ,ïgual: " + igual + " ,menor que: " + maior_que + " ,resultado: " + resultado);



        }   
    }   
