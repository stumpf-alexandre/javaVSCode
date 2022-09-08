package variaveis;

public class variaveis {
    public static void main(String[] args) {
        
        String nome = "Alexandre";
        System.out.println("Olá, " + nome);

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        int div1 = a / b;
        float div2 = a / b;
        //cast
        float div3 = (float) a / b;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);
    }    
}
