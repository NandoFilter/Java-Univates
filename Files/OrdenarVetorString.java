/* Autor: Fernando H. Filter
 * Data: 20/05/2020 */
public class OrdenarVetorString{
  public static void main(String [] args){
    
    /* Dado um valor de Strings, ordene ele atraves do valor.
     * Crie um metodo para isso que devolve o vetor ordenado. */
    
    String[] vetor = {"1.9", "15", "0.6", "3", "8.5", "4"}; //Converter em Double??
    String[] numeros = setOrdena(vetor);
    
    for(int i = 0; i < numeros.length; i++){
      System.out.println(numeros[i]);
    }
  }
  
  public static String[] setOrdena(String[] v1){ 
    int tam = v1.length; 
    double armz = 0;
    double[] v2 = new double [tam];
    
    for(int i = 0; i < tam; i++){
      v2[i] = Double.parseDouble(v1[i]);
    }
    
    for(int i = 0; i < tam - 1; i++){        
      for(int x = 0; x < tam - i - 1; x++){  
        if(v2[x] > v2[(x+1)]){    
          armz = v2[x];                
          v2[x] = v2[(x+1)];       
          v2[(x+1)] = armz;
        }
      }
    }
    
    for(int i = 0; i < tam; i++){
      v1[i] = Double.toString(v2[i]);
    }
    
    return v1;
  }
  
  
}
