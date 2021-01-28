/* Autor: Fernando H. Filter
 * Data: 04/05/2020 */

public class ValidaVetor{
  
  public static void main(String [] args){
  
    /* FUP que solicite 3 numeros maiores que zero distintos para o usuario.
     * Sempre informe o usuario quando ele fornecer um numero ja existente no vetor */
    
    int[] vetor = new int[3];
    
    int numero = 0;
    int count = 0;
    boolean rep = false;
    
    while(count < 3){
    
      numero = Entrada.leiaInt("Informe um numero maior que zero");
      if(numero > 0){
        // Percorrer o vetor para ver se o numero ja est� presente nele
        for(int i = 0; i < vetor.length; i++){
          if(numero == vetor[i]){
            rep = true;
            break;
          }
        }
        
        if(rep == false){
          vetor[count] = numero;
          count++;
        }
        rep = false;
        
      }else{
        System.out.println("Voce informou um numero inv�lido");
      }
      
    }
    
    String resultado = "";
    for(int i = 0; i < vetor.length; i++){
      resultado += "Posicao " + i + " = " + vetor[i] + "\n";
    }
    Entrada.mostraTexto("Resultado", resultado);
    System.out.println("Fim do Programa");
    
  }
}