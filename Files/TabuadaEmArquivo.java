import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* Author: Fernando H. Filter
   Date: 24/06/2020 */

/* FUP que solicite um numero para o usuario e gere a tabuada dele.
   Toda a tabuada gerada devera ser gravada em um arquivo TXT. */ 

public class TabuadaEmArquivo {
    public static void main(String[] args){

        int num = EntradaScanner.leiaInt("Digite um numero: ");
        
        try{
            FileWriter arquivo = new FileWriter("C:/Programação/MeusProjetos/Java-Univates/Files/Docs/tabuada.txt");
            PrintWriter texto = new PrintWriter(arquivo);

            for(int x = 1; x <= 10; x++){
                texto.printf("%d x %d = %d\n", num, x, (num*x));
            }

            texto.close();

            System.out.println("Fim do Programa");

        }catch(IOException ex){
            System.out.println("Error" + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }
}