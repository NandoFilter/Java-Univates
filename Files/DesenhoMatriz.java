/* Author: Fernando H. Filter
   Date: 01/07/2020 */

// FUP que crie um metodo estatico (Procedimento) que, dado um numero por parametro, desenha na tela utilizando uma matriz.

public class DesenhoMatriz {
    public static void main(String[] args) {

        int num = EntradaScanner.leiaInt("Tamanho do Parametro: ");
        String[][] matriz = new String[num][num];

        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                matriz[x][y] = " * ";
            }
        }

        draw_param(num, matriz);
        System.out.println("\nFinal do Programa");
    }

    private static void draw_param(int num, String[][] matriz) {

        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                System.out.print(matriz[x][y]);
                if (y == num - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
}