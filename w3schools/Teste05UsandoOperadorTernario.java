package Java.w3schools;

    public class Teste05UsandoOperadorTernario {
        public static void main(String[] args) {
            
            int tempo = 20;

            //Usando if e else
                System.out.println ("Usando if e else: ");
                    
                    if (tempo < 13) {
                        System.out.println ("Bom Dia!");
                    } else {
                        System.out.println ("Boa tarde!");
                    }

            //Usando Operador ternario
                System.out.println ("Usando Operador ternario: ");
                String result = (tempo < 18 ) ? "Bom dia!" : "Boa tarde!";
                System.out.println(result);
        }
    }
