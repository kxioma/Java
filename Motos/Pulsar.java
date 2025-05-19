<<<<<<< HEAD
package Motos;

=======
>>>>>>> origin
import java.util.Random;

public class Pulsar extends Moto {

    public Pulsar(String nombre) {
        super(nombre); // Llama al constructor de la Moto
    }

    @Override
    public void atacar(Moto oponente) {
<<<<<<< HEAD
        int bonificacion = 10; // daño extra por una Kawasaki
=======
        int bonificacion = 10; // daño extra por ser un T-Rex
>>>>>>> origin
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + bonificacion;
        oponente.recibirDano(dano);
        System.out.println(nombre + " (Pulsar) Le da un bloque de fuerza a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}