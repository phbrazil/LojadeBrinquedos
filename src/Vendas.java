
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.bezerra
 */
public class Vendas extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();

        jSpinnerQuantidade.setValue(1);
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
        JNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JButtonAdicionarCarrinho = new javax.swing.JButton();
        JFinalizarCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JValorTotal = new javax.swing.JTextField();
        JCancelarCompra = new javax.swing.JButton();
        JBPesquisarProduto = new javax.swing.JButton();
        JFaixaEtaria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JGarantia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JNomeClienteVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JIDProduto = new javax.swing.JTextField();
        JCPFClienteVenda = new javax.swing.JTextField();
        JBPesquisarCPF = new javax.swing.JButton();
        JVendaFabricante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código do Produto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 120, 110, 20);
        getContentPane().add(JNomeProduto);
        JNomeProduto.setBounds(210, 140, 230, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome Produto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 120, 120, 20);
        getContentPane().add(JPreco);
        JPreco.setBounds(480, 140, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Preço");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 120, 90, 20);

        JButtonAdicionarCarrinho.setText("Adicionar ao Carrinho");
        JButtonAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAdicionarCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAdicionarCarrinho);
        JButtonAdicionarCarrinho.setBounds(30, 290, 210, 40);

        JFinalizarCompra.setText("Finalizar Compra");
        getContentPane().add(JFinalizarCompra);
        JFinalizarCompra.setBounds(590, 370, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Valor Total");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 280, 90, 30);
        getContentPane().add(JValorTotal);
        JValorTotal.setBounds(590, 310, 160, 40);

        JCancelarCompra.setText("Cancelar Compra");
        getContentPane().add(JCancelarCompra);
        JCancelarCompra.setBounds(50, 370, 150, 40);

        JBPesquisarProduto.setText("Pesquisar Produto");
        JBPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(JBPesquisarProduto);
        JBPesquisarProduto.setBounds(40, 170, 140, 23);
        getContentPane().add(JFaixaEtaria);
        JFaixaEtaria.setBounds(210, 240, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Faixa etária");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 220, 120, 20);
        getContentPane().add(JGarantia);
        JGarantia.setBounds(480, 240, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Garantia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 220, 120, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("CPF do cliente");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 40, 110, 20);

        JNomeClienteVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNomeClienteVendaActionPerformed(evt);
            }
        });
        getContentPane().add(JNomeClienteVenda);
        JNomeClienteVenda.setBounds(410, 60, 340, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nome Cliente");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 40, 110, 20);
        getContentPane().add(JIDProduto);
        JIDProduto.setBounds(40, 140, 140, 30);
        getContentPane().add(JCPFClienteVenda);
        JCPFClienteVenda.setBounds(40, 60, 320, 30);

        JBPesquisarCPF.setText("Pesquisar CPF");
        JBPesquisarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarCPFActionPerformed(evt);
            }
        });
        getContentPane().add(JBPesquisarCPF);
        JBPesquisarCPF.setBounds(40, 90, 140, 23);
        getContentPane().add(JVendaFabricante);
        JVendaFabricante.setBounds(40, 240, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fabricante");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 220, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Vendas");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 10, 220, 30);
        getContentPane().add(jSpinnerQuantidade);
        jSpinnerQuantidade.setBounds(710, 140, 60, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Quantidade");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(710, 110, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarProdutoActionPerformed

        SelectBancoMySQL selectproduto = new SelectBancoMySQL();
        boolean codigoprod = false;

        do {
            try {
                selectproduto.SelectProduto(Integer.valueOf(JIDProduto.getText()));
                codigoprod = true;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Código de produto inválido");
                break;
            }
        } while (codigoprod == false);

        JNomeProduto.setText(String.valueOf(selectproduto.GetnomeProduto()));

        JFaixaEtaria.setText(String.valueOf(selectproduto.GetFaixaEtaria()));
        JPreco.setText(String.valueOf("R$" + selectproduto.GetValorProduto()));
        JGarantia.setText(String.valueOf(selectproduto.GetGarantia()));
        JVendaFabricante.setText(String.valueOf(selectproduto.GetFabricante()));

        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarProdutoActionPerformed

    private void JBPesquisarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarCPFActionPerformed

        SelectBancoMySQL pesquisarcliente = new SelectBancoMySQL();

        boolean cpfdigitado = false;

        do {
            try {
                pesquisarcliente.SelectCPFCliente(Long.valueOf(JCPFClienteVenda.getText()));
                cpfdigitado = true;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite um CPF");
                break;
            }
        } while (cpfdigitado == false);

        if (String.valueOf(pesquisarcliente.GetNomeCliente()).equals("") && cpfdigitado == true) {

            String[] opcaoselecionada = {"Sim", "Não"};

            String novocliente = (String) JOptionPane.showInputDialog(null, "Deseja cadastrar um novo cliente?",
                    "Cliente não cadastrado", JOptionPane.QUESTION_MESSAGE, null, opcaoselecionada, opcaoselecionada[0]);

            if (novocliente.equals("Sim")) {

                CadastroClientes cadastroclientes = new CadastroClientes();
                cadastroclientes.setSize(800, 800);
                cadastroclientes.setVisible(true);

                JCPFClienteVenda.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "Insira um CPF cadastrado");

                JCPFClienteVenda.setText("");

            }

        } else {

            JNomeClienteVenda.setText(String.valueOf(pesquisarcliente.GetNomeCliente()));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarCPFActionPerformed

    private void JNomeClienteVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNomeClienteVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNomeClienteVendaActionPerformed

    private void JButtonAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAdicionarCarrinhoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonAdicionarCarrinhoActionPerformed

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
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPesquisarCPF;
    private javax.swing.JButton JBPesquisarProduto;
    private javax.swing.JButton JButtonAdicionarCarrinho;
    private javax.swing.JTextField JCPFClienteVenda;
    private javax.swing.JButton JCancelarCompra;
    private javax.swing.JTextField JFaixaEtaria;
    private javax.swing.JButton JFinalizarCompra;
    private javax.swing.JTextField JGarantia;
    private javax.swing.JTextField JIDProduto;
    private javax.swing.JTextField JNomeClienteVenda;
    private javax.swing.JTextField JNomeProduto;
    private javax.swing.JTextField JPreco;
    private javax.swing.JTextField JValorTotal;
    private javax.swing.JTextField JVendaFabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinnerQuantidade;
    // End of variables declaration//GEN-END:variables
}
