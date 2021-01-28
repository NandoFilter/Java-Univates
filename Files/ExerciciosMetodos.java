/* Autor: Fernando H. Filter
 * Data: 10/05/2020 */ 

public class ExerciciosMetodos{
  public static void main (String[] args){
    // FUP que some e substraia o valor de uma variavel declarada no metodo MAIN, atraves de metodos.
    // Crie tambem um metodo para mostrar o valor atualizado da variavel vida
    
    // Utilizado futuramente em Labirinto_RPG.java

    int life = 100;
    System.out.println("Vida atual: " + life);
    System.out.println();
    
    life = MenosVida(life);
    mostrarVida(life);
    System.out.println();
    
    life = MaisVida(life);
    mostrarVida(life);
    System.out.println();
    
    // var pras outras maneiras
    life = subtrairVida(life, 20);
    mostrarVida(life);
    
    life = somarVida(life, 10);
    mostrarVida(life);
  }
  
  private static int MenosVida(int menosLife){
    int sub = (int) (Math.random() * 10) + 1;
    menosLife -= sub;
    System.out.println("Voc� foi envenenado");
    return menosLife;
  }
  
  private static int MaisVida(int maisLife){
    int soma = (int) (Math.random() * 10) + 1;
    maisLife += soma;
    if(maisLife > 100){
      maisLife = 100;
    }
    System.out.println("Voce tomou uma pocao de vida");
    return maisLife;
  }
  
  private static void mostrarVida(int vida){
    System.out.println("-------------");
    System.out.println("Vida: " + vida);
    System.out.println("-------------");
  }
  
  // Outras maneiras
  
  private static int subtrairVida(int vida, int valor){
    return (vida - valor);
  }
   
  private static int somarVida(int vida, int valor){
    return (vida + valor);
  }
}