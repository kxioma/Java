import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Creación del arreglo de enteros de n elementos

        // Declaración del arreglo de tamaño n
        int N = (int) (Math.random() * (30 - 15)) + 15;
        int[] a = new int[N];

        // llenar el arreglo con numeros comprendidos entre -20 y 20
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (20 + 20)) - 20;
        }

        // Mostrar el arreglo para validar que se estan guardando los elementos
        for (int i = 0; i < a.length; i++) {
            System.out.println("|" + a[i]);
        }

        System.out.println();

        // Se va a recorrer el arreglo para determinar cúantos números son positivos,
        // negativos y cero
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                contadorPositivos++;
            } else if (a[i] < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Crea los arrreglos que almacenaran los números positivos, negativos y ceros.
        int[] positivos = new int[contadorPositivos];
        int[] negativos = new int[contadorNegativos];
        int[] ceros = new int[contadorCeros];

        // Guardar los elementos
        int j = 0, k = 0, q = 0;
        for (int i = 0; i < a.length;) {
            if (a[i] > 0) {
                positivos[j] = a[i];
                j++;
            } else if (a[i] > 0) {
                negativos[k] = a[i];
                k++;
            } else {
                ceros[q] = a[i];
                q++;
            }

        }
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        System.out.println(Arrays.toString(ceros));

    }

}
