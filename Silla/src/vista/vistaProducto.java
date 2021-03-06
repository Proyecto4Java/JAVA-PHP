/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ProductoController;
import javax.swing.JOptionPane;
import modelo.Lugar;
import modelo.Producto;
import modelo.Serie;
import modelo.Stock;



/**
 *
 * @author Javier
 */
public class vistaProducto extends javax.swing.JFrame {
    
    ProductoController producto = new ProductoController();
    
    int id ;
     static int btnGuardar;
    /**
     * Creates new form vistaProducto
     */
    public vistaProducto() {
        initComponents();
        
        this.jTable1.setModel(producto.mostrarProducto()); 
        this.bloque.setVisible(false);
        this.pasillo.setVisible(false);
        this.repisa.setVisible(false);
        this.categoria.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serie = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        actual = new javax.swing.JTextField();
        foto = new javax.swing.JTextField();
        categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bloque = new javax.swing.JComboBox<>();
        pasillo = new javax.swing.JComboBox<>();
        repisa = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        minimo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        maximo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTbloque = new javax.swing.JTextField();
        jTpasillo = new javax.swing.JTextField();
        jTrepisa = new javax.swing.JTextField();
        jTcategoria = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscador = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        guardar.setText("GUARDAR");
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        nuevo.setText("NUEVO");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Foto");

        serie.setEditable(false);

        nombre.setEditable(false);

        jLabel3.setText("Nº de serie");

        jLabel4.setText("Categoria");

        jLabel5.setText("Stock");

        jLabel6.setText("Ubicación");

        actual.setEditable(false);
        actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualActionPerformed(evt);
            }
        });

        foto.setEditable(false);

        categoria.setMaximumRowCount(4);
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sillas de comedor", "Sillones", "Barras y sillas", "Muebles de bar", "Juegos de comedor", "Tronas", "Sillas de trabajo", "Taburetes escalera", "Taburetes y bancos" }));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        jLabel8.setText("Bloque");

        jLabel7.setText("Pasillo");

        jLabel9.setText("Repisa");

        bloque.setMaximumRowCount(4);
        bloque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloque 1", "Bloque 2", "Bloque 3", "Bloque 4", "Bloque 5", "Bloque 6", "Bloque 7", "Bloque 8" }));
        bloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueActionPerformed(evt);
            }
        });

        pasillo.setMaximumRowCount(4);
        pasillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pasillo 1", "Pasillo 2", "Pasillo 3", "Pasillo 4", "Pasillo 5", "Pasillo 6", "Pasillo 7", "Pasillo 8", "Pasillo 9", "Pasillo 10", "Pasillo 11", "Pasillo 12" }));
        pasillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasilloActionPerformed(evt);
            }
        });

        repisa.setMaximumRowCount(4);
        repisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repisa 1", "Repisa 2", "Repisa 3", "Repisa 4", "Repisa 5", "Repisa 6", "Repisa 7", "Repisa 8" }));
        repisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repisaActionPerformed(evt);
            }
        });

        jLabel10.setText("Actual");

        jLabel11.setText("Minimo");

        minimo.setEditable(false);

        jLabel12.setText("Maximo");

        maximo.setEditable(false);

        jButton1.setText("Selecciona tu foto");
        jButton1.setEnabled(false);

        jTbloque.setEditable(false);
        jTbloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbloqueActionPerformed(evt);
            }
        });

        jTpasillo.setEditable(false);
        jTpasillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpasilloActionPerformed(evt);
            }
        });

        jTrepisa.setEditable(false);

        jTcategoria.setEditable(false);

        modificar.setText("MODIFICAR");
        modificar.setEnabled(false);
        modificar.setOpaque(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(guardar)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButton1)
                                        .addGap(48, 48, 48)
                                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(bloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pasillo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(repisa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(actual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8))
                                                .addGap(41, 41, 41))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTbloque, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTpasillo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jTrepisa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(maximo)))
                                            .addComponent(jLabel7))))))))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTrepisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(nuevo)
                    .addComponent(eliminar)
                    .addComponent(modificar))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REFRESCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
