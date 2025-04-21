// Inicio de la solución 
public class PrecioTotal { 
    // Atributos 
    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;
    private Equipaje[] equipaje;

    // Constructor que recibe un arreglo de Equipajes
    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    // Metodos 
    public void calcularTotales() {
        for (Equipaje e : equipaje) {
            double precio = e.calcularPrecio(); // Calcula el precio del equipaje actual
            totalPrecios += precio; // Suma al total general

            if (e instanceof Bodega) { // Si es de tipo Bodega
                totalBodega += precio;
            } else if (e instanceof Cabina) { // Si es de tipo Cabina
                totalCabina += precio;
            }
        }
    } 

    public void mostrarTotales() { 
        // Calculo de totales 
        calcularTotales(); 
        System.out.println("Total Equipaje " + totalPrecios); 
        System.out.println("Total Bodega " + totalBodega); 
        System.out.println("Total Cabina " + totalCabina); 
    }  
} 
