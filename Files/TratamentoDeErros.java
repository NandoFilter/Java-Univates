public class TratamentoDeErros{
  
  public static void main(String[] args){
    
    int a = EntradaScanner.leiaInt("Informe um valor: ");
    int b = EntradaScanner.leiaInt("Informe um valor: ");

    try{ // Codigo a ser executado
      
      float c = a/b;
      
    }catch(Exception ex){ // Captura do erro
      System.out.println("Erro na operacao");
    }finally{
      System.out.println("Final do Programa");
    } 
  }
}