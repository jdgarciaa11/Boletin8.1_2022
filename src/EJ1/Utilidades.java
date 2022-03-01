package EJ1;

import java.util.Arrays;
import java.util.Random;

public class Utilidades {
    public static int[] generadorArrayAleatorio(int longitud) {
        int[] array = new int[longitud];
        Random rd = new Random();
        for (int i = 0; i < longitud; i++) {
            array[i] = rd.nextInt(101);
        }
        return array;
    }

    public static int[] generadorArrayAleatorio() {
        int[] array = new int[20];
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = rd.nextInt(201) + 100;
        }
        return array;
    }

    //TODO rehacer pero con dos bucles for y longitud 1000000 para comprobar que es mas rapido
    public static int[] arrayPares(int longintud) {
        int contador = 0;
        int[] array = generadorArrayAleatorio(longintud);
        int[] arrayPares = new int[1];
        for (int i = 0; i < longintud; i++) {
            if (array[i] % 2 == 0) {
                if (arrayPares.length <= contador) {
                    arrayPares = Arrays.copyOf(arrayPares, arrayPares.length + 1);
                }
                arrayPares[contador] = array[i];
                contador++;
            }
        }
        return arrayPares;
    }

    public static int[] arrayPrimos(int longintud) {
        int contador = 0;
        int[] array = generadorArrayAleatorio(longintud);
        int[] arrayPrimos = new int[1];
        for (int i = 0; i < longintud; i++) {
            if (esPrimo(array[i])) {
                if (arrayPrimos.length <= contador) {
                    arrayPrimos = Arrays.copyOf(arrayPrimos, arrayPrimos.length + 1);
                }
                arrayPrimos[contador] = array[i];
                contador++;
            }
        }
        return arrayPrimos;
    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static int[] arrayAlreves(int[] array) {
        int posicion = 0;
        int[] arrayAlreves = new int[array.length];
        for (int i = array.length; i > 0; i--){
            arrayAlreves[posicion] = array[i-1];
            posicion++;
        }
        return arrayAlreves;
    }

    public static int encontrarPosicion(int[] array, int numero) {
        int encontrada = -1;
        for (int i = 0; i < array.length; i++){
            if(array[i] == numero){
                encontrada = i;
            }
        }
        return encontrada;
    }
}
