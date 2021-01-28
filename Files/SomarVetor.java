/* Autor: Fernando H. Filter
 * Data: 13/05/2020
 * FUP que tenha 1 metodo: somar todos os numeros de um vetor. */

public class SomarVetor{
  public static void main(String [] args){
    int[] vetor = {1,2,3,4,5,6};
    int soma = 0;
    
    somarNum(vetor);
    multNum(vetor);
    soma = SomarNumeros(vetor);
    System.out.println("[Retorno] A soma dos numeros e: " + soma); 
  }
  
  // private = Este metodo esta disponivel apenas dentro desta Classe.
  // static = Nao necessitamos criar uma instancia da Classe para utilizar este metodo.
  // void = Metodo sem retorno.
  
  private static void somarNum(int[] vet){
    int soma = 0;
    for(int i = 0; i < vet.length; i++){
      soma += vet[i];
    }
    System.out.println("O resultado da soma e: " + soma);
  }
  
  private static void multNum(int[] vet1){
    int mult = 1;
    for(int i = 0; i < vet1.length; i++){
      mult *= vet1[i];
    }
    System.out.println("O resultado da multiplicacao e: " + mult);
  }
  
  // Versao com retorno
  
  private static int SomarNumeros(int[] vet2){
    int soma2 = 0;
    for(int i = 0; i < vet2.length; i++){
      soma2 += vet2[i];
    }
    return soma2;
  }
  
}