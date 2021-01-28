/* Autor: Fernando H. Filter
 * Data: 13/05/2020 
 * FUP que tenha 2 metodos: somar e multiplicar os numeros passados nos argumentos. */
public class OperacoesEmMetodos{
  public static void main (String [] args){
    
    //chamada de método com retorno int
    int resultado = soma(1,3,6);
    int resultado1 = mult(2,4,2);
    System.out.println("Resultado Soma = " + resultado);
    System.out.println("Resultado Multiplicacao = " + resultado1);
  }
  
  //private = acessível somente dentro desta Classe
  private static int soma(int num1, int num2, int num3){
    return(num1 + num2 + num3);
  }
  
  private static int mult(int num1, int num2, int num3){
    return(num1 * num2 * num3);
  }
  
}