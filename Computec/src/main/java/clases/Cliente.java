/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GAMER ARRAX
 */
public class Cliente {
    private int rut;
    private String dv;
    private String nombre;
    private String correo;
    private int telefono;
    private String apellidos;

    public Cliente(int rut, String dv, String nombre, String correo, int telefono, String apellidos) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.apellidos = apellidos;
    }

    public Cliente() {
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", apellidos=" + apellidos + '}';
    }

    

    
    
    
}
