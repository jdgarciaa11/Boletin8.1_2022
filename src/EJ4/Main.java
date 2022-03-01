package EJ4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(erastoteno(2000)));
    }

    private static int[] erastoteno(int numero) {
        int[] impares = numerosImpares(numero);
        return numeroPrimo(impares);
    }

    private static int[] numerosImpares(int numero) {
        int[] impares = new int[1];
        int cont = 0;
        for (int i = 3; i < numero; i++) {
            if (i % 2 != 0) {
                if (impares.length <= cont) {
                    impares = Arrays.copyOf(impares, impares.length + 1);
                }
                impares[cont] = i;
                cont++;
            }
        }
        return impares;
    }

    private static int[] numeroPrimo(int[] impares) {
        int[] primos = new int[2];
        int cont = 0;
        for (int i = 0; i < impares.length; i++) {
            if (impares[i] == 3 || impares[i] == 5) {
                primos[cont] = impares[i];
                cont++;
            } else if (impares[i] % 3 != 0 && impares[i] % 5 != 0) {
                if (primos.length <= cont) {
                    primos = Arrays.copyOf(primos, primos.length + 1);
                }
                primos[cont] = impares[i];
                cont++;
            }
        }
        return primos;
    }
}
