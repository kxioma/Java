package Clase11;

import java.util.List;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;

    public Impresion(int numero, String color, List<Foto> fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + " en color: " + color);
        for (Foto foto : fotos) {
            foto.print();
        }
    }
}
