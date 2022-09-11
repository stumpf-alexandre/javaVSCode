package funcoes;

public class funcoes {
    public static void main(String[] args) {
        String nome = "Alexandre";
        int resultado = soma(2, 3);

        saudacao(nome);

        System.out.println(resultado);
    }

    public static void saudacao(String nome) {//passagem de parametros
        System.out.println("Hello, " + nome);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
