/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modulo_de_Producto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ProductoGUI extends javax.swing.JFrame {
    
    private ArrayList<Producto> productos;
    private Producto produActual;

    /**
     * Creates new form ProductoGUI
     */
    public ProductoGUI() {
        initComponents();
        produActual = new Producto();
        productos = cargarProductos();
    }
    
    //Getters and Setters

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProduActual() {
        return produActual;
    }

    public void setProduActual(Producto produActual) {
        this.produActual = produActual;
    }
    
    
    //metodos para trabajar con el json
    public void guardarServicios(ArrayList<Producto> Productos) {
        try (Writer writer = new FileWriter("Productos.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(Productos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar servicios desde un archivo JSON
    public static ArrayList<Producto> cargarProductos() {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try (Reader reader = new FileReader("Productos.json")) {
            Gson gson = new Gson();
            Producto[] productosArray = gson.fromJson(reader, Producto[].class);
            if (productosArray != null) {
                listaProductos.addAll(Arrays.asList(productosArray));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaProductos;
    }

    public int estaElProducto(String nombre){
        String nombreFix = nombre.trim();
        int value = -1;
        for(Producto pro : productos){
            if(pro.getNombre() == nombreFix){
                return productos.indexOf(pro);
            }
        }
        return value;
    }
    
    
    
    
    
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JTextField();
        BtnCrear = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Marca = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TipoProducto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Tamaño = new javax.swing.JComboBox<>();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        BtnCrear.setText("Crear");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Producto");

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del Articulo");

        jLabel5.setText("Marca");

        jLabel6.setText("Precio");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Tipo del producto");

        TipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bicicleta", "Accesorios", "Suplemetos Alimenticios" }));
        TipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoProductoActionPerformed(evt);
            }
        });

        jLabel9.setText("Tamaño");

        Tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "16", "22", "26", "27", "27.5 ", "29" }));
        Tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamañoActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TipoProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tamaño, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(457, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(84, 84, 84))
                            .addComponent(Buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscar)
                        .addGap(1, 1, 1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrear)
                    .addComponent(BtnModificar)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        
        //saca la informacion de la GUI
        String textoNombre = Nombre.getText();
        String textoTipo = TipoProducto.getSelectedItem().toString();
        String textoTamaño = Tamaño.getSelectedItem().toString();
        String textoMarca = Marca.getText();
        String textoPrecio = Precio.getText();
        String textoCantidad = Cantidad.getText();
        
        int intPrecio = Integer.parseInt(textoPrecio);
        int intCantidad = Integer.parseInt(textoCantidad);

        // Guarda los datos como atributos de produActual para guardarlos despues en el json
        produActual.setNombre(textoNombre.trim());
        produActual.setTipo(textoTipo);
        produActual.setTamaño(textoTamaño);
        produActual.setMarca(textoMarca.trim());
        produActual.setPrecio(intPrecio);
        produActual.setCantidad(intCantidad);
        
        //Agrega ProduActual a la lista de producto y resetea produActual
        
        
        productos.add(produActual);
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
        produActual = new Producto();
 
        //manda el producto nuevo al Json
        guardarServicios(productos);
        cargarProductos();
        
        //Vacia los campos de texto 
        Nombre.setText("");
        Marca.setText("");
        Precio.setText("");
        Cantidad.setText("");
        
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void TipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoProductoActionPerformed

    private void TamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TamañoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        String txtBuscar = Buscar.getText();
        int indexProducto = estaElProducto(txtBuscar);
        System.out.println(""+indexProducto);
            if(indexProducto >= 0){
                Nombre.setText(productos.get(indexProducto).getNombre());
                Marca.setText(productos.get(indexProducto).getMarca());
                Precio.setText(""+productos.get(indexProducto).getPrecio());
                Cantidad.setText(""+productos.get(indexProducto).getCantidad());
            }
        
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JComboBox<String> Tamaño;
    private javax.swing.JComboBox<String> TipoProducto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
