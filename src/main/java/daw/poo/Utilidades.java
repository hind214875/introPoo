/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Utilidades {

    //constrector
    public Utilidades() {
    }

    //metodos
    public int GeneraEnteroAleatorio(int a, int b) {//una metodo para generar un numero Intero en un rango
        Random rd = new Random();
        int numeroAleatorio;
        if (a > b) {
            numeroAleatorio = rd.nextInt(a - b + 1) + b;
        } else {
            numeroAleatorio = rd.nextInt(b - a + 1) + a;//nextInt(max - min + 1) + min;
        }

        return numeroAleatorio;

    }

    public int leerEnteros() {
        boolean solicitarDatos = true;
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            solicitarDatos = true;
            try {
                // Bloque de código candidato a lanzar la excepción
                System.out.println("Introduce un numero ");
                a = sc.nextInt();
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
        } while (solicitarDatos);
        return a;
    }
}
