package br.com.gameVicio.visual;

import br.com.gameVicio.modelo.WebServiceCep;
import br.com.gameVicio.dao.ClienteDao;
import br.com.gameVicio.modelo.cliente;
import br.com.gameVicio.modelo.contato;
import br.com.gameVicio.modelo.endereco;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cadastroCliente extends javax.swing.JInternalFrame {
    ClienteDao cd = new ClienteDao();
    
    
    public cadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbCadastroCliente = new javax.swing.JLabel();
        painelDadosResidenciais = new javax.swing.JPanel();
        lbEndereco = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbNumEnd = new javax.swing.JLabel();
        lbUnidFederal = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumEnd = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        btLimparDadosRecidenciais = new javax.swing.JButton();
        cbUF = new javax.swing.JComboBox();
        btBuscarCep = new javax.swing.JButton();
        painelDadosPessoais = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        btLimparDadosPessoais = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox();
        txtNasc = new javax.swing.JFormattedTextField();
        painelContatos = new javax.swing.JPanel();
        lbCelular = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtDDDCelular = new javax.swing.JTextField();
        txtDDDTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btLimparDadosContato = new javax.swing.JButton();
        btSalvarCadastro = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastros");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/user.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbCadastroCliente.setText("Cadastro de Cliente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 28, 11);
        getContentPane().add(lbCadastroCliente, gridBagConstraints);

        painelDadosResidenciais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Residenciais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painelDadosResidenciais.setLayout(new java.awt.GridBagLayout());

        lbEndereco.setText("Endereço:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbEndereco, gridBagConstraints);

        lbCep.setText("CEP:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbCep, gridBagConstraints);

        lbCidade.setText("Cidade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbCidade, gridBagConstraints);

        lbNumEnd.setText("Número:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbNumEnd, gridBagConstraints);

        lbUnidFederal.setText("UF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 111);
        painelDadosResidenciais.add(lbUnidFederal, gridBagConstraints);

        lbComplemento.setText("Complemento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbComplemento, gridBagConstraints);

        lbBairro.setText("Bairro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbBairro, gridBagConstraints);

        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtEndereco, gridBagConstraints);

        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtCidade, gridBagConstraints);

        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtBairro, gridBagConstraints);

        txtNumEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEndActionPerformed(evt);
            }
        });
        txtNumEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumEndKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumEndKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtNumEnd, gridBagConstraints);

        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 59);
        painelDadosResidenciais.add(txtCep, gridBagConstraints);

        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComplementoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 208;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtComplemento, gridBagConstraints);

        btLimparDadosRecidenciais.setText("limpar");
        btLimparDadosRecidenciais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDadosRecidenciaisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        painelDadosResidenciais.add(btLimparDadosRecidenciais, gridBagConstraints);

        cbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PA", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        painelDadosResidenciais.add(cbUF, gridBagConstraints);

        btBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/magnifier.png"))); // NOI18N
        btBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCepActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 55, 0, 0);
        painelDadosResidenciais.add(btBuscarCep, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        getContentPane().add(painelDadosResidenciais, gridBagConstraints);

        painelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painelDadosPessoais.setLayout(new java.awt.GridBagLayout());

        lbNome.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 10);
        painelDadosPessoais.add(lbNome, gridBagConstraints);

        lbDataNasc.setText("Data Nascimento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 10);
        painelDadosPessoais.add(lbDataNasc, gridBagConstraints);

        lbSexo.setText("Sexo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 10);
        painelDadosPessoais.add(lbSexo, gridBagConstraints);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 7, 5, 10);
        painelDadosPessoais.add(txtNome, gridBagConstraints);

        lbCPF.setText("CPF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        painelDadosPessoais.add(lbCPF, gridBagConstraints);

        txtcpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcpfKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 7, 5, 0);
        painelDadosPessoais.add(txtcpf, gridBagConstraints);

        btLimparDadosPessoais.setText("limpar");
        btLimparDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDadosPessoaisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        painelDadosPessoais.add(btLimparDadosPessoais, gridBagConstraints);

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        painelDadosPessoais.add(cbSexo, gridBagConstraints);

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        painelDadosPessoais.add(txtNasc, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(painelDadosPessoais, gridBagConstraints);

        painelContatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contatos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painelContatos.setLayout(new java.awt.GridBagLayout());

        lbCelular.setText("Celular:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(lbCelular, gridBagConstraints);

        lbTelefone.setText("Telefone:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(lbTelefone, gridBagConstraints);

        lbEmail.setText("E-mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(lbEmail, gridBagConstraints);

        txtDDDCelular.setColumns(2);
        txtDDDCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDDDCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDDDCelularKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(txtDDDCelular, gridBagConstraints);

        txtDDDTelefone.setColumns(2);
        txtDDDTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDDDTelefoneActionPerformed(evt);
            }
        });
        txtDDDTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDDDTelefoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDDDTelefoneKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(txtDDDTelefone, gridBagConstraints);

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 89;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(txtCelular, gridBagConstraints);

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 89;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(txtTelefone, gridBagConstraints);

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelContatos.add(txtEmail, gridBagConstraints);

        btLimparDadosContato.setText("limpar");
        btLimparDadosContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDadosContatoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 57, 0, 0);
        painelContatos.add(btLimparDadosContato, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 17, 0);
        getContentPane().add(painelContatos, gridBagConstraints);

        btSalvarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/accept.png"))); // NOI18N
        btSalvarCadastro.setText("salvar");
        btSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCadastroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(btSalvarCadastro, gridBagConstraints);

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/cancel.png"))); // NOI18N
        btFechar.setText("fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 207, 0, 0);
        getContentPane().add(btFechar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumEndActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtDDDTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDDTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDDDTelefoneActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btLimparDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDadosPessoaisActionPerformed
       txtNome.setText("");
       txtNasc.setText("");
       txtcpf.setText("");
    }//GEN-LAST:event_btLimparDadosPessoaisActionPerformed

    private void btLimparDadosRecidenciaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDadosRecidenciaisActionPerformed
       txtEndereco.setText("");
       txtNumEnd.setText("");
       txtComplemento.setText("");
       txtCep.setText("");
       txtBairro.setText("");
       txtCidade.setText("");
    }//GEN-LAST:event_btLimparDadosRecidenciaisActionPerformed

    private void btLimparDadosContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDadosContatoActionPerformed
       txtDDDCelular.setText("");
       txtDDDTelefone.setText("");
       txtTelefone.setText("");
       txtCelular.setText("");
       txtEmail.setText("");
    }//GEN-LAST:event_btLimparDadosContatoActionPerformed

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed
        
    }//GEN-LAST:event_cbUFActionPerformed

    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
        String campoText = txtCep.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 7){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtCep.setText(campoText);
        } 
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             buscaCep();
             txtNumEnd.setFocusable(true);
             
         }    
    }//GEN-LAST:event_txtCepKeyPressed

    private void btBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCepActionPerformed
        buscaCep();
    }//GEN-LAST:event_btBuscarCepActionPerformed

    private void btSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCadastroActionPerformed
       cliente client = new cliente();
       endereco end = new endereco();
       contato cont = new contato();
       
       // variaveis do objeto endereco end
       String logra  = txtEndereco.getText();
       String numero = txtNumEnd.getText();
       String comple = txtComplemento.getText();
       int cep       = Integer.parseInt(txtCep.getText());
       String estado = cbUF.getSelectedItem().toString();
       String cidade = txtCidade.getText();
       String bairro = txtBairro.getText();
       // setando variaveis no objeto end
       end.setCep(cep);
       end.setCidade(cidade);
       end.setComplemento(comple);
       end.setEstado(estado);
       end.setNumero(numero);
       end.setLogradouro(logra);
       end.setBairro(bairro);
    
       
       ////////////////////////////////////////////
       //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
       
       // variaveis do objeto contato cont
       String telefone = txtDDDTelefone.getText()+txtTelefone.getText();
       String celular = txtDDDCelular.getText()+txtCelular.getText();
       String email = txtEmail.getText();
       // sentando variaveis no objeto contato cont
       cont.setCelular(celular);
       cont.setTelefone(telefone);
       cont.setEmail(email);
       
       ///////////////////////////////////////////
       //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
       
       // variaveis do objeto cliente
       String nome = txtNome.getText();
       String cpf = txtcpf.getText();
       String nasc = txtNasc.getText();
       String sx = null;
       //setando variaveis no objeto cliente client
       if (cbSexo.getSelectedItem().toString().equalsIgnoreCase("Masculino")){
                sx = "m";
        }else if (cbSexo.getSelectedItem().toString().equalsIgnoreCase("Feminino")){
            sx = "f";
        }
       client.setSexo(sx);
       client.setNome(nome);
       client.setCpf(cpf);
       client.setDataNasc(nasc);
        /////////////////////////////
        try {
            cd.inserirCliente(client,end,cont);
        } catch (SQLException ex) {
            Logger.getLogger(cadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSalvarCadastroActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
          this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
       String caracteres;
       caracteres = "0987654321!@#$%¨&*()+=§_¬¢£³²¹/?°;.~,´`[]{}ªº";

        if(caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume

}
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtcpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyTyped
       String caracteres;
       caracteres = "0987654321";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtcpfKeyTyped

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        String caracteres;
       caracteres = "0987654321";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtCepKeyTyped

    private void txtNumEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumEndKeyTyped
         String caracteres;
       caracteres = "0987654321abcdefghijklmnopqrstuvxwyz";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtNumEndKeyTyped

    private void txtDDDCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDCelularKeyTyped
        String caracteres;
       caracteres = "0987654321";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtDDDCelularKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        String caracteres;
       caracteres = "0987654321";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtDDDTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDTelefoneKeyTyped
         String caracteres;
       caracteres = "0987654321";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtDDDTelefoneKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
         String caracteres;
       caracteres = "0987654321";

        if(!caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtDDDCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDCelularKeyPressed
        String campoText = txtDDDCelular.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 1){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtDDDCelular.setText(campoText);

}
    }//GEN-LAST:event_txtDDDCelularKeyPressed

    private void txtDDDTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDTelefoneKeyPressed
        String campoText = txtDDDTelefone.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 1){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtDDDTelefone.setText(campoText);
        }
    }//GEN-LAST:event_txtDDDTelefoneKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        String campoText = txtCelular.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 8){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtCelular.setText(campoText);
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        String campoText = txtTelefone.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 8){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtTelefone.setText(campoText);
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyTyped
       String campoText = txtEndereco.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 99){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtEndereco.setText(campoText);
        }
    }//GEN-LAST:event_txtEnderecoKeyTyped

    private void txtComplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoKeyTyped

    private void txtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyPressed
        String campoText = txtEndereco.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 99){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtEndereco.setText(campoText);
        }
    }//GEN-LAST:event_txtEnderecoKeyPressed

    private void txtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyPressed
       String campoText = txtComplemento.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 49){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtComplemento.setText(campoText);
        }
    }//GEN-LAST:event_txtComplementoKeyPressed

    private void txtNumEndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumEndKeyPressed
       String campoText = txtNumEnd.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 3){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtNumEnd.setText(campoText);
        }
    }//GEN-LAST:event_txtNumEndKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        String campoText = txtCidade.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 49){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtCidade.setText(campoText);
        }
    }//GEN-LAST:event_txtCidadeKeyPressed

    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed
        String campoText = txtBairro.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 99){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtBairro.setText(campoText);
        }
    }//GEN-LAST:event_txtBairroKeyPressed

    private void txtcpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyPressed
        String campoText = txtcpf.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 10){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtcpf.setText(campoText);
        }
    }//GEN-LAST:event_txtcpfKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        String campoText = txtNome.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 99){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtNome.setText(campoText);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
       if ((txtEmail.getText().contains("@")) &&
           (txtEmail.getText().contains(".")) &&
           (!txtEmail.getText().contains(" "))) {
            String usuario = new String(txtEmail.getText().substring(0, txtEmail.getText().lastIndexOf('@'))); 
            String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf ('@') + 1, txtEmail.getText().length()));

            if ((usuario.length() >=1) && (!usuario.contains("@")) &&
             (dominio.contains(".")) && (!dominio.contains("@")) &&
             (dominio.indexOf(".") >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {

             lbEmail.setText("");

             } else {

             lbEmail.setText("E-mail Inválido");
             txtBairro.requestFocus();
             }
             } else { 
            lbEmail.setText("E-mail Inválido"); 
            txtEmail.requestFocus(); 
            } 



    }//GEN-LAST:event_txtEmailFocusLost
      
    public void buscaCep() {
        //Faz a busca para o cep 58043-280
        WebServiceCep webServiceCep = WebServiceCep.searchCep(txtCep.getText());
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

        //caso a busca ocorra bem, imprime os resultados.
        if (webServiceCep.wasSuccessful()) {
            txtEndereco.setText(webServiceCep.getLogradouroFull());
            txtCidade.setText(webServiceCep.getCidade());
            txtBairro.setText(webServiceCep.getBairro());
            cbUF.setSelectedItem(webServiceCep.getUf());
            System.out.println("Cep: " + webServiceCep.getCep());
            System.out.println("Logradouro: " + webServiceCep.getLogradouroFull());
            System.out.println("Bairro: " + webServiceCep.getBairro());
            System.out.println("Cidade: "
                    + webServiceCep.getCidade() + "/" + webServiceCep.getUf());

            //caso haja problemas imprime as exce??es.
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCep;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimparDadosContato;
    private javax.swing.JButton btLimparDadosPessoais;
    private javax.swing.JButton btLimparDadosRecidenciais;
    private javax.swing.JButton btSalvarCadastro;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCadastroCliente;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumEnd;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbUnidFederal;
    private javax.swing.JPanel painelContatos;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JPanel painelDadosResidenciais;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtDDDCelular;
    private javax.swing.JTextField txtDDDTelefone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumEnd;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtcpf;
    // End of variables declaration//GEN-END:variables
}
