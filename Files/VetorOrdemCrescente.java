/* Autor: Fernando H. Filter
 * Data: 06/05/2020 */

public class VetorOrdemCrescente{
  public static void main (String [] args){
    
    /* FUP que consiga ordenar um vetor de inteiros em ordem crescente de valor.
     * Bubble Sort (Ordenacao por Flutuacao) */
    
    int[] numeros = {4, 3, 5, 1, 2};
    int tam = numeros.length;
    int temp = 0;
    
    for(int i = 0; i < 4; i++){
      for(int x = 0; x < 4 - i; x++){
        if(numeros[x] > numeros[(x+1)]){
          temp = numeros[x];
          numeros[x] = numeros[(x+1)];
          numeros[(x+1)] = temp;
        }
      }
    }
    for(int i = 0; i < tam; i++){
      System.out.println(numeros[i]);
    }
    
  }
}