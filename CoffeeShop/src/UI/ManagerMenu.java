/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Utils.Tools;

/**
 *
 * @author thnrg
 */
public class ManagerMenu extends javax.swing.JFrame {
    protected int userid;
    /**
     * Creates new form ManagerMenu
     */
    public ManagerMenu() {
        initComponents();
        OnRun();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogOut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        Categories = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnEmployees = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnMenuProducts = new javax.swing.JMenuItem();
        menuBtnEmployees = new javax.swing.JMenuItem();
        menuBtnUsers = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Menu");
        setResizable(false);

        jToolBar1.setRollover(true);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log out.png"))); // NOI18N
        btnLogOut.setText("Log out");
        btnLogOut.setFocusable(false);
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setMaximumSize(new java.awt.Dimension(68, 52));
        btnLogOut.setMinimumSize(new java.awt.Dimension(68, 52));
        btnLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogOut);
        jToolBar1.add(jSeparator1);

        Categories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lists.png"))); // NOI18N
        Categories.setText("Categories");
        Categories.setFocusable(false);
        Categories.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Categories.setMaximumSize(new java.awt.Dimension(68, 52));
        Categories.setMinimumSize(new java.awt.Dimension(68, 52));
        Categories.setPreferredSize(new java.awt.Dimension(68, 52));
        Categories.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesActionPerformed(evt);
            }
        });
        jToolBar1.add(Categories);

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Label.png"))); // NOI18N
        btnProducts.setText("Products");
        btnProducts.setFocusable(false);
        btnProducts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducts.setMaximumSize(new java.awt.Dimension(68, 52));
        btnProducts.setMinimumSize(new java.awt.Dimension(68, 52));
        btnProducts.setPreferredSize(new java.awt.Dimension(68, 52));
        btnProducts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProducts);

        btnEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Unknown person.png"))); // NOI18N
        btnEmployees.setText("Employees");
        btnEmployees.setFocusable(false);
        btnEmployees.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployees.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEmployees);

        btnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Users.png"))); // NOI18N
        btnUsers.setText("Users");
        btnUsers.setFocusable(false);
        btnUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsers.setMaximumSize(new java.awt.Dimension(68, 52));
        btnUsers.setMinimumSize(new java.awt.Dimension(68, 52));
        btnUsers.setPreferredSize(new java.awt.Dimension(68, 52));
        btnUsers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUsers);

        jMenu3.setText("Account");
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Manage");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Categories");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        btnMenuProducts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMenuProducts.setText("Products");
        jMenu2.add(btnMenuProducts);

        menuBtnEmployees.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuBtnEmployees.setText("Employees");
        menuBtnEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnEmployeesActionPerformed(evt);
            }
        });
        jMenu2.add(menuBtnEmployees);

        menuBtnUsers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuBtnUsers.setText("Users");
        menuBtnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnUsersActionPerformed(evt);
            }
        });
        jMenu2.add(menuBtnUsers);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Statistics");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeesActionPerformed
        new ManageEmployees(this, true).setVisible(true);
    }//GEN-LAST:event_btnEmployeesActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        new ManageUsers(this, true).setVisible(true);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuBtnEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnEmployeesActionPerformed
        new ManageEmployees(this, true).setVisible(true);
    }//GEN-LAST:event_menuBtnEmployeesActionPerformed

    private void menuBtnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnUsersActionPerformed
        new ManageUsers(this, true).setVisible(true);
    }//GEN-LAST:event_menuBtnUsersActionPerformed

    private void CategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriesActionPerformed
        new ManageCategories(this, true).setVisible(true);
    }//GEN-LAST:event_CategoriesActionPerformed

    public  void login(int userid)
    {
        this.userid = userid;
    }
    
    private void OnRun()
    {
        Tools.SetFrameToCenter(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Tools.setLAF();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMenu().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Categories;
    private javax.swing.JButton btnEmployees;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JMenuItem btnMenuProducts;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnUsers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuBtnEmployees;
    private javax.swing.JMenuItem menuBtnUsers;
    // End of variables declaration//GEN-END:variables
}
