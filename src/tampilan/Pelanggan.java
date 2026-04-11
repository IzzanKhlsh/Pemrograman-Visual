package tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

public class Pelanggan extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    public Pelanggan() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }

    protected void aktif(){
        txtid.requestFocus();
    }

    protected void kosong(){
        txtid.setText("");
        txtnm.setText("");
        txttelp.setText("");
        txtalamat.setText("");
        txtcari.setText("");
        buttonGroup1.clearSelection();
    }

    protected void datatable(){
        Object[] Baris ={"ID Pelanggan","Nama","Jenis Kelamin","No. Telepon","Alamat"};
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem=txtcari.getText();

        try {
            String sql = "SELECT * FROM pelanggan where id like '%"+cariitem+"%' or nmplg like '%"+cariitem+"%' order by id asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5)
                });
            }
            tblplgn.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        rlaki = new javax.swing.JRadioButton();
        rperempuan = new javax.swing.JRadioButton();
        txttelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblplgn = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Pelanggan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Data Pelanggan");

        jLabel1.setText("ID Pelanggan");
        jLabel2.setText("Nama Pelanggan");
        jLabel3.setText("Jenis Kelamin");
        jLabel4.setText("No. Telepon");
        jLabel5.setText("Alamat");

        buttonGroup1.add(rlaki);
        rlaki.setText("Laki-Laki");

        buttonGroup1.add(rperempuan);
        rperempuan.setText("Perempuan");

        txtalamat.setColumns(20);
        txtalamat.setRows(4);
        jScrollPane1.setViewportView(txtalamat);

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Pelanggan");

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        tblplgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID Pelanggan", "Nama", "Jenis Kelamin", "No. Telepon", "Alamat"}
        ));
        tblplgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblplgnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblplgn);

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rlaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rperempuan))
                            .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bkeluar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcari)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rlaki)
                    .addComponent(rperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bubah)
                    .addComponent(bhapus)
                    .addComponent(bbatal)
                    .addComponent(bkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {
        String jenis = null;
        if(rlaki.isSelected()){
            jenis = "Laki-Laki";
        } else if(rperempuan.isSelected()){
            jenis = "Perempuan";
        }
        String sql = "insert into pelanggan values (?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtid.getText());
            stat.setString(2, txtnm.getText());
            stat.setString(3, jenis);
            stat.setString(4, txttelp.getText());
            stat.setString(5, txtalamat.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
            txtid.requestFocus();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+e);
        }
        datatable();
    }

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {
        String jenis = null;
        if(rlaki.isSelected()){
            jenis = "Laki-Laki";
        } else if(rperempuan.isSelected()){
            jenis = "Perempuan";
        }
        try{
            String sql = "update pelanggan set nmplg=?,jenis=?,telepon=?,alamat=? where id='"+txtid.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnm.getText());
            stat.setString(2, jenis);
            stat.setString(3, txttelp.getText());
            stat.setString(4, txtalamat.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            txtid.requestFocus();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "data gagal diubah"+e);
        }
        datatable();
    }

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {
        int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from pelanggan where id ='"+txtid.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                txtid.requestFocus();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
            }
            datatable();
        }
    }

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {
        kosong();
        datatable();
    }

    private void tblplgnMouseClicked(java.awt.event.MouseEvent evt) {
        int bar = tblplgn.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();

        txtid.setText(a);
        txtnm.setText(b);
        if ("Laki-Laki".equals(c)) {
            rlaki.setSelected(true);
        } else {
            rperempuan.setSelected(true);
        }
        txttelp.setText(d);
        txtalamat.setText(e);
    }

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {
        datatable();
    }

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            datatable();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rlaki;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JTable tblplgn;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txttelp;
    // End of variables declaration
}
