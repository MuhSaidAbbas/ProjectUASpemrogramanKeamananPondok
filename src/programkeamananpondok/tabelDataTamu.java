/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programkeamananpondok;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muh. Said Abbas
 */
public class tabelDataTamu extends javax.swing.JFrame {

    static void setModel(DefaultTableModel tabel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form tabelDataTamu
     */
    public tabelDataTamu() {
        initComponents();
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
        tabelDataTamu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelDataTamu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hari", "Tanggal", "Nama tamu", "Asal", "Nama", "Status", "Nomor Kontak", "Status Kunjungan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelDataTamu.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabelDataTamu);
        tabelDataTamu.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelDataTamu.getColumnModel().getColumnCount() > 0) {
            tabelDataTamu.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabelDataTamu.getColumnModel().getColumn(1).setResizable(false);
            tabelDataTamu.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelDataTamu.getColumnModel().getColumn(2).setResizable(false);
            tabelDataTamu.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelDataTamu.getColumnModel().getColumn(3).setResizable(false);
            tabelDataTamu.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelDataTamu.getColumnModel().getColumn(4).setResizable(false);
            tabelDataTamu.getColumnModel().getColumn(4).setPreferredWidth(200);
            tabelDataTamu.getColumnModel().getColumn(5).setResizable(false);
            tabelDataTamu.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabelDataTamu.getColumnModel().getColumn(6).setResizable(false);
            tabelDataTamu.getColumnModel().getColumn(6).setPreferredWidth(130);
            tabelDataTamu.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tabelDataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelDataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelDataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelDataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelDataTamu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataTamu;
    // End of variables declaration//GEN-END:variables
}
