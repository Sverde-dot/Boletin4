package boletin4;

public class Ejercicio4_3 {

    private double radio;
    private final double pi = 3.14;
    private double area;
    private double longitud;

    public Ejercicio4_3() {
    }

    public Ejercicio4_3(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        area = Math.pow(radio, radio);
        return area;
    }

    public double calcularLongitud() {
        longitud = 2 * pi * radio;
        return longitud;
    }

    public double setRadio() {
        return radio;
    }
}
