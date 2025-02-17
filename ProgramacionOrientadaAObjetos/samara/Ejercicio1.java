public class Ejercicio1 {
    public static void main(String[] args) {
        
        /*
        * Primera forma de declarar un arreglo 
        * int[] a = {8, 3, 10, 22, 1, 9};
        *
        * Segunda forma de declarar un arreglo
        * int[] a = new int[6];
        * El número hace referencia al tamaño del arreglo
        * Tendremos que arreglarlo
        */
        
        int[] a = {8, 3, 10, 22, 1, 9};
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        //------------------------------------------
        int n = 5;
        int[] b = new int[n];
        
        // Estructura para llenar el arreglo con números aleatorios entre 10 y 30
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * (30 - 10 + 1)) + 10; // Corregido el rango de los números aleatorios
        }
        
        // Mostrar los elementos del arreglo b
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        // Sumar los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < b.length; i++) {
            suma += b[i]; // Forma más compacta de escribir suma = suma + b[i]
        }
        
        // Imprimir la suma de los elementos
        System.out.println("La suma de los elementos del arreglo b es: " + suma);
    }
}



