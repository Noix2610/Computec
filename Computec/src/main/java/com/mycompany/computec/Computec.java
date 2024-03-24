/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computec;

import clases.Cliente;
import clases.Equipo;
import clases.Venta;
import vistas.Principal;
import java.util.ArrayList;
import java.util.List;


public class Computec {
     

    public static void main(String[] args) {
        List<Cliente> listadoClientes = new ArrayList<Cliente>();
        List<Equipo> listaEquipos = new ArrayList<Equipo>();
        List<Venta> listaVentas = new ArrayList<Venta>();
        Principal ventanaInicio = new Principal(listadoClientes, listaEquipos,listaVentas);
    }
}
