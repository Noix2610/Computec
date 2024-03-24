/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.Cliente;
import clases.Equipo;
import clases.Venta;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    protected List<Cliente> listaClientes;
    protected List<Equipo> listaEquipos;
    protected List<Venta> listaVentas;

    public Principal(List<Cliente> listadoClientes, List<Equipo> listaEquipos, List<Venta> listaVentas) {
        initComponents();
        this.setTitle("COMPUTEC");
        this.setLocationRelativeTo(null);
        this.listaClientes = listadoClientes;
        this.listaEquipos = listaEquipos;
        this.listaVentas = listaVentas;
        

        this.setVisible(true);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemIngresarCliente = new javax.swing.JMenuItem();
        jMenuItemIngresarEquipo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemIngresarVenta = new javax.swing.JMenuItem();
        jMenuItemReporteVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("EQUIPOS INFORMÁTICOS PARA TODOS");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setText("COMPUTEC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu1.setText("Ingresos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemIngresarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIngresarCliente.setText("INGRESAR CLIENTE");
        jMenuItemIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemIngresarCliente);

        jMenuItemIngresarEquipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIngresarEquipo.setText("INGRESAR EQUIPO");
        jMenuItemIngresarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresarEquipoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemIngresarEquipo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ventas");

        jMenuItemIngresarVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIngresarVenta.setText("INGRESAR VENTA");
        jMenuItemIngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemIngresarVenta);

        jMenuItemReporteVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemReporteVentas.setText("VER REPORTE DE VENTAS");
        jMenuItemReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReporteVentasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemReporteVentas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresarClienteActionPerformed
        IngresarCliente ventanacliente = new IngresarCliente(this.listaClientes);

    }//GEN-LAST:event_jMenuItemIngresarClienteActionPerformed

    private void jMenuItemIngresarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresarEquipoActionPerformed
        IngresarEquipo ventanaEquipo = new IngresarEquipo(this.listaEquipos);

    }//GEN-LAST:event_jMenuItemIngresarEquipoActionPerformed

    private void jMenuItemIngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresarVentaActionPerformed
        IngresarVenta pantallaVentas = new IngresarVenta(this.listaVentas, this.listaClientes, this.listaEquipos);

    }//GEN-LAST:event_jMenuItemIngresarVentaActionPerformed

    private void jMenuItemReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReporteVentasActionPerformed
        ReporteVentas pantallaReporte = new ReporteVentas(this.listaVentas);

    }//GEN-LAST:event_jMenuItemReporteVentasActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemIngresarCliente;
    private javax.swing.JMenuItem jMenuItemIngresarEquipo;
    private javax.swing.JMenuItem jMenuItemIngresarVenta;
    private javax.swing.JMenuItem jMenuItemReporteVentas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
public class FondoPanel extends JPanel {
    private Image imagenFondo;

    public FondoPanel(String rutaImagen) {
        this.imagenFondo = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
    }
}

}
