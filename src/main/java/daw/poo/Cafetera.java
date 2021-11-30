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
public class Cafetera {
    //Atributtos
    private double capacidadMaxima;
    private double cantidadActual;
    
    //constrector sin parametros

    public Cafetera() {
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
                
    }
    //constrector con parametros sss
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual=capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        if(cantidadActual>this.capacidadMaxima){
            this.cantidadActual=this.capacidadMaxima;
        }
    }
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    public void servirTaza(double cantidadAServir){
        if(cantidadAServir>this.cantidadActual){
            cantidadAServir=this.cantidadActual;
        }else{
            this.cantidadActual-=cantidadAServir;
        }
    }
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    public void agregarCafe(double cantidadAgregar){
        if(this.cantidadActual<this.capacidadMaxima && cantidadAgregar<=(this.capacidadMaxima-this.cantidadActual)){
            this.cantidadActual+=cantidadAgregar;
        }else{
            throw new IllegalArgumentException("no se puede");
        }
    }
}