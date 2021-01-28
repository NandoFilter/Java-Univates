/*
Crie uma matriz 10x2 (10 linhas e 2 colunas) ou então 2 vetores, para armazenar nomes de produtos e 
seu respectivo valor. Exemplo: Maça - R$ 2,90.
Com base nessa tabela, você deverá simular uma compra em um supermercado pelo usuário. 
Apresente a lista para ele e através do método entrada ele deverá escolher, 1 a 1, os itens que quer colocar 
no carrinho. Ao final, você deverá mostrar quanto irá custar o carrinho e quais os itens que ele possui.
[DESAFIO] Segunda parte: Ao final, ao invés de armazenar os produtos em uma String, você deve armazená-los em uma nova
matriz, contendo na coluna 0 o nome do produto, na coluna 1 a quantidade escolhida e na coluna 2 o valor total.
*/
public class Mercado_v2 {
    
    public static void main(String[] args){
        
        int quant_produtos = 0;
        String compras = new String("");

        String[][] carrinho;
        String[][] mercado = {
            {"Abacaxi", "5.45"}, {"Batata", "5.50"}, {"Carne", "20.10"}, {"Cerveja", "8.80"}, 
            {"Erva", "9.40"}, {"Laranja", "3.33"}, {"Maçã", "3.90"}, {"Mamão", "5.90"}, 
            {"Ovo", "5.10"}, {"Peixe", "15.00"}
        };

        int produto = 0;
        double quant;

        int pipe, ecom;

        while(true){

            do{
                produto = Entrada.leiaInt(imprimeProdutos(mercado));
            }while(produto < 0 || produto > mercado.length);//só vai poder escolher um produto que existe no mercado, ou ZERO para SAIR

            if(produto == 0){//0 = SAIR da tela de compra e mostrar a matriz do carrinho
                carrinho = new String[quant_produtos][3]; //carrinho com tamanho necessário OK

                String[] vetor_compras = compras.split("\n");
                for(int x = 0; x < vetor_compras.length; x++){
                    // vamos utilizar o método indexOf da Classe String para dividir o texto e capturar separadamente os itens
                    pipe = vetor_compras[x].indexOf("|");
                    ecom = vetor_compras[x].indexOf("&");
                    carrinho[x][0] = vetor_compras[x].substring(0, pipe);
                    carrinho[x][1] = vetor_compras[x].substring(pipe + 1, ecom);
                    carrinho[x][2] = vetor_compras[x].substring(ecom + 1);
                }
                return;//para a execução do programa
            }

            do{
                quant= Entrada.leiaDouble("Informe a quantidade de " + mercado[produto-1][0]);
            }while(quant <= 0);//fica perguntando enquanto a quantidade digitada for 0 ou menor

            compras += mercado[produto-1][0] + "|" + "quantidade" + "&" + "valor_total" + "\n";

            quant_produtos += 1;
        }

    }//fechamento do main

    private static String imprimeProdutos(String[][] mercado){
        String resultado = "Escolha um item para adicionar ao carrinho:\n\n";
        for(int i = 0; i < mercado.length; i++){
            //System.out.println(mercado[i][0] + "\t" + mercado[i][1]);
            resultado += (i+1) + " - " + mercado[i][0] + "\t" + " R$ " + mercado[i][1] + "\n";
        }

        resultado += "\n0 = SAIR";
        return resultado;
    }

    /* private static void imprimeCompras(String[][] carrinho){
        
        String resultado = "";
        for(int i = 0; i < carrinho.length; i++){
            resultado += carrinho[i][0] + "\t" + carrinho[i][1] + "\t" + carrinho[i][2];
        }
        
        Entrada.mostraTexto("Carrinho de Compras", "Itens comprados:\n" + resultado);
    } */

}