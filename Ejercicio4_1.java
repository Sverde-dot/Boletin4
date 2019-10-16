package boletin4;

public class Ejercicio4_1 {

    private int velocidad;
//4.1

    public Ejercicio4_1() {
        velocidad = 0;
    }

    public void acelerar(int valor) {
        velocidad = velocidad + valor;
    }

    public void frenar(int menos) {
        velocidad = velocidad - menos;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
