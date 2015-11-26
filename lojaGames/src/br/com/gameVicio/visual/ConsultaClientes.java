package br.com.gameVicio.visual;

import br.com.gameVicio.dao.ClienteDao;
import br.com.gameVicio.modelo.WebServiceCep;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsultaClientes extends javax.swing.JInternalFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ClienteDao cd = new ClienteDao();
    BuildVersion bv = new BuildVersion();
    public ConsultaClientes() throws SQLException {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("game?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        pesquisar = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDadosPessoais = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        cbsexo = new javax.swing.JComboBox();
        txtCod = new javax.swing.JTextField();
        txtNasc = new javax.swing.JFormattedTextField();
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
        cbUF = new javax.swing.JComboBox();
        btBuscarCep = new javax.swing.JButton();
        painelContatos = new javax.swing.JPanel();
        lbCelular = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtDDDCelular = new javax.swing.JTextField();
        txtDDDTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisarKeyReleased(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 0));
        jTabbedPane1.setToolTipText("");

        painelDadosPessoais.setBackground(new java.awt.Color(192, 212, 251));
        painelDadosPessoais.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 23, 5, 10);
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
        gridBagConstraints.gridwidth = 4;
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

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        painelDadosPessoais.add(cbsexo, gridBagConstraints);

        txtCod.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        painelDadosPessoais.add(txtCod, gridBagConstraints);

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        painelDadosPessoais.add(txtNasc, gridBagConstraints);

        jTabbedPane1.addTab("Dados Pessoais", painelDadosPessoais);

        painelDadosResidenciais.setBackground(new java.awt.Color(251, 209, 209));
        painelDadosResidenciais.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        painelDadosResidenciais.setLayout(new java.awt.GridBagLayout());

        lbEndereco.setText("Endereço:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbCidade, gridBagConstraints);

        lbNumEnd.setText("Número:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbNumEnd, gridBagConstraints);

        lbUnidFederal.setText("UF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 111);
        painelDadosResidenciais.add(lbUnidFederal, gridBagConstraints);

        lbComplemento.setText("Complemento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbComplemento, gridBagConstraints);

        lbBairro.setText("Bairro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(lbBairro, gridBagConstraints);

        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 303;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtEndereco, gridBagConstraints);

        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtCidade, gridBagConstraints);

        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
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
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 41);
        painelDadosResidenciais.add(txtCep, gridBagConstraints);

        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        painelDadosResidenciais.add(txtComplemento, gridBagConstraints);

        cbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 9);
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
        painelDadosResidenciais.add(btBuscarCep, gridBagConstraints);

        jTabbedPane1.addTab("Dados Residenciais", painelDadosResidenciais);

        painelContatos.setBackground(new java.awt.Color(187, 248, 182));
        painelContatos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 0)));
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

        jTabbedPane1.addTab("Contato", painelContatos);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, tabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sexo}"));
        columnBinding.setColumnName("Sexo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNasc}"));
        columnBinding.setColumnName("Data Nasc");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setText("Pesquisar por:");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Nascimento", "CPF", "Sexo" }));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/accept.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/pencil.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/cancel.png"))); // NOI18N
        btExluir.setText("Excluir");
        btExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSalvar)
                        .addGap(6, 6, 6)
                        .addComponent(btEditar)
                        .addGap(159, 159, 159)
                        .addComponent(btExluir)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addComponent(btEditar)
                    .addComponent(btExluir))
                .addGap(10, 10, 10))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumEndActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

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
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscaCep();
            txtNumEnd.setFocusable(true);
        }
    }//GEN-LAST:event_txtCepKeyPressed

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed

    }//GEN-LAST:event_cbUFActionPerformed

    private void btBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCepActionPerformed
        buscaCep();
    }//GEN-LAST:event_btBuscarCepActionPerformed

    private void txtDDDTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDDTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDDDTelefoneActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        try {
            cd.pesquisarFiltro(pesquisar, tabela, cbFiltro);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pesquisarKeyReleased

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        cd.mostarClientes(tabela, txtcpf, txtNome, cbsexo, txtNasc,txtCod);
        try {
            cd.mostarContts(txtCod, txtEmail, txtDDDCelular, txtCelular, txtTelefone, 
        txtDDDTelefone, txtEndereco, txtNumEnd, txtComplemento, cbUF, txtCidade, txtCep, txtBairro);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
       String caracteres;
       caracteres = "0987654321!@#$%¨&*()+=§_¬¢£³²¹/?°;.~,´`[]{}ªº";

        if(caracteres.contains(evt.getKeyChar()+"")){
        // se o caractere digitado for um contido na String caracteres
        evt.consume(); // o caractere é removido através do método consume

}
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
         String campoText = txtNome.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 99){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtNome.setText(campoText);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtcpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyPressed
          String campoText = txtcpf.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 10){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtcpf.setText(campoText);
        }
    }//GEN-LAST:event_txtcpfKeyPressed

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

    private void txtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyPressed
        String campoText = txtEndereco.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 99){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtEndereco.setText(campoText);
        } 
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             buscaCep();
             txtNumEnd.setFocusable(true);
             
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

    private void txtDDDCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDCelularKeyPressed
         String campoText = txtDDDCelular.getText();
        int quantCaracteres = campoText.length();
        if (quantCaracteres > 1){
        campoText = campoText.substring (0, campoText.length() - 1);
        txtDDDCelular.setText(campoText);
    }//GEN-LAST:event_txtDDDCelularKeyPressed
    }
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
    }//GEN-LAST:event_txtTelefoneKeyPressed
    }
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

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       Object[] options = { "Confirmar", "Cancelar" };  
        int x = JOptionPane.showOptionDialog(null, "Clique Confirmar para Alterar", "Informação",
             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (x==0) {
        try {
            cd.editarCliente(txtCod, txtNome, txtNasc, txtcpf, cbsexo, txtEndereco, 
                 txtNumEnd, txtCidade, cbUF, txtCep, txtComplemento, txtEmail, txtTelefone, 
                 txtDDDTelefone, txtCelular, txtDDDCelular, txtBairro);
            cd.listarClientes(tabela);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
         boolean controla = false;
        if (!txtCod.getText().isEmpty() && controla == false) {
            controla = true;
        txtNome.setEditable(controla);
        txtNasc.setEditable(controla);
        txtcpf.setEditable(controla);
        txtEndereco.setEditable(controla);
        txtNumEnd.setEditable(controla);
        txtCidade.setEditable(controla);
        txtCep.setEditable(controla);
        txtComplemento.setEditable(controla);
        txtEmail.setEditable(controla);
        txtTelefone.setEditable(controla);
        txtDDDTelefone.setEditable(controla);
        txtCelular.setEditable(controla);
        txtDDDCelular.setEditable(controla);
        txtBairro.setEditable(controla);
        
        
        } else if (controla == true){
            controla = false;
        txtNome.setEditable(controla);
        txtNasc.setEditable(controla);
        txtcpf.setEditable(controla);
        txtEndereco.setEditable(controla);
        txtNumEnd.setEditable(controla);
        txtCidade.setEditable(controla);
        txtCep.setEditable(controla);
        txtComplemento.setEditable(controla);
        txtEmail.setEditable(controla);
        txtTelefone.setEditable(controla);
        txtDDDTelefone.setEditable(controla);
        txtCelular.setEditable(controla);
        txtDDDCelular.setEditable(controla);
        txtBairro.setEditable(controla);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExluirActionPerformed
         Object[] options = { "Confirmar", "Cancelar" };  
        int x = JOptionPane.showOptionDialog(null, "Clique Confirmar para deletar", "Informação",
             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        try {
            if (x==0) {
            cd.deletarcliente(txtCod);
            cd.listarClientes(tabela);
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExluirActionPerformed
    
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

            //caso haja problemas imprime as excecoes.
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCep;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbFiltro;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JComboBox cbsexo;
    private java.util.List<br.com.gameVicio.visual.Clientes> clientesList;
    private javax.persistence.Query clientesQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
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
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
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
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
