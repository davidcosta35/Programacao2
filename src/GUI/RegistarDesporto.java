package GUI;

import Classes.Desporto;
import Classes.Ficheiro;
import javax.swing.JOptionPane;

public class RegistarDesporto extends javax.swing.JPanel {

    private LoginAdmin parentFrame;
    private Desporto novoDesporto;
    private String admin;
    
    public RegistarDesporto(LoginAdmin parentFrame, String admin) {
        initComponents();
        this.parentFrame = parentFrame;
        this.admin = admin;
        this.jLabelNome.setVisible(false);
        this.BtnConcluir.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnConcluir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jNomeFocusLost(evt);
            }
        });
        add(jNome);
        jNome.setBounds(310, 270, 200, 27);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");
        add(jLabel3);
        jLabel3.setBounds(240, 270, 70, 22);

        BtnConcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnConcluir.setText("Concluir");
        BtnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConcluirActionPerformed(evt);
            }
        });
        add(BtnConcluir);
        BtnConcluir.setBounds(440, 500, 150, 35);

        BtnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        add(BtnCancelar);
        BtnCancelar.setBounds(200, 500, 150, 35);

        jLabelNome.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 51, 51));
        jLabelNome.setText("Esse desporto já existe.");
        add(jLabelNome);
        jLabelNome.setBounds(520, 270, 200, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo-desportivo.png"))); // NOI18N
        jLabel4.setToolTipText("");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNomeFocusLost
        if (Ficheiro.getRepo().getDesportos().containsKey(this.jNome.getText())) {
            this.jLabelNome.setVisible(true);
            this.BtnConcluir.setEnabled(false);
            } else {
                this.jLabelNome.setVisible(false);
                this.BtnConcluir.setEnabled(true);
            }
    }//GEN-LAST:event_jNomeFocusLost

    private void BtnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcluirActionPerformed
        this.novoDesporto = new Desporto();
        this.novoDesporto.setNome(this.jNome.getText());
        JOptionPane.showMessageDialog(null, "Registo efetuado com sucesso!");
        Ficheiro.getRepo().getDesportos().put(this.novoDesporto.getNome(), (Desporto) novoDesporto);
        Ficheiro.serializar("Ficheiro");
        this.parentFrame.trocaPainel(new ConsultarDesporto(this.parentFrame, this.admin));
    }//GEN-LAST:event_BtnConcluirActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.parentFrame.trocaPainel(new ConsultarDesporto(this.parentFrame, this.admin));
    }//GEN-LAST:event_BtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConcluir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jNome;
    // End of variables declaration//GEN-END:variables
}
