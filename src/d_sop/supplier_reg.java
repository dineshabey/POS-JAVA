/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_sop;

import controls.Database;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mdcc_dinesh
 */
public class supplier_reg extends javax.swing.JInternalFrame {

    /**
     * Creates new form main_cat
     */
    public supplier_reg() {
        initComponents();
        sup_reg_table();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        edit_id1 = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contact_tel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplier_tbl = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(803, 622));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Supplier  Registration ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tel No                                :");

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("DELETE");

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("SAVE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Supplier Name                    :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address                             :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Tel No                  :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contact Person                 :");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        supplier_tbl.setBackground(new java.awt.Color(0, 204, 204));
        supplier_tbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supplier_tbl.setForeground(new java.awt.Color(255, 255, 255));
        supplier_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Telephone", "Contact Person", "Contact Tel"
            }
        ));
        supplier_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplier_tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(supplier_tbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contact_tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(edit_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contact_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(edit_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       //Table load ***************************************************************
    private void sup_reg_table() {
        try {
            ResultSet item_list = Database.getData("SELECT\n"
                    + "suplier.sup_id,\n"
                    + "suplier.sup_name,\n"
                    + "suplier.sup_address,\n"
                    + "suplier.sup_tp,\n"
                    + "suplier.sup_con_person,\n"
                    + "suplier.sup_con_per_tp\n"
                    + "FROM\n"
                    + "suplier\n"
                    + "ORDER BY\n"
                    + "suplier.sup_id DESC");

            DefaultTableModel tMOdel = (DefaultTableModel) supplier_tbl.getModel();
            tMOdel.setRowCount(0);
            while (item_list.next()) {
                ArrayList arrList = new ArrayList();
                arrList.add(item_list.getString("sup_id"));
                arrList.add(item_list.getString("sup_name"));
                arrList.add(item_list.getString("sup_address"));
                arrList.add(item_list.getString("sup_tp"));
                arrList.add(item_list.getString("sup_con_person"));
                arrList.add(item_list.getString("sup_con_per_tp"));
                tMOdel.addRow(arrList.toArray());
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sup_name = name.getText();
        String sup_address = address.getText();
        String sup_tel = tel.getText();
        String sup_contact = contact.getText();
        String sup_contact_tel = contact_tel.getText();

        if (sup_name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        if (sup_address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        if (sup_tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tel can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        if (sup_contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contact person can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        if (sup_contact_tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contact Tel can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean add = Database.putData("INSERT INTO `suplier` (`sup_name`, `sup_address`, `sup_tp`, `sup_con_person`, `sup_con_per_tp`) VALUES ( '" + sup_name + "', '" + sup_address + "', '" + sup_tel + "', '" + sup_contact + "', '" + sup_contact_tel + "')");
            if (add) {
                JOptionPane.showMessageDialog(null, "Successfully added !", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                sup_reg_table();

            } else {
                JOptionPane.showMessageDialog(null, "Erro Uploading !", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String sup_name = name.getText();
        String sup_address = address.getText();
        String sup_tel = tel.getText();
        String sup_contact = contact.getText();
        String sup_contact_tel = contact_tel.getText();
        String id = edit_id1.getText();

        if (sup_name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (sup_address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (sup_tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tel can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (sup_contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contact person can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (sup_contact_tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contact Tel can't be empty!", "Title", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Update ?");
            //CHECK RETURN VAL FOR UPDATE ********************************************
            if (showConfirmDialog == 0) {
                boolean update = Database.putData("UPDATE `suplier` SET  `sup_name`='"+ sup_name +"', `sup_address`='"+ sup_address +"', `sup_tp`='"+ sup_tel +"', `sup_con_person`='"+ sup_contact +"', `sup_con_per_tp`='"+ sup_contact_tel +"' WHERE (`sup_id`='"+ id +"');");
                if (update) {
                    JOptionPane.showMessageDialog(null, "successfully Updated !", "Title", JOptionPane.INFORMATION_MESSAGE);
                    sup_reg_table();
                } else {
                    JOptionPane.showMessageDialog(null, "Update  Errro !", "Title", JOptionPane.INFORMATION_MESSAGE);
                    sup_reg_table();
                }

            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void supplier_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplier_tblMouseClicked

        //GET TABALE ROW SELECTED VAL ******************************************
        int r;
        r = supplier_tbl.getSelectedRow();
        String id = supplier_tbl.getValueAt(r, 0).toString();
        String reg_name = supplier_tbl.getValueAt(r, 1).toString();
        String reg_address = supplier_tbl.getValueAt(r, 2).toString();
        String telephone = supplier_tbl.getValueAt(r, 3).toString();
        String con_person = supplier_tbl.getValueAt(r, 4).toString();
        String con_tel = supplier_tbl.getValueAt(r, 5).toString();

        //SET SELECTED VAL *****************************************************
        edit_id1.setText(id);
        name.setText(reg_name);
        address.setText(reg_address);
        tel.setText(telephone);
        contact.setText(con_person);
        contact_tel.setText(con_tel);
    }//GEN-LAST:event_supplier_tblMouseClicked

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField contact_tel;
    private javax.swing.JTextField edit_id1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTable supplier_tbl;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables

}
