/**
 * Autor: Fernando Filter
 * Data: 30/03/2020
 */
public class Area_do_Retangulo {
  public static void main(String[] args) { 
    int base = Entrada.leiaInt("Informe a base do Retangulo");
    int altura = Entrada.leiaInt("Informe a altura do Retangulo");
    int area = base * altura;
    
    System.out.println("----------------------");
    System.out.println(" AREA DE UM RETANGULO ");
    System.out.println("----------------------");
    System.out.println("Base: " + base + "cm");
    System.out.println("Altura: " + altura + "cm");
    System.out.println("Area: " + area + "cm2");
  }
}