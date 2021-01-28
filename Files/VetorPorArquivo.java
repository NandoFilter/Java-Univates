/* Author: Fernando H. Filter
   Data: 22/06/2020 */

   // FUP que transforme as linhas de um arquivo TXT em um vetor

import java.io.File;
import java.util.Scanner;

public class VetorPorArquivo{
    public static void main(String[] args){
        
        try{
            
            File arquivo = new File ("C:/Programação/MeusProjetos/Java-Univates/Files/Docs/arquivo_vetor.txt");
            Scanner scan = new Scanner (arquivo);

            // Encontrar o numero de linhas do arquivo lido;
            int linhas = 0;
            while(scan.hasNextLine()){
                scan.nextLine(); // Le a linha e retorna pro scan
                linhas++;
            }
            
            scan.close();
            scan = new Scanner (arquivo);
            int pos = 0;
            String[] vetor = new String[linhas];
            while(scan.hasNextLine()){ // Busca linha a linha
                String linha = scan.nextLine();
                vetor[pos] = linha;
                pos++;
            }
            
            System.out.println("-------- V E T O R --------");
            for(int x = 0; x < linhas; x++){
                System.out.println(vetor[x]);
            }

            scan.close();

        }catch (Exception e){
            System.out.println("Erro na leitura do arquivo");
        }

         

    }
}