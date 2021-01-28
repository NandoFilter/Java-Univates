public class MatrizTabuada{
  public static void main (String [] args){
    
    int[] tabuada = {2, 5};
    int[][] matriz = new int [2][10];
    
    // Preencher a matriz com as tabuadas do vetor tabuada[]
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        for(int z = 1; z <= 10; z++){
          matriz[x][y] = tabuada[x] * (y + 1);
        }
      }
    }
    
    String resultado = new String ("");
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        resultado += matriz[x][y] + "-";
      }
      resultado = resultado.substring(0, resultado.length() - 1) + "\n";
    }
    System.out.println(resultado.substring(0, resultado.length() - 1));
  }
}