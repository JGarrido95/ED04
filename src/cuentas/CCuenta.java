package cuentas;
/**
 * Clase que describe una cuenta bancaria
 * Permitirá la gestión del nombre del titular, el número de cuenta, el saldo y el tipo de Interés, así como ingresar/retirar dinero
 * @author jorge
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta, inicializa la cuenta sin valores
     */
    public CCuenta(){
    }

    /**
     * Inicializa los atributos de la cuenta con los valores que se proporcionen:
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés = tipo; // Agregamos el constructor de tipoInterés ya que faltaba
    }

    /**
     * Métodos getter/setter:
     * Getter: Obtendrá el nombre/número de cuenta/saldo/tipo de interés (dependiendo del método que usemos)
     * Setter: Establecerá el nombre/número de cuenta/saldo/tipo de interés (dependiendo del método que usemos)
     */
    
        // Creamos los getter/setter para cada atributo:
    
    // Nombre:
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    // Cuenta:
    public String getCuenta() { return cuenta; }
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }
    
    // Saldo:
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    // Tipo de Interés:
    public double getTipoInterés() { return tipoInterés; }
    public void setTipoInterés(double tipoInterés) { this.tipoInterés = tipoInterés; }
    
   /**
    * Nos devolverá el saldo actual de la cuenta
    * @return saldo actual
    */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad de dinero
     * Si la cantidad resulta negativa, lanzará una excepción
     * @param cantidad - Cantidad a ingresar
     * @throws Exception en caso de cantidad negativa
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    
    /**
     * Método para retirar dinero
     * @param cantidad - cantidad a retirar
     * @throws Exception en caso de que el saldo sea insuficiente o la cantidad sea negativa
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
