/*
 * Autor: Fernando H. Filter
 * Data: 08/04/2020
 */
public class Dia_da_Semana {
  
  
  public static void main(String[] args) { 
    
    //FUP que solicite ao usuario um dia da semana (1 a 7 apenas) e com base nisso, imprima o dia da semana (sendo que o 1 representa o domingo)
    
    int day = 0;
    
    day = Entrada.leiaInt("Diga um Dia da Semana: [1 a 7] ");
    switch(day){
      case 1:
        System.out.println("Domingo");
        break;
      
      case 2:
        System.out.println("Segunda-feira");
        break;
        
      case 3:
        System.out.println("Terca-feira");
        break;
      
      case 4:
        System.out.println("Quarta-feira");
        break;
        
      case 5:
        System.out.println("Quinta-feira");
        break;
        
      case 6:
        System.out.println("Sexta-feira");
        break;
      
      case 7:
        System.out.println("Sabado");
        break;  
    }
  }
}
