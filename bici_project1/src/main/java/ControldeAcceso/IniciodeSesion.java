/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ControldeAcceso;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class IniciodeSesion extends javax.swing.JFrame {
    private ArrayList<Usuario> usuarios;
    private Usuario userActual;
    
    public IniciodeSesion() {
        usuarios = new ArrayList<>();
        userActual = new Usuario();
        guardarUsuariosEnArchivo();
        initComponents();
        
        System.out.println(usuarios);
    }
    
    
    private void guardarUsuariosEnArchivo() {
        try (FileWriter writer = new FileWriter("usuarios.acc")) {
            for (Usuario usuario : usuarios) {
                writer.write(usuario.getNombreUsuario() + "," + usuario.getContraseña() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private int usuarioCorrecto(ArrayList<Usuario> usuarios){
    for (Usuario usuario : usuarios) {
        String nombreUsuario = UsuarioField.getText();
        String contraseña = ContraField.getText();

        if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)){
            // Usuario y contraseña coinciden
            return 1;
        } else if (usuario.getNombreUsuario().equals(nombreUsuario) && !usuario.getContraseña().equals(contraseña)){
            // Usuario correcto pero contraseña incorrecta
            return 0;
        }
    }
    // Ningún usuario coincidió
    return -1;
}

    private boolean usuarioRegistro(ArrayList<Usuario> usuarios){
        boolean value = false;
        for (Usuario usuario : usuarios) {
            if(usuario.getNombreUsuario().equals(UsuarioField.getText())){
                return value = true;
                    }
            }
        
        return value;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsuarioField = new javax.swing.JTextField();
        ContraField = new javax.swing.JTextField();
        InicioSesion = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        UsuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioFieldActionPerformed(evt);
            }
        });

        InicioSesion.setText("Inicio de Sesion");
        InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSesionActionPerformed(evt);
            }
        });

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InicioSesion)
                        .addGap(33, 33, 33)
                        .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ContraField))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(34, 34, 34)
                            .addComponent(UsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ContraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioFieldActionPerformed

    private void InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSesionActionPerformed
        // TODO add your handling code here:
        guardarUsuariosEnArchivo();
        System.out.println(usuarioCorrecto(usuarios));
        if(usuarioCorrecto(usuarios) == 1){
            JOptionPane.showMessageDialog(null, "Usuario Correcto");
            guardarUsuariosEnArchivo();
        }
        else if(usuarioCorrecto(usuarios) == 0){
            JOptionPane.showMessageDialog(null, "La contraseña esta incorrecta");
            guardarUsuariosEnArchivo();
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encuentra Usuario Por favor registrarse");
            guardarUsuariosEnArchivo();
        }
        guardarUsuariosEnArchivo();
        
    }//GEN-LAST:event_InicioSesionActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        // TODO add your handling code here:

        if(usuarioRegistro(usuarios) == false){
            System.out.println(UsuarioField.getText()+ContraField.getText());
            userActual.setNombreUsuario(UsuarioField.getText());
            userActual.setContraseña(ContraField.getText());
            usuarios.add(userActual);
            userActual = new Usuario();
            guardarUsuariosEnArchivo();
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "este Usuario ya esta registrado");
        }
        
    }//GEN-LAST:event_RegistrarseActionPerformed

    
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
            java.util.logging.Logger.getLogger(IniciodeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciodeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciodeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciodeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciodeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContraField;
    private javax.swing.JButton InicioSesion;
    private javax.swing.JButton Registrarse;
    private javax.swing.JTextField UsuarioField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
