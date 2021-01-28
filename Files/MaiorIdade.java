/**
 * Autor: Fernando H. Filter
 * Data: 06/04/2020
 */
public class MaiorIdade {
  
  
  public static void main(String[] args) { 
    
    /* 5 - FUP que solicite a idade da pessoa, e enquanto essa idade for menor que 18,
     * imprima o texto "PESSOA MENOR DE IDADE" e solicite a idade ate o usuurio
     * informar uma idade igual ou superior a 18.
     */
    
    int age = Entrada.leiaInt("Digite sua idade: ");
    while (age < 18){
        System.out.println("PESSOA MENOR DE IDADE");
        age = Entrada.leiaInt("Digite sua idade: ");
    }
       
    System.out.println("PESSOA MAIOR DE IDADE");
    
  }
}
