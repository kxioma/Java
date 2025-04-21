public class Task6 {
    public static void main(String[] args) {
        
/*Una agencia administradora de inmuebles ha decidido guardar en un arreglo lineal de 
n posiciones los alquileres que cobran mensualmente a N viviendas que actualmente 
administran. En otro arreglo de igual número de posiciones guardan los porcentajes de 
ganancia por cada vivienda. Crear un nuevo arreglo con las ganancias por cada 
vivienda */

//Definir los alquileres y los porcentajes
double [] alquileres = {2000.0, 400.0, 599.0, 705.5};//alquileres mensuales

double[] porcentajes = {12, 07, 05, 10}; //porcentaje de ganancia

//crear un nuevo arreglo para almacenar las ganancias
double[] ganancias = new double[alquileres.length];

//Calcular las ganancias
for(int i =0; i< ganancias.length; i++) {
    ganancias[i] = (alquileres[i] * porcentajes[i])  / 100; // Formula para calcular la ganancia


}
// Mostrar los resultados
System.out.println(" ganancias por vivienda");
for(int i= 0; i < ganancias.length; i++) {
    System.out.println("Vivienda " + (i + 1) + ": " + ganancias[i]);

}


    }
}
