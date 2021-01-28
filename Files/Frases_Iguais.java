/**
 * Autor: Fernando Filter
 * Data: 30/03/2020
 */
public class Frases_Iguais {
  
  
  public static void main(String[] args) { 
    
    String frase = Entrada.leiaString("Informe a frase 1: ");
    String frase2 = Entrada.leiaString("Informe a frase 2: ");
    
    System.out.println("Frase 01: " + frase);
    System.out.println("Frase 02: " + frase2);
    System.out.println("--------------------------");
    if(frase.equals(frase2)){
      System.out.println("As frases sao iguais");
    }else{
      System.out.println("As frases sao diferentes");
    }
  } 
}
