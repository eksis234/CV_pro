/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OrganizationController;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Organization;
import org.hibernate.SessionFactory;
import view.SerbaGuna.pesan;

/**
 *
 * @author X453MA
 */
public class OrganizationView extends javax.swing.JInternalFrame {

    private SerbaGuna sg;
    private TableRowSorter<TableModel> rowSorter;
    private final OrganizationController controller;

    /**
     * Creates new form OrganisasiView
     *
     * @param sessionFactory
     */
    public OrganizationView(SessionFactory sessionFactory) {
        initComponents();
        controller = new OrganizationController(sessionFactory);
        sg = new SerbaGuna();
        tblOrganization.setRowSorter(rowSorter);
        bindingOrganization(controller.getAll());
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
        txtOrganizationId = new javax.swing.JTextField();
        txtOrganizationName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPosistion = new javax.swing.JTextField();
        dateStart = new org.jdesktop.swingx.JXDatePicker();
        dateEnd = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        cmbKategori = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Organization Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("ID Organisasi :");

        jLabel2.setText("Nama Organisasi :");

        txtOrganizationId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrganizationIdKeyTyped(evt);
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

        jLabel3.setText("Position :");

        jLabel4.setText("Tanggal Mulai :");

        jLabel5.setText("Tanggal Selesai :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPosistion, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtOrganizationName)
                    .addComponent(txtOrganizationId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDrop))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(dateEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnDrop)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtOrganizationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPosistion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrganizationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrganization);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organization ID", "Organization Name" }));

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrganizationIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrganizationIdKeyTyped
        // TODO add your handling code here:
        sg.filterHuruf(evt);
    }//GEN-LAST:event_txtOrganizationIdKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tblOrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrganizationMouseClicked
        // TODO add your handling code here:
        int row = tblOrganization.getSelectedRow();
        
//        Date startDate;
//        String sdate = tblOrganization.getValueAt(row, 4).toString();
//        sdate = sdate.substring(0, 10);
//        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            startDate = formater.parse(sdate);
//            dateStart.setDate(startDate);
//        } catch (ParseException ex) {
//            Logger.getLogger(OrganizationView.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        Date endDate;
//        String edate = tblOrganization.getValueAt(row, 5).toString();
//        sdate = edate.substring(0, 10);
//        try {
//            endDate = formater.parse(sdate);
//            dateEnd.setDate(endDate);
//        } catch (ParseException ex) {
//            Logger.getLogger(OrganizationView.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        String startDate = tblOrganization.getValueAt(row, 4).toString();
        String endDate = tblOrganization.getValueAt(row, 5).toString();
        txtOrganizationId.setText(tblOrganization.getValueAt(row, 1).toString());
        txtOrganizationName.setText(tblOrganization.getValueAt(row, 2).toString());
        txtPosistion.setText(tblOrganization.getValueAt(row, 3).toString());
        sg.pickDate(startDate, dateStart, OrganizationView.class);
        sg.pickDate(endDate, dateEnd, OrganizationView.class);
        edit();
    }//GEN-LAST:event_tblOrganizationMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        controller.saveOrUpdate(txtOrganizationId.getText(), txtOrganizationName.getText(), txtPosistion.getText(), sg.getDateFormat(dateStart), sg.getDateFormat(dateEnd));
        if (btnDrop.isEnabled()) {
            JOptionPane.showMessageDialog(this, pesan.update.getPesan(), "Update", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, pesan.save.getPesan(), "Save", JOptionPane.INFORMATION_MESSAGE);
        }
        bindingOrganization((List<Object>) controller.getAll());
        reset();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtSearch.getText().equals("")) {
                String text = txtSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                    } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategori.getSelectedIndex()+1));
                }  
            }
        }
        if (txtSearch.getText().equals("")) {
            bindingOrganization(controller.getAll());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

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

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        // TODO add your handling code here:
        int messageBox = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ?", "Delete", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);
        if(messageBox == JOptionPane.YES_OPTION){
            controller.delete(txtOrganizationId.getText());
            JOptionPane.showMessageDialog(this, SerbaGuna.pesan.delete.getPesan());
            bindingOrganization(controller.getAll());
            reset();
        }
        if(messageBox == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, SerbaGuna.pesan.cancel.getPesan());
        }
    }//GEN-LAST:event_btnDropActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbKategori;
    private org.jdesktop.swingx.JXDatePicker dateEnd;
    private org.jdesktop.swingx.JXDatePicker dateStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtOrganizationId;
    private javax.swing.JTextField txtOrganizationName;
    private javax.swing.JTextField txtPosistion;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void bindingOrganization(List<Object> organizations) {
        String[] header = {"No", "ID Organisasi", "Nama Organisasi", "Posisi", "Tanggal Mulai", "Tanggal Selesai"};
        String[][] data = new String[organizations.size()][header.length];
        int i = 0;
        for (Object object : organizations) {
            Organization organization = (Organization) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = organization.getIdorganization().toString();
            data[i][2] = organization.getOrganizationname();
            data[i][3] = organization.getPosition();
            data[i][4] = organization.getStartdate().toString();
            data[i][5] = organization.getEnddate().toString();
            i++;
        }
        tblOrganization.setModel(new DefaultTableModel(data, header));
        this.rowSorter = new TableRowSorter<>(tblOrganization.getModel());
        reset();
    }

    public void reset() {
        txtOrganizationId.setText(controller.getAutoId() + "");
        txtOrganizationId.setEnabled(true);
        tblOrganization.setRowSorter(rowSorter);
        btnDrop.setEnabled(false);
        txtOrganizationId.setEditable(false);
        txtOrganizationName.setText("");
    }

    public void edit() {
        txtOrganizationId.setEnabled(false);
        btnDrop.setEnabled(true);
    }
}
