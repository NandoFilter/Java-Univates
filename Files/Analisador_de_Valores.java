/* Autor: Fernando H. Filter
 * Data: 28/04/2020 */

public class Analisador_de_Valores{
  public static void main (String [] args){
  
    int n1 = 0;
    int soma = 0;
    int div5 = 0;
    int nulo = 0;
    int somaPar = 0;
    double media = 0;
    
    for(int i = 1; i <= 5; i++){
      n1 = Entrada.leiaInt("Digite um valor: ");
      soma += n1;
      
      if(n1 % 5 == 0){
        div5++; 
      }
      
      if(n1 == 0){
        nulo++;
      }
      
      if(n1 % 2 == 0){
        somaPar += n1;
      }
      
      media = soma / 5;
      
    }
    
    System.out.println("A soma dos valores e: " + soma);
    System.out.println("A media entre os valores e: " + media);
    System.out.println("Quantidade de valores div por 5: " + div5);
    System.out.println("Quantidade de valores nulos: " + nulo);
    System.out.println("Soma dos valores pares: " + somaPar);
  }
}