<<<<<<< HEAD
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
=======
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
>>>>>>> origin/master
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
// TODO add your handling code here
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        modificar.setEnabled(true);
        this.eliminar.setEnabled(true);
     
        int fila = jTable1.rowAtPoint(evt.getPoint());
        nombre.setText(String.valueOf(jTable1.getValueAt(fila, 1))); 
        serie.setText(String.valueOf(jTable1.getValueAt(fila, 2)));
        actual.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
        minimo.setText(String.valueOf(jTable1.getValueAt(fila, 4)));
        maximo.setText(String.valueOf(jTable1.getValueAt(fila, 5)));
        jTbloque.setText(String.valueOf(jTable1.getValueAt(fila, 6)));
        jTpasillo.setText(String.valueOf(jTable1.getValueAt(fila, 7)));
        jTrepisa.setText(String.valueOf(jTable1.getValueAt(fila, 8)));
        jTcategoria.setText(String.valueOf(jTable1.getValueAt(fila, 9)));
        
        id = Integer.parseInt(String.valueOf(jTable1.getValueAt(fila, 0)));
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTbloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbloqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbloqueActionPerformed

    private void jTpasilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpasilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpasilloActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String nSerie = serie.getText();
        String nom = nombre.getText();
        int act = Integer.parseInt(actual.getText());
        int min = Integer.parseInt(minimo.getText());
        int max = Integer.parseInt(maximo.getText());
        String cat = jTcategoria.getText();
        String bloq = jTbloque.getText();
        String pas = jTpasillo.getText();
        String rep = jTrepisa.getText();
        
        
        
        boolean validarUbi = producto.validarUbicacion(bloq, pas, rep);
        
        if (!validarUbi){
        JOptionPane.showMessageDialog(null, "Ya hay un producto en ese lugar");
        serie.requestFocus();
        return;
        }       
        
         if (this.nombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre para el Producto");
            nombre.requestFocus();
            return;
        }
         if (!ProductoController.isNumeric(this.serie.getText())) {
              
            JOptionPane.showConfirmDialog(rootPane, "Requiere en Nº de serie");
           
            // boolean num=ControllerFactura.isNumeric(this.jtStock.getText());
            serie.requestFocus();
            return;
        }
        if (this.actual.getText().length() == 0 && this.maximo.getText().length() == 0 && this.minimo.getText().length() == 0 && this.actual.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Introduce los Stock: actual, minimo y maximo");

            } else if (!ProductoController.isNumeric(this.actual.getText()) || !ProductoController.isNumeric(this.maximo.getText()) || !ProductoController.isNumeric(this.minimo.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Los campo de Stock tiene que ser numeros");
            }
            
            if (this.jTcategoria.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "Requiere la Categoria");
            }
            
            if (this.jTpasillo.getText().length() == 0 || this.jTbloque.getText().length() == 0 || this.jTrepisa.getText().length() == 0 ){
                JOptionPane.showMessageDialog(rootPane, "Se quiere la Ubicacion: bloque, pasillo, repisa");
            }
        //
        
            if(vistaProducto.btnGuardar==0){
                Serie s =new Serie(nSerie);
                Producto p=new Producto(nom);
                Stock so=new Stock(max, act, min);
                Lugar l=new Lugar(bloq, pas, rep);
                producto.añadirProducto(s, p, so, l);
                this.jTable1.setModel(producto.mostrarProducto());
            } else {
                producto.modificarProducto(nSerie, nom, act, min, max, cat, bloq, pas, rep, id);
                this.jTable1.setModel(producto.mostrarProducto());
        
            }
                  
        
                
       
        
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        //activar los botones para añadir el producto.
        this.nombre.setEditable(true);
        this.serie.setEditable(true);
        this.actual.setEditable(true);
        this.serie.setVisible(true);
        this.maximo.setEditable(true);
        this.maximo.setVisible(true);
        this.minimo.setEditable(true);
        this.minimo.setVisible(true);
        this.bloque.setEditable(true);
        this.bloque.setVisible(true);
        this.pasillo.setEditable(true);
        this.pasillo.setVisible(true);
        this.repisa.setEditable(true);
        this.repisa.setVisible(true);
        this.categoria.setEditable(true);
        this.categoria.setVisible(true);
        this.guardar.setEnabled(true);
        this.nombre.setText("");
        this.serie.setText("");
        this.actual.setText("");
        this.maximo.setText("");
        this.minimo.setText("");
        this.actual.setText("");
        this.jTbloque.setText("");
        this.jTpasillo.setText("");
        this.jTrepisa.setText("");
        this.jTcategoria.setText("");
        
        
        btnGuardar=0;
       
    }//GEN-LAST:event_nuevoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres elimnar el producto?", "Eliminado", JOptionPane.YES_NO_OPTION);
       if(p==0){
        producto.eliminar(id);
        this.jTable1.setModel(producto.mostrarProducto());
       }
    }//GEN-LAST:event_eliminarActionPerformed

    private void actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualActionPerformed

    private void bloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueActionPerformed
        jTbloque.setText(bloque.getSelectedItem().toString());
    }//GEN-LAST:event_bloqueActionPerformed

    private void pasilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasilloActionPerformed
        jTpasillo.setText(pasillo.getSelectedItem().toString());
    }//GEN-LAST:event_pasilloActionPerformed

    private void repisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repisaActionPerformed
        jTrepisa.setText(repisa.getSelectedItem().toString());
    }//GEN-LAST:event_repisaActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        jTcategoria.setText(categoria.getSelectedItem().toString());
    }//GEN-LAST:event_categoriaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        eliminar.setEnabled(false);
        modificar.setEnabled(false);
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
        this.bloque.setVisible(true);
        this.pasillo.setVisible(true);
        this.repisa.setVisible(true);
        this.categoria.setVisible(true);
        nombre.setEditable(true);
        serie.setEditable(true);
        maximo.setEditable(true);
        minimo.setEditable(true);
        actual.setEditable(true);
        
        btnGuardar=1;
        
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String buscar = buscador.getText();
        
        this.jTable1.setModel(producto.buscarProducto(buscar));
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String buscar = "";
        this.jTable1.setModel(producto.buscarProducto(buscar));
        buscador.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actual;
    private javax.swing.JComboBox<String> bloque;
    private javax.swing.JTextField buscador;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField foto;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTbloque;
    private javax.swing.JTextField jTcategoria;
    private javax.swing.JTextField jTpasillo;
    private javax.swing.JTextField jTrepisa;
    private javax.swing.JTextField maximo;
    private javax.swing.JTextField minimo;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JComboBox<String> pasillo;
    private javax.swing.JComboBox<String> repisa;
    private javax.swing.JTextField serie;
    // End of variables declaration//GEN-END:variables
}
