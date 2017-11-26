package View;

import Controller.AtualizarListaProdutos;
import Mock.CadastrarCliente;
import Mock.CadastrarProduto;
import Mock.VendasCanceladasEfetuadas;
import Mock.CadastrarProduto;
import Mock.VendasMock;
import Model.Clientes;
import Model.Produtos;
import Model.Vendas;
import DAO.SelectCPFlienteVenda;
import DAO.SelectProdutoVenda;
import View.CadastroClientesTela;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.bezerra
 */
public class VendasTela extends javax.swing.JFrame {

    private int linha = 0;
    private int coluna = 0;
    private double valorvenda = 0;
    private boolean codigoprod = false;
    private int idproduto;
    private String cpfcliente;
    private int quantidadeitens = 0;
    private boolean statusvenda;
    private int contadorcarrinho = 0;
    private boolean cpfdigitado = false;

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Date today = Calendar.getInstance().getTime();

    /**
     * Creates new form Vendas
     */
    public VendasTela() {
        initComponents();

        JNomeProduto.setEditable(false);

        JNomeCliente.setEditable(false);

        JPreco.setEditable(false);
        jFormattedValorTotal.setEditable(false);
        jFormattedValorDesconto.setEditable(false);
        JFaixaEtaria.setEditable(false);
        JVendaFabricante.setEditable(false);
        JGarantia.setEditable(false);

        jSpinnerQuantidade.setValue(1);

        JDataVenda.setText(String.valueOf(""));
        JNomeCliente.setText(String.valueOf(""));

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
        JCancelarCompra = new javax.swing.JButton();
        JBPesquisarProduto = new javax.swing.JButton();
        JFaixaEtaria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JGarantia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JIDProduto = new javax.swing.JTextField();
        JBPesquisarCPF = new javax.swing.JButton();
        JVendaFabricante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        JButtonExcluir = new javax.swing.JToggleButton();
        jFormattedCPFVenda = new javax.swing.JFormattedTextField();
        jFormattedValorDesconto = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JDataVenda = new javax.swing.JLabel();
        JNomeCliente = new javax.swing.JTextField();
        jFormattedValorTotal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código do Produto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 120, 110, 20);
        getContentPane().add(JNomeProduto);
        JNomeProduto.setBounds(210, 140, 300, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome Produto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 120, 120, 20);

        JPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(JPreco);
        JPreco.setBounds(520, 140, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Preço");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 120, 90, 20);

        JButtonAdicionarCarrinho.setText("Adicionar ao Carrinho");
        JButtonAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAdicionarCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAdicionarCarrinho);
        JButtonAdicionarCarrinho.setBounds(30, 280, 210, 40);

        JFinalizarCompra.setText("Finalizar Venda");
        JFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(JFinalizarCompra);
        JFinalizarCompra.setBounds(40, 580, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Valor Total");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 280, 90, 30);

        JCancelarCompra.setText("Cancelar Venda");
        JCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCancelarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(JCancelarCompra);
        JCancelarCompra.setBounds(620, 610, 150, 40);

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nome Cliente");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 40, 110, 20);
        getContentPane().add(JIDProduto);
        JIDProduto.setBounds(40, 140, 140, 30);

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
        jSpinnerQuantidade.setBounds(720, 140, 60, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Quantidade");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(720, 120, 70, 20);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Produto", "Nome Produto", "Preço R$", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(44, 424, 700, 130);

        JButtonExcluir.setText("Excluir");
        JButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonExcluir);
        JButtonExcluir.setBounds(630, 570, 105, 23);

        try {
            jFormattedCPFVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedCPFVenda);
        jFormattedCPFVenda.setBounds(40, 60, 280, 30);
        getContentPane().add(jFormattedValorDesconto);
        jFormattedValorDesconto.setBounds(620, 140, 80, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Desconto");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(620, 120, 120, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Data da Venda");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 340, 90, 20);

        JDataVenda.setText("jLabel14");
        getContentPane().add(JDataVenda);
        JDataVenda.setBounds(50, 370, 190, 40);

        JNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(JNomeCliente);
        JNomeCliente.setBounds(410, 60, 360, 30);

        jFormattedValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(jFormattedValorTotal);
        jFormattedValorTotal.setBounds(590, 310, 80, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarProdutoActionPerformed

        // SelectBancoMySQL selectproduto = new SelectBancoMySQL();
        //MOCK
        //CadastrarProduto cadastrarproduto = new CadastrarProduto();
        Produtos produtos = new Produtos();

        DAO.SelectProdutoVenda selectprodutovenda = new SelectProdutoVenda();

        do {
            try {
                idproduto = Integer.valueOf(JIDProduto.getText());
                codigoprod = true;
                selectprodutovenda.SelectProduto(idproduto, produtos);

                if (produtos.getNomeProduto() == null) {
                    //if (listaprodutos.GetNome(idproduto) == null) {

                    String[] opcaoselecionada = {"Sim", "Não"};

                    String novocliente = (String) JOptionPane.showInputDialog(null, "Deseja cadastrar um novo produto?",
                            "Produto não cadastrado", JOptionPane.QUESTION_MESSAGE, null, opcaoselecionada, opcaoselecionada[0]);

                    //SE ESCOLHER CADASTRAR UM NOVO PRODUTO ABRE O MENU PRODUTOS
                    if (novocliente.equals("Sim")) {

                        CadastroProdutosTela controleestoque = new CadastroProdutosTela();
                        controleestoque.setSize(800, 800);
                        controleestoque.setVisible(true);
                        controleestoque.setResizable(false);
                        controleestoque.setLocationRelativeTo(null);

                        JIDProduto.setText("");

                    }
                } else if (produtos.getQuantidade() == 0) {

                    JOptionPane.showMessageDialog(null, "Produto sem estoque");

                } else {

                    produtos.setQuantidade((Integer) (jSpinnerQuantidade.getValue()));
                    System.out.println(produtos.getQuantidade() + "huahuahdusahua");
                    //cadastrarproduto.obterProdutoLista(idproduto);
                    JFaixaEtaria.setText(String.valueOf(produtos.getFaixaEtaria()));
                    JNomeProduto.setText(String.valueOf(produtos.getNomeProduto()));
                    JPreco.setText(String.valueOf("R$" + String.valueOf(produtos.getValor())));
                    JGarantia.setText(String.valueOf(produtos.getGarantia()));
                    JVendaFabricante.setText(String.valueOf(produtos.getFabricante()));
                    jFormattedValorDesconto.setText(String.format("R$%.2f", produtos.getValorDesconto()));

                }
                /*
                selectproduto.SelectProduto(idproduto);
                JNomeProduto.setText(String.valueOf(selectproduto.GetnomeProduto()));
                JFaixaEtaria.setText(String.valueOf(selectproduto.GetFaixaEtaria()));
                JPreco.setText(String.valueOf("R$" + selectproduto.GetValorProduto()));
                JGarantia.setText(String.valueOf(selectproduto.GetGarantia()));
                JVendaFabricante.setText(String.valueOf(selectproduto.GetFabricante()));
                jFormattedValorDesconto.setText(String.valueOf("R$" + selectproduto.GetValorDesconto()));
                
                 */
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Código de produto inválido");
                break;
            }
        } while (codigoprod == false);

        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarProdutoActionPerformed

    private void JBPesquisarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarCPFActionPerformed

        DAO.SelectCPFlienteVenda selectclientevenda = new SelectCPFlienteVenda();

        //Mock.CadastrarCliente pesquisarcadastrado = new CadastrarCliente();
        System.out.println(jFormattedCPFVenda.getText());

        do {
            try {

                //BANCO
                cpfcliente = String.valueOf(jFormattedCPFVenda.getText());
                if (!cpfcliente.equals("   .   .   -  ")) {
                    cpfdigitado = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Digite um CPF");
                    break;
                }

                //MOCK
                //pesquisarcadastrado.obterClienteLista(String.valueOf(jFormattedCPFVenda.getText()));
            } catch (NumberFormatException erro) {
                break;
            }
        } while (cpfdigitado == false);

        //SE CPF NAO FOR EM BRANCO E FOR NUMERICO
        if (selectclientevenda.SelectCPFCliente(cpfcliente).equals("") && cpfdigitado == true) {

            String[] opcaoselecionada = {"Sim", "Não"};

            String novocliente = (String) JOptionPane.showInputDialog(null, "Deseja cadastrar um novo cliente?",
                    "Cliente não cadastrado", JOptionPane.QUESTION_MESSAGE, null, opcaoselecionada, opcaoselecionada[0]);

            //SE ESCOLHER CADASTRAR UM NOVO CLIENTE ABRE O MENU CADASTRO DE CLIENTES
            if (novocliente.equals("Sim")) {

                CadastroClientesTela cadastroclientes = new CadastroClientesTela();
                cadastroclientes.setSize(800, 800);
                cadastroclientes.setVisible(true);
                cadastroclientes.setResizable(false);
                cadastroclientes.setLocationRelativeTo(null);

                jFormattedCPFVenda.setText("");

                //SE ESCOLHER NAO CADASTRAR UM CLIENTE NOVO
            } else {

                JOptionPane.showMessageDialog(null, "Insira um CPF cadastrado");

                jFormattedCPFVenda.setText("");

            }

        } else {

            //SE JA ESTIVER NA BASE PUXA O NOME
            JNomeCliente.setText(String.valueOf(selectclientevenda.SelectCPFCliente(String.valueOf(jFormattedCPFVenda.getText()))));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarCPFActionPerformed

    private void JButtonAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAdicionarCarrinhoActionPerformed

        SelectProdutoVenda selectproduto = new SelectProdutoVenda();
        //CadastrarProduto cadastrarproduto = new CadastrarProduto();
        Produtos produtos = new Produtos();

        AtualizarListaProdutos atualizarcarrinho = new AtualizarListaProdutos();

        //ENQUANTO A LISTA FOR MENOR OU IGUAL A 10 ITENS
        if (linha <= 9 && JNomeProduto != null && (Integer) jSpinnerQuantidade.getValue()
                >= 1 && codigoprod == true) {
            quantidadeitens += (Integer) jSpinnerQuantidade.getValue();

            selectproduto.SelectProduto(idproduto, produtos);

            atualizarcarrinho.inserirProduto(produtos);

            //DATA DA VENDA SOMENTE COM ITEM NO CARRINHO
            JDataVenda.setText(String.valueOf(today));

            //jTableProdutos.setValueAt(JIDProduto.getText(), linha, coluna);
            jTableProdutos.setValueAt(String.valueOf(produtos.getCodigobarras()), linha, coluna);
            coluna++;
            jTableProdutos.setValueAt(String.valueOf(produtos.getNomeProduto()), linha, coluna);
            coluna++;
            jTableProdutos.setValueAt(String.valueOf(produtos.getValor()), linha, coluna);
            coluna++;
            jTableProdutos.setValueAt(String.valueOf(produtos.getQuantidade()), linha, coluna);
            coluna = 0;
            linha++;
            valorvenda = valorvenda + produtos.getValor() - produtos.getValorDesconto();
            jFormattedValorTotal.setText(String.format("R$%.2f", valorvenda));

            JIDProduto.setText("");
            JNomeProduto.setText("");
            JNomeProduto.setText("");
            JFaixaEtaria.setText("");
            JVendaFabricante.setText("");
            JPreco.setText("");
            JGarantia.setText("");
            jFormattedValorDesconto.setText("");

            codigoprod = false;

        } else if ((Integer) jSpinnerQuantidade.getValue()
                <= 0) {

            JOptionPane.showMessageDialog(null, "Informe a Quantidade");

        } else if (linha
                == 10) {

            JOptionPane.showMessageDialog(null, "Lista com 10 itens, finalize a venda");

        } else if (JNomeProduto.getText().equals("") && codigoprod
                == false) {

            JOptionPane.showMessageDialog(null, "Pesquise pelo produto");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonAdicionarCarrinhoActionPerformed


    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed

        //EXCLUIR PRODUTO DA LISTA
        if (jTableProdutos.getSelectedRow() >= 0) {

            valorvenda = 0.00;

            //Obtém a linha do item selecionado
            final int row = jTableProdutos.getSelectedRow();

            String numero = (String) jTableProdutos.getValueAt(row, 1);

            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + numero + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o produto
                    //String nomeproduto = (String) jTableProdutos.getValueAt(row, 0);
                    AtualizarListaProdutos atualizar = new AtualizarListaProdutos();

                    atualizar.RemoverProduto(row);

                    //ISSO LIMPA A TABELA
                    for (int i = 0; i < jTableProdutos.getRowCount(); i++) {
                        for (int j = 0; j < jTableProdutos.getColumnCount(); j++) {
                            jTableProdutos.setValueAt("", i, j);
                        }
                    }

                    //SE CARRINHO ESTIVER VAZION
                    if (atualizar.TamanhoListaCarrinho() == 0) {
                        JOptionPane.showMessageDialog(null, "Carrinho Vazio");
                        valorvenda = 0.00;
                        jFormattedValorTotal.setText(String.format("R$%.2f", valorvenda));
                        linha = 0;
                        coluna = 0;

                    //ISSO ATUALIZA A TABELA DEPOIS DE EXCLUIR UM PRODUTO
                    } else {
                        linha = 0;
                        jTableProdutos.setValueAt(String.valueOf(atualizar.atualizarListaCarrinho().getCodigobarras()), linha, coluna);
                        coluna++;
                        jTableProdutos.setValueAt(String.valueOf(atualizar.atualizarListaCarrinho().getNomeProduto()), linha, coluna);
                        coluna++;
                        jTableProdutos.setValueAt(String.valueOf(atualizar.atualizarListaCarrinho().getValor()), linha, coluna);
                        coluna++;
                        jTableProdutos.setValueAt(String.valueOf(atualizar.atualizarListaCarrinho().getQuantidade()), linha, coluna);
                        coluna = 0;
                        linha++;
                        valorvenda = valorvenda + atualizar.atualizarListaCarrinho().getValor();
                        jFormattedValorTotal.setText(String.format("R$%.2f", valorvenda));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }

            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNomeClienteActionPerformed

    private void JPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPrecoActionPerformed

    private void JFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFinalizarCompraActionPerformed

        //VendasCanceladasEfetuadas vendas = new VendasCanceladasEfetuadas();
        Mock.VendasMock vendas = new VendasMock();
        Model.Vendas vendasdados = new Vendas();
        String opcao = "";

        if (cpfdigitado == true) {

            String[] opcaopagamento = {"Dinheiro", "Débito", "Crédito", "Cancelar Venda"};

            opcao = (String) JOptionPane.showInputDialog(null, "Qual a opção de Pagamento?",
                    "Opção de Pagamento", JOptionPane.QUESTION_MESSAGE, null, opcaopagamento, opcaopagamento[0]);

            if (opcao.equals("Dinheiro") || opcao.equals("Débito") || opcao.equals("Crédito")) {

                vendasdados.setCPFCliente(cpfcliente);
                vendasdados.setTotalValor(valorvenda);
                vendasdados.setDataVenda(String.valueOf(JDataVenda.getText()));
                vendasdados.setQuantidadeItens(quantidadeitens);

                vendas.inserirVenda(vendasdados);

                JOptionPane.showMessageDialog(null, "Venda efetuada com Sucesso");

                //ISSO LIMPA A TABELA
                for (int i = 0; i < jTableProdutos.getRowCount(); i++) {
                    for (int j = 0; j < jTableProdutos.getColumnCount(); j++) {
                        jTableProdutos.setValueAt("", i, j);
                    }
                }
            } else if (opcao.equals("Cancelar Venda") && cpfdigitado == true) {

                String[] confirmarcancelamento = {"Não", "Sim"};

                String opcaocancelar = (String) JOptionPane.showInputDialog(null, "Deseja realmente Cancelar?",
                        "Cancelar Venda", JOptionPane.QUESTION_MESSAGE, null, confirmarcancelamento, confirmarcancelamento[0]);
                System.out.println("to em cancelar venda");

                if (opcaocancelar.equals("Sim")) {

                    //vendas.VendasConcluidas(contadorcarrinho, cpfcliente, valorvenda, String.valueOf(JDataVenda), quantidadeitens, false);
                    //contadorcarrinho++;
                    JOptionPane.showMessageDialog(null, "Venda Cancelada");

                    for (int i = 0; i < jTableProdutos.getRowCount(); i++) {
                        for (int j = 0; j < jTableProdutos.getColumnCount(); j++) {
                            jTableProdutos.setValueAt("", i, j);
                        }
                    }
                    jFormattedCPFVenda.setText("");
                    JNomeCliente.setText("");

                }
            }

        } else if (cpfdigitado == false) {
            JOptionPane.showMessageDialog(null, "Insira um CPF válido antes de finalizar a Venda");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JFinalizarCompraActionPerformed

    private void JCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCancelarCompraActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_JCancelarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(VendasTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasTela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton JBPesquisarCPF;
    private javax.swing.JButton JBPesquisarProduto;
    private javax.swing.JButton JButtonAdicionarCarrinho;
    private javax.swing.JToggleButton JButtonExcluir;
    private javax.swing.JButton JCancelarCompra;
    private javax.swing.JLabel JDataVenda;
    private javax.swing.JTextField JFaixaEtaria;
    private javax.swing.JButton JFinalizarCompra;
    private javax.swing.JTextField JGarantia;
    private javax.swing.JTextField JIDProduto;
    private javax.swing.JTextField JNomeCliente;
    private javax.swing.JTextField JNomeProduto;
    private javax.swing.JTextField JPreco;
    private javax.swing.JTextField JVendaFabricante;
    private javax.swing.JFormattedTextField jFormattedCPFVenda;
    private javax.swing.JFormattedTextField jFormattedValorDesconto;
    private javax.swing.JFormattedTextField jFormattedValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration//GEN-END:variables
}
