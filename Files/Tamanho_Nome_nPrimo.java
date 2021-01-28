import java.util.Scanner;

public class Tamanho_Nome_nPrimo {
  public static void main (String[] args){
  
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um nome: ");
    String nome = scan.nextLine();
    int tamanho = nome.length();
    
    System.out.println("O nome possui " + tamanho + " caracteres.");
    
    int cont = 1;
    int div = 0;
    
    for(cont = 1; cont <= tamanho; cont++){
      if((tamanho % cont) == 0){
        div++; 
      }
    }
    
    if(div == 2){
      System.out.println("O numero " + tamanho + " e primo");
    }else{
      System.out.println("O numero " + tamanho + " nao e primo");
    }
    
  }
}