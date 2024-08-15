package Java.w3schools;

    public class Teste04UsodoIfandElse {
        public static void main(String[] args) {
           
            
            //Exemplo com if, else e else if
                int x = 10;
                int y = 20;

                if (x > y){ 
                    System.out.println("x é maior que y");
                } else if (x == y) {
                    System.out.println("x é igual a y");
                } else {
                    System.out.println("x é menor que y");
                }

            //Exemplo com switch
                int dia = 3; // Representa o dia da semana (1 pra segunda, 2 pra terca, etc.)

                switch (dia){
                    case 1:
                        System.out.println ("Segunda-Feira");
                        break;

                    case 2:
                        System.out.println ("Terça-Feira");
                        break;

                    case 3:
                        System.out.println ("Quarta-Feira");
                        break;

                    case 4:
                        System.out.println ("Quinta-Feira");
                        break;

                     case 5:
                        System.out.println ("Sexta-Feira");
                        break;

                    case 6:
                        System.out.println ("Sábado");
                        break;

                    case 7:
                        System.out.println ("Domingo");
                     break;

                     default:
                     System.out.println ("Dia inválido");
                     break;
                }
        }
    }

