public class Sumanummeros {
    public static void main(String[] args){
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumaPares = 0;
        int sumaImpares = 0;

    for (int num : numeros){
        if( num % 2 == 0){
        sumaPares += num;

    } else  {
    sumaImpares += num;



}

 }
System.out.println("suma de los pares" + sumaPares);
System.out.println("suma de numeros de Impares" + sumaImpares);
}
}