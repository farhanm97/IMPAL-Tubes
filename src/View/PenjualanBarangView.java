/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class PenjualanBarangView extends javax.swing.JFrame {

    /**
     * Creates new form Penjualan_Barang
     */
    public PenjualanBarangView() {
        tabModelKeranjang = new DefaultTableModel(new Object[]{"Nama Barang","Jumlah","Harga","Total"},3);
        tabModelCari = new DefaultTableModel(new Object[]{"ID Barang","Nama Barang","Jumlah","Harga"},5);
        initComponents();
        
    }
    
    public void Row(){
        
    }

    public String getCariForm() {
        return cariForm.getText();
    }

    public int getHargaForm() {
        return Integer.parseInt(hargaForm.getText());
    }

    public int getJumlahForm() {
        return Integer.parseInt(jumlahForm.getText());
    }

    public String getKodeBarangForm() {
        return kodeBarangForm.getText();
    }

    public String getNamaBarangForm() {
        return namaBarangForm.getText();
    }
    
    public void setTotalForm(int total){
        totalForm.setText(Integer.toString(total));
    }
    
    public void cariListener(ActionListener cariListen){
        cariBtn.addActionListener(cariListen);
    }
    
    public void tambahListener(ActionListener tambahListen){
        tambahBtn.addActionListener(tambahListen);
    }
    
    public void hapusListener(ActionListener hapusListen){
        hapusBtn.addActionListener(hapusListen);
    }
    
    public void batalListener(ActionListener batalListen){
        batalBtn.addActionListener(batalListen);
    }
    
    public void bayarListener(ActionListener bayarListen){
        bayarBtn.addActionListener(bayarListen);
    }
    
    public void updateCariTable(ResultSet rs){
        tabModelCari.setRowCount(0);
        
                try {
                rs.beforeFirst();
                while (rs.next())                
                {
                
                int count = tabModelCari.getRowCount()+1;
                
                tabModelCari.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});         
                }       
                rs.beforeFirst();
            
        } catch (Exception ex) {
            //this.Message("Barang Tidak Ada");
        }  
    }
    
    public void updateTableKeranjang(String nama,int jumlah,int harga){
        int total = jumlah*harga;
        tabModelKeranjang.addRow(new Object[]{nama,jumlah,harga,total});
    }
    
    public void message(String s){
        JOptionPane.showMessageDialog(this, s);
    }
    
    
    
    
    
    
    
    
    
    private DefaultTableModel tabModelKeranjang;
    private DefaultTableModel tabModelCari;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        totalForm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namaBarangForm = new javax.swing.JTextField();
        hargaForm = new javax.swing.JTextField();
        kodeBarangForm = new javax.swing.JTextField();
        jumlahForm = new javax.swing.JTextField();
        tambahBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cariTable = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        cariForm = new javax.swing.JTextField();
        cariBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        totalTable = new javax.swing.JTable();
        hapusBtn = new javax.swing.JButton();
        bayarBtn = new javax.swing.JButton();
        batalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        jLabel1.setText("Penjualan Barang");

        totalForm.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        totalForm.setText("tes");

        jLabel4.setText("Kode Barang");

        jLabel5.setText("Nama Barang");

        jLabel6.setText("Harga");

        jLabel7.setText("Jumlah");

        namaBarangForm.setText("jTextField3");

        hargaForm.setText("jTextField4");

        kodeBarangForm.setText("jTextField5");

        jumlahForm.setText("jTextField6");

        tambahBtn.setText("Tambah");

        jLabel3.setText("Total Harga :");

        cariTable.setModel(tabModelCari);
        cariTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cariTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(cariTable);

        cariForm.setText("jTextField7");

        cariBtn.setText("cari");

        jLabel8.setText("cari barang");

        totalTable.setModel(tabModelKeranjang);
        jScrollPane3.setViewportView(totalTable);

        hapusBtn.setText("Hapus");

        bayarBtn.setText("Bayar");

        batalBtn.setText("Batal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hapusBtn)
                                .addGap(48, 48, 48)
                                .addComponent(batalBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalForm, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bayarBtn))
                            .addComponent(jScrollPane3))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tambahBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hargaForm)
                                    .addComponent(jumlahForm)
                                    .addComponent(namaBarangForm)
                                    .addComponent(kodeBarangForm))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cariForm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addGap(65, 65, 65))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cariForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cariBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kodeBarangForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(namaBarangForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalForm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hapusBtn)
                                    .addComponent(batalBtn))
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(bayarBtn)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariTableMousePressed
        // TODO add your handling code here:
        int row = cariTable.getSelectedRow();
        kodeBarangForm.setText(cariTable.getValueAt(row, 1).toString());
        namaBarangForm.setText(cariTable.getValueAt(row, 2).toString());
        hargaForm.setText(cariTable.getValueAt(row, 4).toString());
    }//GEN-LAST:event_cariTableMousePressed

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
            java.util.logging.Logger.getLogger(PenjualanBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanBarangView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalBtn;
    private javax.swing.JButton bayarBtn;
    private javax.swing.JButton cariBtn;
    private javax.swing.JTextField cariForm;
    private javax.swing.JTable cariTable;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JTextField hargaForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jumlahForm;
    private javax.swing.JTextField kodeBarangForm;
    private javax.swing.JTextField namaBarangForm;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JTextField totalForm;
    private javax.swing.JTable totalTable;
    // End of variables declaration//GEN-END:variables
}
