/**
 * Autor: Fernando H. Filter
 * Data: 08/04/2020
 */
public class Numeros_Impares {
  
  
  public static void main(String[] args) { 
   
    // FUP que atraves do laco de repeticao FOR, solicite ao usuario 4 numeros inteiros e ao final, imprima todos os numeros impares que ele informou.
    
    int num = 0;
    String impares = "";
    
    for (int cont = 1; cont <= 4; cont++){
      num = Entrada.leiaInt("Numero " + cont + ": ");
      if (num % 2 == 1){
        impares += num + ", ";
      }
    }
    
    System.out.println("Numeros impares informados: " + impares);
    
    
  }
}
