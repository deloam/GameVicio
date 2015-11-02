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
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemConProduto = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        areaDeTrabalho.setAutoscrolls(true);
        areaDeTrabalho.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        areaDeTrabalho.setOpaque(false);

        lbVersao.setText("Build Verson 1.0.0.0");

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
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

        jMenuItemCadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/pencil.png"))); // NOI18N
        jMenuItemCadastros.setText("cadastros");
        jMenuItemCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrosActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemCadastros);

        jMenuItemConsultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/magnifier.png"))); // NOI18N
        jMenuItemConsultas.setText("consulta");
        jMenuPrincipal.add(jMenuItemConsultas);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/cancel.png"))); // NOI18N
        jMenuItemSair.setText("sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemSair);

        jMenuBar1.add(jMenuPrincipal);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        jMenuClientes.setText("Clientes");

        jMenuItemCadClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemCadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/user_add.png"))); // NOI18N
        jMenuItemCadClientes.setText("cadastrar cliente");
        jMenuItemCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemCadClientes);

        jMenuItemConCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemConCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/vcard.png"))); // NOI18N
        jMenuItemConCliente.setText("consultar clientes");
        jMenuItemConCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemConCliente);

        jMenuBar1.add(jMenuClientes);

        jMenuProdutos.setText("Produtos");

        jMenuItemCadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/basket_add.png"))); // NOI18N
        jMenuItemCadProduto.setText("cadastrar produtos");
        jMenuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemCadProduto);

        jMenuItemConProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemConProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/cart_go.png"))); // NOI18N
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

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/television.png"))); // NOI18N
        jMenuItem1.setText("Tutorial");
        jMenuSobre.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/anchor.png"))); // NOI18N
        jMenuItem2.setText("Criadores");
        jMenuSobre.add(jMenuItem2);

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

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadClientes;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemCadastros;
    private javax.swing.JMenuItem jMenuItemConCliente;
    private javax.swing.JMenuItem jMenuItemConProduto;
    private javax.swing.JMenuItem jMenuItemConsultas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JLabel lbVersao;
    // End of variables declaration//GEN-END:variables
}
