package Java.w3schools;

    public class Teste06UsandoNovamenteIfeElse {
        public static void main(String[] args) {

            //Exemplo 1 : verifica o codigo da porta
                int codigoPorta = 1332;

                    System.out.println ("Verificando o codigo da porta: ");
                    if (codigoPorta == 1332) {
                        System.out.println ("Codigo Correto, A porta esta aberta");
                    } else {
                        System.out.println ("Codigo Incorreto, A porta esta fechada");
                    }

            //Exemplo 2: Verifica se um numero e positivo, negativo ou zero
                    int meuNumero= 10;
                        
                        System.out.println ("\nVerificando se o meu numero e positivo, negativo ou zero: ");
                        if (meuNumero > 0) {
                            System.out.println ("O numero e positivo");
                        } else if (meuNumero < 0 ) {
                            System.out.println ("O numero e negativo");
                        } else {
                            System.out.println ("O numero e zero");
                        }

            //Exemplo 3: Verifica se a pessa e velha o suficiente para votar
                    int minhaIdade = 23;
                    int idadeVotar = 18;
                    
                        System.out.println ("\nVerificando idade para votar: ");
                        if (minhaIdade >= idadeVotar) {
                            System.out.println ("Voce e velho o suficiente para votar");
                        } else {
                            System.out.println ("Voce ainda e muito jovem para votar");
                        }

            //Exemplo 4: Verifica se o numero e par ou impar
                    int numeorParOuImpar = 5;
                        
                        System.out.println ("\nVerificando se o numero e par ou impar: ");
                        if (numeorParOuImpar % 2 == 0 ){
                            System.out.println ("O numero e par");  
                        } else {
                            System.out.println ("O numero e impar");
                        }

            //Exemplo 5: Usando operador ternario para verificar um numero
                    int tempo = 13;
                    System.out.println ("\nUsando operador ternario para vericar o tempo: ");
                    String result = (tempo < 14) ? "Bom dia" : "Boa tarde";
                    System.out.println(result);
        }   
    }               
