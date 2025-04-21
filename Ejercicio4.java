public class Ejercicio4 {
    public static void main(String[] args) {
        
        int[] edades1 = {12, 24, 35, 22,17};
        int[] edades2 = {45, 7, 60, 22, 10 };

 // encontrar el valor mayor de las edades
 int MayorValor = encontrarMayorValor(edades1, edades2);

//Mostrar resultado
 System.out.println("el mayor valor entre ambos arreglos es: " + MayorValor );


}
//funcion que encuentra el mayor resultado entre los dos valores
public static int encontrarMayorValor(int[] Arreglo1, int[] Arreglo2){
    int mayor = Integer.MIN_VALUE;

    //recorreremos el primer arreglo
    for (int i = 0; i< Arreglo1.length; i++) {
        if(Arreglo1[i] > mayor){
                mayor= Arreglo1[i];
        }
    }
    //recorremos el segundo arreglo


    for (int i = 0; i< Arreglo2.length; i++) {
         if(Arreglo2[i] > mayor){
            mayor = Arreglo2[i];

        
            

         }
        }

    return mayor;
}

}


 
       