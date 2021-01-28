/**
 * Autor: Fernando H. Filter
 * Data: 08/04/2020
 */
public class Animais {
  
  
  public static void main(String[] args) { 
    
    /* FUP que seja capaz de concluir qual dentre os seguintes mamiferos foi escolhido, atraves de Q&A.
     * Animais possiveis: Leao, Cavalo, Homem, Macaco, Morcego e Baleia.*/
    
    
    //Poderia usar Boolean
    
    String quad = Entrada.leiaString("E Quadrupede? [S/N] ");
    if (quad.equalsIgnoreCase("S")){
      String carn = Entrada.leiaString("E Carnivoro? [S/N] ");
      if (carn.equalsIgnoreCase("S")){
        System.out.println("Quadrupede e Carnivoro: Leao");
      }else{
        System.out.println("Quadrupede e Herbivoro: Cavalo");
      }
    }else{
      String bip = Entrada.leiaString("E Bipede? [S/N] ");
      if (bip.equalsIgnoreCase("S")){
        String oniv = Entrada.leiaString ("E Onivoro? [S/N] ");
        if (oniv.equalsIgnoreCase("S")){
          System.out.println("Bipede e Onivoro: Humano");
        }else{
          System.out.println("Bipede e Frutivaro: Macaco");
        }  
      }else{
        String voad = Entrada.leiaString("E Voador? [S/N] ");
        if (voad.equalsIgnoreCase("S")){
          System.out.println("Voador: Morcego");
        }else{
          System.out.println("Aquatico: Baleia");
        }
      }
    }
    
    
  }
}
