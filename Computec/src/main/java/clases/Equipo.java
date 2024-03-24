/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GAMER ARRAX
 */
public abstract class Equipo {
    private String nombre, tipoEquipo, codigoEquipo,cpu;
    private int tamanhoDisco;
    private int ram;
    private int precio;

    public Equipo() {
    }

    public Equipo(String nombre, String tipoEquipo, String codigoEquipo, String cpu, int tamanhoDisco, int ram, int precio) {
        this.nombre = nombre;
        this.tipoEquipo = tipoEquipo;
        this.codigoEquipo = codigoEquipo;
        this.cpu = cpu;
        this.tamanhoDisco = tamanhoDisco;
        this.ram = ram;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getTamañoDisco() {
        return tamanhoDisco;
    }

    public void setTamañoDisco(int tamañoDisco) {
        this.tamanhoDisco = tamañoDisco;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", tipoEquipo=" + tipoEquipo + ", codigoEquipo=" + codigoEquipo + ", cpu=" + cpu + ", tama\u00f1oDisco=" + tamanhoDisco + ", ram=" + ram + ", precio=" + precio + '}';
    }
    
    
    
}
