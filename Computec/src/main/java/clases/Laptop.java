/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GAMER ARRAX
 */
public class Laptop extends Equipo{
    private int tamañoPantalla;
    private int cantPuertoUSB;

    public Laptop(int tamañoPantalla, int cantPuertoUSB) {
        this.tamañoPantalla = tamañoPantalla;
        this.cantPuertoUSB = cantPuertoUSB;
    }

    public Laptop(int tamañoPantalla, int cantPuertoUSB, String nombre, String tipoEquipo, String tipoPeso, String codigoEquipo, String cpu, int tamañoDisco, int ram, int precio) {
        super(nombre, tipoEquipo, codigoEquipo, cpu, tamañoDisco, ram, precio);
        this.tamañoPantalla = tamañoPantalla;
        this.cantPuertoUSB = cantPuertoUSB;
    }

    public Laptop() {
        this.setTipoEquipo("Laptop");
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getCantPuertoUSB() {
        return cantPuertoUSB;
    }

    public void setCantPuertoUSB(int cantPuertoUSB) {
        this.cantPuertoUSB = cantPuertoUSB;
    }

    @Override
    public String toString() {
        return super.toString() + "tama\u00f1oPantalla=" + tamañoPantalla + ", cantPuertoUSB=" + cantPuertoUSB;
    }
    
    
    
}
