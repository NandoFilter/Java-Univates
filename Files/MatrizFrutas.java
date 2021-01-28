/* Autor: Fernando H. Filter
 * Data: 18/05/2020 */
public class MatrizFrutas{
  public static void main(String [] args){
    
    /* FUP que tenha uma matriz 5x2 (5 linhas e 2 colunas) para armazenar o nome de uma fruta e o seu preço.
     * Ao final, percorra a matriz e diga qual a fruta com o menor valor e qual a com o maior valor. */
    
    String[][] frutas = new String [3][2];
    double[][] preco = new double [3][2];
    
    String frutaHP = "", frutaLP = "";
    double precoHP = 0, precoLP = 0;
    
    for(int x = 0; x < frutas.length; x++){
      for(int y = 0; y < frutas[x].length; y++){
        frutas[x][y] = EntradaScanner.leiaString("Fruta: ");
        preco[x][y] = EntradaScanner.leiaDouble("Preco: ");
      }
    }
    
    for(int x = 0; x < frutas.length; x++){
      for(int y = 0; y < frutas[x].length; y++){
        System.out.println(frutas[x][y] + ": R$" + preco[x][y]);
        
        if(preco[x][y] > precoHP){
          precoHP = preco[x][y];
          frutaHP = frutas[x][y];
        }
        
        if(preco[x][y] < precoLP || precoLP == 0){
          precoLP = preco[x][y];
          frutaLP = frutas[x][y];
        }
      }
    }
    
    System.out.println();
    System.out.println("Fruta mais cara: " + frutaHP + " / R$" + precoHP);
    System.out.println("Fruta mais barata: " + frutaLP + " / R$" + precoLP);
  }
}