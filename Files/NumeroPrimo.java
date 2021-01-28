public class NumeroPrimo{
  public static void main(String [] args){
  
  System.out.println("Este programa fara a verificacao do numero informado e informara se e Primo ou Nao. (0) Para terminar a execucao");  
    
  int num = 0;
  int cont = 1;  
  int div = 0;
  
  do{
    num = Entrada.leiaInt("Digite um valor: ");
    for(cont = 1; cont <= num; cont++){
      if((num % cont) == 0){
        div += 1;
      }
    }
    if(num == 1){
      System.out.println("O n�mero 1 nao e primo");
    }else{
      if(div <= 2){
        System.out.println("O numero " + num + " e primo");
      }else{
        System.out.println("O numero " + num + " nao e primo e e divisivel por " + div + " numeros");
      }
    }
    div = 0;
  }while(num > 0);
  
  System.out.println("Fim do Programa");
 }
}