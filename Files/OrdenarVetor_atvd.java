/*
 * FUP que consiga ordenar um vetor de inteiros em ordem crescente de valor
 * Bubble sort (ordenacao por flutuacao)
 */
public class OrdenarVetor_atvd{

  public static void main(String[] args){
    
    // Declaracao de Vetor e Variaveis de Tipo Inteiro.
    int[] numeros = {4,3,5,1,2};  // Vetor numeros[] armazena valores {4,3,5,1,2}.
    int tam = numeros.length;     // Variavel tam armazena o tamanho do Vetor como valor.
    int temp = 0;                 // Variavel temp armazena valor 0.
    
    // Ordenar o vetor em Ordem Crescente de valor.
    for(int i = 0; i < tam - 1; i++){        // Laco para diminuir a condicao de fim do laco que esta dentro desse.
      for(int x = 0; x < tam - i - 1; x++){  // Laco para trocar as posicoes dos valores do vetor.
        if(numeros[x] > numeros[(x+1)]){     // Estrutura Condicional que, caso execute, trocara a ordem dos valores do vetor.
          temp = numeros[x];                 // Armazena o maior valor na variavel temp.
          numeros[x] = numeros[(x+1)];       // A posicao do menor indice recebe o menor numero que esta na posicao de maior indice.
          numeros[(x+1)] = temp;             // A posicao do maior indice recebe o maior valor, assim, deixando os valores nos indices (x) e (x + 1) em ordem crescente.
        }
      }
    }
    
    // Imprimir valores no Console.
    for(int i = 0; i < numeros.length; i++){ // Laco para imprimir os valores do vetor no Console.
      System.out.print(numeros[i] + ",");    // Comando de Saida para imprimir o valor de "numeros" no indice i e a String (",") para separar os valores exibidos na mesma linha.
    }
    
    System.out.println("\nFim do programa"); // Imprimindo o final do programa.
    
  }
}