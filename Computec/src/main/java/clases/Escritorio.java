/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GAMER ARRAX
 */
public class Escritorio extends Equipo {
    private int potFuentePoder;
    private String factorForma;

    public Escritorio(int potFuentePoder, String factorForma, String nombre, String tipoEquipo, String tipoPeso, String codigoEquipo, String cpu, int tamañoDisco, int ram, int precio) {
        super(nombre, tipoEquipo, codigoEquipo, cpu, tamañoDisco, ram, precio);
        this.potFuentePoder = potFuentePoder;
        this.factorForma = factorForma;
    }

    public Escritorio() {
        this.setTipoEquipo("PC Escritorio");
    }

    public int getPotFuentePoder() {
        return potFuentePoder;
    }

    public void setPotFuentePoder(int potFuentePoder) {
        this.potFuentePoder = potFuentePoder;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }

    @Override
    public String toString() {
        return super.toString() + "potFuentePoder=" + potFuentePoder + ", factorForma=" + factorForma ;
    }
    
    
}
