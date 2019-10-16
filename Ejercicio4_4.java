package boletin4;

public class Ejercicio4_4 {

    private String cliente;
    private String cuenta;
    private double interes;
    private double saldo;

    public Ejercicio4_4() {
    }
    public String setClientes(){
        
    }
    public String setCuenta(){
        
    }
    public double setInteres(){
        return interes
    }
    public double setSaldo(){
        return saldo
    }
    
    
    
    public String getCliente(){
        return cliente;
    }
    public String getCuenta(){
        return cuenta;
    }
    public double getInteres(){
        return interes;
    }
    public double getSaldo(double saldo){
        return saldo;
    }


    public void ingresos(double cantidad){
        saldo += cantidad;
    }
    
    public void reintegro(double cantidad){
        saldo -= Math.acos(cantidad);
    }
    //public void transferircuent