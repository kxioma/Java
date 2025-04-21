public class task12 {
    public static void main(String[] args) {
        
    
     // Definir el arreglo original A
     int[] A = {4, 6, 8, 2, 6, 9, 6, 1};
     int X = 6; // Número a buscar
     
     // Contar cuántas veces aparece X para determinar el tamaño de B
     int contador = 0;
     for (int num : A) {
         if (num == X) {
             contador++;
         }
     }
     
     // Crear el arreglo B con las posiciones donde aparece X
     int[] B = new int[contador];
     int index = 0;
     for (int i = 0; i < A.length; i++) {
         if (A[i] == X) {
             B[index++] = i + 1; // Guardamos la posición (comenzando desde 1)
         }
     }
     
     // Imprimir el arreglo resultante B
     System.out.print("Arreglo resultante B: ");
     for (int pos : B) {
         System.out.print(pos + " ");
     }
}
}