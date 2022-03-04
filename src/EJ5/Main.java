package EJ5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int LONGITUD = 4;
    private static final int[] RANDOM = generadorRandom();
    public static void main(String[] args) {
        int numero = 0, cont = 0;
        int[] numeroArray = new int[LONGITUD];
        String resultado;
        Scanner scan = new Scanner(System.in);
        do {
            do {
                System.out.println("Introduzca 4 numeros: ");
                numero = validarDatosNumericos();
            } while (numero < 999);
            numeroArray = conversorArray(numero);
            if (comprobador(numeroArray).equals("1111")){
                System.out.println("Enorabuena! Has ganado");
            } else {
                resultado = comprobador(conversorArray(numero));
                System.out.println(resultado);
            }
            cont++;
        } while (cont < 13);

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
        String cadenaNumeros = Integer.toString(numero) ;
        int[] array = new int[LONGITUD];
        for (int i = 0; i < LONGITUD; i++) {
            array[i] = ((int) cadenaNumeros.charAt(i))-48;
        }
        return array;
    }

    private static String comprobador(int[] array){
        StringBuilder resultado = new StringBuilder();
        boolean parar = false;
        for (int i = 0; i < LONGITUD; i++){
            do{
                if(array[i] == RANDOM[i]) {
                    resultado.append('1');
                    parar = true;
                } else if(encontrado(array[i])){
                    resultado.append('0');
                    parar = true;
                } else {
                    resultado.append('X');
                    parar = true;
                }
            }while(!parar);
            parar = false;
        }
        return resultado.toString();
    }

    private static boolean encontrado(int origen){
        boolean encontrado = false;
        for(int i = 0; i < LONGITUD; i++){
            if (RANDOM[i] == origen) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
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
