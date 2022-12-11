import java.util.Arrays;
public class Prueba_03 {
    public static void main(String[] args) {
        String [] nombres = {"Luis", "Alberto", "juan"} ;
        int [] edades = {30, 22, 20};

        String [] mayores = mayoresde25(nombres, edades);
        System.out.println("Los mayores de 25 son : " + Arrays.toString(mayores));


    }

    public static String [] mayoresde25(String [] nombres, int [] edades) {

        int contador = 0;
        for (int i=0; i<edades.length; i++) {
            if (edades[i] > 25) {
                contador = contador + 1;
            }
        }


        String [] mayores25 = new String[contador];
        contador = 0;
        for (int i=0; i < edades.length; i++) {
            if (edades[i] > 25) {
                mayores25[contador] = nombres[i];
                contador = contador + 1;
            }
        }

        return (mayores25);


    }
}
