/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

/**
 *
 * @author hinda
 */
public class testEmpleado {
    public static void main(String[] args) {
        Empleado em1= new Empleado();
        Empleado em2=new Empleado("emp2","apl2","1254k",1000.00,20.00,1.5,10,true,2);
        //System.out.println(em2.toString());
         em2.setIRPF(14);
         em2.setNumeroHijos(1);
         em2.setCasado(true);
         em2.setHorasExtraMes(2);
         em2.setPagoHorasExtras(1);
         em2.complementoHorasExtras();
         em2.CalculoSueldoBruto();
         System.out.println("sueldo Bruto: "+em2.CalculoSueldoBruto());
         System.out.println("IRPF: "+ em2.CalculoIRPF());    
         System.out.println("complemento Horas Extras: "+ em2.complementoHorasExtras());
         em2.escribirAllInfo();
    }
}
