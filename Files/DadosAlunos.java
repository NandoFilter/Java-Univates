/* Author: Fernando H. Filter
   Date: 06/07/2020 */

/* FUP que faça a leitura de dados de 10 alunos. Para cada aluno foram obtidos nome, altura e idade.
   Faça um programa que leia estes dados do teclado e forneça:
    
    a) o nome dos alunos que têm altura superior à média;
    b) quantos alunos possuem mais de 20 anos. */

public class DadosAlunos{
    public static void main(String[] args){

        int[] idade = new int[10]; 
        String[] nome = new String[10]; 
        double[] altura = new double[10];
        
        double medAlt = 0; int aluno_20 = 0;

        for(int x = 0; x < 10; x++){
            System.out.println("----- ALUNO " + (x+1) + " -----");
            nome[x] = EntradaScanner.leiaString("Nome: ");
            idade[x] = EntradaScanner.leiaInt("Idade: ");
            altura[x] = EntradaScanner.leiaDouble("Altura: ");
            medAlt += altura[x];
            System.out.println("-------------------\n");
            
            if(idade[x] > 20){
                aluno_20 += 1;
            }
        }

        medAlt = medAlt / 10;

        System.out.println("Lista de alunos com altura superior a media (" + medAlt + "m):");
        for(int y = 0; y < 10; y++){
            if(altura[y] >= medAlt){
                System.out.println(" - " + nome[y]);
            }
        }

        System.out.println("\nNumero de alunos maiores de 20 anos: " + aluno_20);

    }
}
