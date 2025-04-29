package Clase11;

public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Sobrescritura del método mostrarDetalle
    public void mostrarDetalle() {
        System.out.println("Impresión #" + getNumero() + ", Color: " + color);
     for (Foto f : fotos) {
            f.print(); // Composición: usa objetos Foto
        }
    }
}
