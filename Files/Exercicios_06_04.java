/**
 * Autor: Fernando H. Filter
 * Data: 06/04/2020
 */
public class Exercicios_06_04 {
  
  
  public static void main(String[] args) { 
    
    /* 1 - FUP que dado o valor de um emprestimo calcula o valor total do financiamento em 6 meses.
     * A taxa de juros e 3,5 (juros simples) se o valor esta abaixo de 12000 Reais ou 4,0 se o valor
     * do emprestimo e superior a 12000 Reais.*/
    
    // J = C x I x T
    
    double montante = 0;
    
    double capital = Entrada.leiaDouble("Qual o capital?");
    
    if (capital < 12000){
      // 3.5%
      montante = capital + (capital * (3.5 / 100) * 6);
      System.out.println("Seu emprestimo e de R$" + montante);
    }else{
      // 4%
      montante = capital + (capital * (4 / 100) * 6);
      System.out.println("Seu emprestimo e de R$" + montante);
    }
    
    /* 2 - FUP que le altura e peso de uma pessoa e calcula o IMC usando a seguinte formula:
     * IMC = peso/(altura*altura)
     * Apos calcular o IMC o programa verifica se essa a pessoa esta no peso ideal, sabendo que
     * o peso e ideal se o IMC e menor ou igual a 20,7.
     */
    
    double alt = Entrada.leiaDouble("Qual a sua altura? ");
    double peso = Entrada.leiaDouble("Qual o seu peso? ");
    
    alt = (alt * 100); // Metros p/ Centimetros
    double imc = peso / (alt * alt);
    
    System.out.println("Seu IMC e: " + imc);
    if (imc <= 20.7){
      System.out.println("Voce esta no seu peso ideal.");
    }
    
    //3 - FUP que solicite um numero para o usuario e atraves deste numero, imprima a sua tabuada.
    
    int num = Entrada.leiaInt("Digite um numero: ");
    
    for (int cont = 1; cont <= 10; cont++){
      int total = num * cont;
      System.out.println(num + " x " + cont + " = " + total);
    }

    /* 4 - FUP que utilize o lado ENQUANTO para solicitar 3 numeros ao usuario, e para cada numero,
     * informe a sua raiz quadrada ( Math.sqrt() )Exemplo de utilizacao:
     * System.out.println("Raiz quadrada de 9 = " + Math.sqrt(9));
     */ 
    
    int x = 1;
    while (x <= 3){
      int num1 = Entrada.leiaInt("Digite um valor: ");
      System.out.println("Raiz Quadrada de " + num1 + " = " + Math.sqrt(num1));
      x++;
    }


    /* 5 - FUP que solicite a idade da pessoa, e enquanto essa idade for menor que 18,
     * imprima o texto "PESSOA MENOR DE IDADE" e solicite a idade ate o usuario
     * informar uma idade igual ou superior a 18.
     */
    
    int age = 0;
    
    do {
      age = Entrada.leiaInt("Digite sua idade: ");
      if (age < 18){
        System.out.println("PESSOA MENOR DE IDADE");
      }
    }while(age < 18);
       
    System.out.println("PESSOA MAIOR DE IDADE");

  }
}
