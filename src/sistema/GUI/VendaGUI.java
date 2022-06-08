/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.GUI;
import sistema.DAO.VendaDAO;
import sistema.Modelos.Venda;
import sistema.Modelos.Produto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 *
 * @author gusta
 */
public class VendaGUI extends javax.swing.JFrame {
    String titulo;
    Venda venda;
    Produto produto;
    /**
     * Creates new form VendaGUI
     * @param produto
     */
    public VendaGUI(Produto produto) {
        titulo = "Novo";
        this.produto = produto;
        initComponents();  
        setLocationRelativeTo(null);
        lblTitulo.setText(titulo);
        lblId.setVisible(false);
        txtProduto.setText(produto.getNomeExibicao());
        txtPreco.setText(produto.getPreco().toString());
        txtPreco.setEditable(false);
        chkData.setSelected(true);
        txtData.setEditable(false);
        txtData.setText(LocalDateTime.now().toString());
    }
    
    public VendaGUI(Venda venda) {
        titulo = "Editar";
        this.venda = venda;
        initComponents();
        setLocationRelativeTo(null);
        lblTitulo.setText(titulo);
        lblId.setText("Id - "+venda.getIdVenda());
        txtProduto.setText(venda.getProdutoTexto());
        txtQuantidade.setText(Integer.toString(venda.getQtdVendida()));
        txtPreco.setText(venda.getPrecoUnitario().toString());
        txtData.setText(venda.getDataVenda().toString());
        chkData.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        chkData = new javax.swing.JCheckBox();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Titulo");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblId.setText("Id:");

        lblProduto.setText("Produto:");

        txtProduto.setEditable(false);

        lblData.setText("Data:");

        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setText("0");

        chkData.setText("Data e hora atual?");
        chkData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDataActionPerformed(evt);
            }
        });

        lblPreco.setText("Preco Unitario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduto)
                            .addComponent(txtData)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkData))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProduto)
                                    .addComponent(lblId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSalvar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQuantidade)
                                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPreco)
                                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(27, 27, 27)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(chkData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        VendaDAO operar = new VendaDAO();
        operar.conectar();

        if("Novo".equals(titulo)){
            operar.criar(produto.getIdProduto(), new BigDecimal(txtPreco.getText()), Integer.parseInt(txtQuantidade.getText()), LocalDateTime.parse(txtData.getText()));
            this.dispose();
        }
        else{
            operar.editar(venda.getProduto(), venda.getQtdVendida(), new BigDecimal(txtPreco.getText()), Integer.parseInt(txtQuantidade.getText()), LocalDateTime.parse(txtData.getText()), venda.getIdVenda());
            this.dispose();
        }
        operar.desconectar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void chkDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDataActionPerformed
        if(chkData.isSelected()){
            txtData.setEditable(false);
            txtData.setText(LocalDateTime.now().toString());
        }
        else{
            txtData.setEditable(true);
        }
    }//GEN-LAST:event_chkDataActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkData;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}