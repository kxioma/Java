public class totalEquipaje {

    //constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;

    //Atributos
    private double peso;
    private double tamanio;
    private double precioBase;

    //Contructores
    public totalEquipaje(double peso, double tamanio){
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE;
    }

}