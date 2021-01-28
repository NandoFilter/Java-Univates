/* Autor: Fernando H. Filter
 * Data: 13/05/2020 */
public class VetorContagem{
  public static void main (String [] args){
    
    // FUP que atraves de um vetor ja preenchido, diga quantas vezes determinado numero se repete nele.
    
    int[] vetor = {1,1,1,1,2,2,2,3,4,4,4,5,5,6};
    int numero = Entrada.leiaInt("Digite um valor entre 1 e 6: ");
    int count = 0;
    
    for(int i = 0; i < vetor.length; i++){
      if(vetor[i] == numero){
        count++;
      } 
    }
    System.out.println("O numero " + numero + " se repete: " + count + " vez(es) no vetor.");
    System.out.println("Fim do Programa");
  }
}