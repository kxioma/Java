public class Cabina extends Equipaje {
    // Constantes
    private final static int TIEMPO = 2;

    // Constructores
    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }   

    public Cabina() {
        super();
    }

    // Metodos
    public double calcularPrecio() {
        // Calculos
        return getPrecioBase() + (getPeso() * getTamanio() * TIEMPO);
    }

    public String toString() {
        return "cabina { peso: " + getPeso() +
                ", tamanio: " + getTamanio() +
                ", precioBase: " + getPrecioBase() +
                ", precio final: " + calcularPrecio() + " }";
    }
}
