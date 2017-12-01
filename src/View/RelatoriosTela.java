/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Mock.CadastrarCliente;
import Mock.CadastrarProduto;
import Mock.VendasMock;
import DAO.RelatorioClientes;
import DAO.RelatorioProdutos;
import DAO.RelatorioVendas;
import java.security.Provider;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.bezerra
 */
public class RelatoriosTela extends javax.swing.JFrame {

    private int tamanhoObjeto = 1000;

    private String coluna1 = "Coluna 1", coluna2 = "Coluna 2", coluna3 = "Coluna 3", coluna4 = "Coluna 4", coluna5 = "Coluna 5", coluna6 = "Coluna 6", coluna7 = "Coluna 7", coluna8 = "Coluna 8", coluna9 = "Coluna 9", coluna10 = "Coluna 10", coluna11 = "Coluna 11";

    /**
     * Creates new form Relatorios
     */
    public RelatoriosTela() {
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

        jLabel1 = new javax.swing.JLabel();
        JResultadoReport = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboRelatorios = new javax.swing.JComboBox<>();
        BotaoGerarRelatorio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jFormattedDataInicial = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedDataFinal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatórios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 0, 190, 40);
        getContentPane().add(JResultadoReport);
        JResultadoReport.setBounds(110, 220, 330, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Resultado");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 180, 90, 20);

        jComboRelatorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total de Produtos", "Total de Clientes","Total de Vendas"}));
        getContentPane().add(jComboRelatorios);
        jComboRelatorios.setBounds(280, 40, 220, 40);

        BotaoGerarRelatorio.setText("Gerar");
        BotaoGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoGerarRelatorio);
        BotaoGerarRelatorio.setBounds(370, 160, 59, 23);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [tamanhoObjeto][tamanhoObjeto],
            new String [] {
                coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7, coluna8
            }
        ));
        jScrollPane2.setViewportView(jTableClientes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 210, 660, 404);

        jLabel3.setText("Data Inicial  (AAAA-MM-DD)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 100, 140, 20);

        try {
            jFormattedDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedDataInicial);
        jFormattedDataInicial.setBounds(230, 120, 130, 40);

        jLabel4.setText("Data Final (AAAA-MM-DD)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 100, 140, 20);

        try {
            jFormattedDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedDataFinal);
        jFormattedDataFinal.setBounds(440, 120, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarRelatorioActionPerformed

        DAO.RelatorioProdutos relatorioproduto = new RelatorioProdutos();
        DAO.RelatorioClientes relatoriocliente = new RelatorioClientes();
        DAO.RelatorioVendas relatoriovendas = new RelatorioVendas();


        int quantidadeproduto = relatorioproduto.SelectQuantosProdutos();
        int quantidadecliente = relatoriocliente.SelectQuantosClientes();
        int quantidadevendas = relatoriovendas.SelectQuantidadeVendas();

        int linha = 0, coluna = 0;

        //ISSO LIMPA A TABELA
        for (int i = 0; i < jTableClientes.getRowCount(); i++) {
            for (int j = 0; j < jTableClientes.getColumnCount(); j++) {
                jTableClientes.setValueAt("", i, j);
            }
        }

        if (jComboRelatorios.getSelectedItem().equals("Total de Produtos")) {

            //Mock.CadastrarProduto relatorioproduto = new CadastrarProduto();
            System.out.println("uhaudsaudhaudasu" + quantidadeproduto);

            if (quantidadeproduto == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum Produto na base");
            } else {
                for (int i = 1; i <= relatorioproduto.SelectQuantosProdutos(); i++) {

                    relatorioproduto.SelectProduto(i,String.valueOf(jFormattedDataInicial.getText()).replace("/", "-"),String.valueOf(jFormattedDataFinal.getText()).replace("/", "-"));
                    jTableClientes.setValueAt(relatorioproduto.GetcodigoBarras(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetNomeProduto(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetValor(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetValorDesconto(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetFaixaEtaria(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetFabricante(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetPrazoGarantia(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatorioproduto.GetQuantidade(), linha, coluna);
                    linha++;
                    coluna = 0;

                }

            }

        } else if (jComboRelatorios.getSelectedItem().equals("Total de Clientes")) {

            //Mock.CadastrarCliente relatoriocliente = new CadastrarCliente();
            if (quantidadecliente == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum Cliente na base");
            } else {

                for (int i = 1; i <= relatoriocliente.SelectQuantosClientes(); i++) {

                    relatoriocliente.SelectCliente(i);
                    jTableClientes.setValueAt(relatoriocliente.GetNome(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriocliente.GetCPF(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriocliente.GetCPF(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriocliente.GetTelefone(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriocliente.GetCelular(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriocliente.GetEmail(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriocliente.GetEstadoCivil(), linha, coluna);
                    linha++;
                    coluna = 0;
                }
            }

        } else if (jComboRelatorios.getSelectedItem().equals("Total de Vendas")) {

            //Mock.VendasMock vendasrelatorio = new VendasMock();

            //int quantidadevendas = relatoriovendas.SelectQuantidadeVendas();
            if (relatoriovendas.SelectQuantidadeVendas() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma Venda na base");
            } else {
                for (int i = 1; i <= quantidadevendas; i++) {

                    relatoriovendas.SelectVendas(i,String.valueOf(jFormattedDataInicial.getText()).replace("/", "-"),String.valueOf(jFormattedDataFinal.getText()).replace("/", "-"));
                    jTableClientes.setValueAt(relatoriovendas.GetCPFCliente(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt("R$" + relatoriovendas.GetValorVenda(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriovendas.GetDataVenda(), linha, coluna);
                    coluna++;
                    jTableClientes.setValueAt(relatoriovendas.GetQuantidadeItens(), linha, coluna);
                    linha++;
                    coluna = 0;

                }

            }

        }

        linha = 0;

        coluna = 0;


    }//GEN-LAST:event_BotaoGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoGerarRelatorio;
    private javax.swing.JLabel JResultadoReport;
    private javax.swing.JComboBox<String> jComboRelatorios;
    private javax.swing.JFormattedTextField jFormattedDataFinal;
    private javax.swing.JFormattedTextField jFormattedDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    // End of variables declaration//GEN-END:variables
}
