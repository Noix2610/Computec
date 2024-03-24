/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.Equipo;
import clases.Escritorio;
import clases.Laptop;
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
public class IngresarEquipo extends javax.swing.JFrame {

    protected List<Equipo> listaEquipos;
    FondoPanel fondo;

    public IngresarEquipo(List<Equipo> listaEquipo) {
        initComponents();
        this.setTitle("INGRESAR EQUIPO");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.listaEquipos = listaEquipo;

    }

    public void limpiar() {

        jTextFieldCodigo.setText("");
        jTextFieldCp.setText("");
        jTextFieldDiscoDuro.setText("");
        jTextFieldFPotencia.setText("");
        jTextFieldFactorForma.setText("");
        jTextFieldNombre.setText("");
        jTextFieldPantalla.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldRam.setText("");
        jTextFieldUSB.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelEscritorio = new javax.swing.JLabel();
        jLabelNotebook = new javax.swing.JLabel();
        jRadioButtonEscritorio = new javax.swing.JRadioButton();
        jRadioButtonNotebook = new javax.swing.JRadioButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelCPU = new javax.swing.JLabel();
        jLabelDiscoDuro = new javax.swing.JLabel();
        jLabelRam = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelPotencia = new javax.swing.JLabel();
        jLabelFactorForma = new javax.swing.JLabel();
        jLabelPantalla = new javax.swing.JLabel();
        jLabelUSB = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDiscoDuro = new javax.swing.JTextField();
        jTextFieldCp = new javax.swing.JTextField();
        jTextFieldRam = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldFPotencia = new javax.swing.JTextField();
        jTextFieldFactorForma = new javax.swing.JTextField();
        jTextFieldPantalla = new javax.swing.JTextField();
        jTextFieldUSB = new javax.swing.JTextField();
        jLabelGB = new javax.swing.JLabel();
        jLabelMB = new javax.swing.JLabel();
        jLabelPesos = new javax.swing.JLabel();
        jButtonRegistrarEquipo = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelWatts = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabelEscritorio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelEscritorio.setText("PC ESCRITORIO");

        jLabelNotebook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelNotebook.setText("NOTEBOOK");

        jRadioButtonEscritorio.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonEscritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEscritorioActionPerformed(evt);
            }
        });

        jRadioButtonNotebook.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNotebookActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelNombre.setText("NOMBRE");

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCodigo.setText("CODIGO");

        jLabelCPU.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCPU.setText("CPU");

        jLabelDiscoDuro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDiscoDuro.setText("DISCO DURO");

        jLabelRam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelRam.setText("MEMORIA RAM");

        jLabelPrecio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPrecio.setText("PRECIO");

        jLabelPotencia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPotencia.setText("FUENTE DE PODER(POTENCIA)");

        jLabelFactorForma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelFactorForma.setText("FACTOR FORMA");

        jLabelPantalla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPantalla.setText("TAMAÑO PANTALLA");

        jLabelUSB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelUSB.setText("PUERTOS USB");

        jTextFieldCodigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldDiscoDuro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldDiscoDuro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldDiscoDuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDiscoDuroKeyReleased(evt);
            }
        });

        jTextFieldCp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldRam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldRam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRamKeyReleased(evt);
            }
        });

        jTextFieldPrecio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyReleased(evt);
            }
        });

        jTextFieldFPotencia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldFPotencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldFPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFPotenciaKeyReleased(evt);
            }
        });

        jTextFieldFactorForma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldFactorForma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldPantalla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPantallaKeyReleased(evt);
            }
        });

        jTextFieldUSB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldUSB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldUSB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUSBKeyReleased(evt);
            }
        });

        jLabelGB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelGB.setText("GB");

        jLabelMB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelMB.setText("MB");

        jLabelPesos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPesos.setText("PESOS");

        jButtonRegistrarEquipo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRegistrarEquipo.setText("INGRESAR EQUIPO");
        jButtonRegistrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEquipoActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelWatts.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelWatts.setText("WATTS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("''");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabelEscritorio)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonEscritorio)
                        .addGap(83, 83, 83)
                        .addComponent(jLabelNotebook)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonNotebook))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jLabelCPU)
                                    .addComponent(jLabelDiscoDuro)
                                    .addComponent(jLabelPantalla))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCp)
                                    .addComponent(jTextFieldCodigo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelMB))
                                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2))
                                            .addComponent(jButtonLimpiar))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUSB)
                                            .addComponent(jLabelPotencia)
                                            .addComponent(jLabelFactorForma)
                                            .addComponent(jLabelRam)
                                            .addComponent(jLabelPrecio))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldUSB)
                                            .addComponent(jTextFieldFactorForma)
                                            .addComponent(jTextFieldPrecio)
                                            .addComponent(jTextFieldFPotencia)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldRam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonRegistrarEquipo)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGB)
                            .addComponent(jLabelPesos)
                            .addComponent(jLabelWatts))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEscritorio)
                    .addComponent(jRadioButtonEscritorio)
                    .addComponent(jLabelNotebook)
                    .addComponent(jRadioButtonNotebook))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRam)
                            .addComponent(jTextFieldRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGB))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecio)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPesos)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCodigo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPotencia)
                            .addComponent(jTextFieldFPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWatts)
                            .addComponent(jTextFieldCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPU))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFactorForma)
                            .addComponent(jTextFieldFactorForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelDiscoDuro)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMB))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUSB)
                            .addComponent(jLabelPantalla))
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonRegistrarEquipo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonEscritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEscritorioActionPerformed
        jRadioButtonNotebook.setSelected(false);

        jTextFieldPantalla.setEditable(false);
        jTextFieldUSB.setEditable(false);

        jTextFieldPantalla.setText("");
        jTextFieldUSB.setText("");

        jTextFieldFPotencia.setEditable(true);
        jTextFieldFactorForma.setEditable(true);
    }//GEN-LAST:event_jRadioButtonEscritorioActionPerformed

    private void jRadioButtonNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNotebookActionPerformed
        jRadioButtonEscritorio.setSelected(false);
        jTextFieldPantalla.setEditable(true);
        jTextFieldUSB.setEditable(true);

        jTextFieldFPotencia.setText("");
        jTextFieldFactorForma.setText("");

        jTextFieldFPotencia.setEditable(false);
        jTextFieldFactorForma.setEditable(false);
    }//GEN-LAST:event_jRadioButtonNotebookActionPerformed

    private void jButtonRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEquipoActionPerformed
        Escritorio nuevoPC = new Escritorio();
        Laptop nuevoLaptop = new Laptop();
        int tamanhoDisco = 0;
        int tamanhoPantalla = 0;
        int cantPuertos = 0;
        int potFtePoder = 0;
        String factorForma = "";
        boolean flagNotebook = false;
        boolean flagPC = false;

        try {
            tamanhoDisco = Integer.parseInt(jTextFieldDiscoDuro.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "EL TAMAÑO DEL DISCO DEBE SER NUMERICO EN MB...");
            return;
        }
        String nombre = jTextFieldNombre.getText();
        String codigo = jTextFieldCodigo.getText();
        String cpu = jTextFieldCp.getText();
        int ram;

        try {
            ram = Integer.parseInt(jTextFieldRam.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "MEMORIA RAM DEBE SER NUMERICO EN GB...");
            return;
        }
        int precio;
        try {
            precio = Integer.parseInt(jTextFieldPrecio.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "PRECIO DEBE SER NUMERICO EN PESOS...");
            return;
        }

        if (nombre.isEmpty() || codigo.isEmpty() || ram <= 0 || tamanhoDisco <= 0 || precio <= 0 || cpu.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NINGUN CAMPO PUEDE QUEDAR VACIO...");
        } else {
            if (jRadioButtonEscritorio.isSelected()) {

                if (!jTextFieldFactorForma.getText().isEmpty() || potFtePoder > 0) {
                    factorForma = jTextFieldFactorForma.getText();

                    try {
                        potFtePoder = Integer.parseInt(jTextFieldFPotencia.getText());
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "POTENCIA FUENTE PODER DEBE SER NUMERICO EN WATTS...");
                        return;
                    }

                    nuevoPC.setNombre(nombre);
                    nuevoPC.setCodigoEquipo(codigo);
                    nuevoPC.setRam(ram);
                    nuevoPC.setTamañoDisco(tamanhoDisco);
                    nuevoPC.setPrecio(precio);
                    nuevoPC.setCpu(cpu);
                    nuevoPC.setFactorForma(factorForma);
                    nuevoPC.setPotFuentePoder(potFtePoder);

                    listaEquipos.add(nuevoPC);

                    JOptionPane.showMessageDialog(null, "EQUIPO AGREGADO A LA BASE DE DATOS...");

                } else {
                    JOptionPane.showMessageDialog(null, "LOS CAMPOS POTENCIA FUENTE DE PODER O FACTOR FORMA NO PUEDEN ESTAR VACIOS...");
                    return;
                }

            } else if (jRadioButtonNotebook.isSelected()) {

                try {
                    tamanhoPantalla = Integer.parseInt(jTextFieldPantalla.getText());
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "TAMAÑO PANTALLA DEBE SER NUMERICO EN PULGADAS...");
                    return;
                }

                try {
                    cantPuertos = Integer.parseInt(jTextFieldUSB.getText());
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "CANTIDAD DE PUERTOS USB DEBE SER NUMERICO EN UNIDADES...");
                    return;
                }

                nuevoLaptop.setNombre(nombre);
                nuevoLaptop.setCodigoEquipo(codigo);
                nuevoLaptop.setRam(ram);
                nuevoLaptop.setTamañoDisco(tamanhoDisco);
                nuevoLaptop.setPrecio(precio);
                nuevoLaptop.setCpu(cpu);
                nuevoLaptop.setCantPuertoUSB(cantPuertos);
                nuevoLaptop.setTamañoPantalla(tamanhoPantalla);

                listaEquipos.add(nuevoLaptop);

                JOptionPane.showMessageDialog(null, "EQUIPO AGREGADO A LA BASE DE DATOS...");

            } else {
                JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR AL MENOS UN BOTON DE PC ESCRITORIO O LAPTOP...");
                return;
            }

            System.out.println(listaEquipos);

        }
    }//GEN-LAST:event_jButtonRegistrarEquipoActionPerformed

    private void jTextFieldDiscoDuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDiscoDuroKeyReleased
        if (!jTextFieldDiscoDuro.getText().isEmpty()) {

            String textoActual = jTextFieldDiscoDuro.getText();
            try {
                int discoDuro = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldDiscoDuro.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldDiscoDuroKeyReleased

    private void jTextFieldUSBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUSBKeyReleased
        if (!jTextFieldUSB.getText().isEmpty()) {

            String textoActual = jTextFieldUSB.getText();
            try {
                int usb = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldUSB.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldUSBKeyReleased

    private void jTextFieldPantallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPantallaKeyReleased
        if (!jTextFieldPantalla.getText().isEmpty()) {

            String textoActual = jTextFieldPantalla.getText();
            try {
                int pantalla = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldPantalla.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldPantallaKeyReleased

    private void jTextFieldFPotenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFPotenciaKeyReleased
        if (!jTextFieldFPotencia.getText().isEmpty()) {

            String textoActual = jTextFieldFPotencia.getText();
            try {
                int potencia = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldFPotencia.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldFPotenciaKeyReleased

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

    private void jTextFieldRamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRamKeyReleased
        if (!jTextFieldRam.getText().isEmpty()) {

            String textoActual = jTextFieldRam.getText();
            try {
                int ram = Integer.parseInt(textoActual);

            } catch (NumberFormatException nfe) {
                textoActual = textoActual.substring(0, textoActual.length() - 1);
                jTextFieldRam.setText(textoActual);
            }
        }
    }//GEN-LAST:event_jTextFieldRamKeyReleased

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrarEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCPU;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDiscoDuro;
    private javax.swing.JLabel jLabelEscritorio;
    private javax.swing.JLabel jLabelFactorForma;
    private javax.swing.JLabel jLabelGB;
    private javax.swing.JLabel jLabelMB;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNotebook;
    private javax.swing.JLabel jLabelPantalla;
    private javax.swing.JLabel jLabelPesos;
    private javax.swing.JLabel jLabelPotencia;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRam;
    private javax.swing.JLabel jLabelUSB;
    private javax.swing.JLabel jLabelWatts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEscritorio;
    private javax.swing.JRadioButton jRadioButtonNotebook;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCp;
    private javax.swing.JTextField jTextFieldDiscoDuro;
    private javax.swing.JTextField jTextFieldFPotencia;
    private javax.swing.JTextField jTextFieldFactorForma;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPantalla;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldRam;
    private javax.swing.JTextField jTextFieldUSB;
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
