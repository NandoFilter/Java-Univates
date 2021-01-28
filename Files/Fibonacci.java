/* Autor: Fernando H. Filter
 * Data: 28/04/2020 */

public class Fibonacci{
  public static void main (String [] args){
    
    int n1 = 0;
    int n2 = 1;
    
    for(int i = 1; i <= 8; i++){
      System.out.print(n1 + " " + n2 + " ");
      n1 += n2;
      n2 += n1;
    }
  }
}