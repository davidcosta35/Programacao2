package GUI;

import Classes.Cliente;
import Classes.Dono;
import Classes.Ficheiro;
import Classes.Recinto;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class PesquisarRecinto extends javax.swing.JPanel {

    private Cliente cliente;
    private LoginCliente parentFrame;
    
    public PesquisarRecinto(Cliente cliente, LoginCliente parentFrame) {
        initComponents();
        this.cliente = cliente;
        this.parentFrame = parentFrame;
        DefaultTableModel table = (DefaultTableModel) this.jTable.getModel();

        for (Map.Entry<String, Dono> mapa : Ficheiro.getRepo().getDonos().entrySet()) {
           for (Recinto r : mapa.getValue().getRecintos()) {
            table.addRow(new Object[]{r.getNome(), r.getLocalidade(),r.getMorada(), r.getTipoRecinto()});
           }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        BtnVoltar = new javax.swing.JButton();
        BtnVoltar1 = new javax.swing.JButton();
        BtnDesportos = new javax.swing.JButton();
        BtnServicos = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Recintos");
        add(jLabel1);
        jLabel1.setBounds(270, 210, 130, 35);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recinto", "Localidade", "Morada", "Tipo de Recinto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(270, 260, 500, 240);

        BtnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        add(BtnVoltar);
        BtnVoltar.setBounds(600, 520, 175, 40);

        BtnVoltar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnVoltar1.setText("Reservar");
        BtnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltar1ActionPerformed(evt);
            }
        });
        add(BtnVoltar1);
        BtnVoltar1.setBounds(270, 520, 175, 40);

        BtnDesportos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDesportos.setText("Consultar Desportos");
        add(BtnDesportos);
        BtnDesportos.setBounds(50, 340, 175, 40);

        BtnServicos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnServicos.setText("Consultar Serviços");
        add(BtnServicos);
        BtnServicos.setBounds(50, 390, 175, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
    }//GEN-LAST:event_jTableMouseClicked

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.parentFrame.trocaPainel(new MenuCliente(this.cliente, this.parentFrame));
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVoltar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDesportos;
    private javax.swing.JButton BtnServicos;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JButton BtnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
