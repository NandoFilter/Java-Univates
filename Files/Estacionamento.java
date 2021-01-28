/* 
 * Autor: Fernando H. Filter
 * Data: 08/04/2020
 */

public class Estacionamento {
  
  public static void main (String [] args){
  
    /* Considere um parque de estacionamento que pratica os precos seguintes: primeira hora:
     * R$ 2,00; segunda hora: R$ 1,50; a partir da segunda hora: R$ 1,00 por hora.
     * O tempo de permanencia no parque e contabilizado em horas e minutos. 
     * Por exemplo, se um veiculo permanecer 2 horas e 30 minutos no parque,
     * pagara R$ 2 (primeira hora) + R$ 1,50 (segunda hora) + R$ 0,50 (30 minutos a R$ 1/hora) = R$ 4.
     * Elabore um algoritmo que, lido o tempo que determinado veiculo permaneceu estacionado no parque (horas e minutos), diga a quantia que deve ser paga.*/
    
    int hora = 0;
    int min = 0;
    double pay = 0;
    double contM = 0;
    
    System.out.println("------------------");
    System.out.println("  ESTACIONAMENTO  ");
    System.out.println("------------------");
    System.out.println("INFORME O TEMPO: ");
    hora = Entrada.leiaInt("Quantas horas? ");
    min = Entrada.leiaInt("Quantos minutos? ");
    
    if (hora == 0){
      if(min >= 1){
        if (min <= 59){
          pay += (min * 100 / 60) * 2 / 100;
          System.out.println("Voce permaneceu " + min + " minutos. A quantia a ser paga e de R$" + pay);
        }
      }
    }
    
    if (hora == 1){
      if(min >= 1){
        if (min <= 59){
          contM += (min * 100 / 60) * 1.5 / 100;
          pay += 2 + contM;
          System.out.println("Voce permaneceu 1 hora e " + min + " minutos. A quantia a ser paga e de R$" + pay);
      }
    }
   }
    
    if (hora == 2){
      if (min >= 1){
        if (min <= 59){
          contM += min * 100 / 60;
          pay += 2 + 1.5 + (contM / 100);
          System.out.println("Voce permaneceu 2 horas e " + min + " minutos. A quantia a ser paga e de R$" + pay);
        }
      }
    }    
        
    if (hora >= 3){
      if (min >= 1){
        if (min <= 59){
          contM += min * 100 / 60;
          pay += 2 + 1.5 + (hora - 2) + (contM / 100);
      System.out.println("Voce permaneceu " + hora + " horas e " + min + " minutos no estacionamento. A quantia a ser paga e de R$" + pay);
     }
    }   
   }
  }
}