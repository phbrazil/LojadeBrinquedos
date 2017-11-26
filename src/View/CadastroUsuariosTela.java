package View;

import Controller.ValidaUsuarioCadastrado;
import Model.Usuarios;
import DAO.InsertNovoUsuario;
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
public class CadastroUsuariosTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuarios
     */
    public CadastroUsuariosTela() {
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

        JUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        JNomeFunc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JSenhaConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(JUsername);
        JUsername.setBounds(130, 175, 200, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 137, 125, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 220, 125, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastro de Usuários");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 11, 147, 39);

        JPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(JPassword);
        JPassword.setBounds(130, 260, 200, 30);

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 380, 84, 29);

        JNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNomeFuncActionPerformed(evt);
            }
        });
        getContentPane().add(JNomeFunc);
        JNomeFunc.setBounds(130, 93, 300, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nome do Funcionário");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 61, 133, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Confirmar Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 300, 120, 20);
        getContentPane().add(JSenhaConfirm);
        JSenhaConfirm.setBounds(130, 330, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        InsertNovoUsuario cadastrousuarios = new InsertNovoUsuario();

        Usuarios usuarios = new Usuarios();

        Controller.ValidaUsuarioCadastrado validausuario = new ValidaUsuarioCadastrado();

        //SE O NOME DO FUNCIONARIO FOR MUITO CURTO
        if (JNomeFunc.getText().length() < 5) {

            JOptionPane.showMessageDialog(null, "Nome do funcionário inválido");

            //SE AS SENHAS NAO COMBINAM
        } else if (!JPassword.getText().equals(JSenhaConfirm.getText())) {

            JOptionPane.showMessageDialog(null, "Senhas não combinam");

            //SE O USERNAME DO FUNCIONARIO FOR MUITO CURTO
        } else if (JUsername.getText().length() < 5) {

            JOptionPane.showMessageDialog(null, "Username inválido");

            //SE A SENHA FOR MUITO CURTA
        } else if (JPassword.getText().length() < 10) {

            JOptionPane.showMessageDialog(null, "Senha muito curta");

            //ELSE GRAVA O NOVO USER NO BANCO
        } else if (validausuario.UsuarioJaCadastrado(JNomeFunc.getText(), JUsername.getText()) == true) {

            JOptionPane.showMessageDialog(null, "Usuário já se encontra na base");

        } else {

            usuarios.setNomeUser(String.valueOf(JNomeFunc.getText()));

            usuarios.setUserName(String.valueOf(JUsername.getText()));

            usuarios.setPassword(String.valueOf(JPassword.getText()));

            cadastrousuarios.InsertNovoUsuario(usuarios);

            JOptionPane.showMessageDialog(null, "O usuário " + JNomeFunc.getText() + " foi cadastrado!");

            JPassword.setText("");
            JUsername.setText("");
            JNomeFunc.setText("");
            JSenhaConfirm.setText("");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPasswordActionPerformed

    private void JNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNomeFuncActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField JNomeFunc;
    public javax.swing.JPasswordField JPassword;
    private javax.swing.JPasswordField JSenhaConfirm;
    public javax.swing.JTextField JUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}