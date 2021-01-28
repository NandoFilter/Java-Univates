/* Author: Fernando H. Filter
   Date: 01/07/2020 

   Made just for fun */
   
// Ctrl + Shift + L = Trocar nome de variavel
// Ctrl + Shift + F = Identa o codigo

public class BandeiraUSA {
    public static void main(String[] args) {

        int num = 7;
        String[][] stars = new String[num][num];

        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                stars[x][y] = " * ";
            }
        }
        
        for (int a = 0; a < num; a++) {
            for (int b = 0; b < num; b++) {
                System.out.print(stars[a][b]);

                if (b >= num - 1) {
                    System.out.print("------------------------------------------------\n");
                } 
            }
        }

        for(int c = 0; c < 6; c++){
            System.out.println("---------------------------------------------------------------------");
        }

    }
}