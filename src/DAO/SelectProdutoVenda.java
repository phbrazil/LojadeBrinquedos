package DAO;

import DAO.BancoMySQL;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import Model.Produtos;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.bezerra
 */
public class SelectProdutoVenda {

    private Connection conexao = null;
    
    Produtos produtos = new Produtos();

    public void SelectProduto(int idproduto, Produtos produtos) {

        String select = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexao = BancoMySQL.getConnection();

            java.sql.Statement st = conexao.createStatement();
            select = "select * from produtos where idproduto = " + idproduto;
            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                produtos.setNomeProduto(result.getString("nomeproduto"));
                System.out.println("heuaheuahu"+produtos.getNomeProduto());
                produtos.setFaixaEtaria(result.getString("faixaetaria"));
                produtos.setFabricante(result.getString("fabricante"));
                produtos.setGarantia(result.getString("prazogarantia"));
                produtos.setValor(result.getDouble("valor"));
                produtos.setValorDesconto(result.getDouble("valordesconto"));

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("erro" + e.getMessage());

        }
        if (produtos.getNomeProduto()==null) {
            //JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

    }
    
}
