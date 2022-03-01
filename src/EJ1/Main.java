package EJ1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayEjemplo = new int[]{6,9,5,8,5,0};
        System.out.println(Arrays.toString(Utilidades.generadorArrayAleatorio(10)));
        System.out.println(Arrays.toString(Utilidades.generadorArrayAleatorio()));
        System.out.println(Arrays.toString(Utilidades.arrayPares(10)));
        System.out.println(Arrays.toString(Utilidades.arrayPrimos(10)));
        System.out.println(Arrays.toString(Utilidades.arrayAlreves(arrayEjemplo)));
        System.out.println(Utilidades.encontrarPosicion(arrayEjemplo,6));
    }
}
