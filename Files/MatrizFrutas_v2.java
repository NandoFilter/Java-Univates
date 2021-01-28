/* Autor: Fernando H. Filter
 * Data: 18/05/2020 */
public class MatrizFrutas_v2{
  public static void main(String [] args){
    
    /* FUP que tenha uma matriz 5x2 (5 linhas e 2 colunas) para armazenar o nome de uma fruta e o seu preço.
     * Ao final, percorra a matriz e diga qual a fruta com o menor valor e qual a com o maior valor. *
     * 
     * Double.toString(<variavel double aqui>) = metodo que recebe valor em Double e converte para uma String.
     * 
     * Double.parseDouble(<variavel String aqui>) = metodo que recebe valor em String e converte para um Double. */
    
    String[][] frutas = new String [5][2];
    
    for (int i = 0; i < frutas.length; i++){
      frutas[i][0] = EntradaScanner.leiaString("Informe o nome da fruta: ");
      frutas[i][1] = Double.toString(EntradaScanner.leiaDouble("Informe o valor da fruta: R$"));
    }
    
    String menor = "", maior = "";
    double menor_valor = 0, maior_valor = 0;
    
    for(int i = 0; i < frutas.length; i++){
      System.out.println(frutas[i][0] + ": R$" + frutas[i][1]);
      
      if(Double.parseDouble(frutas[i][1]) > maior_valor){
        maior_valor = Double.parseDouble(frutas[i][1]);
        maior = frutas[i][0];
      }
      
      if(Double.parseDouble(frutas[i][1]) < menor_valor || menor_valor == 0){
        menor_valor = Double.parseDouble(frutas[i][1]);
        menor = frutas[i][0];
      }
    }
    
    System.out.println("\nMais caro: " + maior + " a R$" + maior_valor);
    System.out.println("Mais barato: " + menor + " a R$" + menor_valor);
    
    // IMPRIMIR A MATRIZ
    
    System.out.println("\n-PRECOS-");
    for(int i = 0; i < frutas.length; i++){
      System.out.println(frutas[i][0] + "\t" + frutas[i][1]);
    }
    
  }
}