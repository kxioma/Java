package Clase11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente(" 07102035", "Jerronimo Castillo");

        // Crear fotos
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        List<Foto> fotos = Arrays.asList(foto1, foto2);

        // Crear productos
        Impresion impresion = new Impresion(1, "Color", fotos);
        Camara camara = new Camara(2, "Canon", "EOS 90D");

        // Crear lista de productos
        List<Producto> productos = Arrays.asList(impresion, camara);

        // Crear pedido
        Pedido pedido = new Pedido(cliente, productos, new Date(), 12345678);

        // Mostrar pedido
        pedido.mostrarPedido();
    }
}
