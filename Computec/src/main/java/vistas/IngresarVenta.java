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
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IngresarVenta extends javax.swing.JFrame {

    List<Venta> listadoVentas;
    List<Cliente> listadoClientes;
    List<Equipo> listadoEquipos;

    public IngresarVenta(List<Venta> listaVentas, List<Cliente> listadoClientes, List<Equipo> listadoEquipos) {
        initComponents();
        this.setTitle("INGRESAR VENTA");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setVisible(true);
        this.listadoVentas = listaVentas;
        this.listadoEquipos = listadoEquipos;
        this.listadoClientes = listadoClientes;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelRut = new javax.swing.JLabel();
        jTextFieldRut = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelPesos = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButtonIngresarVenta = new javax.swing.JButton();
        jLabelCodTelefono = new javax.swing.JLabel();
        jComboBoxModelos = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabelRut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelRut.setText("RUT CLIENTE");

        jTextFieldRut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldRut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyReleased(evt);
            }
        });

        jButtonBuscarCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonBuscarCliente.setText("BUSCAR CLIENTE");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelNombre.setText("NOMBRE CLIENTE");

        jTextFieldNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTelefono.setText("TELEFONO CLIENTE");

        jTextFieldTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
        });

        jLabelCorreo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCorreo.setText("CORREO CLIENTE");

        jTextFieldCorreo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelPrecio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPrecio.setText("PRECIO EQUIPO");

        jLabelModelo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelModelo.setText("MODELO");

        jTextFieldModelo.setEditable(false);
        jTextFieldModelo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldPrecio.setEditable(false);
        jTextFieldPrecio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyReleased(evt);
            }
        });

        jLabelPesos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPesos.setText("PESOS");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCodigo.setText("CODIGO EQUIPO");

        jLabelTipo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTipo.setText("TIPO EQUIPO");

        jTextFieldTipo.setEditable(false);
        jTextFieldTipo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("LIMPIAR");

        jButtonIngresarVenta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonIngresarVenta.setText("INGRESAR VENTA");
        jButtonIngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarVentaActionPerformed(evt);
            }
        });

        jLabelCodTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCodTelefono.setText("+56 9");

        jComboBoxModelos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GAMER ARRAX", "LAPTOP XZY123", "GAMER A123" }));
        jComboBoxModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModelosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNombre)
                                .addComponent(jLabelRut))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonBuscarCliente))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTelefono)
                                .addComponent(jLabelCorreo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextFieldCorreo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jButton2)
                                            .addGap(141, 141, 141)
                                            .addComponent(jButtonIngresarVenta))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabelCodTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 140, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPesos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCodigo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRut)
                    .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCliente))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodTelefono))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipo)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelModelo)
                    .addComponent(jComboBoxModelos, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesos)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonIngresarVenta))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String obtenerYMostrarFecha() {
        // Obtener la fecha del sistema
        LocalDate fecha = LocalDate.now();

        // Crear un formateador de fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convertir la fecha a String
        String fechaComoString = fecha.format(formato);

        // Imprimir la fecha como String
        return fechaComoString;
    }

    public String obtenerYMostrarHora() {
        // Obtener la hora del sistema
        Date hora = new Date();

        // Crear un formateador de hora
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

        // Convertir la hora a String
        String horaComoString = formato.format(hora);

        // Imprimir la hora como String
        return horaComoString;
    }

    public void limpiar() {
        jTextFieldRut.setText("");
        jTextFieldNombre.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldModelo.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldTipo.setText("");
    }

    public void buscarEquipoCargaDatos(String modelo) {

        for (Equipo buscarEquipo : this.listadoEquipos) {
            if (modelo.equalsIgnoreCase(buscarEquipo.getNombre())) {
                jTextFieldPrecio.setText(Integer.toString(buscarEquipo.getPrecio()));
                jTextFieldModelo.setText(buscarEquipo.getNombre());
                jTextFieldCodigo.setText(buscarEquipo.getCodigoEquipo());
                jTextFieldPrecio.setText(Integer.toString(buscarEquipo.getPrecio()));
                jTextFieldTipo.setText(buscarEquipo.getTipoEquipo());
            }
        }
    }

    public void cargarDatosSegunModeloSeleccionado() {
        String modeloSeleccionado = (String) jComboBoxModelos.getSelectedItem();

        // Lógica para cargar datos en los JTextFields según el modelo seleccionado
        if ("GAMER A123".equalsIgnoreCase(modeloSeleccionado)) {
            buscarEquipoCargaDatos(modeloSeleccionado);

        } else if ("LAPTOP XZY123".equalsIgnoreCase(modeloSeleccionado)) {
            buscarEquipoCargaDatos(modeloSeleccionado);

        } else if ("GAMER ARRAX".equalsIgnoreCase(modeloSeleccionado)) {
            buscarEquipoCargaDatos(modeloSeleccionado);
        }
    }

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        if (!jTextFieldRut.getText().isEmpty()) {

            for (Cliente buscarCliente : listadoClientes) {
                if (buscarCliente.getRut() == Integer.parseInt(jTextFieldRut.getText())) {
                    jTextFieldRut.setText(Integer.toString(buscarCliente.getRut()) + "-" + buscarCliente.getDv());
                    jTextFieldNombre.setText(buscarCliente.getNombre() + " "
                            + buscarCliente.getApellidos());
                    jTextFieldCorreo.setText(buscarCliente.getCorreo());
                    jTextFieldTelefono.setText(Integer.toString(buscarCliente.getTelefono()));
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON CLIENTES CON EL RUT INGRESADO...");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "EL CAMPO RUT CLIENTE NO PUEDE ESTAR VACIO...");
        }
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jTextFieldPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyReleased
        if (!jTextFieldPrecio.getText().isEmpty()) {

            String textoActual = jTextFieldPrecio.getText();
            try {
                int precio = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldPrecio.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldPrecioKeyReleased

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

    private void jButtonIngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarVentaActionPerformed
        Venta nuevaVenta = new Venta();

        if (jTextFieldCodigo.getText().isEmpty() || jTextFieldRut.getText().isEmpty() || jTextFieldNombre.getText().isEmpty()
                || jTextFieldCorreo.getText().isEmpty() || jTextFieldTelefono.getText().isEmpty() || jTextFieldModelo.getText().isEmpty()
                || jTextFieldTipo.getText().isEmpty() || jTextFieldPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NINGUN CAMPO PUEDE ESTAR VACIO...");
        } else {
            String fecha = obtenerYMostrarFecha();
            String hora = obtenerYMostrarHora();
            nuevaVenta.setRutCliente(jTextFieldRut.getText());
            nuevaVenta.setNombreCliente(jTextFieldNombre.getText());
            nuevaVenta.setModelo(jTextFieldModelo.getText() + " " + jTextFieldCodigo.getText());
            nuevaVenta.setCorreoCliente(jTextFieldCorreo.getText());
            nuevaVenta.setPrecio(Integer.parseInt(jTextFieldPrecio.getText()));
            nuevaVenta.setTelefonoCliente(Integer.parseInt(jTextFieldTelefono.getText()));
            nuevaVenta.setTipoEquipo(jTextFieldTipo.getText());
            nuevaVenta.setFecha(fecha);
            nuevaVenta.setHora(hora);

            listadoVentas.add(nuevaVenta);

            JOptionPane.showMessageDialog(null, "VENTA INGRESADA A LA BASE DE DATOS...");
            limpiar();

            System.out.println(listadoVentas);

        }


    }//GEN-LAST:event_jButtonIngresarVentaActionPerformed

    private void jComboBoxModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModelosActionPerformed
        cargarDatosSegunModeloSeleccionado();
    }//GEN-LAST:event_jComboBoxModelosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonIngresarVenta;
    private javax.swing.JComboBox<String> jComboBoxModelos;
    private javax.swing.JLabel jLabelCodTelefono;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPesos;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTipo;
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
