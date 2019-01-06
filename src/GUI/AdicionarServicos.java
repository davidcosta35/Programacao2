package GUI;

import javax.swing.JOptionPane;
import Classes.Recinto;
import Classes.Dono;
import Classes.Ficheiro;
import Classes.Servicos;
import java.util.Map;

public class AdicionarServicos extends javax.swing.JPanel {

   private Recinto recinto;
   private Dono dono;
   private LoginDono parentFrameDono;
   private Servicos novoServico;

   public AdicionarServicos(Recinto recinto, Dono dono, LoginDono parentFrame) {
      initComponents();
      this.dono = dono;
      this.recinto = recinto;
      this.parentFrameDono = parentFrame;

      
         for (Map.Entry<String, Servicos> mapa : Ficheiro.getRepo().getServicos().entrySet()) {
            this.jComboServico.addItem(mapa.getKey());
         }
      
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
      BtnAdicionar = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      jComboServico = new javax.swing.JComboBox<>();
      jAdicionarServico = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();

      setLayout(null);

      jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setText("Serviços");
      add(jLabel1);
      jLabel1.setBounds(330, 170, 147, 43);

      BtnAdicionar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
      BtnAdicionar.setText("Adicionar");
      BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtnAdicionarActionPerformed(evt);
         }
      });
      add(BtnAdicionar);
      BtnAdicionar.setBounds(310, 380, 150, 35);

      jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      jLabel2.setText("Nome do Serviço:");
      add(jLabel2);
      jLabel2.setBounds(90, 325, 160, 22);

      jComboServico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
      jComboServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Serviço" }));
      add(jComboServico);
      jComboServico.setBounds(260, 320, 250, 35);

      jAdicionarServico.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
      jAdicionarServico.setText("Adicionar novo Serviço");
      jAdicionarServico.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jAdicionarServicoActionPerformed(evt);
         }
      });
      add(jAdicionarServico);
      jAdicionarServico.setBounds(520, 320, 200, 34);

      jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
      jLabel3.setToolTipText("");
      add(jLabel3);
      jLabel3.setBounds(0, 0, 800, 600);
   }// </editor-fold>//GEN-END:initComponents

   private void jAdicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarServicoActionPerformed
      String getText = JOptionPane.showInputDialog("Novo Serviço");
      boolean existe = false;
      for (Map.Entry<String, Servicos> mapa : Ficheiro.getRepo().getServicos().entrySet()) {
         if (getText.equals(mapa.getKey())) {
            existe = true;
            break;
         }
      }
      if (existe) {
         JOptionPane.showMessageDialog(null, "Serviço já existente.\nSelecione na lista.", "Erro", JOptionPane.ERROR_MESSAGE);
      } else if (getText == null) {
         System.out.println("Serviço null");
      } else {
         this.novoServico = new Servicos();
         this.novoServico.setNome(getText);
         JOptionPane.showMessageDialog(null, "Serviço registado com sucesso!");
         Ficheiro.getRepo().getServicos().put(this.novoServico.getNome(), (Servicos) novoServico);
         Ficheiro.serializar("Ficheiro");
         this.jComboServico.addItem(getText);
      }
   }//GEN-LAST:event_jAdicionarServicoActionPerformed

   private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
      if (this.jComboServico.getSelectedIndex() == 0) {
         JOptionPane.showMessageDialog(null, "Serviço inválido.\nSelecione uma das opções ou crie um novo Serviço.", "Erro", JOptionPane.ERROR_MESSAGE);
      } else {
         
         Servicos s = null;
          String nomeD = (String) this.jComboServico.getSelectedItem();

          for (Servicos ser : this.recinto.getServicos()) {
             if (ser.getNome().equals(nomeD)) {
                JOptionPane.showMessageDialog(null, "Esse serviço já está incluido na lista de serviços do Recinto.");
             } else {
                s = ser;
                this.recinto.getServicos().add(s);
             }
          }
          int n = JOptionPane.showConfirmDialog(null, "Serviço adicionado com sucesso.\nDeseja adicionar mais serviços?", "Adicionar", JOptionPane.YES_NO_OPTION);
          Ficheiro.serializar("Ficheiro");
          if (n == 0) {
             this.parentFrameDono.trocaPainel(new AdicionarServicos(this.recinto, this.dono, this.parentFrameDono));
          } else {
             this.parentFrameDono.trocaPainel(new ConsultarRecinto(this.parentFrameDono, this.dono));
          }
      }
      Ficheiro.serializar("Ficheiro");
   }//GEN-LAST:event_BtnAdicionarActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton BtnAdicionar;
   private javax.swing.JButton jAdicionarServico;
   private javax.swing.JComboBox<String> jComboServico;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   // End of variables declaration//GEN-END:variables
}