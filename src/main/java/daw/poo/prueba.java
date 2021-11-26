/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

/**
 *
 * @author hinda
 */
public class prueba {

    public static void main(String[] args) {
        //declaracion del objeto Utilidades
        Utilidades ut = new Utilidades();

        do {
            int max = ut.leerEnteros();
            int min = ut.leerEnteros();
            System.out.println("El numero aleatorio es: " + ut.GeneraEnteroAleatorio(max,min));

        } while (ut.leerEnteros()!= 0);

    }
}
