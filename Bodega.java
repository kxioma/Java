public class Bodega extends Equipaje { 
    // Constantes 
    private static final double CAPACIDAD = 8.0; 

    // Constructores 
    public Bodega(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Bodega(double precioBase) {
        super(precioBase);
    }

    public Bodega() {
        super();
    }
   
    // Metodos 
    public double CalcularPrecio(){ 
        // Calculos (
        return getPrecioBase() + (getPeso() * getTamanio() * CAPACIDAD); 
    } 

    public String toString() {
        return "Bodega { peso: " + getPeso() +
               ", tamanio: " + getTamanio() +
               ", precioBase: " + getPrecioBase() +
               ", precio final: " + calcularPrecio() + " }";
    }
}