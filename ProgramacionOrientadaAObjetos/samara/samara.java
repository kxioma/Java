public class samara {
    public class  Ejercicio1{
        public static void main (String[] args ){
            
            /*
            *primeraforma de declarar un arreglo 
            *int[] a={8,3,10,22,1,9};
            *
            *sgunda forma de declarar un arreglo
            *int[] a= new int[6];
            *El número hace refencia al tamaño del arreglo
            *tendremos que arreglarlo
            */
            
           int[] a={8,3,10,22,1,9};
           for (int i = 0; i < a. length;i ++){
               System.out.println("a["+i + ")=" + a [i]);}
           }
        
        
        
        //------------------------------------------
        int n = 5;
        int[] b =new int [n];
        //Estructura para llenar el arreglo con números aleatorios 
        //entre 10 y 30
        
        for (int i = 0; i < b.length; i++) { 
        b[i] = (int) (Math.random() * (30+10)) + 10;
        }
        //mostrar los elementos del arreglo de b
        for (int i = 0; i < b.length; i++) { 
            System.out.println("b[" + i +"]=" + b[i]);
        
            }
        
        // Sumar los elementos del arreglo
        int suma = 0;
            for (int i = 0; i < b.length; i++) {
                suma = suma + b[i]; 
         } 
}
