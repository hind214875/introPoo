/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.poo;

/**
 *
 * @author hinda
 */
public class TestCafetera {
    public static void main(String[] args) {
        Cafetera c1=new Cafetera(100,300);
//        c1.llenarCafetera();
        System.out.println(c1.getCantidadActual());
        System.out.println(c1.getCapacidadMaxima());
        c1.servirTaza(20);
        System.out.println("Cantidad Actual: "+c1.getCantidadActual());
        System.out.println("Capacidad Maxima: "+c1.getCapacidadMaxima());
        c1.servirTaza(80);
        System.out.println("Cantidad Actual: "+c1.getCantidadActual());
        System.out.println("Capacidad Maxima: "+c1.getCapacidadMaxima());
        c1.servirTaza(20);
       System.out.println("Cantidad Actual: "+c1.getCantidadActual());
    }
}
