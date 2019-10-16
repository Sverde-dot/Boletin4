package boletin4;

public class Ejercicio4_2 {

    private double meridiano;
    private double paralelo;
    private double distanciaTierra;

    public Ejercicio4_2() {

        meridiano = paralelo = distanciaTierra = 0;
    }

    public Ejercicio4_2(double meridiano, double paralelo, double distanciaTierra) {

        this.meridiano=meridiano;
        this.paralelo=paralelo;
        this.distanciaTierra=distanciaTierra;

    }

    public void verPosicion() {

        System.out.println("El satelite se situa en el paralelo " + paralelo + ", meridiano " + meridiano + ", y a una distancia de la terra " + distanciaTierra);

    }
}
