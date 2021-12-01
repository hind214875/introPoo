/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

/**
 *
 * @author hinda
 */
public class Empleado {

   //Attributos
    private String nombre, apellidos, nif;
    private double sueldoBase, pagoHorasExtras, horasExtraMes;//horasExtra entre 10 y 25
    private int IRPF, numeroHijos;//condicion
    private boolean casado;//o no 

    //constrector por defecto
    public Empleado() {
    }

    //constrector parametrizado
    public Empleado(String nombre, String apellidos, String NIF, double sueldoBase,
            double pagoHorasExtras, double horasExtraMes, int IRPF, boolean casado, int numeroHijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = NIF;
        this.sueldoBase = sueldoBase;
        if (pagoHorasExtras < 10 || pagoHorasExtras > 25) {
            throw new IllegalArgumentException("Pago por horas extras fuera del rango");
        }
        this.pagoHorasExtras = pagoHorasExtras;
        this.horasExtraMes = horasExtraMes;
        this.IRPF = 20;
        if (IRPF > 1 && IRPF < 20) {
            this.IRPF = IRPF;
        }
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return nif;
    }

    public void setNIF(String NIF) {
        this.nif = NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHorasExtras() {
        return pagoHorasExtras;
    }

    public void setPagoHorasExtras(double pagoHorasExtras) {
        if (this.pagoHorasExtras < 10 || this.pagoHorasExtras > 25) {
            throw new IllegalArgumentException("Pago por horas extras fuera del rango");
        }
        this.pagoHorasExtras = pagoHorasExtras;
    }

    public double getHorasExtraMes() {
        return horasExtraMes;
    }

    public void setHorasExtraMes(double horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public int getIRPF() {
        return IRPF;
    }

    public void setIRPF(int IRPF) {
        this.IRPF = 20;
        if (IRPF > 1 && IRPF < 20) {//si el IRPF no es dentro del rango su valor es 20 por defecto
            this.IRPF = IRPF;
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    //Tostring
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos
                + ", NIF=" + nif + ", sueldoBase=" + sueldoBase
                + ", pagoHorasExtras=" + pagoHorasExtras + ", horasExtraMes=" + horasExtraMes
                + ", IRPF=" + IRPF + ", casado=" + casado + ", numeroHijos=" + numeroHijos + '}';
    }

    //metodos
    public double complementoHorasExtras() {
        return this.getHorasExtraMes() * this.getPagoHorasExtras();
    }

    public double CalculoSueldoBruto() {
        return sueldoBase + complementoHorasExtras();
    }

    public double CalculoIRPF() {
        double irpf = this.getIRPF();
        //
        if (this.getNumeroHijos() > 0) {
            irpf -=this.getNumeroHijos();
        } else if (this.isCasado()) {
            irpf -= 2;
        }
        else{ 
             if(this.isCasado()) {
                 irpf -= 2;
             }
        }
        
        return ((irpf*CalculoSueldoBruto())/100);

    }

    public double sueldoNeto() {
        return CalculoSueldoBruto() - CalculoIRPF();
    }

    public void escribirBasicInfo() {
        String casado;
        if (this.isCasado()) {
            casado = "Casado";
        } else {
            casado = "no Casado";
        }

        System.out.println("-----Info Basica--------"
                + "\n  El nombre es: " + this.getNombre()
                + "\n  apellidos: " + this.getApellidos()
                + "\n  NIF: " + this.getNIF()
                + "\n  estado civil: " + casado
                + "\n  numero de hijos: " + this.getNumeroHijos()
                + "\n  Horas extras al mes: " + this.horasExtraMes);

    }

    public void escribirAllInfo() {
        escribirBasicInfo();
        System.out.println("-----All Info------"
                + "\n sueldo base : " + this.getSueldoBase()
                + "\n complemento por horas extra: " + this.complementoHorasExtras()
                + "\n el sueldo bruto: " + this.CalculoSueldoBruto()
                + "\n IRPF: " + this.CalculoIRPF() 
                + "\n el sueldo neto:" + this.sueldoNeto());
    }
}
