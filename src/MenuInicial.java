/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo.hbezerra
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MenuInicial() {
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

        JVendas = new javax.swing.JButton();
        JControleEstoque = new javax.swing.JButton();
        JControleUsuarios = new javax.swing.JButton();
        JAdicionarClientes = new javax.swing.JButton();
        JRelatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JVendas.setText("Vendas");
        JVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JVendasActionPerformed(evt);
            }
        });
        getContentPane().add(JVendas);
        JVendas.setBounds(70, 100, 160, 57);

        JControleEstoque.setText("Controle de Estoque");
        JControleEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JControleEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(JControleEstoque);
        JControleEstoque.setBounds(290, 250, 170, 60);

        JControleUsuarios.setText("Controle de Usuários");
        JControleUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JControleUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(JControleUsuarios);
        JControleUsuarios.setBounds(520, 250, 170, 57);

        JAdicionarClientes.setText("Controle de clientes");
        JAdicionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAdicionarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(JAdicionarClientes);
        JAdicionarClientes.setBounds(70, 250, 160, 57);

        JRelatorios.setText("Relatórios");
        JRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(JRelatorios);
        JRelatorios.setBounds(520, 100, 170, 57);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lojão do Kikão");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 310, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JVendasActionPerformed

        Vendas vendas = new Vendas();
        vendas.setSize(800, 800);
        vendas.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_JVendasActionPerformed

    private void JControleEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JControleEstoqueActionPerformed

        ControleEstoque controleestoque = new ControleEstoque();
        controleestoque.setSize(800, 800);
        controleestoque.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_JControleEstoqueActionPerformed

    private void JControleUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JControleUsuariosActionPerformed

        CadastroUsuarios cadastroUsuarios = new CadastroUsuarios();
        cadastroUsuarios.setSize(600, 600);
        cadastroUsuarios.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_JControleUsuariosActionPerformed

    private void JAdicionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAdicionarClientesActionPerformed

        CadastroClientes cadastroclientes = new CadastroClientes();
        cadastroclientes.setSize(800, 800);
        cadastroclientes.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_JAdicionarClientesActionPerformed

    private void JRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRelatoriosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuInicial telaInicial = new MenuInicial();
                telaInicial.setSize(800, 800);
                telaInicial.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JAdicionarClientes;
    private javax.swing.JButton JControleEstoque;
    private javax.swing.JButton JControleUsuarios;
    private javax.swing.JButton JRelatorios;
    private javax.swing.JButton JVendas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}