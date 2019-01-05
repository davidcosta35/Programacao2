package GUI;

import Classes.Dono;

public class MenuDono extends javax.swing.JPanel {

   private Dono dono;
   private LoginDono parentFrame;

   public MenuDono(Dono dono, LoginDono parentFrame) {
      initComponents();
      this.dono = dono;
      this.parentFrame = parentFrame;
      this.jDono.setText(this.dono.getNickname());
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnAddRecinto = new javax.swing.JButton();
        BtnListRecintos = new javax.swing.JButton();
        jDono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("O que deseja fazer?");
        add(jLabel1);
        jLabel1.setBounds(300, 390, 203, 26);

        BtnAddRecinto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnAddRecinto.setText("Adicionar Recinto");
        BtnAddRecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddRecintoActionPerformed(evt);
            }
        });
        add(BtnAddRecinto);
        BtnAddRecinto.setBounds(190, 430, 200, 35);

        BtnListRecintos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnListRecintos.setText("Consultar Recintos");
        BtnListRecintos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListRecintosActionPerformed(evt);
            }
        });
        add(BtnListRecintos);
        BtnListRecintos.setBounds(400, 430, 200, 35);

        jDono.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jDono.setForeground(new java.awt.Color(0, 0, 0));
        jDono.setText("dono");
        add(jDono);
        jDono.setBounds(440, 260, 200, 43);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bem vindo");
        add(jLabel2);
        jLabel2.setBounds(250, 260, 190, 43);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
        jLabel4.setToolTipText("");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

   private void BtnAddRecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddRecintoActionPerformed
      
   }//GEN-LAST:event_BtnAddRecintoActionPerformed

   private void BtnListRecintosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListRecintosActionPerformed
      
   }//GEN-LAST:event_BtnListRecintosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddRecinto;
    private javax.swing.JButton BtnListRecintos;
    private javax.swing.JLabel jDono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}