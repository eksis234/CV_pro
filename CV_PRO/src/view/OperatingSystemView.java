/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OsController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Os;
import model.Tools;
import org.hibernate.SessionFactory;
import view.SerbaGuna.pesan;

/**
 *
 * @author Martin
 */
public class OperatingSystemView extends javax.swing.JInternalFrame {
    private OsController controller;
    private TableRowSorter<TableModel> rowSorter;
    private final SerbaGuna sg;
    /**
     * Creates new form OperatingSystemView
     */
    public OperatingSystemView(SessionFactory factory) {
        initComponents();
        controller = new OsController(factory);
        bindingOs(controller.getAll());
        tblOperatingSystem.setRowSorter(rowSorter);
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

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperatingSystem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamaOs = new javax.swing.JTextField();
        txtIdOs = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbKategori = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Operating System");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnSearch.setText("Find");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblOperatingSystem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblOperatingSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOperatingSystemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOperatingSystem);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setText("ID OS :");

        jLabel2.setText("Nama OS :");

        txtIdOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdOsActionPerformed(evt);
            }
        });
        txtIdOs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdOsKeyTyped(evt);
            }
        });

        btnDelete.setText("Drop");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdOs, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtNamaOs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)))
        );

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OS ID", "OS NAME" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOsActionPerformed

    private void txtIdOsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdOsKeyTyped
        // TODO add your handling code here:
        sg.filterHuruf(evt);
    }//GEN-LAST:event_txtIdOsKeyTyped

    /**
     * Mengambil data dari baris yang di klik oleh mouse
     * @param evt (MouseEvent)
     */
    private void tblOperatingSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOperatingSystemMouseClicked
        // TODO add your handling code here:
        int row = tblOperatingSystem.getSelectedRow();
        txtIdOs.setText(tblOperatingSystem.getValueAt(row, 1).toString());
        txtNamaOs.setText(tblOperatingSystem.getValueAt(row, 2).toString());
        edit();
    }//GEN-LAST:event_tblOperatingSystemMouseClicked

    /**
     * Menyimpan data saat menekan button save
     * @param evt (ActionEvent)
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(!txtNamaOs.getText().equals("")){
            if(!txtNamaOs.getText().substring(0, 1).equals(" ")){
                controller.saveOrUpdate(txtIdOs.getText(), txtNamaOs.getText());
                if(!txtIdOs.isEnabled()){
                    JOptionPane.showMessageDialog(this, pesan.update.getPesan(), "Update", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, pesan.save.getPesan(), "Save", JOptionPane.INFORMATION_MESSAGE);
                }
                bindingOs(controller.getAll());
                reset();
            }
        }
        else JOptionPane.showMessageDialog(this, pesan.kosong.getPesan(), "Kosong", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Untuk menghapus data dengan menggunakan button drop
     * @param evt (ActionEvent)
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?","Pertanyaan",JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            controller.delete(txtIdOs.getText());
            JOptionPane.showMessageDialog(this, pesan.delete.getPesan(), "Delete", JOptionPane.INFORMATION_MESSAGE);
            bindingOs(controller.getAll());
            reset();
        }else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, pesan.cancel.getPesan(), "Delete", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Untuk melakukan pencarian dari kategori dengan menekan tombol enter dan menampilkan seluruh data saat
     * textfield search dikosongkan
     * @param evt (KeyEvent)
     */
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (txtSearch.getText().equals("")) {
                bindingOs(controller.getAll());
            }else if (!txtSearch.getText().equalsIgnoreCase("")){
                btnSearch.setEnabled(true);
            }
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String text = txtSearch.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
                } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategori.getSelectedIndex() + 1));
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    /**
     * Melakukan pencarian dengan menggunakan button search
     * @param evt (ActionEvent)
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!txtSearch.getText().equalsIgnoreCase("")) {
            String text = txtSearch.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategori.getSelectedIndex() + 1));
            }                 
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOperatingSystem;
    private javax.swing.JTextField txtIdOs;
    private javax.swing.JTextField txtNamaOs;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    /**
     * Untuk menampilkan seluruh data ke dalam tabel
     * @param Os (List<Object>) data yang akan dimasukan ke tabel
     */
    private void bindingOs(List<Object> Os) {
    String [] header = {"No","OS Id","OS Name"};
        String [][] data = new String[Os.size()][header.length];
        int i = 0;
        for (Object object : Os) {
            Os os  =  (Os) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = os.getIdos()+"";
            data[i][2] = os.getOsname();
            i++;
        }
        tblOperatingSystem.setModel(new DefaultTableModel(data, header));
        this.rowSorter = new TableRowSorter<>(tblOperatingSystem.getModel());
        reset();     
    }
    
    /**
     * Menampilkan ID terakhir di textfield idOs dan mengaktifkan serta menghilangkan kemampuan meng-edit 
     * textfield tersebut, menonaktifkan button drop, save dan search, mengosongkan textfield NamaOs
     */
    public  void reset(){
        txtIdOs.setText(controller.getAutoId()+"");
        txtIdOs.setEnabled(true);
        txtNamaOs.setText("");
        btnDelete.setEnabled(false);
        txtIdOs.setEditable(false);
        btnSearch.setEnabled(false);
        tblOperatingSystem.setRowSorter(rowSorter);
    }
    
    /**
     * menonaktifkan texfield idOs, button save dan delete
     */
    private void edit(){
        txtIdOs.setEnabled(false);
        btnDelete.setEnabled(true);
    } 
    
}
