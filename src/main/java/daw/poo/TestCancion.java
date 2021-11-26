/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

/**
 *
 * @author hinda
 */
public class TestCancion {
    public static void main(String[] args) {
        Cancion c1=new Cancion();
        Cancion c2= new Cancion("cancion","autor1");
        
        c1.setAutor("autorC1");
        c2.getAutor();
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
