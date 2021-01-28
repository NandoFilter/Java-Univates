/* Autor: Fernando H. Filter
 * Data: 25/05/2020 */

public class MatrizProvas{
  public static void main (String[] args){
    
    //Em uma classe ha 4 alunos, cada um realizou tres provas. Apos solicitar os nomes dos alunos e as notas, imprimir todas as informacoes.
    
    String[] nomes = new String [4];
    double[][] notas = new double [4][3];
    
    for(int i = 0; i < nomes.length; i++){
      nomes[i] = EntradaScanner.leiaString("Informe o nome do aluno " + (i+1) + ": ");
    
      for(int x = 0; x < notas[i].length; x++){
        notas[i][x] = EntradaScanner.leiaDouble("Informe a nota " + (x+1) + ": ");
      }
    }
    
    for(int y = 0; y < nomes.length; y++){
      System.out.println("--------------------");
      System.out.println("Aluno " + (y+1) + ": " + nomes[y]);
      
      for(int z = 0; z < notas[y].length; z++){
        System.out.println("Nota " + (z+1) + ": " + notas[y][z]);
      }
    }
    System.out.println("--------------------");
    
  }
}