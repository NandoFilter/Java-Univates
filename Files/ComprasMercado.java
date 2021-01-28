/* Autor: Fernando H. Filter
 * Data: 10/06/2020 */

/* Crie uma matriz 10x2 (10 linhas e 2 colunas) para armazenar nomes de produtos e seu respectivo valor. Exemplo: Maca - R$ 2,90.
 Com base nessa tabela, voce devera simular uma compra em um supermercado pelo usuario. Apresente a lista para ele e atraves do
 metodo entrada ele devera escolher, 1 a 1, os itens que quer colocar no carrinho. Ao final, voce devera mostrar quanto ira
 custar o carrinho e quais os itens que ele possui. */

public class ComprasMercado{
  public static void main(String[] args){
    String[] itens = {"Cenoura", "P�o", "Queijo", "Carne", "Ovos", "Leite", "Cerveja", "Sab�o", "Amaciante", "Shampoo"};
    double[] preco = {2, 5.50, 5, 29.50, 6, 3.50, 4, 2, 18.50, 8};
    int[] comprados = new int [itens.length];
   
    String carrinho;
    int compra = 0;
    double total = 0; boolean action = false;
    int[] qntd = new int [itens.length];
    int somaQntd = 0;
    
    // LISTA
    System.out.println("----------- DaLIA -----------");
    for(int x = 0; x < itens.length; x++){
      System.out.println("[" + (x+1) + "] " + itens[x] + " a R$" + preco[x]);
    }
    System.out.println("-----------------------------\n");
    System.out.println("--------------- CARRINHO ---------------");
    
    // Organizacao
    while(action == false){
      while(compra <= 0 || compra > itens.length){ 
        compra = Entrada.leiaInt("Digite o numero do item que deseja comprar");
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
        
        action = Entrada.leiaBoolean("Finalizar compra?","Sim","Nao");
      }else{
        Entrada.mostraTexto("","Item ja adicionado no carrinho");
        action = Entrada.leiaBoolean("Finalizar compra?","Sim","Nao");
      }
      compra = 0;
    }
    
    System.out.println("----------------------------------------");
    System.out.println("QTD. TOTAL DE ITENS                 " + somaQntd);
    System.out.println("VALOR TOTAL R$                      " + total);
    System.out.println("----------------------------------------");
  }
}