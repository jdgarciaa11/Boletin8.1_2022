package EJ2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nota dam = new Nota(5);
        Boolean salir = false;
        int opc;
        Scanner scan = new Scanner(System.in);
        while (!salir){
            System.out.print("""
                    [1]. Mostrar la nota mas alta.
                    [2]. Mostrar la nota mas baja.
                    [3]. Mostar la nota media.
                    [4]. Alumnos con la nota mas alta que la media.
                    [5]. Alumnos con la nota mas alta que la media.
                    [6]. Resumen
                    [7]. Salir.
                    Elige una opcion:\040""");
            opc = scan.nextInt();
            switch (opc){
                case 1 -> System.out.println(dam.notaMasAlta());
                case 2 -> System.out.println(dam.notaMasBaja());
                case 3 -> System.out.println(dam.notaMedia());
                case 4 -> System.out.println(dam.alumEficiente());
                case 5 -> System.out.println(dam.alumDeficiente());
                case 6 -> System.out.println(dam);
                case 7 -> salir = true;
                default -> throw new IllegalArgumentException("OPCION BETWEEN 1 6");
            }
        }
    }
}
