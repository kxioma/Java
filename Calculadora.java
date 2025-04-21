import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            // Menú de Opciones para el usuario:
            System.out.println("Calculadora Cíentifica Industrias calderón: ");
            System.out.println("1. suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencía");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. seno");
            System.out.println("8. Coseno ");
            System.out.println("9. Tangente ");
            System.out.println("10. Salir ");
            System.out.println("Selecione una opción: ");

            opcion = Scanner.nextInt(); // Leer la opción del usuario
            if (opcion == 10) {
                System.out.println("Saliendo de  la calculadora");
                break;
            }

            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Ingrese el primer número porfavor: ");
                int num1 = Scanner.nextInt();

                System.out.println("Ingrese el segundo número porfavor: ");
                int num2 = Scanner.nextInt();
                int resultado = 0;

                if (opcion == 1) {
                    resultado = num1 + num2;
                } else if (opcion == 2) {
                    resultado = num1 - num2;
                } else if (opcion == 3) {
                    resultado = num1 * num2;
                }
                System.out.println("El resultado es: " + resultado);

            } else if (opcion == 4 || opcion == 5) {// operaciones con posibles resultados decimales(la división y
                                                    // potencia)
                System.out.println("Ingrese el primer número porfavor: ");
                double num1 = Scanner.nextDouble();
                System.out.println("Ingrese el segundo número porfavor :");
                double num2 = Scanner.nextDouble();
                double resultado = 0;

                if (opcion == 4) {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error División por cero ❌");
                        continue;
                    }
                } else if (opcion == 5) {
                    resultado = Math.pow(num1, num2);
                }

                System.out.println("El resultado es: " + resultado);

            } else if (opcion >= 6 && opcion <= 9) {
                System.out.println("Ingrese un número: ");
                double num1 = Scanner.nextDouble();
                double resultado = 0;

                if (opcion == 6) {
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                    } else {
                        System.out.println("Error no se puede calcular la raiz cuadrada de un número negativo ❌");
                        continue;
                    }
                } else if (opcion == 7) {
                    resultado = Math.sin(Math.toRadians(num1));
                } else if (opcion == 8) {
                    resultado = Math.cos(Math.toRadians(num1));
                } else if (opcion == 9) {
                    resultado = Math.tan(Math.toRadians(num1));
                }
                System.out.println(" El resultado es " + resultado);
            } else {
                System.out.println("Opción no valida");

            }

        }
        Scanner.close();
    }

}
