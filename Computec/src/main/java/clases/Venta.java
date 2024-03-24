/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GAMER ARRAX
 */
public class Venta {
    String rutCliente, nombreCliente, correoCliente;
    int telefonoCliente, precio;   
    String modelo;
    String tipoEquipo;
    String fecha;
    String hora;

    public Venta() {
    }

    public Venta(String rutCliente, String nombreCliente, String correoCliente, int telefonoCliente, int precio, String modelo, String tipoEquipo, String fecha, String hora) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.precio = precio;
        this.modelo = modelo;
        this.tipoEquipo = tipoEquipo;
        this.fecha = fecha;
        this.hora = hora;
    }

    

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Venta{" + "rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", correoCliente=" + correoCliente + ", telefonoCliente=" + telefonoCliente + ", precio=" + precio + ", modelo=" + modelo + ", tipoEquipo=" + tipoEquipo + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    

    
    
    
    
}
