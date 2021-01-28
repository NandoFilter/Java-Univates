/* Autor: Fernando H. Filter
 * Data: 11/05/2020 */

public class Matrizes{
  
  public static void main (String [] args){
    
    int[][] matriz = new int [2][5];
    
    matriz[0][0] = 1;
    matriz[0][1] = 2;
    matriz[0][2] = 3;
    matriz[0][3] = 4;
    matriz[0][4] = 5;
    matriz[1][0] = 6;
    matriz[1][1] = 7;
    matriz[1][2] = 8;
    matriz[1][3] = 9;
    matriz[1][4] = 10;
    
    String resultado = new String("");
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[0].length; y++){
        resultado += matriz[x][y] + "-";
      }
      resultado += "\n";
    }
    System.out.println(resultado.substring(0, resultado.length() - 1));
  }
}