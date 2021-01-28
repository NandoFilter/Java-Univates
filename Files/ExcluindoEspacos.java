/* Author: Fernando H. Filter
   Date: 06/07/2020 */
   
// Crie um método estático (Procedimento) que recebe uma frase por parâmetro e remove todos os caracteres de espaços da frase. 

public class ExcluindoEspacos {
    public static void main(String[] args){

        String texto = EntradaScanner.leiaString("Texto: ");

        noSpace(texto);
    }

    private static void noSpace(String texto){
        texto = texto.replace(" ", "");
        System.out.println("\nTexto sem espacos: " + texto);
    }
}