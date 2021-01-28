// Autor: Fernando H. Filter
// Data: 29/04/2020
public class Vetor{
  public static void main(String [] args){
    
    double soma;
    double [] vetor = new double [5]; // M�ximo de 5 valores
    int contador;
    int acimadamedia;
    double media;
    
    media = soma = contador = 0;
    
    while(contador < 5){
      vetor [contador] = Entrada.leiaDouble("Digite uma nota: ");
      soma += vetor[contador];
      contador++;
    }
    
    media = soma / 5;
    acimadamedia = 0;
    contador = 0;
    
    while(contador < 5){
      if(vetor[contador] > media){
        acimadamedia++;
      }
      contador++;
    }
     
    System.out.println("A media e " + media);
    System.out.println("Alunos acima da media: " + acimadamedia);
  }
}