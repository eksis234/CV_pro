/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EducationController;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Education;
import org.hibernate.SessionFactory;

/**
 *
 * @author Martin
 */
public class EducationView extends javax.swing.JInternalFrame {

    private final SerbaGuna sg;
    private final EducationController controller;
    private String[] cmb = {"ideducation", "instansi", "leveleducation", "gpa", "yearin", "graduation", "major"};

    /**
     * Creates new form EducationView
     */
    public EducationView(SessionFactory factory) {
        initComponents();
        sg = new SerbaGuna();
        controller = new EducationController(factory);
        bindingEducation(controller.getAll());
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInstansi1 = new javax.swing.JTextField();
        txtAngkatan1 = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEducation = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdEdukasi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInstansi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTingkatEdukasi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIpk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAngkatan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTahunLulus = new javax.swing.JTextField();
        txtJurusan = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbKategori = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Edukasi");

        btnSearch.setText("Find");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblEducation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEducation);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setText("ID Edukasi :");

        txtIdEdukasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEdukasiKeyTyped(evt);
            }
        });

        jLabel2.setText("Instansi :");

        jLabel3.setText("Tingkat Pendidikani :");

        jLabel4.setText("IPK :");

        jLabel5.setText("Angkatan :");

        jLabel6.setText("Tahun Lulus :");

        jLabel7.setText("Jurusan :");

        btnDelete.setText("Drop");

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
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdEdukasi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstansi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTingkatEdukasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIpk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(29, 29, 29)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnSave)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnDelete)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAngkatan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txtTahunLulus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJurusan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdEdukasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTahunLulus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTingkatEdukasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIpk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(txtJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnDelete))
                        .addContainerGap())))
        );

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Edukasi", "Instansi", "Tingkat Pendidikan", "IPK", "Angkatan", "Tahun Lulus", "Jurusan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)))
                .addContainerGap())
            .addComponent(jScrollPane1)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdEdukasiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEdukasiKeyTyped
        // TODO add your handling code here:
        sg.filterHuruf(evt);
    }//GEN-LAST:event_txtIdEdukasiKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        controller.saveOrUpdate(controller.getAutoId().toString(), txtInstansi.getText(), txtTingkatEdukasi.getText(), txtIpk.getText(), txtAngkatan.getText(), txtTahunLulus.getText(), txtJurusan.getText());

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
//        if(cmbKategori.getSelectedItem().equals("ID Edukasi")){
//            bindingEducation(controller.search("ideducation", new BigDecimal(txtSearch.getText())));
//        } else if(cmbKategori.getSelectedItem().equals("Instansi")){
//            bindingEducation(controller.search("instansi", txtSearch.getText()));
//        }else if(cmbKategori.getSelectedItem().equals("Tingkat Pendidikan")){
//            bindingEducation(controller.search("leveleducation", txtSearch.getText()));
//        } else if(cmbKategori.getSelectedItem().equals("IPK")){
//            bindingEducation(controller.search("gpa", txtSearch.getText()));
//        } else if(cmbKategori.getSelectedItem().equals("Angkatan")){
//            bindingEducation(controller.search("yearin", txtSearch.getText()));
//        } else if(cmbKategori.getSelectedItem().equals("Tahun Lulus")){
//            bindingEducation(controller.search("graduation", txtSearch.getText()));
//        } else {
//            bindingEducation(controller.search("major", txtSearch.getText()));
//        }
            if(!txtSearch.getText().equals("")){
                bindingEducation(controller.search(cmb[cmbKategori.getSelectedIndex()], txtSearch.getText()));
            }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEducation;
    private javax.swing.JTextField txtAngkatan;
    private javax.swing.JTextField txtAngkatan1;
    private javax.swing.JTextField txtIdEdukasi;
    private javax.swing.JTextField txtInstansi;
    private javax.swing.JTextField txtInstansi1;
    private javax.swing.JTextField txtIpk;
    private javax.swing.JTextField txtJurusan;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTahunLulus;
    private javax.swing.JTextField txtTingkatEdukasi;
    // End of variables declaration//GEN-END:variables
    public void bindingEducation(List<Object> object) {
        String[] header = {"No.", "ID Edukasi", "Instansi", "Tingkat Edukasi", "IPK", "Angkatan", "Tahun Lulus", "Jurusan"};
        String[][] data = new String[object.size()][header.length];
        int i = 0;
        for (Object obj : object) {
            Education education = (Education) obj;
            data[i][0] = (i + 1) + "";
            data[i][1] = education.getIdeducation() + "";
            data[i][2] = education.getInstansi() + "";
            data[i][3] = education.getLeveleducation() + "";
            data[i][4] = education.getGpa() + "";
            data[i][5] = education.getYearin() + "";
            data[i][6] = education.getGraduation() + "";
            data[i][7] = education.getMajor() + "";
            i++;
        }
        tblEducation.setModel(new DefaultTableModel(data, header));
        reset();
    }

    public void reset() {
        txtIdEdukasi.setText(controller.getAutoId() + " ");
        txtIdEdukasi.setEnabled(true);
        txtInstansi.setEnabled(true);
        txtTingkatEdukasi.setEnabled(true);
        txtIpk.setEnabled(true);
        txtAngkatan.setEnabled(true);
        txtAngkatan.setEnabled(true);
        txtTahunLulus.setEnabled(true);
        txtJurusan.setEnabled(true);
        btnDelete.setEnabled(false);
        btnSave.setEnabled(true);
        btnSearch.setEnabled(true);
    }

    public void edit() {
        txtIdEdukasi.setEnabled(false);
    }
}
