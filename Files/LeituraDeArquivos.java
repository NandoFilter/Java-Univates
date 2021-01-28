import java.io.File;
import java.util.Scanner;

public class LeituraDeArquivos {
    public static void main(String[] args){

        try {
            
            File arquivo = new File("C:/Programação/MeusProjetos/Java-Univates/Files/Docs/arquivo.txt");
            Scanner scan = new Scanner(arquivo);

            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

            scan.close();

        } catch (Exception e) {
           System.out.println("Erro na leitura do arquivo");
        }
    }
}