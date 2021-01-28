public class Prova01{
  public static void main (String [] args){
 
    // Tipos de Variaveis
    
       // Texto
       String txt = "Ola Mundo";
    
       // Inteiro
       byte n0 = 0; // De -128 a 127 (8 bits)
       short n1 = 0; // De -32768 a 32767 (16 bits)
       int n2 = 0; // De -2147483648 a 2147483647 (32 bits)
       long n3 = 0; // De -2^63 a (2^63)-1 (64 bits)
       
       // Flutuante
       float n4 = 7.5f; // (32 bits) com Precisao Simples
       double n5 = 3.1415; // (64 bits) com Precisao Dupla
       
       // L�gico
       boolean n6 = true; // true or false
       
       // Caracter
       char p1 = 'M'; // Armazena caracteres unicode (16 bits) ou Inteiro de 0 a 65535
       
         // Comparando Variaveis
         String city1 = "LAJEADO";
         String city2 = "lajeado";
         
         if(city1.equalsIgnoreCase(city2)){ // IgnoreCase retorna sem case sensitive
           System.out.println("Textos Iguais");
         }
         
         int num1 = 10;
         double num2 = 10.8;
         
         if(num1 != num2){
           System.out.println("Numeros Diferentes");
         }
    
    // Comandos de Entrada e Sa�da  
       int inteiro = Entrada.leiaInt("Digite um valor Inteiro");
       System.out.println("Inteiro lido: " + inteiro);
       
       String texto = Entrada.leiaString("Digite um valor String");
       System.out.println("Texto lido: " + texto);
       
       double valor = Entrada.leiaDouble("Digite um valor Double"); 
       System.out.println("Double lido: " + valor);
       
    // La�os de Repeti��o   
       for(int i = 1; i <= 10; i++){ // Preciso identificar ate quando o laco deve ser executado, e qual
         System.out.print(i + " ");  // incremento devera ser dado entre cada passo. for(inicializacao; cond de fim; incremento){}
       }
       
       System.out.println("");
       
       int x = 10;
       while(x > 0){                // Recomendado quando o fim do laco depender da entrada do usuario
         System.out.print(x + " "); // Executa um comando enquanto sua condicao for verdadeira
         x--;
       } 
       
       System.out.println("");
       
       int y = 1;
       do{                          // Difere do While no sentido de permitir que pelo menos uma execucao do
         System.out.print(y + " "); // bloco de comandos seja executada antes de testar a condicao
         y++;
       }while(y <= 10);
       
       System.out.println("");
       
       int [] array = {1, 2, 3, 4, 5}; // Enhanced For e utilizado para realizar varreduras em listas e arrays
       for(int z : array){             // Pode ser utilizado para inserir elementos dentro de arrays e listas
         System.out.print(z + " ");
       } 
       
      // O comando break tem a funcao de interromper a execucao do laco
  }
}