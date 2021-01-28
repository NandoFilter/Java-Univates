/**
 * Autor: Fernando Filter
 * Data: 30/03/2020
 */
public class Aula04B {
  
  
  public static void main(String[] args) { 
    
    double soma = 15 + 12.75;
    double subt = 20 - 8;
    double mult = 7 * 3;
    double div = 10 / 5;
    double pot = 4 ^ 2;
    double resto = 9 % 2;
    
    System.out.println("----------------------");
    System.out.println("OPERADORES ARITMETICOS");
    System.out.println("----------------------");
    System.out.println("Soma = " + soma);
    System.out.println("Subtracao = " + subt);
    System.out.println("Multiplicacao = " + mult);
    System.out.println("Divisao = " + div);
    System.out.println("Potenciacao = " + pot);
    System.out.println("Resto = " + resto);
    System.out.println("----------------------");
    
    /**Operadores Relacionais
      * Normalmente sao utilizados jutno com operadores condicionais
      */
    
    int var1 = 1;
    int var2 = 2;
    boolean var3 = (var1 == var2);
    boolean var4 = (var1 >= var2);
    boolean var5 = (var1 != var2);
      
      if (var1 == var2){
         System.out.println(var3 + " = Os numeros sao iguais");
      }else{
         System.out.println(var3 + " = Os numeros sao diferentes");
      }   
      if (var1 < var2) {
         System.out.println("O numero " + var2 + " e o maior.");
      }else{
         System.out.println("O numero " + var1 + " e o maior.");
      } 
   
      System.out.println("O primeiro valor e MAIOR ou IGUAL ao segundo? " + var4);
      System.out.println("Os dois valores sao diferentes? " + var5);
      System.out.println("---------------------");
      
      //Comparando Strings
      
      String nome = "Fernando";
      String nome2 = "Fernando";
        
      if(nome.equals(nome2)){
        System.out.println("O Nome e o Nome2 sao iguais");
      }else{}
  }
}
