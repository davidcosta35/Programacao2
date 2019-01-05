package GUI;

public class MenuAdmin extends javax.swing.JPanel {

   private String admin;
   private LoginAdmin parentFrame;

   public MenuAdmin(String admin, LoginAdmin parentFrame) {
      initComponents();
      this.admin = admin;
      this.parentFrame = parentFrame;
      this.jAdmin.setText(admin);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel5 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jAdmin = new javax.swing.JLabel();
      jButton4 = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();

      setLayout(null);

      jLabel5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(0, 0, 0));
      jLabel5.setText("O que deseja fazer?");
      add(jLabel5);
      jLabel5.setBounds(60, 410, 210, 26);

      jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
      jButton1.setText("Adicionar Admin");
      jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      add(jButton1);
      jButton1.setBounds(60, 450, 160, 40);

      jButton2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
      jButton2.setText("Listar Recintos");
      jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });
      add(jButton2);
      jButton2.setBounds(230, 450, 145, 40);

      jButton3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
      jButton3.setText("Listar Utilizadores");
      jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });
      add(jButton3);
      jButton3.setBounds(380, 450, 180, 40);

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
      add(jLabel1);
      jLabel1.setBounds(266, 125, 250, 61);

      jLabel2.setFont(new java.awt.Font("Arial", 2, 30)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      jLabel2.setText("Bem-Vindo ");
      add(jLabel2);
      jLabel2.setBounds(266, 271, 158, 35);

      jAdmin.setFont(new java.awt.Font("Arial", 2, 30)); // NOI18N
      jAdmin.setForeground(new java.awt.Color(0, 0, 0));
      jAdmin.setText("admin");
      add(jAdmin);
      jAdmin.setBounds(430, 271, 143, 35);

      jButton4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
      jButton4.setText("Gerir Desportos");
      jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jButton4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
         }
      });
      add(jButton4);
      jButton4.setBounds(570, 450, 180, 40);

      jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
      jLabel3.setToolTipText("");
      add(jLabel3);
      jLabel3.setBounds(0, 0, 800, 600);
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.parentFrame.trocaPainel(new RegistarAdmin(this.parentFrame, this.admin));
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.parentFrame.trocaPainel(new ConsultarRecinto(this.parentFrame, this.admin));
   }//GEN-LAST:event_jButton2ActionPerformed

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      //this.parentFrame.trocaPainel(new ConsultarClientes(this.admin, this.parentFrame));
   }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      this.parentFrame.trocaPainel(new ConsultarDesporto(this.parentFrame, this.admin));
    }//GEN-LAST:event_jButton4ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jAdmin;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel5;
   // End of variables declaration//GEN-END:variables
}
