package Clase10;

public class EjecutarBanco {
    public static void main(String[] args) {
        //creacion de los objetos

       
        Cuenta objCuenta =new Cuenta(numeroCuenta: 1000235, saldo: 2345); 
        Cliente objCliente =new Cliente(cedula: 1117234567);

        System.out.println("objcuenta");
        System.out.println("objcliente");
        Banco objBanco = new Banco(id:1, nombre:"Mi primer ahorro", objCuenta);

        System.out.println("objBanco");
        objBanco.mostrarCliente(objCliente);
    }
}
