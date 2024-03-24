/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.Venta;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author GAMER ARRAX
 */
public class ReporteVentas extends javax.swing.JFrame {

    List<Venta> listadoVentas;
    private TableRowSorter trs;
    private DefaultTableModel modelo;


    public ReporteVentas(List<Venta> listadoVentas) {
        initComponents();
        this.setTitle("REPORTE DE VENTAS");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.listadoVentas = listadoVentas;
        this.mostrarReporte();
        jLabelValorTotalVentas.setText(Integer.toString(listadoVentas.size()));
        jLabelValorRecaudado.setText(Integer.toString(sumarTotalVentas()));
        jRadioButtonLaptop.setOpaque(false);
        jRadioButtonDesktop.setOpaque(false);

    }

    public void mostrarReporte() {

        modelo = (DefaultTableModel) jTableLista.getModel();

        for (Venta venta : listadoVentas) {
            Object[] fila = {
                venta.getRutCliente(),
                venta.getNombreCliente(),
                venta.getTelefonoCliente(),
                venta.getCorreoCliente(),
                venta.getModelo(),
                venta.getTipoEquipo(),
                venta.getPrecio(),
                venta.getFecha(),
                venta.getHora()
            };

            modelo.addRow(fila);

        }
        ajustarTamanioColumnas();

    }

    public int sumarTotalVentas() {
        int total = 0;

        for (Venta venta : listadoVentas) {
            total += venta.getPrecio();
        }
        return total;
    }

    private void ajustarTamanioColumnas() {

        // Crear un renderizador de celdas personalizado para centrar el texto.
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplica el renderizador a cada columna de la tabla.
        for (int i = 0; i < jTableLista.getColumnCount(); i++) {
            jTableLista.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        // Itera sobre cada columna de la tabla.
        for (int column = 0; column < jTableLista.getColumnCount(); column++) {
            int maxWidth = 0;

            // Itera sobre cada fila de la tabla.
            for (int row = 0; row < jTableLista.getRowCount(); row++) {
                // Obtiene el renderizador de celdas para la celda actual.
                TableCellRenderer cellRenderer = jTableLista.getCellRenderer(row, column);

                // Obtiene el valor de la celda actual.
                Object value = jTableLista.getValueAt(row, column);

                // Obtiene el componente de renderizado de la celda.
                Component cellRendererComponent = cellRenderer.getTableCellRendererComponent(
                        jTableLista, value, false, false, row, column
                );

                // Calcula el ancho preferido del componente y actualiza el ancho máximo.
                maxWidth = Math.max(maxWidth, cellRendererComponent.getPreferredSize().width);
            }

            // Establece el ancho preferido de la columna al ancho máximo más un pequeño espacio adicional.
            jTableLista.getColumnModel().getColumn(column).setPreferredWidth(maxWidth + 10);
        }
    }

    private void actualizarFiltro(String filtro) {
        jRadioButtonLaptop.setSelected(!"PC Escritorio".equals(filtro));
        jRadioButtonDesktop.setSelected("PC Escritorio".equals(filtro));

        // Aplicar el filtro
        if (trs == null) {
            trs = new TableRowSorter<>(modelo); // asume que 'modelo' es el modelo de tu tabla
            jTableLista.setRowSorter(trs);
        }

        // Aplicar el filtro específico
        trs.setRowFilter(RowFilter.regexFilter(filtro, 5));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTotalVentas = new javax.swing.JLabel();
        jLabelValorTotalVentas = new javax.swing.JLabel();
        jLabelTotalRecaudado = new javax.swing.JLabel();
        jLabelValorRecaudado = new javax.swing.JLabel();
        jRadioButtonDesktop = new javax.swing.JRadioButton();
        jRadioButtonLaptop = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabelTotalVentas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTotalVentas.setText("TOTAL DE VENTAS");

        jLabelValorTotalVentas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelValorTotalVentas.setText("0");

        jLabelTotalRecaudado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTotalRecaudado.setText("TOTAL RECAUDADO");

        jLabelValorRecaudado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelValorRecaudado.setText("0");

        jRadioButtonDesktop.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonDesktop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonDesktop.setText("FILTRAR POR DESKTOP");
        jRadioButtonDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDesktopActionPerformed(evt);
            }
        });

        jRadioButtonLaptop.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonLaptop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonLaptop.setText("FILTRAR POR LAPTOP");
        jRadioButtonLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLaptopActionPerformed(evt);
            }
        });

        jButton1.setText("FILTRAR TODO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTotalVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelValorTotalVentas))
                    .addComponent(jRadioButtonDesktop))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTotalRecaudado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelValorRecaudado))
                    .addComponent(jRadioButtonLaptop))
                .addContainerGap(321, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(455, 455, 455))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalVentas)
                    .addComponent(jLabelValorTotalVentas)
                    .addComponent(jLabelTotalRecaudado)
                    .addComponent(jLabelValorRecaudado))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonLaptop)
                    .addComponent(jRadioButtonDesktop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        jTableLista.setBackground(new java.awt.Color(204, 255, 204));
        jTableLista.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT CLIENTE", "NOMBRE CLIENTE", "TELEFONO CLIENTE", "CORREO CLIENTE", "MODELO", "TIPO", "PRECIO", "FECHA", "HORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDesktopActionPerformed

        jRadioButtonLaptop.setSelected(false);
        jRadioButtonDesktop.setSelected(true);
        actualizarFiltro("PC Escritorio");


    }//GEN-LAST:event_jRadioButtonDesktopActionPerformed

    private void jRadioButtonLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLaptopActionPerformed

        jRadioButtonDesktop.setSelected(false);
        jRadioButtonLaptop.setSelected(true);
        actualizarFiltro("Laptop");

    }//GEN-LAST:event_jRadioButtonLaptopActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jRadioButtonDesktop.setSelected(false);
        jRadioButtonLaptop.setSelected(false);
        if (trs == null) {
            trs = new TableRowSorter<>(modelo);
            jTableLista.setRowSorter(trs);
        }
        trs.setRowFilter(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelTotalRecaudado;
    private javax.swing.JLabel jLabelTotalVentas;
    private javax.swing.JLabel jLabelValorRecaudado;
    private javax.swing.JLabel jLabelValorTotalVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDesktop;
    private javax.swing.JRadioButton jRadioButtonLaptop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
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
