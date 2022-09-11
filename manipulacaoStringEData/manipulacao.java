package manipulacaoStringEData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class manipulacao {
    public static void main(String[] args) {
        String nome = "Alexandre";

        System.out.println(nome.toUpperCase());//transforma as letras em caixa alta
        System.out.println(nome.toLowerCase());//transforma as letras em caixa baixa
        System.out.println(nome.length());//conta a quantidade de caracteres da frase

        String outroNome = "alexandre";

        System.out.println(nome.equals(outroNome));//compara as caracteristicas e as letras da frase
        System.out.println(nome.equalsIgnoreCase(outroNome));//compara as letras da frase mas sem comparar as caracteristicas(se uma estiver em caixa alta e a outra em caixa baixa)

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");//transforma o dia da semana do ingles para o portugues
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "ola!";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
