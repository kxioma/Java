import java.util.Scanner;

public class BatallaMotos {
    private Moto moto1;
    private Moto moto2;

    public BatallaMotos( Moto m1,  Moto m2) {
        this.moto1 = m1;
        this.moto2 = m2;
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza la batalla entre " + moto1.getNombre() + " y " + moto2.getNombre() + "!");

        while (moto1.estaVivo() && moto2.estaVivo()) {
            turno(moto1, moto2);
            if (moto2.estaVivo()) {
                turno(moto2, moto1);
            }
        }

        if (moto1.estaVivo()) {
            System.out.println(moto1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(moto2.getNombre() + " ha ganado la batalla.");
        }
    }

    private void turno(Moto atacante, Moto defensor) {
        System.out.println("\nTurno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el nombre de la moto 1: ");
    String nombre1 = scanner.nextLine();
    System.out.print("Elige su modelo ( MT/Pulsar): ");
    String modelo1 = scanner.nextLine().toLowerCase();

    Moto m1 = modelo1.equals("MT") ? new MT(nombre1) : new MT(nombre1);

    System.out.print("Introduce el nombre de la moto 2: ");
    String nombre2 = scanner.nextLine();
    System.out.print("Elige su modelo (MT/Pulsar): ");
    String modelo2 = scanner.nextLine().toLowerCase();

    Moto m2 = modelo2.equals("Pulsar") ? new Pulsar(nombre2) : new  Pulsar(nombre2);

    scanner.close(); //  Cierra el recurso

    BatallaMotos batalla = new BatallaMotos(m1, m2);
    batalla.iniciarPelea();
    }
}