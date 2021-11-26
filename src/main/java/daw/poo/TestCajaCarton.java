/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

/**
 *
 * @author hinda
 */
public class TestCajaCarton {
    public static void main(String[] args) {
        //creacion y intialization de dos objetos de tipo CajaCarton
        CajaCarton cajaGrande=new CajaCarton(250,400,500,200);
        CajaCarton cajaChica=new CajaCarton(25,30,15,17);
        
        //muestrar los datos del objetos usando getters
        System.out.println("datos del objeto CajaGrande ancho: "+cajaGrande.getAncho()
                            +" alto: "+cajaGrande.getAlto()+" largo: "+cajaGrande.getLargo()
                            +" peso: "+cajaGrande.getPeso());
        
        System.out.println("datos del objeto CajaChica ancho: "+cajaChica.getAncho()
                            +" alto: "+cajaChica.getAlto()+" largo: "+cajaChica.getLargo()
                            +" peso: "+cajaChica.getPeso());
    }
}
