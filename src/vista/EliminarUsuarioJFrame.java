/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Ortega
 */
public class EliminarUsuarioJFrame extends javax.swing.JFrame {

    /** Creates new form EditarUsuarioJFrame */
    public EliminarUsuarioJFrame() {
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
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N. de Identificacion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estrato:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Departamento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingresos:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Avaluo Catastral:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Municipio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Correo:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Impuestos:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Multas:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 190, -1));

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 190, -1));

        jTextFieldNID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 190, -1));

        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 190, -1));

        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, -1));

        jTextFieldEstrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstratoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 190, -1));

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 190, -1));

        jTextFieldDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDepartamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 190, -1));

        jTextFieldIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIngresosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 190, -1));

        jTextFieldAvaluo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAvaluoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAvaluo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 190, -1));

        jTextFieldMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMunicipioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 190, -1));

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 190, -1));

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 190, -1));

        jTextFieldImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldImpuestosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 190, -1));

        jTextFieldMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMultasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 190, -1));

        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 140, -1));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 80, -1));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 70, 20));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        label_status.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Digite el N. de Identificacion del usuario a eliminar:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIDActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        MenuAdminJFrame mad=new MenuAdminJFrame();
        mad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_impuesto", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from ciudadanos where ID = ?");
            pst.setString(1, jTextFieldBuscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                jTextFieldNombre.setText(rs.getString("Nombre"));
                jTextFieldEdad.setText(rs.getString("Edad"));
                jTextFieldNID.setText(rs.getString("ID"));
                jTextFieldPass.setText(rs.getString("Contraseña"));
                jTextFieldGenero.setText(rs.getString("Genero"));
                jTextFieldEstrato.setText(rs.getString("Estrato"));
                jTextFieldDireccion.setText(rs.getString("Direccion"));
                jTextFieldDepartamento.setText(rs.getString("Departamento"));
                jTextFieldIngresos.setText(rs.getString("Ingresos"));
                jTextFieldAvaluo.setText(rs.getString("Avaluo"));
                jTextFieldMunicipio.setText(rs.getString("Municipio"));
                jTextFieldTelefono.setText(rs.getString("Telefono"));
                jTextFieldCorreo.setText(rs.getString("Correo"));
                jTextFieldImpuestos.setText(rs.getString("Impuestos"));
                jTextFieldMultas.setText(rs.getString("Multas"));
                
            } else{
               
               JOptionPane.showMessageDialog(null, "Alumno no registrado");
               
           }                     
            
        }catch (Exception e){
            
        }            
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            
                     
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_impuesto", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from ciudadanos where ID = ?");
            
            pst.setString(1, jTextFieldBuscar.getText().trim());
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
            
            label_status.setText("Registro eliminado");
                       
                     
        }catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMultasActionPerformed

    private void jTextFieldImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldImpuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldImpuestosActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMunicipioActionPerformed

    private void jTextFieldAvaluoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAvaluoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAvaluoActionPerformed

    private void jTextFieldIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIngresosActionPerformed

    private void jTextFieldDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDepartamentoActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGeneroActionPerformed

    private void jTextFieldEstratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstratoActionPerformed

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EliminarUsuarioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
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
    private javax.swing.JTextField jTextFieldBuscar;
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
