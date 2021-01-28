/**
 * Autor: Fernando H. Filter
 * Data: 06/04/2020
 */
public class Tabuada {
  
  
  public static void main(String[] args) { 
    
    //3 - FUP que solicite um numero para o usuario e atraves deste numero, imprima a sua tabuada.
    
    int num = Entrada.leiaInt("Digite um n�mero: ");
    
    for (int cont = 1; cont <= 10; cont++){
      int total = num * cont;
      System.out.println(num + " x " + cont + " = " + total);
    }
    
  }
}
