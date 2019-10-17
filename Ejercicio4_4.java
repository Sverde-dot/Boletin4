package Ejercicio4_4;

public class Ejercicio4_4 {
    String nomeCliente = "";
    String numeroConta = "";
    double interese = 0;
    double saldo = 0;
//  Constructores
    public Ejercicio4_4(){
    
    }
    public Ejercicio4_4(String nomeCliente, String numeroConta, double interese, double saldo){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.interese = interese;
        this.saldo = saldo;
    }
//  Setters
    public void setNome(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setInterese(double interese){
        this.interese = interese;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
// Getters
    public String getNome(){
        return nomeCliente;
    }
    public String getConta(){
        return numeroConta;
    }
    public double getInterese(){
        return interese;
    }
    public double getSaldo(){
        return saldo;
    }
//  Ingreso
    public void ingreso(double cantidad){
        saldo += cantidad;
    }
//  Reintegro
    public void reintegro(double cantidad){
        saldo -= Math.abs(cantidad);
    }
//  Transferencia  
   public void transferencia(Ejercicio4_4 destino, double cantidad){
       saldo -= Math.abs(cantidad);
       destino.setSaldo(destino.getSaldo() - cantidad);
   }
}

