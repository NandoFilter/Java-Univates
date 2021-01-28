/**
 * Autor: Fernando H. Filter
 * Data: 06/04/2020
 */
public class IMC {
  
  
  public static void main(String[] args) { 
    
    /* 2 - FUP que le altura e peso de uma pessoa e calcula o IMC usando a seguinte formula:
     * IMC = peso/(altura*altura)
     * Apos calcular o IMC o programa verifica se essa a pessoa esta no peso ideal, sabendo que
     * o peso e ideal se o IMC e menor ou igual a 20,7.
     */
    
    double alt = Entrada.leiaDouble("Qual a sua altura? ");
    double peso = Entrada.leiaDouble("Qual o seu peso? ");

    alt = (alt * 100); // Metros p/ Centimetros
    double imc = peso / (alt * alt);
    
    System.out.println("Seu IMC é: " + imc);
    if (imc <= 20.7){
      System.out.println("Você está no seu peso ideal.");
    }

  }
}
