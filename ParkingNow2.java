import java.util.Scanner;   

public class ParkingNow2 {  

    public static void main(String[] args) {  // Método principal, punto de entrada del programa
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer datos desde el teclado
        int[] puestos = new int[20];  // Crea un arreglo de 20 posiciones para los puestos de estacionamiento. 0 = libre, 1 = ocupado
        String[] placas = new String[20];  // Arreglo para almacenar las placas de los vehículos (de 20 puestos)
        int[] tiempos = new int[20];  // Arreglo para almacenar el tiempo en minutos de estacionamiento para cada puesto
        int opcion;  // Variable para almacenar la opción seleccionada por el usuario.

        System.out.println("Bienvenido a ParkingNow, Espacio reservado para su comodidad y seguridad");  // Mensaje de bienvenida.

        do {  // Bucle do while que mantiene el menú activo hasta que el usuario elija salir (opción 4)
            System.out.println("Menu Principal ParkingNow: 🏍️");  // Imprime el menú principal
            System.out.println("1. Registrar el Vehiculo");
            System.out.println("2. Retirar Vehiculo");
            System.out.println("3. Mostrar puestos disponibles del parqueadero");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();  // Lee la opción seleccionada por el usuario.
            scanner.nextLine();  // Limpiar el buffer de entrada.

            if (opcion == 1) {  // Si la opción seleccionada es 1 (Registra vehículo)
                System.out.print("Ingrese la placa del vehiculo: ");
                String placa = scanner.nextLine();  // Lee la placa del vehículo.

                // Verifica si la placa ya está registrada en el sistema.
                if (placaRegistrada(placas, placa)) {
                    System.out.println("* Error: La placa " + placa + " ya está registrada en el parqueadero.");
                } else {  // Si la placa no está registrada, se puede proceder con el registro.
                    System.out.print("Ingrese el puesto (1-20): ");
                    int puesto = scanner.nextInt() - 1;  // Lee el número del puesto (resta 1 para tener un índice de arreglo de 0 a 19).
                    scanner.nextLine();  // Limpiar el buffer de entrada.

                    if (puesto >= 0 && puesto < 20) {  // Verifica que el puesto esté dentro del rango válido (1 a 20).
                        if (puestos[puesto] == 0) {  // Verifica si el puesto está libre (0 = libre).
                            puestos[puesto] = 1;  // Marca el puesto como ocupado (1).
                            placas[puesto] = placa;  // Guarda la placa en el puesto correspondiente.
                            System.out.print("Ingrese tiempo en minutos: ");
                            tiempos[puesto] = scanner.nextInt();  // Guarda el tiempo de estacionamiento en minutos.
                            System.out.println("Moto registrada en el puesto " + (puesto + 1));  // Muestra mensaje de confirmación.
                        } else {
                            System.out.println("Ese puesto está ocupado.");  // Si el puesto ya está ocupado, muestra un mensaje de error.
                        }
                    } else {
                        System.out.println("*Puesto inexistente* ");  // Si el puesto no es válido, muestra un mensaje de error.
                    }
                }
            } else if (opcion == 2) {  // Si la opción seleccionada es 2 (Retirar vehículo).
                System.out.print("Ingrese el puesto que va a liberar (1-20): ");
                int puesto = scanner.nextInt() - 1;  // Lee el puesto a liberar (resta 1 para ajustarse al índice de arreglo).

                if (puesto >= 0 && puesto < 20) {  // Verifica que el puesto esté dentro del rango válido (1 a 20).
                    if (puestos[puesto] == 1) {  // Verifica si el puesto está ocupado (1 = ocupado).
                        int tarifa = calcularTarifa(tiempos[puesto]);  // Calcula la tarifa de estacionamiento.
                        System.out.println("Moto con placa " + placas[puesto] + " valor a pagar $" + tarifa);  // Muestra la tarifa a pagar.
                        puestos[puesto] = 0;  // Marca el puesto como libre (0).
                        placas[puesto] = null;  // Borra la placa registrada en ese puesto.
                        tiempos[puesto] = 0;  // Resetea el tiempo de estacionamiento a 0.
                    } else {
                        System.out.println("Ese puesto está disponible.");  // Si el puesto está libre, muestra un mensaje.
                    }
                } else {
                    System.out.println("* Puesto inválido.");  // Si el puesto no es válido, muestra un mensaje de error.
                }
            } else if (opcion == 3) {  // Si la opción seleccionada es 3 (Mostrar puestos disponibles).
                // Imprime los puestos del parqueadero.
                for (int i = 0; i < 20; i++) {
                    System.out.print((puestos[i] == 0 ? "[ ]" : "[*]") + " ");  // Si el puesto está libre (0), imprime "[ ]", si está ocupado (1), imprime "[*]".
                    if ((i + 1) % 5 == 0)  // Después de cada 5 puestos, se hace un salto de línea para mayor legibilidad.
                        System.out.println();
                }
            } else if (opcion != 4) {  // Si la opción no es válida (no es 1, 2, 3 ni 4), muestra un mensaje de error.
                System.out.println("* Opción no válida.");
            }
        } while (opcion != 4);  // El bucle se repite mientras la opción seleccionada no sea 4 (Salir).

        System.out.println("Gracias por usar ParkingNow. ¡Hasta pronto!!");  // Mensaje de despedida cuando el programa termina.
        scanner.close();  // Cierra el objeto Scanner para liberar recursos.
    }

    // Método para calcular la tarifa de estacionamiento.
    public static int calcularTarifa(int tiempo) {
        if (tiempo <= 30)  // Si el tiempo es menor o igual a 30 minutos, la tarifa es gratuita (0).
            return 0;
        if (tiempo <= 60)  // Si el tiempo es menor o igual a 60 minutos, la tarifa es 800.
            return 800;
        return 2000;  // Si el tiempo es mayor a 60 minutos, la tarifa es 2000.
    }

    // Método para verificar si una placa ya está registrada en el sistema.
    public static boolean placaRegistrada(String[] placas, String placa) {
        for (String p : placas) {  // Recorre el arreglo de placas.
            if (p != null && p.equalsIgnoreCase(placa)) {  // Si encuentra una placa que coincide (ignora mayúsculas/minúsculas), devuelve true.
                return true;
            }
        }
        return false;  // Si no se encuentra la placa, devuelve false.
    }
}
