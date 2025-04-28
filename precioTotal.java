public class precioTotal                       {
    //Atributos
    private double  totalPrecios;
    private double totalBodega;
    private double totalCabina;private Equipaje[] equipaje;



    //Contructores
    public precioTotal (Equipaje[] equipaje){
        this.equipaje=equipaje ;

    }

    //Metodos
    public void calcularTotales(){
        for (Equipaje e: equipaje){
            double precio = e.calcularPrecio();
     totalPrecios = precio;

            if   (e instanceof Bodega){
                totalBodega += precio;
            }else if (e instanceof Cabina){
                totalCabina += precio;
            }

        }
    }

public void mostrarTotales(){
    calcularTotales();
    System.out.println("Total Equipaje" + totalPrecios);
    System.out.println("Total Bodega " + totalBodega );
    System.out.println("Total Cabina" +totalCabina );
}






}
