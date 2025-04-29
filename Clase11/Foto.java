package Clase11;

public class Foto {

    private String fichero;// Archivo de la foto

    // constructores
    public Foto(String fichero) {
        this.fichero = fichero;
    }
    // Método para mostrar la foto

    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }

}