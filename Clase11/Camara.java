package Clase11;

public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Camara #" + numero + " Marca: " + marca + ", Modelo: " + modelo);
    }
}
