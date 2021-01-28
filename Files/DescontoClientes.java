/* Autor: Fernando H. Filter
 * Data: 14/04/2020 */ 

import javax.swing.*;

public class DescontoClientes {

  public static void main (String [] args){
  
  // 5% de desconto para funcionarios e 10% de desconto para clientes especiais
    
  double pay = 0;
  
  JOptionPane.showMessageDialog(null, "Bem-vindo a Loja Madrid", "", JOptionPane.INFORMATION_MESSAGE);
  Double valor = Entrada.leiaDouble("Digite valor total da compra? R$");
  System.out.println("--------------------");
  System.out.println("[1] Cliente Comum");
  System.out.println("[2] Cliente Especial");
  System.out.println("[3] Funcionario");
  System.out.println("--------------------");
  int tipoCli = Entrada.leiaInt("Digite o numero conforme as caracteristicas:");
  switch (tipoCli){
    case 1:
     pay += valor;
     System.out.println("[Cliente Comum] \nValor total da compra: R$" + pay);
     break;
     
    case 2:
     pay += valor - (valor * 10) / 100;
     System.out.println("[Cliente Especial] \nValor total da compra com 10% de desconto: R$" + pay);
     break;
     
    case 3:
     pay += valor - (valor * 5) / 100;
     System.out.println("[Funcionario] \nValor total da compra com 5% de desconto: R$" + pay);
     break;
  }
    
  }
    
 }
  
  