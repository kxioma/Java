package Clase10;

public class EjecutarBanco {
    public static void main(String[] args) {
        //creacion de los objetos

       

        Cuenta objCuenta =new Cuenta(1000235, 2345); 
        Cliente objCliente =new Cliente(1117234567);
        

        System.out.println("objcuenta");
        System.out.println("objcliente");
        Banco objBanco = new Banco(1, "Mi primer ahorro", objCuenta);

        System.out.println("objBanco");
        objBanco.mostrarCliente(objCliente);
    }
}
