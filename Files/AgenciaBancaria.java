/* Autor: Fernando H. Filter
 * Data: 14/04/2020 */

import javax.swing.*;

public class AgenciaBancaria {

  public static void main (String [] args){
  
    /* [1] Poupanca -> 1.5%
     * [2] Poupanca plus -> 2%
     * [3] Fundos de Renda Fixa -> 4% */ 
    
    double rend = 0;
    
    JOptionPane.showMessageDialog(null, "BANCO DO BRASIL", "titulo", JOptionPane.INFORMATION_MESSAGE);
    int codCli = Entrada.leiaInt("Informe seu codigo:");
    while(codCli >= 1){
      System.out.println("Cliente N.o " + codCli);
      double valor = Entrada.leiaDouble("Informe o valor desejado para investir: R$");
      System.out.println("--------------------------");
      System.out.println("[1] Poupanca");
      System.out.println("[2] Poupanca Plus");
      System.out.println("[3] Fundos de Renda Fixa");
      System.out.println("--------------------------");
      int invest = Entrada.leiaInt("Digite o numero conforme o tipo de investimento:");
      switch (invest){
        case 1:
          rend += valor * 1.5 / 100;
          System.out.println("[Poupanca] \nTotal investido: R$" + valor + " com 1.5% de Total de Juros pagos: R$" + rend);
          break;
          
        case 2:
          rend += valor * 2 / 100;
          System.out.println("[Poupanca Plus] \nTotal investido: R$" + valor + " com 2% de Total de Juros pagos: R$" + rend);
          break;
          
        case 3:
          rend += valor * 4 / 100;
          System.out.println("[Fundos de Renda Fixa] \nTotal investido: R$" + valor + " com 4% de Total de Juros pagos: R$" + rend);
          break;
      } 
      codCli = Entrada.leiaInt("Informe seu codigo: [0] Para cancelar");
      System.out.println("--------------------------");
    }
  }
}