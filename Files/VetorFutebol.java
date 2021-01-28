/* Autor: Fernando H. Filter
 * Data: 10/05/2020 */

public class VetorFutebol{
  public static void main (String [] args){
    
    String [] time = new String [3];
    int i = 0;
    int j = 0;
    
    System.out.println("-----------------------");
    System.out.println(" CAMPEONATO DE FUTEBOL ");
    System.out.println("-----------------------");
    
    for(i = 0; i < 3; i++){
      time[i] = Entrada.leiaString("Nome do " + (i + 1) + "º time: ");
    }
    
    for(i = 0; i < 3; i++){
      for(j = 0; j < 3; j++){
        if(time[i] == time[j]){
          j++;
          System.out.println(time[i] + " [ ] x [ ] " + time[j]);
        }else{  
          System.out.println(time[i] + " [ ] x [ ] " + time[j]);
        }
      }
     }  
    }
   }