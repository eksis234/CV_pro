/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Tools;
import org.hibernate.SessionFactory;
import view.SerbaGuna.pesan;

/**
 *
 * @author chochong
 */
public class ToolsView extends javax.swing.JInternalFrame {

    private final ToolsController controller;
    private final SerbaGuna sg;
    private TableRowSorter<TableModel> rowSorter;
     /**
     * Creates new form ToolsView
     * @param factory untuk koneksi
     */
    public ToolsView(SessionFactory factory) {
        initComponents();
        controller = new ToolsController(factory);
        bindingTools(controller.getAll());
        jtTools.setRowSorter(rowSorter);
        sg = new SerbaGuna();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbKategoriTools = new javax.swing.JComboBox<>();
        txtFindTools = new javax.swing.JTextField();
        btnFindTools = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTools = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtToolsId = new javax.swing.JTextField();
        txtToolsName = new javax.swing.JTextField();
        jlProgrammingId = new javax.swing.JLabel();
        jlProgrammingName = new javax.swing.JLabel();
        btnDropTools = new javax.swing.JButton();
        btnSaveTools = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Master Tools");

        cmbKategoriTools.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tools ID", "Tools Name" }));

        txtFindTools.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindToolsKeyReleased(evt);
            }
        });

        btnFindTools.setText("FIND");
        btnFindTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindToolsActionPerformed(evt);
            }
        });

        jtTools.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtTools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtToolsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTools);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbKategoriTools, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindTools, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindTools)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKategoriTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFindTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindTools))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel2.setToolTipText("Detail");

        txtToolsId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToolsIdActionPerformed(evt);
            }
        });
        txtToolsId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtToolsIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtToolsIdKeyTyped(evt);
            }
        });

        txtToolsName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtToolsNameKeyTyped(evt);
            }
        });

        jlProgrammingId.setText("Tools Id       :");

        jlProgrammingName.setText("Tools Name :");

        btnDropTools.setText("DROP");
        btnDropTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropToolsActionPerformed(evt);
            }
        });

        btnSaveTools.setText("SAVE");
        btnSaveTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToolsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlProgrammingName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlProgrammingId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtToolsName, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txtToolsId))
                .addGap(72, 72, 72)
                .addComponent(btnDropTools)
                .addGap(18, 18, 18)
                .addComponent(btnSaveTools)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProgrammingId)
                    .addComponent(txtToolsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProgrammingName)
                    .addComponent(txtToolsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDropTools)
                    .addComponent(btnSaveTools))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindToolsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindToolsKeyReleased
        // TODO add your handling code here:
        if (txtFindTools.getText().equals("")) {
                bindingTools(controller.getAll());
            }else if (!txtFindTools.getText().equalsIgnoreCase("")){
                btnFindTools.setEnabled(true);
            }
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String text = txtFindTools.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
                } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategoriTools.getSelectedIndex() + 1));
            }
        }
    }//GEN-LAST:event_txtFindToolsKeyReleased

    private void btnFindToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindToolsActionPerformed
        // TODO add your handling code here:
                if (!txtFindTools.getText().equalsIgnoreCase("")) {
                        String text = txtFindTools.getText();
                        if (text.trim().length() == 0) {
                                rowSorter.setRowFilter(null);
                            } else {
                                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategoriTools.getSelectedIndex() + 1));
                            JOptionPane.showMessageDialog(this,pesan.find.getPesan(), "Search",JOptionPane.INFORMATION_MESSAGE);
                        }                 
                    }
    }//GEN-LAST:event_btnFindToolsActionPerformed

    private void txtToolsIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToolsIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToolsIdActionPerformed

    private void txtToolsIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToolsIdKeyReleased
        // TODO add your handling code here:
                if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                        if (!txtToolsId.getText().equals("") ){
                                sg.filterAngka(evt);
                            }
                    }
    }//GEN-LAST:event_txtToolsIdKeyReleased

    private void txtToolsIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToolsIdKeyTyped
        // TODO add your handling code here:
        //        ss.filterAngka(evt);
    }//GEN-LAST:event_txtToolsIdKeyTyped

    private void txtToolsNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToolsNameKeyTyped
        // TODO add your handling code here:
        //        sf.filterPass(evt);
    }//GEN-LAST:event_txtToolsNameKeyTyped

    private void btnDropToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropToolsActionPerformed
        // TODO add your handling code here:
                int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?","Pertanyaan",JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    controller.delete(txtToolsId.getText());
                    JOptionPane.showMessageDialog(this, pesan.delete.getPesan(), "Delete", JOptionPane.INFORMATION_MESSAGE);
                    bindingTools(controller.getAll());
                    reset();
                    }else if (response == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(this, pesan.cancle.getPesan(), "Delete", JOptionPane.INFORMATION_MESSAGE);
                    }
    }//GEN-LAST:event_btnDropToolsActionPerformed

    private void btnSaveToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToolsActionPerformed
        // TODO add your handling code here:
                boolean isUpdate = false;
                if(!txtToolsId.isEnabled()){
                        isUpdate = false;
                    }
                if (isUpdate) {
                    controller.saveOrUpdate(txtToolsId.getText(), txtToolsName.getText());
                    JOptionPane.showMessageDialog(this, pesan.update.getPesan(), "Update", JOptionPane.INFORMATION_MESSAGE);
                    bindingTools(controller.getAll());}
                else {controller.saveOrUpdate(txtToolsId.getText(), txtToolsName.getText());
                    JOptionPane.showMessageDialog(this, pesan.save.getPesan(), "Simpan", JOptionPane.INFORMATION_MESSAGE);
                    bindingTools(controller.getAll());
                    txtToolsId.setEditable(true);
                 }
    }//GEN-LAST:event_btnSaveToolsActionPerformed

    private void jtToolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtToolsMouseClicked
        // TODO add your handling code here:
        int row = jtTools.getSelectedRow();
        txtToolsId.setText(jtTools.getValueAt(row, 1).toString());
        txtToolsName.setText(jtTools.getValueAt(row, 2).toString());
        edit();
    }//GEN-LAST:event_jtToolsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDropTools;
    private javax.swing.JButton btnFindTools;
    private javax.swing.JButton btnSaveTools;
    private javax.swing.JComboBox<String> cmbKategoriTools;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlProgrammingId;
    private javax.swing.JLabel jlProgrammingName;
    private javax.swing.JTable jtTools;
    private javax.swing.JTextField txtFindTools;
    private javax.swing.JTextField txtToolsId;
    private javax.swing.JTextField txtToolsName;
    // End of variables declaration//GEN-END:variables

    
       /**
     * dok bindingCountries
     * @param countrys berupa list<object>
     */
private void bindingTools(List<Object> tools) {
    String [] header = {"No","Tools Id","Tools Name"};
        String [][] data = new String[tools.size()][header.length];
        int i = 0;
        for (Object object : tools) {
            Tools t  =  (Tools) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = t.getIdtool()+"";
            data[i][2] = t.getToolname();
            i++;
        }
        jtTools.setModel(new DefaultTableModel(data, header));
        this.rowSorter = new TableRowSorter<>(jtTools.getModel());
        reset();     
    }
    
    /**
     * dok reset
     */
    public  void reset(){
        txtToolsId.setText(controller.getAutoId()+"");
        txtToolsId.setEnabled(false);
        txtToolsName.setText("");
        btnDropTools.setEnabled(false);
        btnSaveTools.setEnabled(true);
        btnFindTools.setEnabled(false);
        jtTools.setRowSorter(rowSorter);
    }
    
    /**
     * dok edit
     */
    private void edit(){
        txtToolsId.setEnabled(false);
        btnSaveTools.setEnabled(true);
        btnDropTools.setEnabled(true);
    }  
    
    
    
    
    
}
