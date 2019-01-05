package GUI;

import Classes.Ficheiro;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class RegistarAdmin extends javax.swing.JPanel {

   private String admin;
   private LoginAdmin parentFrame;

   public RegistarAdmin(LoginAdmin parentFrame, String admin) {
      initComponents();
      this.admin = admin;
      this.parentFrame = parentFrame;
      this.jLabelUsername.setVisible(false);
      this.jLabelPassword.setVisible(false);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        BtnRegistar = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jPassword1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username:");
        add(jLabel2);
        jLabel2.setBounds(240, 350, 100, 22);

        jUsername.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jUsernameFocusLost(evt);
            }
        });
        jUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameActionPerformed(evt);
            }
        });
        add(jUsername);
        jUsername.setBounds(350, 350, 190, 28);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");
        add(jLabel3);
        jLabel3.setBounds(240, 390, 100, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Confirme a password:");
        add(jLabel4);
        jLabel4.setBounds(140, 430, 200, 22);

        jLabelUsername.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 51, 51));
        jLabelUsername.setText("Username já existe.");
        add(jLabelUsername);
        jLabelUsername.setBounds(550, 350, 160, 19);

        jLabelPassword.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 51, 51));
        jLabelPassword.setText("Passwords não coincidem.");
        add(jLabelPassword);
        jLabelPassword.setBounds(550, 430, 210, 19);

        BtnCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        add(BtnCancelar);
        BtnCancelar.setBounds(340, 480, 100, 35);

        BtnRegistar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnRegistar.setText("Registar");
        BtnRegistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistarActionPerformed(evt);
            }
        });
        add(BtnRegistar);
        BtnRegistar.setBounds(450, 480, 100, 35);
        add(jPassword);
        jPassword.setBounds(350, 390, 190, 28);

        jPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPassword1FocusLost(evt);
            }
        });
        jPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword1ActionPerformed(evt);
            }
        });
        jPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassword1KeyPressed(evt);
            }
        });
        add(jPassword1);
        jPassword1.setBounds(350, 430, 190, 28);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
        jLabel5.setToolTipText("");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents


   private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
      this.parentFrame.trocaPainel(new MenuAdmin(this.admin, this.parentFrame));
   }//GEN-LAST:event_BtnCancelarActionPerformed

   private void BtnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistarActionPerformed
      Ficheiro.getRepo().getAdmins().put(this.jUsername.getText(), new String(this.jPassword.getPassword()));
      JOptionPane.showMessageDialog(null, "Registo efetuado com sucesso!");
      Ficheiro.serializar("Ficheiro");
      this.parentFrame.trocaPainel(new MenuAdmin(this.admin, this.parentFrame));
   }//GEN-LAST:event_BtnRegistarActionPerformed

   private void jUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jUsernameActionPerformed

   private void jUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsernameFocusLost
      if (Ficheiro.getRepo().getAdmins().containsKey(this.jUsername.getText())) {
         this.jLabelUsername.setVisible(true);
         this.BtnRegistar.setEnabled(false);
      } else {
         this.jLabelUsername.setVisible(false);
         this.BtnRegistar.setEnabled(true);
      }
   }//GEN-LAST:event_jUsernameFocusLost

   private void jPassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassword1FocusLost
      if (!new String(this.jPassword.getPassword()).equals(new String(this.jPassword1.getPassword()))) {
         this.jLabelPassword.setVisible(true);
         this.BtnRegistar.setEnabled(false);
      } else {
         this.jLabelPassword.setVisible(false);
         this.BtnRegistar.setEnabled(true);
      }
   }//GEN-LAST:event_jPassword1FocusLost

   private void jPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jPassword1ActionPerformed

   private void jPassword1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword1KeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         this.BtnRegistar.doClick();
      }
   }//GEN-LAST:event_jPassword1KeyPressed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JTextField jUsername;
    // End of variables declaration//GEN-END:variables
}