// Author: Fernando H. Filter
// Date: 15/06/2020

    /* Crie uma matriz 10x2 (10 linhas e 2 colunas) ou então 2 vetores, para armazenar nomes de produtos e seu respectivo valor. Exemplo: Maça - R$ 2,90.
    Com base nessa tabela, você deverá simular uma compra em um supermercado pelo usuário. Apresente a lista para ele e através do método entrada ele deverá
    escolher, 1 a 1, os itens que quer colocar no carrinho. Ao final, você deverá mostrar quanto irá custar o carrinho e quais os itens que ele possui. */

public class Mercado{
    public static void main(String[] args) {
        String[] itens = { "Cenoura", "Pao", "Queijo", "Carne", "Ovos", "Leite", "Cerveja", "Sabao", "Amaciante", "Shampoo" };
        double[] preco = { 2, 5.50, 5, 29.50, 6, 3.50, 4, 2, 18.50, 8 };
        int[] comprados = new int[itens.length];
        String[][] shop = new String [itens.length][3];

        String carrinho;
        int compra = 0;
        double total = 0;
        boolean action = false;
        int[] qntd = new int[itens.length];
        int somaQntd = 0;
        int somaItens = 1;

        // LISTA
        System.out.println("----------- DÁLIA -----------");
        for(int x = 0; x < itens.length; x++){
            System.out.println("[" + (x+1) + "] " + itens[x] + " a R$" + preco[x]);
        }
        System.out.println("-----------------------------\n");
        System.out.println("--------------- CARRINHO ---------------");
                    
        // Organização
        while(action == false){
            while(compra <= 0 || compra > itens.length){ 
                compra = Entrada.leiaInt("Digite o número do item que deseja comprar");
                compra -= 1;
            }

            if(comprados[compra] != compra){
                comprados[compra] = compra;
                        
                while(qntd[compra] <= 0){
                    qntd[compra] = Entrada.leiaInt("Digite a quantidade que deseja comprar de: " + itens[compra]);
                }
                        
                carrinho = itens[compra];
                        
                System.out.println(carrinho + " | QNT: " + qntd[compra] + " | UNIT: " + preco[compra] + " | TOTAL: " + (preco[compra] * qntd[compra]));
                        
                somaQntd += qntd[compra];
                total += preco[compra] * qntd[compra];

                somaItens += 1;
                action = Entrada.leiaBoolean("Finalizar compra?","Sim","Não");
            }else{
                Entrada.mostraTexto("","Item já adicionado no carrinho");
                action = Entrada.leiaBoolean("Finalizar compra?","Sim","Não");
            }

            compra = 0;

            System.out.println("----------------------------------------");
            System.out.println("QTD. TOTAL DE ITENS                 " + somaQntd);
            System.out.println("VALOR TOTAL R$                      " + total);
            System.out.println("----------------------------------------"); 
        } 
    }
}
