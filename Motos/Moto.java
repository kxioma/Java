package Motos;

import java.util.Random;

public class Moto {
    protected String nombre;
    protected int puntosDeVida;
    protected final int MAX_DANO = 30;
    protected final int MIN_DANO = 10;

    public Moto(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    public void atacar(Moto oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(nombre + " muerde a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
