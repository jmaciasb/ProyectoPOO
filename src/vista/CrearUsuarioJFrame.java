/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;
import bd.conexionSQL;
import java.sql.*;

/**
 *
 * @author Juan Ortega
 */
public class CrearUsuarioJFrame extends javax.swing.JFrame {

    /** Creates new form EditarUsuarioJFrame */
    public CrearUsuarioJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldNID = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jTextFieldEstrato = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldDepartamento = new javax.swing.JTextField();
        jTextFieldIngresos = new javax.swing.JTextField();
        jTextFieldAvaluo = new javax.swing.JTextField();
        jTextFieldMunicipio = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldImpuestos = new javax.swing.JTextField();
        jTextFieldMultas = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N. de Identificacion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estrato:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Departamento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingresos:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Avaluo Catastral:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Municipio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Correo:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Impuestos:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Multas:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, -1));

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));

        jTextFieldNID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));

        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, -1));

        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 190, -1));

        jTextFieldEstrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstratoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, -1));

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 190, -1));

        jTextFieldDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDepartamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, -1));

        jTextFieldIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIngresosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 190, -1));

        jTextFieldAvaluo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAvaluoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAvaluo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, -1));

        jTextFieldMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMunicipioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 190, -1));

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 190, -1));

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 190, -1));

        jTextFieldImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldImpuestosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 190, -1));

        jTextFieldMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMultasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 190, -1));

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, -1, -1));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 80, -1));

        label_status.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Registrar usuario");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jTextFieldNIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIDActionPerformed

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGeneroActionPerformed

    private void jTextFieldEstratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstratoActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDepartamentoActionPerformed

    private void jTextFieldIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIngresosActionPerformed

    private void jTextFieldAvaluoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAvaluoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAvaluoActionPerformed

    private void jTextFieldMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMunicipioActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldImpuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldImpuestosActionPerformed

    private void jTextFieldMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMultasActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        MenuAdminJFrame mad=new MenuAdminJFrame();
        mad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_impuesto", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into ciudadanos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, "0");
            pst.setString(2, jTextFieldNombre.getText().trim());
            pst.setString(3, jTextFieldEdad.getText().trim());
            pst.setString(4, jTextFieldNID.getText().trim());
            pst.setString(5, jTextFieldPass.getText().trim());
            pst.setString(6, jTextFieldGenero.getText().trim());
            pst.setString(7, jTextFieldEstrato.getText().trim());
            pst.setString(8, jTextFieldDireccion.getText().trim());
            pst.setString(9, jTextFieldDepartamento.getText().trim());
            pst.setString(10, jTextFieldIngresos.getText().trim());
            pst.setString(11, jTextFieldAvaluo.getText().trim());
            pst.setString(12, jTextFieldMunicipio.getText().trim());
            pst.setString(13, jTextFieldTelefono.getText().trim());
            pst.setString(14, jTextFieldCorreo.getText().trim());
            pst.setString(15, jTextFieldImpuestos.getText().trim());
            pst.setString(16, jTextFieldMultas.getText().trim());
            
            pst.executeUpdate();
            
            jTextFieldNombre.setText("");
            jTextFieldEdad.setText("");
            jTextFieldNID.setText("");
            jTextFieldPass.setText("");
            jTextFieldGenero.setText("");
            jTextFieldEstrato.setText("");
            jTextFieldDireccion.setText("");
            jTextFieldDepartamento.setText("");
            jTextFieldIngresos.setText("");
            jTextFieldAvaluo.setText("");
            jTextFieldMunicipio.setText("");
            jTextFieldTelefono.setText("");
            jTextFieldCorreo.setText("");
            jTextFieldImpuestos.setText("");
            jTextFieldMultas.setText("");
            label_status.setText("Registro exitoso");
            
            
        }catch (Exception e){
            
        }            
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField jTextFieldAvaluo;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDepartamento;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldEstrato;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldImpuestos;
    private javax.swing.JTextField jTextFieldIngresos;
    private javax.swing.JTextField jTextFieldMultas;
    private javax.swing.JTextField jTextFieldMunicipio;
    private javax.swing.JTextField jTextFieldNID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel label_status;
    // End of variables declaration//GEN-END:variables

}