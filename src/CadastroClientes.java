
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.hbezerra
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
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
        jButton1 = new javax.swing.JButton();
        JClienteNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JClienteRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        JClienteCPF = new javax.swing.JTextField();
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
        JClienteLogradouro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JClienteBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JClienteCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JClienteEstado = new javax.swing.JTextField();
        ComboUF = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JClienteTelefone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JClienteCelular = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JClienteEmail = new javax.swing.JTextField();
        ComboSexo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboEstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jFormattedNascimento = new javax.swing.JFormattedTextField();
<<<<<<< HEAD
        jFormattedCPF = new javax.swing.JFormattedTextField();
=======
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(175, 11, 373, 42);

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
<<<<<<< HEAD
        jButton1.setBounds(340, 430, 84, 29);
=======
        jButton1.setBounds(340, 430, 67, 23);
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0

        JClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClienteNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JClienteNome);
        JClienteNome.setBounds(270, 90, 252, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 70, 99, 18);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("RG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 70, 57, 18);

        JClienteRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClienteRGActionPerformed(evt);
            }
        });
        getContentPane().add(JClienteRG);
        JClienteRG.setBounds(560, 90, 154, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 60, 58, 26);
<<<<<<< HEAD
=======

        JClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClienteCPFActionPerformed(evt);
            }
        });
        getContentPane().add(JClienteCPF);
        JClienteCPF.setBounds(50, 90, 160, 30);
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
        getContentPane().add(JClienteLogradouro);
        JClienteLogradouro.setBounds(50, 170, 250, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Logradouro");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 150, 100, 14);
        getContentPane().add(JClienteBairro);
        JClienteBairro.setBounds(340, 170, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Bairro");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 150, 80, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 150, 100, 14);
        getContentPane().add(JClienteCidade);
        JClienteCidade.setBounds(520, 170, 160, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 210, 100, 20);
        getContentPane().add(JClienteEstado);
        JClienteEstado.setBounds(50, 230, 250, 30);

        ComboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "ES", "SE", "PE", "PB", "ES", "AM", "RR", "RO", "RS", "RN","PR", "AC", "TO", "MG", "SC", "BA", "CE", "PA","PI" }));
        getContentPane().add(ComboUF);
        ComboUF.setBounds(340, 230, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("UF");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(340, 210, 14, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Telefone");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 350, 80, 20);
        getContentPane().add(JClienteTelefone);
        JClienteTelefone.setBounds(50, 370, 160, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Celular");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 350, 100, 20);
        getContentPane().add(JClienteCelular);
        JClienteCelular.setBounds(240, 370, 160, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(370, 280, 120, 30);
        getContentPane().add(JClienteEmail);
        JClienteEmail.setBounds(370, 310, 230, 30);

        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino"}));
        getContentPane().add(ComboSexo);
        ComboSexo.setBounds(440, 230, 180, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sexo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(440, 210, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Estado Civil");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 280, 100, 30);

        ComboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viúvo", "Divorciado" }));
        getContentPane().add(ComboEstadoCivil);
        ComboEstadoCivil.setBounds(50, 310, 160, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Data Nascimento");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(240, 280, 100, 30);

        try {
<<<<<<< HEAD
            jFormattedNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
=======
            jFormattedNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedNascimento.setText("  /  /    ");
        getContentPane().add(jFormattedNascimento);
<<<<<<< HEAD
        jFormattedNascimento.setBounds(240, 310, 80, 30);

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedCPF);
        jFormattedCPF.setBounds(50, 90, 200, 30);
=======
        jFormattedNascimento.setBounds(240, 310, 60, 30);
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
=======
    private void JClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClienteCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JClienteCPFActionPerformed

>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
    private void JClienteRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClienteRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JClienteRGActionPerformed

    private void JClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JClienteNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

<<<<<<< HEAD
        //FALTA O CPF
        InsertBancoMySQL insertcliente = new InsertBancoMySQL();
        SelectBancoMySQL selectnovocliente = new SelectBancoMySQL();

=======
       InsertBancoMySQL insertcliente = new InsertBancoMySQL();
       SelectBancoMySQL selectnovocliente = new SelectBancoMySQL();
        
        
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
        ValidaCPF validacpf = new ValidaCPF();

        boolean tudook = false;
        String nome = "", logradouro = "", RG = "", bairro = "", cidade = "",
                estado = "", UF = "", telefone = "", celular = "", email = "", sexo = "", estadocivil = "", nascimento = "";

<<<<<<< HEAD
        String CPFsemPontos = "";
        String CPFsemTraco = "";

        long CPF = 0;

=======
        long CPF = 0;
        
        
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
        do {
            try {
                nome = String.valueOf(JClienteNome.getText());
                logradouro = String.valueOf(JClienteLogradouro.getText());
                RG = String.valueOf(JClienteRG.getText());
<<<<<<< HEAD
                CPFsemPontos = String.valueOf(jFormattedCPF.getText());
                CPFsemTraco = String.valueOf(CPFsemPontos.replace(".", ""));
                CPF = Long.valueOf(CPFsemTraco.replace("-", ""));
                System.out.println("aeeeeeeee"+CPF);

=======
                CPF = Long.valueOf(JClienteCPF.getText());
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
                bairro = String.valueOf(JClienteBairro.getText());
                cidade = String.valueOf(JClienteCidade.getText());
                estado = String.valueOf(JClienteEstado.getText());
                UF = String.valueOf(ComboUF.getSelectedItem());
                telefone = String.valueOf(JClienteTelefone.getText());
                celular = String.valueOf(JClienteCelular.getText());
                email = String.valueOf(JClienteEmail.getText());
                sexo = String.valueOf(ComboSexo.getSelectedItem());
                estadocivil = String.valueOf(ComboEstadoCivil.getSelectedItem());
                nascimento = String.valueOf(jFormattedNascimento.getText());

<<<<<<< HEAD
=======
                //insertcliente.CPFCadastradoSelect(CPF);
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
                tudook = true;

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Verifique os dados inseridos");
            }
        } while (tudook == false);

<<<<<<< HEAD
        if (jFormattedCPF.getText().equals("") || jFormattedCPF.getText().length() < 14 || jFormattedCPF.getText().length() > 14) {
=======
        if (JClienteCPF.getText().equals("")||JClienteCPF.getText().length()<11 || JClienteCPF.getText().length()>11) {
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
            JOptionPane.showMessageDialog(null, "Verifique os campos");

        } else if (validacpf.CPFValido(CPF) == false) {
            JOptionPane.showMessageDialog(null, "CPF inválido");

        } else if (selectnovocliente.CPFCadastradoSelect(CPF) == true) {

            JOptionPane.showMessageDialog(null, "O CPF " + CPF + " já se encontra na base");

        } else {
<<<<<<< HEAD
            insertcliente.InsertNovoCliente(nome, logradouro, RG, String.valueOf(CPFsemPontos), bairro, cidade, estado, UF, telefone, celular, email, sexo, estadocivil, nascimento);

            JClienteNome.setText("");
            JClienteBairro.setText("");
            jFormattedCPF.setText("");
=======
            insertcliente.InsertNovoCliente(nome, logradouro, RG, String.valueOf(CPF), bairro, cidade, estado, UF, telefone, celular, email, sexo, estadocivil, nascimento);

            JClienteNome.setText("");
            JClienteBairro.setText("");
            JClienteCPF.setText("");
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
            JClienteRG.setText("");
            JClienteLogradouro.setText("");
            JClienteTelefone.setText("");
            JClienteCelular.setText("");
            JClienteEstado.setText("");
            JClienteCidade.setText("");
<<<<<<< HEAD
            jFormattedNascimento.setText("");
=======
            jFormattedNascimento.setText("  /  /    ");
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
            JClienteEmail.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastroClientes().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboEstadoCivil;
    public javax.swing.JComboBox<String> ComboSexo;
    public javax.swing.JComboBox<String> ComboUF;
    public javax.swing.JTextField JClienteBairro;
<<<<<<< HEAD
=======
    public javax.swing.JTextField JClienteCPF;
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
    public javax.swing.JTextField JClienteCelular;
    public javax.swing.JTextField JClienteCidade;
    public javax.swing.JTextField JClienteEmail;
    public javax.swing.JTextField JClienteEstado;
    public javax.swing.JTextField JClienteLogradouro;
    public javax.swing.JTextField JClienteNome;
    public javax.swing.JTextField JClienteRG;
    public javax.swing.JTextField JClienteTelefone;
    private javax.swing.JButton jButton1;
<<<<<<< HEAD
    private javax.swing.JFormattedTextField jFormattedCPF;
=======
>>>>>>> c4e8560d32a0055c2043deb590cc22684cd2c8f0
    private javax.swing.JFormattedTextField jFormattedNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
