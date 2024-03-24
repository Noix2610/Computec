/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author GAMER ARRAX
 */
public class IngresarCliente extends javax.swing.JFrame {

    protected List<Cliente> listaClientes;

    public IngresarCliente(List<Cliente> listaClientes) {
        initComponents();
        this.setTitle("INGRESAR CLIENTE");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.listaClientes = listaClientes;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelRut = new javax.swing.JLabel();
        jLabelDV2 = new javax.swing.JLabel();
        jLabelPnombre = new javax.swing.JLabel();
        jLabelPapellido = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldRut = new javax.swing.JTextField();
        jTextFieldDv = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelDV = new javax.swing.JLabel();
        jLabelCodigoTelefono = new javax.swing.JLabel();
        jButtonVerificarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabelRut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelRut.setText("RUT (SIN DV)");

        jLabelDV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDV2.setText("-");

        jLabelPnombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPnombre.setText("NOMBRE");

        jLabelPapellido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPapellido.setText("APELIIDOS");

        jLabelCorreo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCorreo.setText("CORREO");

        jLabelTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTelefono.setText("TELEFONO");

        jTextFieldApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldRut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldRut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyReleased(evt);
            }
        });

        jTextFieldDv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldDv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldDv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDvKeyReleased(evt);
            }
        });

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
        });

        jButtonIngresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonIngresar.setText("INGRESAR CLIENTE");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimpiar.setText("LIMPIAR TODO");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelDV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDV.setText("DV");

        jLabelCodigoTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCodigoTelefono.setText("+56 9");

        jButtonVerificarCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonVerificarCliente.setText("VERIFICAR CLIENTE");
        jButtonVerificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPapellido)
                    .addComponent(jLabelPnombre)
                    .addComponent(jLabelRut)
                    .addComponent(jLabelCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRut)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTelefono)
                                .addGap(55, 55, 55)
                                .addComponent(jLabelCodigoTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDV2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDV)
                                .addGap(86, 86, 86)
                                .addComponent(jButtonVerificarCliente)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButtonIngresar)
                .addGap(71, 71, 71)
                .addComponent(jButtonLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDV2)
                            .addComponent(jTextFieldDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDV)
                            .addComponent(jButtonVerificarCliente))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefono)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCodigoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRut))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPnombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPapellido))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButtonLimpiar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar() {

        jTextFieldRut.setText("");
        jTextFieldDv.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldTelefono.setText("");
    }
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        Cliente nuevoCliente = new Cliente();
        int rut;
        int telefono;
        
        try {
            telefono = Integer.parseInt(jTextFieldTelefono.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "EL TELEFONO DEBE SER NUMERICO...");
            return;
        }
        
        try {
            rut = Integer.parseInt(jTextFieldRut.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "EL RUT DEBE SER NUMERICO SIN PUNTOS NI GUION...");
            return;
        }
        String dv = jTextFieldDv.getText();
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellidos.getText();

        String correo = jTextFieldCorreo.getText();
        
        if (rut <= 0 || dv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "RUT O DV INVALIDO...");
        } else if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono <= 0) {
            JOptionPane.showMessageDialog(null, "LOS CAMPOS 'PRIMER NOMBRE', 'PRIMER APELLIDO', 'CORREO', O 'TELEFONO', NO PUEDEN QUEDAR VACIOS...");
        } else {
            nuevoCliente.setRut(rut);
            nuevoCliente.setDv(dv);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setCorreo(correo);
            nuevoCliente.setTelefono(telefono);

            listaClientes.add(nuevoCliente);
            
            JOptionPane.showMessageDialog(null, "CLIENTE INGRESADO A LA BASE DE DATOS...");
            
            System.out.println(listaClientes);

        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jTextFieldRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRutKeyReleased
        if (!jTextFieldRut.getText().isEmpty()) {

            String textoActual = jTextFieldRut.getText();
            try {
                int rut = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldRut.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldRutKeyReleased

    private void jTextFieldDvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDvKeyReleased
        if (!jTextFieldDv.getText().isEmpty()) {
            String textoActual = jTextFieldDv.getText();
            String dvString = "K";

            if (textoActual.length() > 1) {
                // Elimina el último carácter de la cadena si su longitud es mayor que 1
                textoActual = textoActual.substring(0, textoActual.length() - 1);
            } else if (textoActual.matches("[a-zA-Z]")) {
                // Entra aquí si la cadena tiene longitud 1 y es una letra
                if (textoActual.equalsIgnoreCase("K")) {
                    // Hacer algo si el carácter es una K (ignorando mayúsculas/minúsculas)
                } else {
                    // Eliminar el carácter si no es una K
                    textoActual = "";
                }
            } else if (textoActual.matches("[0-9]")) {
                // Entra aquí si la cadena tiene longitud 1 y es un número del 0 al 9
                int numero = Integer.parseInt(textoActual);
                if (numero < 0 || numero >= 10) {
                    // Eliminar el carácter si el número no está en el rango deseado
                    textoActual = "";
                }
                // Hacer algo con el número si es necesario
            } else {
                // Aquí puedes manejar otros casos según tus necesidades
            }

            // Actualizar el texto en jTextFieldDv
            jTextFieldDv.setText(textoActual);
        }
    }//GEN-LAST:event_jTextFieldDvKeyReleased

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased
        if (!jTextFieldTelefono.getText().isEmpty()) {
            String textoActual = jTextFieldTelefono.getText();
            try {
                int telefono = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldTelefono.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jButtonVerificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarClienteActionPerformed
        int rut = Integer.parseInt(jTextFieldRut.getText());
        for (Cliente verRut : this.listaClientes) {
            if (verRut.getRut() == rut) {
                JOptionPane.showMessageDialog(null, "EL RUT INGRESADO YA SE ENCUENTRA EN LA BASE DE DATOS...");

            } else {
                JOptionPane.showMessageDialog(null, "NO HAY CLIENTES INGRESADOS CON EL RUT DIGITADO...");
            }
        }
    }//GEN-LAST:event_jButtonVerificarClienteActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonVerificarCliente;
    private javax.swing.JLabel jLabelCodigoTelefono;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDV;
    private javax.swing.JLabel jLabelDV2;
    private javax.swing.JLabel jLabelPapellido;
    private javax.swing.JLabel jLabelPnombre;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDv;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
    private class FondoPanel extends JPanel {

        private String rutaRecurso;
        private Image imagen;

        public FondoPanel(String rutaRecurso) {
            this.rutaRecurso = rutaRecurso;
            URL url = getClass().getResource(rutaRecurso);

            // Verifica la URL
            if (url != null) {
                this.imagen = new ImageIcon(url).getImage();
            }

            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
