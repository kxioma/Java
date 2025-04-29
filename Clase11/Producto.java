package Clase11;

public abstract class Producto {

    private int numero;// Atributo privado

    public Producto(int numero) {
        this.numero = numero;
    }

    // Método público para obtener el número
    public int getNumero() {
        return numero;
    }
    // Método abstracto que será implementado en las subclases

    public abstract void mostrarDetalle();

}
