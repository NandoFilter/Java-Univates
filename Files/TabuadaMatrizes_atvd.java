/*
 * FUP que preencha uma matriz com duas tabuadas
 * Codigo compartilhado ja
 */
public class TabuadaMatrizes_atvd{
  
  public static void main(String[] args){
  
    // Declaracao de Vetor e Matriz de Tipo Inteiro
    int[] tabuada = {2,5};           // Vetor tabuada[] armazena valores {2,5}.
    int[][] matriz = new int[2][10]; // Matriz matriz[][] armazena dimensoes de tamanho 2 e 10.
    
    //Preencher a matriz com as tabuadas do vetor tabuada[]
    for(int x = 0; x < matriz.length; x++){       // Laco para preencher valores da dimensao de indice x em matriz[][] e preencher a condicao de fim do laco dentro desse.
      for(int y = 0; y < matriz[x].length; y++){  // Laco para preencher valores da dimensao de indice y em matriz[][].
        matriz[x][y] = tabuada[x] * (y + 1);      // A matriz nos indices x e y recebe como valor a multiplicacao entre o Vetor tabuada[] no indice x e a variavel y somado a 1.
      }
    }
    
    String resultado = new String(""); // Declaracao de Variavel do tipo String.
    
    // Preencher a Variavel resultado com os valores da Matriz.
    for(int x = 0; x < matriz.length; x++){       // Laco para armazenar os valores da dimensao de indice x de matriz[][] dentro da Variavel resultado e preencher a condicao de fim do laco dentro desse.
      for(int y = 0; y < matriz[x].length; y++){  // Laco para armazenar os valores da dimensao de indice y de matriz[][] dentro da Variavel resultado.
        resultado += matriz[x][y] + "\t";          // Armazenando valores da Matriz em uma String.
      }
      resultado = resultado.substring(0, resultado.length() - 1) + "\n"; // Armazenando o tamanho da Variavel desde primeiro caractere ate o penultimo, para remover o ultimo "-".
    }
    
    System.out.println(resultado.substring(0, resultado.length() - 1)); // Imprimindo String, sem o ultimo "-", com o Metodo Substring.
    System.out.println("Fim do Programa"); // Imprimindo o final do programa.
  }
}
