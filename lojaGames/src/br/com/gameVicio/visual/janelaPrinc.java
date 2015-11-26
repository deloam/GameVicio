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
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemCadClientes = new javax.swing.JMenuItem();
        jMenuItemConCliente = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemConProduto = new javax.swing.JMenuItem();

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

        jMenuClientes.setText("Clientes");

        jMenuItemCadClientes.setText("cadastrar cliente");
        jMenuItemCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemCadClientes);

        jMenuItemConCliente.setText("consultar clientes");
        jMenuItemConCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemConCliente);

        jMenuBar1.add(jMenuClientes);

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

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jMenuItemConClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConClienteActionPerformed
       ConsultaClientes form = null;
        try {
            form = new ConsultaClientes();
        } catch (SQLException ex) {
            Logger.getLogger(janelaPrinc.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        areaDeTrabalho.add(form);
    }//GEN-LAST:event_jMenuItemConClienteActionPerformed

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
    private javax.swing.JMenuItem jMenuItemCadClientes;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemConCliente;
    private javax.swing.JMenuItem jMenuItemConProduto;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JLabel lbVersao;
    // End of variables declaration//GEN-END:variables
}
