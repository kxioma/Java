package Clase11;

import java.util.List;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, List<Producto> productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("Pedido de: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        for (Producto p : productos) {
            p.mostrarDetalles(); // <--- POLIMORFISMO AQUÍ
        }
    }
}
