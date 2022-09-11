package vetores;

import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {
        //criando um arrey de 5 posições
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //ou

        String[] letras = {"A", "B", "C", "J", "I"};
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        //ou
        System.out.println(Arrays.toString(letras));


        int[] nums = {9, 10, 12, 25, 2};
        int maior = nums[0];
        int menor = nums[0];
        int media = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
            }

            if (nums[i] < menor) {
                menor = nums[i];
            }

            media += nums[i];
        }

        System.out.println("Maior : " + maior);
        System.out.println("Menor : " + menor);
        System.out.println("Media : " + media / nums.length);
    }
}
