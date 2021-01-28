/**
 * Autor: Fernando Filter
 * Data: 01/04/2020
 * 
 * && - E
 * || - OU
 * ! - Negacao
 */
public class AulaOperadores {
  
  
  public static void main(String[] args) { 
   //Operadores 01
    
    String nome = Entrada.leiaString("Digite um nome:");
    int age = Entrada.leiaInt("Digite uma idade:");
    String city = Entrada.leiaString("Digite uma cidade:");
    
    //Se a idade e igual a 18 E a cidade e Lajeado
    System.out.println("Nome do Usuario:" + nome);
    if (age >= 18 && city.equals("Lajeado")){
      System.out.println("Dados conferem");
    }else{
      System.out.println("Dados nao conferem");
    }
  }
}
