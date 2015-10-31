package br.com.gameVicio.visual;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class janelaPrinc extends javax.swing.JFrame {
    BuildVersion bv = new BuildVersion();
            
    public janelaPrinc() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        bv.setVersao();
        initComponents();
        lbVersao.setText(bv.getVersao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        lbVersao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuItemCadastros = new javax.swing.JMenuItem();
        jMenuItemConsultas = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemCadClientes = new javax.swing.JMenuItem();
        jMenuItemConCliente = new javax.swing.JMenuItem();
        jMenuFornecedor = new javax.swing.JMenu();
        jMenuItemCadForne = new javax.swing.JMenuItem();
        jMenuItemConForne = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemConProduto = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        areaDeTrabalho.setAutoscrolls(true);
        areaDeTrabalho.setOpaque(false);

        lbVersao.setText("Build Verson 1.0.0.0");

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addComponent(lbVersao)
                .addContainerGap())
        );
        areaDeTrabalhoLayout.setVerticalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(lbVersao)
                .addContainerGap())
        );
        areaDeTrabalho.setLayer(lbVersao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(areaDeTrabalho);

        jMenuPrincipal.setText("Menu");

        jMenuItemCadastros.setText("cadastros");
        jMenuItemCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrosActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemCadastros);

        jMenuItemConsultas.setText("consulta");
        jMenuPrincipal.add(jMenuItemConsultas);

        jMenuItemSair.setText("sair");
        jMenuPrincipal.add(jMenuItemSair);

        jMenuBar1.add(jMenuPrincipal);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        jMenuClientes.setText("Clientes");

        jMenuItemCadClientes.setText("cadastrar cliente");
        jMenuItemCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemCadClientes);

        jMenuItemConCliente.setText("consultar clientes");
        jMenuClientes.add(jMenuItemConCliente);

        jMenuBar1.add(jMenuClientes);

        jMenuFornecedor.setText("Fornecedor");

        jMenuItemCadForne.setText("cadastrar fornecedor");
        jMenuFornecedor.add(jMenuItemCadForne);

        jMenuItemConForne.setText("consultar fornecedores");
        jMenuFornecedor.add(jMenuItemConForne);

        jMenuBar1.add(jMenuFornecedor);

        jMenuProdutos.setText("Produtos");

        jMenuItemCadProduto.setText("cadastrar produtos");
        jMenuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemCadProduto);

        jMenuItemConProduto.setText("consultar produtos");
        jMenuItemConProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemConProduto);

        jMenuBar1.add(jMenuProdutos);

        jMenuSobre.setText("sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrosActionPerformed
        Cadastros form;
        form = new Cadastros();
        form.setVisible(true);
        areaDeTrabalho.add(form);
       
    }//GEN-LAST:event_jMenuItemCadastrosActionPerformed

    private void jMenuItemCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClientesActionPerformed
        cadastroCliente form;
        form = new cadastroCliente();
        form.setVisible(true);
        areaDeTrabalho.add(form);
    }//GEN-LAST:event_jMenuItemCadClientesActionPerformed

    private void jMenuItemConProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConProdutoActionPerformed
        consultarProduto form = null;
        try {
            form = new consultarProduto();
        } catch (SQLException ex) {
            Logger.getLogger(janelaPrinc.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        areaDeTrabalho.add(form);
    }//GEN-LAST:event_jMenuItemConProdutoActionPerformed

    private void jMenuItemCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutoActionPerformed
        CadastroProduto form = null;
        form = new CadastroProduto();
        form.setVisible(true);
        areaDeTrabalho.add(form);
    }//GEN-LAST:event_jMenuItemCadProdutoActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        Sobre_1 sobre = new Sobre_1();
        sobre.setSize(200, 300);
        sobre.setVisible(true);
       
    }//GEN-LAST:event_jMenuSobreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuFornecedor;
    private javax.swing.JMenuItem jMenuItemCadClientes;
    private javax.swing.JMenuItem jMenuItemCadForne;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemCadastros;
    private javax.swing.JMenuItem jMenuItemConCliente;
    private javax.swing.JMenuItem jMenuItemConForne;
    private javax.swing.JMenuItem jMenuItemConProduto;
    private javax.swing.JMenuItem jMenuItemConsultas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JLabel lbVersao;
    // End of variables declaration//GEN-END:variables
}
