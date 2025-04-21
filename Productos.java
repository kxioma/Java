public class Productos {

    public static void main(String[] args) {

        // Arreglos unidimensionales para precios, cantidades y descripciones.
        double[] PreciosUnitarios = {19.0, 20.0, 7.0}; // Precios de los productos
        int[] CantidadesCompradas = {2, 5, 3}; // Cantidades compradas
        String[] Descripciones = {"salchicha", "pan", "leche"}; // Descripción de productos

        // Crear un arreglo para los totales gastados en cada producto
        double[] TotalesGastados = new double[PreciosUnitarios.length];

        // Calcular el total gastado por producto
        double totalGeneral = 0;
        double mayorGasto = 0;
        String productoMayorGasto = "";

        System.out.println("Información de los productos:");

        for (int i = 0; i < PreciosUnitarios.length; i++) {
            // Calcular total por producto
            TotalesGastados[i] = PreciosUnitarios[i] * CantidadesCompradas[i];
            
            // Calcular el total general
            totalGeneral += TotalesGastados[i];

            // Determinar el producto con mayor gasto
            if (TotalesGastados[i] > mayorGasto) {
                mayorGasto = TotalesGastados[i];
                productoMayorGasto = Descripciones[i];
            }

            // Mostrar la información del producto
            System.out.println("Producto: " + Descripciones[i]);
            System.out.println("Precio Unitario: $" + PreciosUnitarios[i]);
            System.out.println("Cantidad Comprada: " + CantidadesCompradas[i]);
            System.out.println("Total Gasto: $" + TotalesGastados[i]);
            System.out.println();
        }

        // Mostrar el total general de todas las compras
        System.out.println("Total General de todas las compras: $" + totalGeneral);

        // Mostrar el producto con el mayor gasto
        System.out.println("El producto con mayor gasto es: " + productoMayorGasto);
        System.out.println("Total gastado en " + productoMayorGasto + ": $" + mayorGasto);
    }
}
