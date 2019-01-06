package GUI;

import Classes.Desporto;
import Classes.Ficheiro;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class ConsultarDesporto extends javax.swing.JPanel {

   private LoginAdmin parentFrame;
   private String admin;

   public ConsultarDesporto(LoginAdmin parentFrame, String admin) {
      initComponents();
      this.admin = admin;
      this.parentFrame = parentFrame;
      DefaultTableModel table = (DefaultTableModel) this.jTable.getModel();

      for (Map.Entry<String, Desporto> mapa : Ficheiro.getRepo().getDesportos().entrySet()) {
        table.addRow(new Object[]{mapa.getValue().getNome()});  
      }
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        BtnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnAdicionar = new javax.swing.JButton();
        BtnVoltar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(180, 160, 460, 240);

        BtnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        add(BtnVoltar);
        BtnVoltar.setBounds(470, 440, 175, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Desportos");
        add(jLabel1);
        jLabel1.setBounds(340, 90, 160, 35);

        BtnAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAdicionar.setText("Adicionar");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });
        add(BtnAdicionar);
        BtnAdicionar.setBounds(180, 440, 175, 40);

        BtnVoltar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnVoltar1.setText("Remover");
        BtnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltar1ActionPerformed(evt);
            }
        });
        add(BtnVoltar1);
        BtnVoltar1.setBounds(660, 260, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
        jLabel3.setToolTipText("");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
    }//GEN-LAST:event_jTableMouseClicked

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.parentFrame.trocaPainel(new MenuAdmin(this.admin, this.parentFrame));
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        this.parentFrame.trocaPainel(new RegistarDesporto(this.parentFrame, this.admin));
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltar1ActionPerformed
        if (this.jTable.getSelectedRowCount() == 1) {
            String nomeD = (String) this.jTable.getValueAt(this.jTable.getSelectedRow(), 0);
            Ficheiro.getRepo().getDesportos().remove(nomeD);
            
        }
        Ficheiro.serializar("Ficheiro");
        this.parentFrame.trocaPainel(new ConsultarDesporto(this.parentFrame, this.admin));
    }//GEN-LAST:event_BtnVoltar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JButton BtnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
