/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.poo;

/**
 * syntaxis de la clase 1º Atributos,campos,propiedades 2º Metodos 3º
 * Constrectores 4º Getters Setters 5º Tostring va a preguntar:
 * -Implicacion(motivo) public y private en los miembros(atributos y metodos de
 * una clase) -Encapsulamiento -constructores sobrecargados( Igual
 * nombre,distintos parametros)
 */
public class Cafetera {
    //Atributtos,campos,propiedades

    private double capacidadMaxima;
    private double cantidadActual;

    //constrector sin parametros
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;

    }

    //constrector con parametros 
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima < 10) {
            this.capacidadMaxima = 10;
        }
        //this.capacidadMaxima = Math.abs(capacidadMaxima);//si la capacidadMaxima negativa pasa a positiva
        this.cantidadActual = this.capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.abs(cantidadActual);

        if (this.capacidadMaxima < 10) {
            this.capacidadMaxima = 10;
        }
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    //metodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(double cantidadAServir) {
        double cantidadPositiva = Math.abs(cantidadAServir);//pongo la cantidad positiva     
        if (cantidadPositiva > this.cantidadActual) {// servir cantidadActual si cntServir > cantidad actual
            vaciarCafetera();
        } else {
            this.cantidadActual -= cantidadPositiva;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(double cantidadAgregar) {
        double cantidadAgregarPositive = Math.abs(cantidadAgregar);
        this.capacidadMaxima=this.capacidadMaxima;
        this.cantidadActual=this.cantidadActual;
        
        if (cantidadAgregarPositive > this.capacidadMaxima || (this.cantidadActual+cantidadAgregarPositive)>this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual += cantidadAgregarPositive;
        }
    }

    //getters 
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    //toString
    @Override
    public String toString() {
        return "capacidad Maxima de Cafeteria es: " + capacidadMaxima + " y cantidadActual es: " + cantidadActual;
    }

}
