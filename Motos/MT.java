package Motos;

import java.util.Random;

public class MT extends Moto {
    public MT(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Moto oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        System.out.println(nombre + " (MT) Ataca fuertemente con un humo toxico a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
}