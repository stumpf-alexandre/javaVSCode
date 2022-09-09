package boleanosTabelaVerdade;

public class boleanos {
    public static void main(String[] args) {
        boolean resultado = false;
        System.out.println(resultado);

        boolean fimDeSemana1 = true;
        boolean fazendoSol1 = true;
        boolean vamosAPraia1 = fimDeSemana1 && fazendoSol1;

        boolean fimDeSemana2 = false;
        boolean fazendoSol2 = true;
        boolean vamosAPraia2 = fimDeSemana2 && fazendoSol2;

        boolean fimDeSemana3 = true;
        boolean fazendoSol3 = false;
        boolean vamosAPraia3 = fimDeSemana3 && fazendoSol3;

        boolean fimDeSemana4 = false;
        boolean fazendoSol4 = false;
        boolean vamosAPraia4 = fimDeSemana4 && fazendoSol4;

        //Tabela verdade
        //Operador && (AND)
        //true && true == true
        //true && false == false
        //false && true == false
        //false && false == false

        boolean fimDeSemana5 = true;
        boolean fazendoSol5 = true;
        boolean vamosAPraia5 = fimDeSemana5 || fazendoSol5;

        boolean fimDeSemana6 = false;
        boolean fazendoSol6 = true;
        boolean vamosAPraia6 = fimDeSemana6 || fazendoSol6;

        boolean fimDeSemana7 = true;
        boolean fazendoSol7 = false;
        boolean vamosAPraia7 = fimDeSemana7 || fazendoSol7;

        boolean fimDeSemana8 = false;
        boolean fazendoSol8 = false;
        boolean vamosAPraia8 = fimDeSemana8 || fazendoSol8;

        //Operador || (OR)
        //true || true == true
        //true || false == true
        //false || true == true
        //false || false == false

        System.out.println(vamosAPraia1);
        System.out.println(vamosAPraia2);
        System.out.println(vamosAPraia3);
        System.out.println(vamosAPraia4);
        System.out.println(vamosAPraia5);
        System.out.println(vamosAPraia6);
        System.out.println(vamosAPraia7);
        System.out.println(vamosAPraia8);

        String mensagem1 = fimDeSemana1 ? "É fim de semana" : "Não é fim de semana";
        String mensagem2 = fimDeSemana2 ? "É fim de semana" : "Não é fim de semana";
        String mensagem3 = fimDeSemana3 ? "É fim de semana" : "Não é fim de semana";
        String mensagem4 = fimDeSemana4 ? "É fim de semana" : "Não é fim de semana";
        String mensagem5 = fimDeSemana5 ? "É fim de semana" : "Não é fim de semana";
        String mensagem6 = fimDeSemana6 ? "É fim de semana" : "Não é fim de semana";
        String mensagem7 = fimDeSemana7 ? "É fim de semana" : "Não é fim de semana";
        String mensagem8 = fimDeSemana8 ? "É fim de semana" : "Não é fim de semana";

        System.out.println(mensagem1);
        System.out.println(mensagem2);
        System.out.println(mensagem3);
        System.out.println(mensagem4);
        System.out.println(mensagem5);
        System.out.println(mensagem6);
        System.out.println(mensagem7);
        System.out.println(mensagem8);
    }
}
