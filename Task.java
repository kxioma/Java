import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        /*
         * Se tiene un arreglo lineal de N números. Hallar la suma de los N números (N
         * es
         * ingresado por el usuario)
         */

        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Ingrese la cantidad de números (N > 0): ");
            N = scanner.nextInt();

            if (N > 0) {
                break;
            } else {
                System.out.println("Por favor, ingrese un número mayor que 0.");
            }
        }

        int[] numeros = new int[N];
        int suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los " + N + " números es: " + suma);

        scanner.close();

        System.out.println("TASK NUMERO 2////////");

        /*
         * Se tienen N empleados de una compañía y se ha ideado llenar un arreglo lineal
         * A con
         * sueldos de los empleados, un arreglo B con las asignaciones totales de cada
         * empleado,
         * un arreglo C con las deducciones de cada uno. Crear un arreglo T que contenga
         * el neto
         * a pagar a cada empleado. (Neto a pagar= sueldo + asignaciones - deducciones)
         */

        // Sueldos de los empleados
        double[] A = { 220.0, 199.7, 100.0 };

        // Asignaciones totales de cada empleado
        double[] B = { 300.0, 200.9, 150.0 };

        // Deducciones de cada empleado
        double[] C = { 200.0, 100.0, 99, 0 };

        // Arreglo que almacena el neto a pagar de cada empleado Ej: A.length --> 3
        double[] T = new double[A.length];
        for (int i = 0; i < T.length; i++) {

            T[i] = A[i] + B[i] - C[i];

        }
        // Mostrar el neto a pagar de los enteros
        for (int i = 0; i < T.length; i++) {
            System.out.println("T[" + i + "]= " + T[i]);

        }
        System.out.println("TASK NUMERO 3 ////////");

        /*
         * Dado un arreglo lineal de números, sumar separadamente los números pares y
         * los
         * números impares.
         */

        int[] numeros1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int num : numeros1) {
            if (num % 2 == 0) {
                sumaPares += num;

            } else {
                sumaImpares += num;

            }

        }
        System.out.println("suma de los pares" + sumaPares);
        System.out.println("suma de numeros de Impares" + sumaImpares);

        System.out.println("TASK NUMERO 4 ////////");

        /*
         * Se tienen dos arreglos unidimensionales que guardan las edades de un grupo de
         * personas, se pide hallar el mayor valor.
         */

        // dos ejemplos unidimensionales de edades

        int[] edades1 = { 12, 24, 35, 22, 17 };
        int[] edades2 = { 45, 7, 60, 22, 10 };

        // encontrar el valor mayor de las edades
        int MayorValor = encontrarMayorValor(edades1, edades2);

        // Mostrar resultado
        System.out.println("el mayor valor entre ambos arreglos es: " + MayorValor);

    }

    // funcion que encuentra el mayor resultado entre los dos valores
    public static int encontrarMayorValor(int[] Arreglo1, int[] Arreglo2) {
        int mayor = Integer.MIN_VALUE;

        // recorreremos el primer arreglo
        for (int i = 0; i < Arreglo1.length; i++) {
            if (Arreglo1[i] > mayor) {
                mayor = Arreglo1[i];
            }
        }
        // recorremos el segundo arreglo

        for (int i = 0; i < Arreglo2.length; i++) {
            if (Arreglo2[i] > mayor) {
                mayor = Arreglo2[i];

            }
        }

        return mayor;

/* Se tiene tres arreglos unidimensionales que guardan los precios unitarios (PU) las 
cantidades compradas (CC) y la descripción respectivamente de N productos distintos. 
Se Pide:  */


/*Ejercicio 6 : Una agencia administradora de inmuebles ha decidido guardar en un arreglo lineal de 
n posiciones los alquileres que cobran mensualmente a N viviendas que actualmente 
administran. En otro arreglo de igual número de posiciones guardan los porcentajes de 
ganancia por cada vivienda. Crear un nuevo arreglo con las ganancias por cada 
vivienda */
 
 

    }
  {
    System.out.println("TASK NUMERO 7////////");

    
 /*. Obtener dos arreglos tal que sus elementos sean los números pares y números impares 
del arreglo A de 10 elementos.  */

int[] A = {2, 3, 54, 66, 20, 12, 9, 8, 76, 33};

// Lista para almacenar números pares e impares

int[] pares = new int[A.length];
int [] impares = new int[A.length];
int countpares = 0, countimpares = 0;

//Recorrer el arreglo y separar los números pares e impares
for(int num : A){
    if (num % 2 == 0){
        pares[countpares++]= num;
    }else {
        impares[countimpares++] = num;
    }
}
    pares= Arrays.copyOf(pares, countimpares);
    impares= Arrays.copyOf(impares, countimpares);

System.out.println("números pares: " + Arrays.toString(pares));
System.out.println("números impares: " + Arrays.toString(impares));



System.out.println("TASK NUMERO 8 ////////");

       /*Elaborar un programa que lea 30 números y que imprima el número mayor, menor y 
el número de veces que se repiten ambos.   */

int[] numeros={ 11, 23, 3, 56, 32, 42, 11, 2, 1, 5, 34, 1, 991, 88, 1,  33, 29, 77, 89, 1, 78, 991, 1, 818, 4, 87, 991, 938, 1, 27};
int Mayor  = numeros [0], Menor= numeros[0];
int contadorMayor = 0, contadorMenor = 0;


//Encontrar el mayor y el menor
for(int i = 0; i < numeros.length; i++){
    if(numeros[i]> Mayor){
        Mayor = numeros[i];

    }
    if (numeros[i] < Menor){
        Menor = numeros[i];
    }
}

//Contar cuantas veces aparece el mayor y el menor
for(int num : numeros){
    if(num == Mayor){
     contadorMayor++;
}
    if (num ==  Menor){
        contadorMenor++;
    }
}

System.out.println("El Número Mayor es:" + Mayor + "( y se repite " + contadorMayor + " veces)");
System.out.println("El Número menor es:" + Menor + "(y se repite " + contadorMenor + "  veces)");

System.out.println("TASK NUMERO 9 //////////////////////////////////////////////////////////////////////7");

/*Codifique un programa tal, que dado como entrada un arreglo unidimensional de 
enteros y un número entero, determine cuántas veces se encuentra este número 
dentro del arreglo. */


//entrada del arrreglo unidimencional de enteros

int[] numeros1 ={1, 2, 3, 4, 5, 2, 12,  3, 2};

//buscar el arreglo
int numeroBuscado = 2;

// Utilizamos una variable para contar cuantas veces se encuentra el número en el arreglo
int contador = 0;

for(int num : numeros1 ){
    if(num== numeroBuscado){
    contador++;
    }
}
// Imprimir el resultado en la pantalla
System.out.println("el número " + numeroBuscado +  " aparece " + contador +" veces en el arreglo:)"  );


System.out.println("TASK NUMERO 10//////////////////////////////////////////////////////////////////////7");

/*10  Dado un arreglo A de N elementos se desea crear otro arreglo, tal que cada uno de sus 
elementos sea la suma de los opuestos en el arreglo dado.  
Ejemplo:       
Arreglo dado A = (8,5,3,10,2,8,1)  
Arreglo resultante B=(10,13,5,10)  */


 // Definir el arreglo original A
 int[] Arreglo1 = {8, 5, 3, 10, 2, 8, 1};
 int N = Arreglo1.length;
 
 // Calcular el tamaño del nuevo arreglo B
 int nuevoTamaño = (N + 1) / 2;
 int[] B = new int[nuevoTamaño];
 
 // Llenar el arreglo B con la suma de los opuestos
 for (int i = 0; i < nuevoTamaño; i++) {
     B[i] = A[i] + A[N - 1 - i];
 }
 
 // Imprimir el arreglo resultante B
 System.out.print("Arreglo resultante B: ");
 for (int num : B) {
     System.out.print(num + " ");
 }

 System.out.println("TASK NUMERO 11 //////////////////////////////////////////////////////////////////////");
 /*11 Dado un arreglo A de N elementos se desea generar tres arreglos */
  
     
         // Creación del arreglo de enteros de n elementos
 
         // Declaración del arreglo de tamaño n
         int N1 = (int) (Math.random() * (30 - 15)) + 15;
         int[] a = new int[N1];
 
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


/* 12. Dado un arreglo A de N elementos se quiere generar otro arreglo que contenga las 
posiciones de los elementos del arreglo dado que sean iguales a un valor x dado.  
Ejemplo:  
Arreglo dado A=(4,6,8,2,6,9,6,1)  
X=6  
Arreglo resultante B=(2,5,7) */
 
  
/* 13. Dado un arreglo A de N elementos se desea almacenar los elementos mayores y 
menores que la media, almacenarlos en vectores diferentes.  */

 
    }

}


    



 
