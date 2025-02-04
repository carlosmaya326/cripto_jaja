package test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import cipher.SymmetricCipher;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import util.Util;

/**
 *
 * @author Juan
 */
public class UI extends javax.swing.JFrame {
    
    public SecretKey secretKey;
    public String fileName = "Name";
    public byte[] cipherText = null;
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCifrar = new javax.swing.JTextField();
        txtDecifrado = new javax.swing.JTextField();
        txtCifrado = new javax.swing.JTextField();
        btnCifrar = new javax.swing.JButton();
        btnDecifrar = new javax.swing.JButton();
        btnGuardarLlave = new javax.swing.JButton();
        btnGenerarLlave = new javax.swing.JButton();
        btnCargarLlave = new javax.swing.JButton();
        txtLlave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Symeric Cipher MiniProject");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Texto a cifrar");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Texto cifrado");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Texto decifrado");

        txtCifrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCifrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCifrarKeyReleased(evt);
            }
        });

        txtDecifrado.setEditable(false);
        txtDecifrado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCifrado.setEditable(false);
        txtCifrado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnCifrar.setText("Cifrar");
        btnCifrar.setEnabled(false);
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        btnDecifrar.setText("Decifrar");
        btnDecifrar.setEnabled(false);
        btnDecifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecifrarActionPerformed(evt);
            }
        });

        btnGuardarLlave.setText("Guardar llave");
        btnGuardarLlave.setEnabled(false);
        btnGuardarLlave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLlaveActionPerformed(evt);
            }
        });

        btnGenerarLlave.setText("Generar llave");
        btnGenerarLlave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarLlaveActionPerformed(evt);
            }
        });

        btnCargarLlave.setText("Cargar llave");
        btnCargarLlave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarLlaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCifrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardarLlave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarLlave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLlave)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 165, Short.MAX_VALUE)
                                .addComponent(btnCargarLlave))))
                    .addComponent(txtCifrado)
                    .addComponent(txtDecifrado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDecifrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDecifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecifrar)
                    .addComponent(btnCifrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarLlave)
                    .addComponent(txtLlave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarLlave)
                    .addComponent(btnGuardarLlave)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLlaveActionPerformed
        FileOutputStream fileOut;
        ObjectOutputStream out;
        try {
            String key = this.secretKey.toString().split("@")[1];
            fileOut = new FileOutputStream("src\\SecretKeys\\"+key+".txt");
            out = new ObjectOutputStream(fileOut);
            out.writeObject(this.secretKey);
            out.flush();
            out.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGuardarLlaveActionPerformed

    private void btnCargarLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLlaveActionPerformed
        FileInputStream fileIn;
        ObjectInputStream in;
        SecretKey secretKey = null;
        try {
            fileIn = new FileInputStream(getKey());
            in = new ObjectInputStream(fileIn);
            this.secretKey = (SecretKey) in.readObject();
            System.out.println(this.secretKey);
            txtLlave.setText( this.secretKey.toString().split("@")[1] );
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnCargarLlaveActionPerformed

    private void btnGenerarLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarLlaveActionPerformed
        this.secretKey = null;
        try {
            this.secretKey = KeyGenerator.getInstance("DES").generateKey();
            txtLlave.setText( this.secretKey.toString().split("@")[1] );
            System.out.println(this.secretKey.toString());
            btnGuardarLlave.setEnabled(true);

            if ( txtCifrar.getText() == "" ) {
                btnCifrar.setEnabled(false);
                btnDecifrar.setEnabled(false);
            } else {
                btnCifrar.setEnabled(true);
                btnDecifrar.setEnabled(true);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarLlaveActionPerformed
    
    // Cifrar texto
    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
        SymmetricCipher s = new SymmetricCipher( this.secretKey, "DES/ECB/PKCS5Padding" );
        String clearText = txtCifrar.getText();
        long timeBeforeMili = System.currentTimeMillis();

        this.cipherText = s.encryptMessage( clearText );
        
 
        txtCifrado.setText( "{ " + Util.printByteArrayInt( cipherText ) + " }" );
        
        long timeAfterMili = System.currentTimeMillis();
        
        JOptionPane.showMessageDialog(null, "Tiempo transcurrido en milisegundos: " + ( timeAfterMili - timeBeforeMili ));
    }//GEN-LAST:event_btnCifrarActionPerformed

    private void txtCifrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCifrarKeyReleased
        String valor = txtCifrar.getText();
        if ( valor == "" || txtLlave.getText() == "" ) {
            btnCifrar.setEnabled(false);
            btnDecifrar.setEnabled(false);
        } else {
            btnCifrar.setEnabled(true);
            btnDecifrar.setEnabled(true);
        }
    }//GEN-LAST:event_txtCifrarKeyReleased

    private void btnDecifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecifrarActionPerformed
        SymmetricCipher s = new SymmetricCipher( this.secretKey, "DES/ECB/PKCS5Padding" );
        long timeBeforeMili = System.currentTimeMillis();
        
        if ( this.cipherText != null ) {
            String clearText = s.decryptMessage( this.cipherText );

            txtDecifrado.setText( clearText.toString() );
            
            long timeAfterMili = System.currentTimeMillis();
        
            JOptionPane.showMessageDialog(null, "Tiempo transcurrido en milisegundos: " + ( timeAfterMili - timeBeforeMili ));
        }
    }//GEN-LAST:event_btnDecifrarActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    
    private String getKey() {
        /**llamamos el metodo que permite cargar la ventana*/
        // JFileChooser file = new JFileChooser( "D:\\Documentos\\CIAF\\Semestre VI\\Programación en redes\\Parcial\\Parcial\\src\\SecretKeys\\" );
        JFileChooser file = new JFileChooser( "src\\SecretKeys\\" );
        file.showOpenDialog(this);
        /**abrimos el archivo seleccionado*/
        File abre = file.getSelectedFile();

        return abre.getAbsolutePath();
      }

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarLlave;
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnDecifrar;
    private javax.swing.JButton btnGenerarLlave;
    private javax.swing.JButton btnGuardarLlave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCifrado;
    private javax.swing.JTextField txtCifrar;
    private javax.swing.JTextField txtDecifrado;
    private javax.swing.JLabel txtLlave;
    // End of variables declaration//GEN-END:variables
}
