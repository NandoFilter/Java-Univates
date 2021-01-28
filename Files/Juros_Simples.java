/**
 * Autor: Fernando H. Filter
 * Data: 06/04/2020
 */
public class Juros_Simples {
  
  public static void main(String[] args) { 
   
    /* 1 - FUP que dado o valor de um emprestimo calcula o valor total do financiamento em 6 meses.
     * A taxa de juros e 3,5 (juros simples) se o valor esta abaixo de 12000 Reais ou 4,0 se o valor
     * do emprestimo e superior a 12000 Reais.
     */
    
    // J = C x I x T
    
    double montante = 0;
    
    double capital = Entrada.leiaDouble("Qual o capital?");
    
    if (capital < 12000){
      // 3.5%
      montante = capital + (capital * (3.5 / 100) * 6);
      System.out.println("Seu emprestimo e de R$" + montante);
    }else{
      // 4%
      montante = capital + (capital * (4 / 100) * 6);
      System.out.println("Seu emprestimo e de R$" + montante);
    }
    
  }
}
