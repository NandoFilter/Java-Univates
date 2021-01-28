/**
 * Autor: Fernando Filter
 * Data: 01/04/2020
 */
public class Exercicios_01_04 {
  
  
  public static void main(String[] args) { 
    
    /* 1) FUP utilizando a classe Entrada que some as idades maiores ou iguais a 60 anos
      E concatene os nomes das pessoas que moram em Lajeado (5 pessoas). Imprima o resultado. */
    
    String nomes = "";
    int soma_idades = 0;
    int contador = 1;
    
    //.toLowerCase = lAjeaDO > lajeado
    //.toUpperCase = lajeado > LAJEADO
    //.equals = Comparar Strings
    //.equalsIgnoreCase = Comparar Strings ignorando a formatacao do texto
    //.trim = Tira Espacos
    
    /*.replace = Troca 
     * Exemplo: String nome = "Juca Bala"
     * nome.replace("a", "b) >  Jucb Bbla
     */
    
    int pessoas = Entrada.leiaInt("Quantas pessoas?");
    while (contador <= pessoas){
      String nome = Entrada.leiaString("Pessoa " + contador);
      contador = contador + 1;     
      int idade = Entrada.leiaInt("Idade");
      String cidade = Entrada.leiaString("Cidade");
      if (idade >= 60 && cidade.equalsIgnoreCase("Lajeado")){
        nomes += nome + ", ";
        soma_idades += idade;
      }
    }
     
    System.out.println(nomes + "entre outros, sao algumas das pessoas que estao no grupo de risco do COVID-19.");
    System.out.println("Suas idades somadas e de " + soma_idades);
    
    // 2) FUP que calcula a idade de uma pessoa, solicitando mes e ano do seu nascimento, tambem utilizando a classe Entrada.
    
    double anoAtual = Entrada.leiaDouble("Em qual ano estamos?");
    double mesAtual = Entrada.leiaDouble("Em qual mes estamos?");
    double ano = Entrada.leiaDouble("Em qual ano voce nasceu?");
    double mes = Entrada.leiaDouble("Em qual mes?");
    
    double idade = (anoAtual - ano) + ((mesAtual - mes) / 10);
    System.out.println("Voce tem " + idade + " anos de vida");
    
  }
}
