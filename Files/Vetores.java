// Autor: Fernando H. Filter
// Data: 29/04/2020

public class Vetores{
  public static void main (String [] args){
    
    int [] vetor = {1, 2, 3};
    
    for (int i = 0; i < vetor.length; i++){
      System.out.println("Vetor ["+ i +"] = " + vetor [i]);
    }
    
    vetor[0] = Entrada.leiaInt("Informe um numero: ");
    vetor[1] = Entrada.leiaInt("Informe um numero: ");
    vetor[2] = Entrada.leiaInt("Informe um numero: ");
    
    for(int i = 0; i < vetor.length; i++){
      System.out.println("Vetor ["+ i +"] = " + vetor[i]);
    }
  }
}