/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NetworkingController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Networking;
import org.hibernate.SessionFactory;
import view.SerbaGuna.pesan;

/**
 *
 * @author X453MA
 */
public class NetworkingView extends javax.swing.JInternalFrame {
    private SerbaGuna sg;
    private NetworkingController controller;
    private TableRowSorter<TableModel> rowSorter;
    /**
     * Creates new form OrganisasiView
     */
    public NetworkingView(SessionFactory sessionFactory) {
        initComponents();
        sg = new SerbaGuna();
        controller = new NetworkingController(sessionFactory);
        tblNetworking.setRowSorter(rowSorter);
        bindingNetworking(controller.getAll());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNetworkingId = new javax.swing.JTextField();
        txtNetworkingSkill = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNetworking = new javax.swing.JTable();
        cmbKategori = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Networking");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Networking Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Networking ID :");

        jLabel2.setText("Networking Skill :");

        txtNetworkingId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNetworkingIdKeyTyped(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDrop.setText("DROP");
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
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNetworkingId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtNetworkingSkill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDrop))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNetworkingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNetworkingSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDrop)
                    .addComponent(btnSave)))
        );

        tblNetworking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNetworking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNetworkingMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNetworking);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Networking", "Networking Skill" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNetworkingIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetworkingIdKeyTyped
        // TODO add your handling code here:
        sg.filterHuruf(evt);
    }//GEN-LAST:event_txtNetworkingIdKeyTyped

    /**
     * Menyimpan data saat menekan button save
     * @param evt (ActionEvent)
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!txtNetworkingSkill.getText().equals("")){
            if(!txtNetworkingSkill.getText().substring(0, 1).equals(" ")){
                controller.saveOrUpdate(txtNetworkingId.getText(), txtNetworkingSkill.getText());
                if(!txtNetworkingId.isEnabled()){
                    JOptionPane.showMessageDialog(this, pesan.update.getPesan(), "Update", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, pesan.save.getPesan(), "Save", JOptionPane.INFORMATION_MESSAGE);
                }
                bindingNetworking(controller.getAll());
                reset();
            }
        }
        else JOptionPane.showMessageDialog(this, pesan.kosong.getPesan(), "Kosong", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Mengambil data dari baris yang di klik oleh mouse
     * @param evt (MouseEvent)
     */
    private void tblNetworkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNetworkingMouseClicked
        // TODO add your handling code here:
        int row = tblNetworking.getSelectedRow();
        txtNetworkingId.setText(tblNetworking.getValueAt(row, 1).toString());
        txtNetworkingSkill.setText(tblNetworking.getValueAt(row, 2).toString());
        edit();
    }//GEN-LAST:event_tblNetworkingMouseClicked

    /**
     * Untuk menghapus data dengan menggunakan button drop
     * @param evt (ActionEvent)
     */
    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        // TODO add your handling code here:
        int messageBox = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ?", "Delete", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);
        if(messageBox == JOptionPane.YES_OPTION){
            controller.delete(txtNetworkingId.getText());
            JOptionPane.showMessageDialog(this, pesan.delete.getPesan());
            bindingNetworking(controller.getAll());
            reset();
        }
        if(messageBox == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, pesan.cancel.getPesan());
        }
    }//GEN-LAST:event_btnDropActionPerformed

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
            bindingNetworking(controller.getAll());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    /**
     * Melakukan pencarian dengan menggunakan button search
     * @param evt (ActionEvent)
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(!txtSearch.getText().equalsIgnoreCase("")){
             String text = txtSearch.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
                } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategori.getSelectedIndex()+1));
            }                 
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNetworking;
    private javax.swing.JTextField txtNetworkingId;
    private javax.swing.JTextField txtNetworkingSkill;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    /**
     * Untuk menampilkan seluruh data ke dalam tabel
     * @param networking (List<Object>) data yang akan dimasukan ke tabel
     */
    private void bindingNetworking(List<Object> networking) {
        String[] header = {"No", "ID Networking", "Networking Skill"};
        String[][] data = new String[networking.size()][header.length];
        int i = 0;
        for (Object object : networking) {
            Networking net = (Networking) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = net.getIdnetworking() + "";
            data[i][2] = net.getNetworkingskill() + "";
            i++;
        }
        tblNetworking.setModel(new DefaultTableModel(data, header));
        this.rowSorter = new TableRowSorter<>(tblNetworking.getModel());
        reset();
    }
    
    /**
     * menonaktifkan texfield NetworkingId dan button drop
     */
    private void edit() {
        txtNetworkingId.setEnabled(false);
        btnDrop.setEnabled(true);
    }
    
    /**
     * Menampilkan ID terakhir di textfield NetworkingId dan mengaktifkan serta menghilangkan kemampuan meng-edit 
     * textfield tersebut, menonaktifkan button drop dan search, mengosongkan textfield NetworkingSkill
     */
    private void reset() {
        txtNetworkingId.setText(controller.getAutoId()+"");
        txtNetworkingId.setEnabled(true);
        txtNetworkingSkill.setText("");
        btnDrop.setEnabled(false);
        btnSearch.setEnabled(false);
        txtNetworkingId.setEditable(false);
        tblNetworking.setRowSorter(rowSorter);
    }
    
}
