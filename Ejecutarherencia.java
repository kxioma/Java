public class Ejecutarherencia {
    public static void main(String[] args) {
        
        Pago objpago1= new Efectivo1(1200.0, "lunes", "pago en efectivo ");
        Pago objpago2 = new Tarjetadecredito(610.0, "Marzo 2025", 570860094);

         System.out.println(objpago1. pagar ());  //1440.0
         System.out.println("objpago2.pagar()");//793.0
    }
}
