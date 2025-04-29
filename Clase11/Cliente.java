package Clase11;

public class Cliente {
    private String cedula;
    private String nombre;

    // constructor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Get
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}
