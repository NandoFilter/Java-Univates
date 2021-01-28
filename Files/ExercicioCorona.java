/**
 * Autor: Fernando Filter
 * Data: 01/04/2020
 */
public class ExercicioCorona {
  
  
  public static void main(String[] args) { 
    //FUP que some as idades maiores ou iguais a 60 anos e concatene os nomes das pessoas que moram em Lajeado (5 pessoas)
   
    int somaIdade = 0;
    String nomes = "";
    
    String nomeP1 = "Jorge";
    int idadeP1 = 82;
    String cidadeP1 = "Lajeado";
    if (idadeP1 >= 60 && cidadeP1.equals("Lajeado")){
      somaIdade += idadeP1;
      nomes += nomeP1 + ", ";
    }
        
    String nomeP2 = "Reni";
    int idadeP2 = 79;
    String cidadeP2 = "Encantado";
    if (idadeP2 >= 60 && cidadeP2.equals("Lajeado")){
      somaIdade += idadeP2;
      nomes += nomeP2 + ", ";
    }    
    
    String nomeP3 = "Ivete";
    int idadeP3 = 63;
    String cidadeP3 = "Lajeado";
    if (idadeP3 >= 60 && cidadeP3.equals("Lajeado")){
      somaIdade += idadeP3;
      nomes += nomeP3 + ", ";
    }    
    
    String nomeP4 = "Hugo";
    int idadeP4 = 77;
    String cidadeP4 = "Lajeado";
    if (idadeP4 >= 60 && cidadeP4.equals("Lajeado")){
      somaIdade += idadeP4;
      nomes += nomeP4 + ", ";
    }
    
    String nomeP5 = "Lucila";
    int idadeP5 = 60;
    String cidadeP5 = "Estrela";
    if (idadeP5 >= 60 && cidadeP5.equals("Lajeado")){
      somaIdade += idadeP5;
      nomes += nomeP5 + ", ";
    }
    
    String nomeP6 = "Alberto";
    int idadeP6 = 60;
    String cidadeP6 = "Lajeado";
    if (idadeP6 >= 60 && cidadeP6.equals("Lajeado")){
      somaIdade += idadeP6;
      nomes += nomeP6 + ", ";
    }
    
    String nomeP7 = "Lucas";
    int idadeP7 = 23;
    String cidadeP7 = "Lajeado";
    if (idadeP7 >= 60 && cidadeP7.equals("Lajeado")){
      somaIdade += idadeP7;
      nomes += nomeP7 + ", ";
    }
    
    String nomeP8 = "Jade";
    int idadeP8 = 95;
    String cidadeP8 = "Lajeado";
    if (idadeP8 >= 60 && cidadeP8.equals("Lajeado")){
      somaIdade += idadeP8;
      nomes += nomeP8 + ", ";
    }
    
    String nomeP9 = "Sabrina";
    int idadeP9 = 18;
    String cidadeP9 = "Nova Brescia";
    if (idadeP9 >= 60 && cidadeP9.equals("Lajeado")){
      somaIdade += idadeP9;
      nomes += nomeP9 + ", ";
    }
    
    System.out.println(nomes + "entre outros, sao alguns dos idosos de Lajeado que estao em quarentena devido ao COVID-19. Suas idades somadas dao " + somaIdade + " anos.");
    
  } 
}
