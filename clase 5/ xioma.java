 import java.util.Scanner;

public class ParkingNow {
        public static void main(String[] args) {
            Scanner Scanner = new  Scanner(System.in);// nos deja leer los datos ingresados por el (usuario)

            int[] puestos = new int[20]; // arreglo me permite alamcenar si un puesto esta libre (0) u ocupado(1)
            String[]  placas  = new String[20]; //arreglo para guardar las placas de los vehiculos estacionados
            int[] tiempo = new  int[20]; // arreglo para almacenar el tiempo de estacionamiento en minutos
            int opcion;

            //Entrada de bienvenida a el Usuario
            System.out.println( "Bienvenido a ParkingNow, Espacio reservado para su comodidad y seguridad");
        
            do{
                //Menú de opciones
                System.out.println("Menu Principal ParkingNow: 🏍️");
                System.out.println("1. Registrar el Vehiculo");
                System.out.println("2. Retirar el vehiculo");
                System.out.println("3.Mostrar puestos disponibles del parqueadero");
                System.out.println("Salir");
                System.out.println("Elija una opción, amable usuario:");
                opcion = Scanner.nextInt();
                Scanner.nextLine();//Después de leer un número con Scanner, es importante limpiar cualquier dato extra que haya quedado en la entrada para evitar problemas en futuras lecturas.

                if (opcion ==1) { // Registrar el Vehiculo
                  System.out.println("Ingrese la placa del Vehiculo: ");
                  String placa = Scanner.nextLine(); //Leer la placa ingresada

                  if(placaReagistrada(placas, placa)) { //Verificar si la placa ya esta registrada
                    System.out.println("*Error: La placa"  + placa + " ya esta registrada en el parqueadero.");



                  }else {
                    System.out.println("Ingrese el puesto que desea ocupar (1,20): ");
                    Scanner.nextLine(); //Después de leer un número con Scanner, es importante limpiar cualquier dato extra que haya quedado en la entrada para evitar problemas en futuras lecturas.
                        
                    if(Puesto >= 0 && puesto < 20) { // Validar que el puesto en un puesto permitido (Rango)
                        if (puestos [puesto] == 0 ){ //Verificar si el puesto esta libre
                            puestos[puesto] = 1;// Marcar puesto como ocupado
                            Placas [puesto] = placa; //  guardar la placa en el puesto correspondido
                           System.out.println("Ingrese el tiempo en minutos: ");
                           tiempos[puesto] =Scanner.nextInt(); //Guardar el tiempo de estacionamiento

                           System.out.println("Vehiculo registrado en el puesto" + (puesto + 1));



                        }else {+
                             System.out.println(" *Este puesto está ocupado* ");//Mensaje si  el puesto no se encuentra disponible
                        }

                    } else{
                        System.out.println("*Puesto inexixtente*"); //Mensaje si el puesto no es valido

                    }


                  }
                } else if (opcion == 2) { //Retirar el vehiculo
                    System.out.println("Ingrese el puesto que va a liberar (1,20):");
                     int puesto = Scanner.nextInt() - 1; // Ajustar indicepara acceder al arreglo
                    
                     
                     if (puesto >= 0 && puesto < 20) { //Verificar si el puesto que el usuario va a ocupar sea valido

                        if (puestos [ puesto ] == 1 ){//Verificar si esta ocupado
                            int tarifa = caldularTarifa(tiempos[puesto]); //calcular la tarifa según el tiempo de uso
                            System.out.println("Moto con placa " + placas[puesto] + "Valor a pagar $" + tarifa);
                            puestos[puesto] =0; //Liberar el puesto
                            placas[puesto] = null;// eliminar la placa registrada
                            tiempo[puesto] = 0; //Reiniciar el tiempo de estacionamiento

                        } else {
                            System.out.println("Ese puesto está disponible. ");
                        }



                     }

                     }

                }
                

            
            }
        }    
}
