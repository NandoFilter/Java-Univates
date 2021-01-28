/**
 * Autor: Fernando H. Filter
 * Data:06/04/2020
 */
public class Aula_06_04 {
  
  
  public static void main(String[] args) { 
    //Lacos de Repeticao
    
      /* for(iniciacao; condicao de fim; incremento){
       *   bloco de comando 
       * }
       */
    
    for(int num = 1; num <= 10; num++){
      System.out.println("Valor: " + num);
    }
    
     /* while(condicao){
      *   bloco de comandos
      * }
      */ 
    
    int x = 15;
    while(x < 18){
      System.out.println("Voce nao tem permissao para entrar");
      x++;
    }
    
    /*do{
     * bloco de comandos
     *} while (condicao); 
     */ 
    
    int y = 15;
    do {
      System.out.println("Voce nao tem permissao para entrar");
      y++;
    } while (y < 18);
    
    //Enhanced For
    
    int[] array = {1,2,3,4,5};
    
    for (int i : array){
      System.out.println(i);
    }
  }
}
