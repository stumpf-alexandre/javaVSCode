package lacosNumericos;

public class lacosNumericos {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            //System.out.println(i);//pula de um em um
        }

        for (int i = 1; i <= 50; i+=2) {
            //System.out.println(i);//pulando de dois em dois
        }

        for (int i = 1; i <= 50; i+=10) {
            //System.out.println(i);//pulando de dez em dez
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {//aninhando laços
                System.out.println(j + " x " + i + " = " + j * i);
            }
        }
    }
}
