/* Autor: Fernando H. Filter
 * Data: 06/05/2020 */

public class VetorOrdemCresAleat{
  public static void main(String [] args){
    
    // FUP utilizando a atividade anterior. Porém agora o vetor inicial precisa ser dinâmico no tamanho e com valores preenchidos aleatoriamente.
   
   int numVet;
   numVet = Entrada.leiaInt("Qual o tamanho do vetor? ");
   
   int[] num = new int [numVet];
   int tam = num.length;
   int armz = 0;
   
   for(int r = 0; r < tam - 1; r++){
     num[r] = (int) (Math.random() * numVet) + 1;
   }
   
   for(int i = 0; i < tam - 1; i++){
     for(int x = 0; x < tam - i - 1; x++){
       if(num[x] > num[(x+1)]){
         armz = num[x];
         num[x] = num[(x+1)];
         num[(x+1)] = armz;
       }
     }
   }
   
   for(int i = 0; i < tam; i++){
     System.out.println(num[i]);
   }

    
  }
}