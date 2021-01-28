/* Autor: Fernando H. Filter
 * Data: 14/04/2020 */

import javax.swing.*;

public class DescontoUnidade {

  public static void main (String [] args){
  
   /* Ate 10 und -> 0
    * de 11 a 20 und -> 10%
    * de 21 a 50 und -> 20%
    * acima de 50 und -> 30% */ 
    
    double pay = 0;
    
    JOptionPane.showMessageDialog(null, "Bem-vindo a Loja Paris", "", JOptionPane.INFORMATION_MESSAGE);
    int qntd = Entrada.leiaInt("Informe a quantidade de unidades que deseja comprar: ");
    double valor = Entrada.leiaDouble("Informe o valor unitario da compra: R$");
    
    if(qntd <= 10){
      pay += valor * qntd;
      System.out.println("Valor total da compra de " + qntd + " unidade(s): R$" + pay);
    }else if(qntd >= 11 && qntd <= 20){
      pay += (valor * qntd) - ((valor * qntd) * 10 / 100);
      System.out.println("Valor total da compra de " + qntd + " unidade(s) com 10% de desconto: R$" + pay);
    }else if(qntd >= 21 && qntd <= 50){
      pay += (valor * qntd) - ((valor * qntd) * 20 / 100);
      System.out.println("Valor total da compra de " + qntd + " unidade(s) com 20% de desconto: R$" + pay);
    }else if(qntd > 50){
      pay += (valor * qntd) - ((valor * qntd) * 30 / 100);
      System.out.println("Valor total da compra de " + qntd + " unidade(s) com 30% de desconto: R$" + pay);
    }
    
   // Outro Formato
    System.out.println("---------------------------");
    double pay1 = 0;
    int desc = 0;
    
    int qntd1 = Entrada.leiaInt("Informe a quantidade de unidades que deseja comprar: ");
    double valor1 = Entrada.leiaDouble("Informe o valor unitario da compra: R$");
    
    if(qntd >= 11 && qntd <= 20){
      desc += 10;
    }else if(qntd >= 21 && qntd <= 50){
      desc += 20;  
    }else if(qntd > 50){
      desc += 30;
    }
    
    if(qntd <= 10){
      pay1 += valor1 * qntd1;
      System.out.println("Valor total da compra: " + pay1);
    }else{
      pay1 += (valor1 * qntd1) - ((valor1 * qntd1) * desc) / 100;
      System.out.println("Valor total da compra: " + (valor1 * qntd1) + "\nValor com " + desc + "% de desconto: R$" + pay1);
    }
 }
}