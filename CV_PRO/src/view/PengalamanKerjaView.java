/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PengalamankerjaController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Achievement;
import model.Workingexperience;
import org.hibernate.SessionFactory;
import view.SerbaGuna.pesan;

/**
 *
 * @author Martin
 */
public class PengalamanKerjaView extends javax.swing.JInternalFrame {

    private SerbaGuna sg;
    private PengalamankerjaController controller;
    private TableRowSorter<TableModel> rowSorter;
    /**
     * Creates new form PengalamanKerja
     */
    public PengalamanKerjaView(SessionFactory sessionFactory) {
        initComponents();
        sg = new SerbaGuna();
        controller = new PengalamankerjaController(sessionFactory);
        tblPengalamanKerja.setRowSorter(rowSorter);
        bindingPengalaman(controller.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPengalamanKerja = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdPengalaman = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamaPerusahaan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        cmbKategori = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pengalaman Kerja");

        tblPengalamanKerja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPengalamanKerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPengalamanKerjaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPengalamanKerja);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setText("ID Pengalaman :");

        txtIdPengalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPengalamanActionPerformed(evt);
            }
        });
        txtIdPengalaman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPengalamanKeyTyped(evt);
            }
        });

        jLabel3.setText("Nama Perusahaan :");

        jLabel4.setText("Kota :");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDrop.setText("Drop");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNamaPerusahaan, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtIdPengalaman)
                    .addComponent(txtCity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDrop))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPengalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDrop)))
        );

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

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Pengalaman", "Nama Perusahaan", "Kota" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 79, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPengalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPengalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPengalamanActionPerformed

    private void txtIdPengalamanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPengalamanKeyTyped
        // TODO add your handling code here:
        sg.filterHuruf(evt);
    }//GEN-LAST:event_txtIdPengalamanKeyTyped

    /**
     * Menyimpan data saat menekan button save
     * @param evt (ActionEvent)
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(!txtNamaPerusahaan.getText().equals("") && !txtCity.getText().equals("")){
            if(!txtNamaPerusahaan.getText().substring(0, 1).equals(" ") && !txtCity.getText().substring(0, 1).equals(" ")){
                controller.saveOrUpdate(txtIdPengalaman.getText(), txtNamaPerusahaan.getText(), txtCity.getText());
                if(!txtIdPengalaman.isEnabled()){
                    JOptionPane.showMessageDialog(this, pesan.update.getPesan(), "Update", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, pesan.save.getPesan(), "Save", JOptionPane.INFORMATION_MESSAGE);
                }
                bindingPengalaman(controller.getAll());
                reset();
            }
        }
        else JOptionPane.showMessageDialog(this, pesan.kosong.getPesan(), "Kosong", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Untuk menghapus data dengan menggunakan button drop
     * @param evt (ActionEvent)
     */
    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        // TODO add your handling code here:
        int messageBox = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ?", "Delete", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);
        if(messageBox == JOptionPane.YES_OPTION){
            controller.delete(txtIdPengalaman.getText());
            JOptionPane.showMessageDialog(this, SerbaGuna.pesan.delete.getPesan());
            bindingPengalaman(controller.getAll());
            reset();
        }
        if(messageBox == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, SerbaGuna.pesan.cancel.getPesan());
        }
    }//GEN-LAST:event_btnDropActionPerformed

    /**
     * Mengambil data dari baris yang di klik oleh mouse
     * @param evt (MouseEvent)
     */
    private void tblPengalamanKerjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPengalamanKerjaMouseClicked
        // TODO add your handling code here:
        int row = tblPengalamanKerja.getSelectedRow();
        txtIdPengalaman.setText(tblPengalamanKerja.getValueAt(row, 1).toString());
        txtNamaPerusahaan.setText(tblPengalamanKerja.getValueAt(row, 2).toString());
        txtCity.setText(tblPengalamanKerja.getValueAt(row, 3).toString());
        edit();
    }//GEN-LAST:event_tblPengalamanKerjaMouseClicked

    /**
     * Melakukan pencarian dengan menggunakan button search
     * @param evt (ActionEvent)
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!txtSearch.getText().equals("")) {
            String text = txtSearch.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
                } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategori.getSelectedIndex()+1));
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * Untuk melakukan pencarian dari kategori dengan menekan tombol enter dan menampilkan seluruh data saat
     * textfield search dikosongkan
     * @param evt (KeyEvent)
     */
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (!txtSearch.getText().equals("")) {
            btnSearch.setEnabled(true);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = txtSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                    } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategori.getSelectedIndex()+1));
                }
            }
        }
        if (txtSearch.getText().equals("")) {
        bindingPengalaman(controller.getAll());
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPengalamanKerja;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtIdPengalaman;
    private javax.swing.JTextField txtNamaPerusahaan;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    /**
     * Untuk menampilkan seluruh data ke dalam tabel
     * @param pengalaman (List<Object>) data yang akan dimasukan ke tabel
     */
    private void bindingPengalaman(List<Object> pengalaman) {
        String[] header = {"No", "ID Pengalaman", "Nama Perusahaan", "Kota"};
        String[][] data = new String[pengalaman.size()][header.length];
        int i = 0;
        for (Object object : pengalaman) {
            Workingexperience workExp = (Workingexperience) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = workExp.getIdworkingexperience() + "";
            data[i][2] = workExp.getNamaperusahaan() + "";
            data[i][3] = workExp.getCity() + "";
            i++;
        }
        tblPengalamanKerja.setModel(new DefaultTableModel(data, header));
        this.rowSorter = new TableRowSorter<>(tblPengalamanKerja.getModel());
        reset();
    } 
    
    /**
     * menonaktifkan texfield IdPengalaman dan mengaktifkan button drop
     */
    private void edit() {
        txtIdPengalaman.setEnabled(false);
        btnDrop.setEnabled(true);
    }
    
    /**
     * Menampilkan ID terakhir di textfield achievementId dan mengaktifkan serta menghilangkan kemampuan meng-edit 
     * textfield tersebut, menonaktifkan button drop dan search , mengosongkan textfield achievementName,eventName,dan year
     */
    private void reset() {
        txtIdPengalaman.setText(controller.getAutoId()+"");
        txtIdPengalaman.setEnabled(true);
        txtNamaPerusahaan.setText("");
        txtCity.setText("");
        btnDrop.setEnabled(false);
        btnSearch.setEnabled(false);
        txtIdPengalaman.setEditable(false);
        tblPengalamanKerja.setRowSorter(rowSorter);
    }  

}
