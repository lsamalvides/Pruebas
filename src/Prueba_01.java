
import java.util.Scanner;
import java.util.Arrays;
public class Prueba_01 {
    public static void main(String[] args) {
        int entero = 0;
        double real = 5.6;
        System.out.println((int) real);
        double PI2 = 3.3;
        final double PI = 3.1416;

        String [] arreglo = {"1","2","3","4"};
        String [] arreglo2 = new String[4];
        String cadena = "0123456789";
        System.out.println("Substring de la cadena : " + cadena.substring(0,7));
        String numeroentero = "123";
        String numeroreal = "123.45";
        System.out.println("entero : " + Integer.parseInt(numeroentero)*2);
        System.out.println("Real : " + Double.parseDouble(numeroreal)*2);
        for (int i=0; i<arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        for (int i=0; i<cadena.length(); i++) {
            System.out.println(cadena.substring(i,i+1));
            System.out.println(cadena.substring(i));
        }


        System.out.println(Arrays.toString(arreglo));

        arreglo2[0]="A";
        System.out.println(Arrays.toString(arreglo2));
        System.out.println("\n\n");
        listararreglo(arreglo);

        System.out.println("El valor de PI es : " + PI);



    }

    public static void listararreglo(String[] arreglo) {
        for (int i=0; i<arreglo.length; i++) {
            System.out.println(arreglo[i] + "   " + Integer.parseInt(arreglo[i])*2);
        }

    }
}
