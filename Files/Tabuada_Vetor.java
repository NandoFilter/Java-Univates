// Autor: Fernando H. Filter
// Data: 29/04/2020

public class Tabuada_Vetor{
  public static void main (String [] args){
    
    int tabuada[] = new int [3];
    
    for (int i = 0; i < tabuada.length; i++){
      tabuada [i] = Entrada.leiaInt("Digite um valor: ");
    }
    
    for(int count = 0; count < tabuada.length; count++){
      int total = 0;
      for(int x = 1; x <= 10; x++){
        total = tabuada[count] * x;
        System.out.println(x + " x " + tabuada[count] + " = " + total);
        if(x == 10){
          System.out.println("----------------------------"); // Separacao p/ Organizacao
        }
      }
    }
    
  }
}