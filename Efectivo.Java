Public class Efectivo extends pago{

private String Descripción

public Efectivo (double monto, String fecha, String Descripción){
    super (monto, fecha);
    this.descripcion= descripcion;

}
public double pagar (){
        return monto* 1.20;
}

public  String toString(){
    return "Efectivo {monto: " + monto +
    "fecha: " + fecha +
    "Descripción: " + Descripción + "}";

}
}
