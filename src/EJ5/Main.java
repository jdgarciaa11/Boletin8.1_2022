package EJ5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int LONGITUD = 4;
    private static final int[] RANDOM = generadorRandom();
    public static void main(String[] args) {
        int numero = 0, cont = 0;
        Scanner scan = new Scanner(System.in);
        do {
            do {
                System.out.println("Introduzca 4 numeros: ");
                numero = validarDatosNumericos();
            } while (numero < 999);

            cont++;
        } while (cont < 13);
        System.out.println("Introduzca 4 numeros: ");

    }

    private static int[] generadorRandom() {
        int[] array = new int[LONGITUD];
        Random rd = new Random();
        for (int i = 0; i < LONGITUD; i++) {
            array[i] = rd.nextInt(11);
        }
        return array;
    }

    private static int[] conversorArray(int numero) {
        String cadenaNumeros = Integer.toString(numero);
        int[] array = new int[LONGITUD];
        for (int i = 0; i < LONGITUD; i++) {
            array[i] = (int) cadenaNumeros.charAt(i);
        }
        return array;
    }

    private static String comprobador(int[] array){
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < LONGITUD; i++){
            for (int j = 0; j < LONGITUD; j++){
                if(array[i] == RANDOM[j]){
                    resultado.append('1');
                }
            }
        }
        return resultado.toString();
    }

    private static int validarDatosNumericos() {
        Scanner scan = new Scanner(System.in);
        int numero = -1;
        try {
            numero = scan.nextInt();
            if (numero != 0) {
                if (numero < 0) {
                    System.err.println("ERROR! Dato numerico menor que 0");
                } else if (Integer.toString(numero).length() < LONGITUD) {
                    System.err.println("ERROR! Dato numerico menor de cuatro cifras");
                } else if (Integer.toString(numero).length() > LONGITUD) {
                    System.err.println("ERROR! Dato numerico mayor de dos cifras");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Dato introducido no numerico");
            scan.next();
        }
        return numero;
    }
}
