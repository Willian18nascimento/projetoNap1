/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Willian
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public FrmMenu() {
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

        Deskpainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnarquivosprodutos = new javax.swing.JMenuItem();
        mnarquivosusuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnarquivosaltsenha = new javax.swing.JMenuItem();
        mnarquivosaltusuarios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnarquivossair = new javax.swing.JMenuItem();
        mnmovimentos = new javax.swing.JMenu();
        mnmovimentosvendas = new javax.swing.JMenuItem();
        mnmovimentosrelatorios = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        mnajudasobre = new javax.swing.JMenuItem();
        mnajudaajuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Deskpainel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout DeskpainelLayout = new javax.swing.GroupLayout(Deskpainel);
        Deskpainel.setLayout(DeskpainelLayout);
        DeskpainelLayout.setHorizontalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        DeskpainelLayout.setVerticalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        mnarquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconArquivos.png"))); // NOI18N
        mnarquivos.setText("Arquivos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconClientes.jpg"))); // NOI18N
        jMenuItem1.setText("Clientes");
        mnarquivos.add(jMenuItem1);

        mnarquivosprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconProdutos.jpg"))); // NOI18N
        mnarquivosprodutos.setText("Produtos");
        mnarquivosprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosprodutosActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosprodutos);

        mnarquivosusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconUsuario.png"))); // NOI18N
        mnarquivosusuarios.setText("Usuários");
        mnarquivosusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosusuariosActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosusuarios);
        mnarquivos.add(jSeparator1);

        mnarquivosaltsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconaltSenha.png"))); // NOI18N
        mnarquivosaltsenha.setText("Alterar Senha");
        mnarquivosaltsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosaltsenhaActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosaltsenha);

        mnarquivosaltusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconAltUsuario.png"))); // NOI18N
        mnarquivosaltusuarios.setText("Alterar Usuário");
        mnarquivos.add(mnarquivosaltusuarios);
        mnarquivos.add(jSeparator2);

        mnarquivossair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconSair.jpg"))); // NOI18N
        mnarquivossair.setText("Sair");
        mnarquivos.add(mnarquivossair);

        jMenuBar1.add(mnarquivos);

        mnmovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconMovimentos.png"))); // NOI18N
        mnmovimentos.setText("Movimentos");

        mnmovimentosvendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconVendas.png"))); // NOI18N
        mnmovimentosvendas.setText("Vendas");
        mnmovimentosvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmovimentosvendasActionPerformed(evt);
            }
        });
        mnmovimentos.add(mnmovimentosvendas);

        mnmovimentosrelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconRelatorio.png"))); // NOI18N
        mnmovimentosrelatorios.setText("Relatórios Vendas");
        mnmovimentos.add(mnmovimentosrelatorios);

        jMenuBar1.add(mnmovimentos);

        mnajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconAjuda.png"))); // NOI18N
        mnajuda.setText("Ajuda");

        mnajudasobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconSobre.png"))); // NOI18N
        mnajudasobre.setText("Sobre");
        mnajudasobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnajudasobreActionPerformed(evt);
            }
        });
        mnajuda.add(mnajudasobre);

        mnajudaajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconAjudaA.jpg"))); // NOI18N
        mnajudaajuda.setText("Ajuda");
        mnajuda.add(mnajudaajuda);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnarquivosprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosprodutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivosprodutosActionPerformed

    private void mnarquivosaltsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosaltsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivosaltsenhaActionPerformed

    private void mnmovimentosvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmovimentosvendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnmovimentosvendasActionPerformed

    private void mnajudasobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnajudasobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnajudasobreActionPerformed

    private void mnarquivosusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosusuariosActionPerformed
        // Este código é do botão Usuários da barra de Menu
        frmUsuarios fusuarios = new frmUsuarios();
        Deskpainel.add(fusuarios );
        fusuarios.show();
    }//GEN-LAST:event_mnarquivosusuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Deskpainel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenuItem mnajudaajuda;
    private javax.swing.JMenuItem mnajudasobre;
    private javax.swing.JMenu mnarquivos;
    private javax.swing.JMenuItem mnarquivosaltsenha;
    private javax.swing.JMenuItem mnarquivosaltusuarios;
    private javax.swing.JMenuItem mnarquivosprodutos;
    private javax.swing.JMenuItem mnarquivossair;
    private javax.swing.JMenuItem mnarquivosusuarios;
    private javax.swing.JMenu mnmovimentos;
    private javax.swing.JMenuItem mnmovimentosrelatorios;
    private javax.swing.JMenuItem mnmovimentosvendas;
    // End of variables declaration//GEN-END:variables
}
