import java.util.Arrays;
public class Prueba_02 {
    public static void main(String[] args) {
        String [] arreglo1 = new String[5];
        int [] arreglo2 = new int[5];
        double [] arreglo3 = new double[5];

        double real = 123.4567;
        System.out.println("Real = " + Math.round(real*100)/100.0);

        String cadena = "012345" ;
        System.out.println("Len = " + cadena.length());

        arreglo1[0] = "A";
        arreglo2[0] = 1;

        System.out.println("Arreglo1 : " + Arrays.toString(arreglo1));
        System.out.println("Arreglo2 : " + Arrays.toString(arreglo2));
        System.out.println("Arreglo3 ; " + Arrays.toString(arreglo3));

        System.out.println("Cadenita : " + cadena.substring(3,5));

        int numero = 5;

        while (numero > 0) {
            System.out.println("Numero : " + numero);
            numero = numero -1 ;
        }

        numero = 5;

        do {
            System.out.println("Numero : " + numero);
            numero = numero -1;
            if (numero == 2) {
                break;
            }

        } while (numero > 0) ;

    }
}
