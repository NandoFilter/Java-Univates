import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/* Author: Fernando H. Filter
   Date: 29/06/2020 */ 

  // FUP que leia o arquivo de texto anexo na atividade, um arquivo com a relação de contas bancárias (conta, senha, Titular, saldo). 

/* String linha1 = arquivo[0];
   String[] colunas = arquivo[0].split("\\|"); */

public class ContaBancaria {
    public static void main (String[] args){

      /*  String var = "100";
        int num = Integer.parseInt(var); */

       String[] arquivo = EntradaScanner.leiaArquivo("C:/Programação/MeusProjetos/Java-Univates/Files/Docs/contas.txt");
       
       String[][] matriz = new String[5][4];

        for(int i = 0; i < arquivo.length; i++){
            String[] colunas = arquivo[i].split("\\|");
            for(int j = 0; j < colunas.length; j++){
                matriz[i][j] = colunas[j];
            }
        }

        int z = 0; int transf = 0; double valor = 0; String exec = "Sim";

        System.out.println("-------------------------------");
        System.out.println("        BANCO DO BRASIL        ");
        System.out.println("-------------------------------\n");

        while(z >= 0 && z < 10){
            System.out.println("------------ LOGIN ------------");

            int num_Conta = 0;
            String senha = "";

            // INFORMAR CONTA
            while(num_Conta == 0){
                num_Conta = EntradaScanner.leiaInt("Nº CONTA: ");
                if(num_Conta <= 0 || num_Conta > arquivo.length){
                    System.out.println("Conta Nao Existente"); 
                    System.out.println("-------------------------------\n");  
                    num_Conta = 0;
                }
            }

            // INFORMAR SENHA
            while(senha.equals("")){
                senha = EntradaScanner.leiaString("SENHA: ");
                if(!senha.equals(matriz[num_Conta - 1][1])){
                    System.out.println("SENHA INCORRETA");
                    System.out.println("-------------------------------\n"); 
                    senha = "";
                }
            }

            System.out.println("-------------------------------\n");

            if(Double.parseDouble(matriz[num_Conta - 1][3]) <= 0){ // Caso Saldo for = 0
                System.out.println("Seu saldo esta esgotado");
                System.out.println("-------------------------------\n");
            }else{
                System.out.println("------- Acesso Liberado -------");
                System.out.printf("Bem-vindo %s, o seu saldo e de R$%s.\n", matriz[num_Conta - 1][2], matriz[num_Conta - 1][3]);
                
                exec = "Sim";

                while(exec.equalsIgnoreCase("Sim")){
                    if(exec.equalsIgnoreCase("Nao")){
                        break;
                    }
                    
                    System.out.println("-------------------------------");
                    System.out.println("        TRANSFERENCIA " + (z+1) + "        ");
                    System.out.println("-------------------------------");
                
                    while(transf <= 0 || transf > arquivo.length){
                    transf = EntradaScanner.leiaInt("CONTA: ");
                    if(transf == num_Conta){
                        System.out.println("Impossivel de realizar a transferencia a propria conta!");
                        System.out.println("-------------------------------\n");
                        transf = 0;
                    }
                    }
                
                    while(valor <= 0){
                        valor = EntradaScanner.leiaDouble("VALOR: R$");
                        if(valor > Double.parseDouble(matriz[num_Conta - 1][3])){
                            System.out.println("Saldo Insuficiente");
                            valor = 0;
                        }
                    }

                    System.out.printf("%s transferiu R$" + valor + " para %s.\n", matriz[num_Conta - 1][2], matriz[transf - 1][2]);
                    System.out.println("-------------------------------\n");
                    
                    double conta2 = Double.parseDouble(matriz[transf - 1][3]); // SALDO DA CONTA QUE RECEBERA
                    double contaPrin = Double.parseDouble(matriz[num_Conta - 1][3]); // SALDO DO USUARIO

                    conta2 += valor;

                    contaPrin -= valor;
                    if(contaPrin <= 0){
                        contaPrin = 0;
                    }

                    matriz[transf - 1][3] = Double.toString(conta2);
                    matriz[num_Conta - 1][3] = Double.toString(contaPrin);

                try {
                
                    FileWriter novo_arq = new FileWriter("C:/Programação/MeusProjetos/Java-Univates/Files/Docs/29062020.txt");
                    PrintWriter texto = new PrintWriter(novo_arq);

                    for(int i = 0; i < arquivo.length; i++){
                        texto.println(matriz[i][0] + "|" + matriz[i][1] + "|" + matriz[i][2] + "|" + matriz[i][3]);
                    }
        
                    novo_arq.close();
        
                }catch (IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                } 
                
                exec = EntradaScanner.leiaString("Deseja continuar? [ Sim | Nao ] ");
                
                if(exec.equalsIgnoreCase("Sim") && contaPrin == 0){
                    System.out.println("Saldo Zerado");
                    exec = "Nao";
                }

                transf = 0; valor = 0; z++;
            }
        
            num_Conta = 0; senha = "";
            }
        }
        System.out.println("Fim do Programa");
    }  
}