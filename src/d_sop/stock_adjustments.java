/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_sop;

import controls.Database;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mdcc_dinesh
 */
public class stock_adjustments extends javax.swing.JFrame {

    //SET ID'S *****************************************************************
    private static int edit_id = -1;
    //Tabale Search ************************************************************
    
    
    public stock_adjustments() {
        initComponents();
        stock_adjustment_tabale();
        //FULL SIZE PAGE *******************************************************
        setExtendedState(MAXIMIZED_BOTH);
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
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stock_adjustment_tabale = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        sell = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1004, 409));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Stock Adjustments");

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 204, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("CHANGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        stock_adjustment_tabale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stock_adjustment_tabale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Code", "Name", "Cost", "Sell", "QTY", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stock_adjustment_tabale.setRowHeight(25);
        stock_adjustment_tabale.getTableHeader().setReorderingAllowed(false);
        stock_adjustment_tabale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stock_adjustment_tabaleMouseClicked(evt);
            }
        });
        stock_adjustment_tabale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stock_adjustment_tabaleKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(stock_adjustment_tabale);
        if (stock_adjustment_tabale.getColumnModel().getColumnCount() > 0) {
            stock_adjustment_tabale.getColumnModel().getColumn(0).setResizable(false);
            stock_adjustment_tabale.getColumnModel().getColumn(0).setHeaderValue("Category");
            stock_adjustment_tabale.getColumnModel().getColumn(1).setResizable(false);
            stock_adjustment_tabale.getColumnModel().getColumn(1).setHeaderValue("Code");
            stock_adjustment_tabale.getColumnModel().getColumn(2).setResizable(false);
            stock_adjustment_tabale.getColumnModel().getColumn(2).setHeaderValue("Name");
            stock_adjustment_tabale.getColumnModel().getColumn(3).setResizable(false);
            stock_adjustment_tabale.getColumnModel().getColumn(3).setHeaderValue("Cost");
            stock_adjustment_tabale.getColumnModel().getColumn(4).setResizable(false);
            stock_adjustment_tabale.getColumnModel().getColumn(4).setHeaderValue("Sell");
            stock_adjustment_tabale.getColumnModel().getColumn(5).setResizable(false);
            stock_adjustment_tabale.getColumnModel().getColumn(5).setPreferredWidth(0);
            stock_adjustment_tabale.getColumnModel().getColumn(5).setHeaderValue("QTY");
            stock_adjustment_tabale.getColumnModel().getColumn(6).setMinWidth(0);
            stock_adjustment_tabale.getColumnModel().getColumn(6).setPreferredWidth(0);
            stock_adjustment_tabale.getColumnModel().getColumn(6).setMaxWidth(0);
            stock_adjustment_tabale.getColumnModel().getColumn(6).setHeaderValue("ID");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("QTY        :");

        qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 51, 51));
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        name.setEnabled(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        sell.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sell.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cost       :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Sell         :");

        cost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Name     :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sell, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(qty)
                            .addComponent(cost)
                            .addComponent(name)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sell, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, qty, sell});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cost, name});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Table load ***************************************************************
    private void stock_adjustment_tabale() {
        try {
            ResultSet item_list = Database.getData("SELECT\n"
                    + "sub_category_id.main_cat_id,\n"
                    + "r_itm_reg.itm_cat_id,\n"
                    + "r_itm_reg.itm_name,\n"
                    + "sub_category_id.sub_cat_id,\n"
                    + "main_category.`name`,\n"
                    + "main_category.id,\n"
                    + "r_grn_itm_data.grn_qunt,\n"
                    + "r_grn_data.grnManual,\n"
                    + "r_grn_data.grn_no,\n"
                    + "r_itm_reg.itm_code,\n"
                    + "r_grn_itm_data.grn_free_qty,\n"
                    + "r_grn_itm_data.grn_itm_cost,\n"
                    + "r_grn_itm_data.grn_itm_sell,\n"
                    + "r_grn_itm_data.grn_itm_data_id\n"
                    + "FROM\n"
                    + "sub_category_id\n"
                    + "INNER JOIN r_itm_reg ON sub_category_id.sub_cat_id = r_itm_reg.itm_cat_id\n"
                    + "INNER JOIN main_category ON sub_category_id.main_cat_id = main_category.id\n"
                    + "INNER JOIN r_grn_itm_data ON r_grn_itm_data.grn_itm_id = r_itm_reg.itm_id\n"
                    + "INNER JOIN r_grn_data ON r_grn_data.grn_no = r_grn_itm_data.grn_no\n"
                    + "ORDER BY \n"
                    + "r_itm_reg.itm_cat_id DESC");

            DefaultTableModel tMOdel = (DefaultTableModel) stock_adjustment_tabale.getModel();
            tMOdel.setRowCount(0);
            while (item_list.next()) {
                ArrayList arrList = new ArrayList();
                arrList.add(item_list.getString("name"));
                arrList.add(item_list.getString("itm_code"));
                arrList.add(item_list.getString("itm_name"));
                arrList.add(item_list.getString("grn_itm_cost"));
                arrList.add(item_list.getString("grn_itm_sell"));
                arrList.add(item_list.getString("grn_qunt"));
                arrList.add(item_list.getString("grn_itm_data_id"));
                tMOdel.addRow(arrList.toArray());
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        home back_home = new home();
        back_home.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String i_cost = cost.getText();
        String i_sell = sell.getText();
        String i_qty = qty.getText();

        if (i_cost.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Item Cost not to be empty!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
        if (i_sell.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Item Sell not to be empty!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
        if (i_qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Item QTY not to be empty!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean update = Database.putData("UPDATE `r_grn_itm_data` SET  `grn_qunt`='"+ i_qty +"', `grn_itm_cost`='"+ i_cost +"', `grn_itm_sell`='"+ i_sell +"' WHERE (`grn_itm_data_id`='"+ edit_id +"');");
                   // System.out.println("UPDATE `r_grn_itm_data` SET  `grn_qunt`='"+ i_qty +"', `grn_itm_cost`='"+ i_cost +"', `grn_itm_sell`='"+ i_sell +"', WHERE (`grn_itm_data_id`='"+ edit_id +"');");
            if (update) {
                JOptionPane.showMessageDialog(null, "successfully added !", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                stock_adjustment_tabale();

            } else {
                JOptionPane.showMessageDialog(null, "Erro Uploading !", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void stock_adjustment_tabaleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stock_adjustment_tabaleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_adjustment_tabaleKeyPressed

    private void stock_adjustment_tabaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stock_adjustment_tabaleMouseClicked
        //GET TABALE ROW SELECTED VAL ******************************************
        int r;
        r = stock_adjustment_tabale.getSelectedRow();
        String item_name = stock_adjustment_tabale.getValueAt(r, 2).toString();
        String item_cost = stock_adjustment_tabale.getValueAt(r, 3).toString();
        String item_sell = stock_adjustment_tabale.getValueAt(r, 4).toString();
        String item_qty = stock_adjustment_tabale.getValueAt(r, 5).toString();
        String ids = stock_adjustment_tabale.getValueAt(r, 6).toString();

        //SET SELECTED VAL *****************************************************
        cost.setText(item_cost);
        sell.setText(item_sell);
        qty.setText(item_qty);
        name.setText(item_name);
        edit_id = Integer.parseInt(ids);

    }//GEN-LAST:event_stock_adjustment_tabaleMouseClicked

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stock_adjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock_adjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock_adjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock_adjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stock_adjustments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField cost;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField sell;
    private javax.swing.JTable stock_adjustment_tabale;
    // End of variables declaration//GEN-END:variables
}
