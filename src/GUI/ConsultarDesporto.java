package GUI;

import Classes.Desporto;
import Classes.Dono;
import Classes.Ficheiro;
import Classes.Recinto;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarDesporto extends javax.swing.JPanel {

   private LoginAdmin parentFrameAdmin;
   private LoginDono parentFrameDono;
   private String admin;
   private Recinto recinto;
   private Dono dono;

   public ConsultarDesporto(LoginAdmin parentFrame, String admin) {
      initComponents();
      this.admin = admin;
      this.parentFrameAdmin = parentFrame;
      this.BtnConcluir.setVisible(false);

      DefaultTableModel table = (DefaultTableModel) this.jTable.getModel();
      for (Map.Entry<String, Desporto> mapa : Ficheiro.getRepo().getDesportos().entrySet()) {
         table.addRow(new Object[]{mapa.getValue().getNome()});
      }
   }

   public ConsultarDesporto(Recinto recinto, Dono dono, LoginDono parentFrame) {
      initComponents();
      this.dono = dono;
      this.recinto = recinto;
      this.parentFrameDono = parentFrame;
      this.BtnRemover.setVisible(false);
      this.BtnVoltar.setVisible(false);

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
      BtnConcluir = new javax.swing.JButton();
      BtnVoltar = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      BtnAdicionar = new javax.swing.JButton();
      BtnRemover = new javax.swing.JButton();
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
      jScrollPane1.setViewportView(jTable);

      add(jScrollPane1);
      jScrollPane1.setBounds(180, 190, 460, 240);

      BtnConcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
      BtnConcluir.setText("Concluir");
      BtnConcluir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtnConcluirActionPerformed(evt);
         }
      });
      add(BtnConcluir);
      BtnConcluir.setBounds(180, 450, 125, 40);

      BtnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
      BtnVoltar.setText("Voltar");
      BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtnVoltarActionPerformed(evt);
         }
      });
      add(BtnVoltar);
      BtnVoltar.setBounds(180, 450, 125, 40);

      jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setText("Desportos");
      add(jLabel1);
      jLabel1.setBounds(180, 120, 180, 43);

      BtnAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
      BtnAdicionar.setText("Adicionar");
      BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtnAdicionarActionPerformed(evt);
         }
      });
      add(BtnAdicionar);
      BtnAdicionar.setBounds(510, 450, 125, 40);

      BtnRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
      BtnRemover.setText("Remover");
      BtnRemover.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtnRemoverActionPerformed(evt);
         }
      });
      add(BtnRemover);
      BtnRemover.setBounds(350, 450, 125, 40);

      jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
      jLabel3.setToolTipText("");
      add(jLabel3);
      jLabel3.setBounds(0, 0, 800, 600);
   }// </editor-fold>//GEN-END:initComponents

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
       this.parentFrameAdmin.trocaPainel(new MenuAdmin(this.admin, this.parentFrameAdmin));
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
       if (this.parentFrameAdmin != null) {
          this.parentFrameAdmin.trocaPainel(new RegistarDesporto(this.parentFrameAdmin, this.admin));
       } else {
          Desporto d = null;
          String nomeD = (String) this.jTable.getValueAt(this.jTable.getSelectedRow(), 0);

          for (Desporto des : this.recinto.getDesportos()) {
             if (des.getNome().equals(nomeD)) {
                JOptionPane.showMessageDialog(null, "Esse desporto já está incluido na lista de desportos do Recinto.", "Erro", JOptionPane.ERROR_MESSAGE);
             } else {
                d = des;
                this.recinto.getDesportos().add(d);
             }
          }
          int n = JOptionPane.showConfirmDialog(null, "Desporto adicionado com sucesso.\nDeseja adicionar mais desportos?", "Adicionar", JOptionPane.YES_NO_OPTION);
          Ficheiro.serializar("Ficheiro");
          if (n == 0) {
             this.parentFrameDono.trocaPainel(new ConsultarDesporto(this.recinto, this.dono, this.parentFrameDono));
          } else {
             this.parentFrameDono.trocaPainel(new AdicionarServicos(this.recinto, this.dono, this.parentFrameDono));
          }
       }
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverActionPerformed
       if (this.jTable.getSelectedRowCount() == 1) {
          String nomeD = (String) this.jTable.getValueAt(this.jTable.getSelectedRow(), 0);
          Ficheiro.getRepo().getDesportos().remove(nomeD);
       }
       Ficheiro.serializar("Ficheiro");
       this.parentFrameAdmin.trocaPainel(new ConsultarDesporto(this.parentFrameAdmin, this.admin));
    }//GEN-LAST:event_BtnRemoverActionPerformed

   private void BtnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcluirActionPerformed
      this.parentFrameDono.trocaPainel(new AdicionarServicos(this.recinto, this.dono, this.parentFrameDono));
   }//GEN-LAST:event_BtnConcluirActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton BtnAdicionar;
   private javax.swing.JButton BtnConcluir;
   private javax.swing.JButton BtnRemover;
   private javax.swing.JButton BtnVoltar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable;
   // End of variables declaration//GEN-END:variables
}
