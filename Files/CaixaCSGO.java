public class CaixaCSGO {
    public static void main(String[] args){

        double item = Math.random() * 100;

        // System.out.println(item);

        if(item <= 0.25575){ // Amarelo
            System.out.println("Item Amarelo");
        }else if(item > 0.25575 && item <= 0.63939){  // Vermelho
            System.out.println("Item Vermelho");
        }else if(item > 0.63939 && item <= 3.19693){  // Rosa
            System.out.println("Item Rosa");
        }else if(item > 3.19693 && item <= 15.98465){ // Roxo
            System.out.println("Item Roxo");
        }else if(item > 15.98465 && item <= 100){     // Azul
            System.out.println("Item Azul");
        }

    }
}