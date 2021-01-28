/**
 * Autor: Fernando Filter
 * Data: 30/03/2020
 */
public class Exercicio01 {
  
  
  public static void main(String[] args) { 
   String nome = "Gabriel";
   float nota1 = 6.5f;
   float nota2 = 7;
   float nota3 = 9;
   float media = ((nota1 + nota2 + nota3) / 3);
   
   System.out.println("Nome do Aluno: " + nome);
   System.out.println("Nota 01: " + nota1);
   System.out.println("Nota 02: " + nota2);
   System.out.println("Nota 03: " + nota3);
   System.out.println("-------------------------");
   System.out.println("CALCULANDO MEDIA DO ALUNO");
   System.out.println("-------------------------");
   System.out.println("Media: " + media);
   
   if (media >= 7) {
     System.out.println(nome + " foi aprovado");
   }else{
     System.out.println(nome + " foi reprovado");
   }
  } 
}
