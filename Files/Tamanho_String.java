/**
 * Autor: Fernando Filter
 * Data: 30/03/2020
 */
public class Tamanho_String {
  
  
  public static void main(String[] args) { 
    
    String txt = Entrada.leiaString("Informe um texto: ");
    int tamanho = txt.length();
    
    txt = txt.trim(); //Remove Espacos Antes e Depois da String
    
    //txt = txt.replace(" ", "");  //Retira espacos entre String
    
    System.out.println("A String '" + txt + "' tem " + tamanho + " letras");
  }
}
