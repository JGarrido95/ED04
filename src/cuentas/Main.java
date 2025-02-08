package cuentas;

public class Main {

    public static void main(String[] args) {
        // Actualizaremos el llamado a operativa_cuenta, creando un float cantidadOperacion para hacer más sencilla la modificación futura del código
        float cantidadOperacion = 500;
        operativa_cuenta(cantidadOperacion); // Llamado al método operativa_cuenta
    }
    
    // Creamos el nuevo método operativa_cuenta, donde quedarán todas las operaciones con cuenta1 que anteriormente estaban directamente dentro del método main
    public static void operativa_cuenta(float cantidad) { // Añadimos float cantidad como parámetro a operativa_cuenta
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

    // Tanto en retirar como ingresar sustituiremos las cantidades por "cantidad"    
        
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
