import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GravarArquivo {
    public static void main(String[] args){

        try {
            FileWriter arquivo = new FileWriter("C:/Programação/MeusProjetos/Java-Univates/Files/Docs/arquivo_gravacao.txt");
            PrintWriter texto = new PrintWriter(arquivo);

            texto.println("Texto do arquivo");
            texto.println("Nova linha 1");
            texto.println("Nova linha 2");
            texto.println("Nova linha 3");

            arquivo.close();
            System.out.println("Fim do Programa");

        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}