package boletin4;

import java.util.Scanner;

public class Boletin4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//4.1
        Ejercicio4_1 obx1 = new Ejercicio4_1();
        int acelerando = sc.nextInt();
        int frenando = sc.nextInt();
        int velocidade = obx1.getVelocidad();
        
        System.out.println("Velocidade= " + velocidade);
        obx1.acelerar(acelerando);
        int velocidade1 = obx1.getVelocidad();
        System.out.println("Velocidade= " + velocidade1);
        obx1.frenar(frenando);
        int velocidade2 = obx1.getVelocidad();
        System.out.println("Velocidade= " + velocidade2);
        
//4.2
       Ejercicio4_2 obx2 = new Ejercicio4_2(24, 35, 34);
        obx2.verPosicion();
        
//4.3
        Ejercicio4_3 obx3 = new Ejercicio4_3(10);
        double area = obx3.calcularArea();
        double longitud = obx3.calcularLongitud();

        System.out.println("El circulo tiene un area de " + area + " y una longitud de " + longitud);
//4.4
        Ejercicio4_4 obx4 = new Ejercicio4_4();
 
}

}
